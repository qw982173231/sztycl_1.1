package com.szt.sztycl.common;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@Component
public class FileTool {

    final static String path="E:/code";


    /*
     * 解压zip格式压缩包
     * <br/>
     * @param unzipFile  压缩文件路径
     * @returns java.lang.String
     * 解压成功返回解压的文件绝对路径
     *  解压失败返回""
     *
     * @author d
     * @date 2019/12/1 10:11
     */
    public String unZip(String unzipFile) throws RuntimeException {
        if (!new File(unzipFile).exists())return "";
        if (unzipFile.split(".").length>2)return "";
        File file = new File(unzipFile.split("\\.")[0]);
        if (!file.exists())file.mkdir();
        // 开始解压
        ZipFile zipFile = null;
        try {
            zipFile = new ZipFile(new File(unzipFile), Charset.forName("GBK"));
            Enumeration<?> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                // 如果是文件夹，就创建个文件夹
                if (entry.isDirectory()) {
                    String dirPath = unzipFile.split("\\.")[0] + "/" + entry.getName();
                    File dir = new File(dirPath);
                    dir.mkdirs();
                } else {
                    // 如果是文件，就先创建一个文件，然后用io流把内容copy过去
                    File targetFile = new File(unzipFile.split("\\.")[0] + "/" + entry.getName());
                    // 保证这个文件的父文件夹必须要存在
                    if (!targetFile.getParentFile().exists()) {
                        targetFile.getParentFile().mkdirs();
                    }
                    targetFile.createNewFile();
                    // 将压缩文件内容写入到这个文件中
                    InputStream is = zipFile.getInputStream(entry);
                    FileOutputStream fos = new FileOutputStream(targetFile);
                    int len;
                    byte[] buf = new byte[1024];
                    while ((len = is.read(buf)) != -1) {
                        fos.write(buf, 0, len);
                    }
                    // 关流顺序，先打开的后关闭
                    fos.close();
                    is.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("unzip error from ZipUtils", e);
        } finally {
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return file.getAbsolutePath();
        }
    }

    /*
     * 修改文件名称
     * <br/>
     * @param srcFileName
     * @param newFileName
     * @returns java.lang.String
     * @author d
     * @date 2019/12/1 10:31
     */
    public Boolean newFileName(String freshFilePath,String pastFilePath){
        File srcFile = new File(freshFilePath);
        File newFile = new File(pastFilePath);
        boolean result = newFile.renameTo(srcFile);
        return result;
    }


    /*
     * 查找指定文件
     * <br/>
     * @param folder
     * @param keyword
     * @returns java.util.List<java.io.File>
     * @author d
     * @date 2019/12/1 10:52
     */
    public List<File> searchFiles(File folder, final String keyword) {
        final String keyname1=new StringBuilder(keyword).append(".ktr").toString();
        final String keyname2=new StringBuilder(keyword).append(".kjb").toString();
        List<File> result = new ArrayList<File>();
        List<String> info = new ArrayList<String>();
        if (folder.isFile()) result.add(folder);

        File[] subFolders = folder.listFiles(new FileFilter() {

            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return true;
                }
//
                if (file.getName().toLowerCase().equals(keyname1)||file.getName().toLowerCase().equals(keyname2) ) {
                    return true;
                }
                return false;
            }
        });
        if (subFolders != null) {
            for (File file : subFolders) {
                if (file.isFile()) {
                    // 如果是文件则将文件添加到结果列表中
                    result.add(file);
                } else {
                    // 如果是文件夹，则递归调用本方法，然后把所有的文件加到结果列表中
                    result.addAll(searchFiles(file, keyword));
                }
            }
        }
        return result;
    }

    /*
     * 删除指定文件
     * <br/>
     * @param file
     * @returns void
     * @author d
     * @date 2019/12/1 10:57
     */
    public void deleteDirectory(File file) {
        Boolean flage = false;
        if (file.isFile()) {// 表示该文件不是文件夹
            file.delete();

        } else {
            // 首先得到当前的路径
            String[] childFilePaths = file.list();
            for (String childFilePath : childFilePaths) {
                File childFile = new File(file.getAbsolutePath() + "/" + childFilePath);
                deleteDirectory(childFile);
            }
            file.delete();
        }
    }



    /*
     * 文件上传
     * <br/>
     * @param file 上传的文件
     * @returns java.lang.String  返回上传的文件绝对路径
     * @author d
     * @date 2019/12/3 5:23
     */
    public String upload( MultipartFile file) {
        if (file.isEmpty()) {
            return "";
        }
        String fileName = file.getOriginalFilename();
        if(!new File(path).exists())new File(path).mkdirs();
        File dest = new File(new StringBuffer(path).append("/").append(fileName).toString());
        try {
            file.transferTo(dest);
            return dest.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
