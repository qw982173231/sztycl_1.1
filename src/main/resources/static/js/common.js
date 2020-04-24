/**
 * @Description
 *  将指定的form表单数据格式化为json对象
 * @Param
 * @return
 * @Date 13:42 2020/4/15
 * @Author 杜雁辉
 **/
function formDataFormat(formId) {
    var formData = $("#"+formId).form().serializeArray();
    var formDataJson={};
    formData.forEach(function (node) {
        formDataJson[node.name]=node.value;
    })
    return formDataJson;
}

/**
 * @Description
 *  表单恢复默认
 * @Param
 * @return
 * @Date 15:18 2020/4/15
 * @Author 杜雁辉
 **/
function formRest(status,data,formId) {
    if (status == 1){
        $("#"+formId).form('load',data);
    } else {
        $("#"+formId).form('reset');
    }

}

/*
* 设置选择查询时间的控件格式
* <br/>
* @param null
* @returns
* @author d
* @date 2019/12/23 15:09
*/
function myformatter(date){
    var y = date.getFullYear();
    var m = date.getMonth()+1;
    var d = date.getDate();
    return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
}

function myparser(s){
    if (!s) return new Date();
    var ss = (s.split('-'));
    var y = parseInt(ss[0],10);
    var m = parseInt(ss[1],10);
    var d = parseInt(ss[2],10);
    if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
        return new Date(y,m-1,d);
    } else {
        return new Date();
    }
}

//在右边center区域打开菜单，新增tab
function Open(text, url) {

    if ($("#tabs").tabs('exists', text)) {
        $('#tabs').tabs('select', text);
    } else {
        $('#tabs').tabs('add', {
            title: text,
            closable: true,
            content: url
        });
    }
};