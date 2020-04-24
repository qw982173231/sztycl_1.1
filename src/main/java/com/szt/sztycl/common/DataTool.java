package com.szt.sztycl.common;

import com.szt.sztycl.bean.DeleteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class DataTool {

    @Autowired
    DeleteInfo deleteInfo;

    @Transactional(rollbackFor = Exception.class)
    public Boolean deleteData(List<DeleteInfo> list){  //uuid 表名 中间表名 表名  中间表名  表名  中间表名 表名
        for (DeleteInfo deleteInfo:list) {

        }
        return false;//返回执行结束
    }
}
