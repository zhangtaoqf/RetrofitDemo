package com.qf.zt.retrofitdemo;

/**
 * Created by Administrator on 2016/10/17.
 */

public class AppInterface {
    public final static String BASE_URL="http://m2.qiushibaike.com";
    // 最新
    public final static String URL_LATEST ="/article/list/latest";

    // 图片
    public final static String URL_PIC= "/article/list/pic";

    // 视频
    public final static String URL_VIDEO = "/article/list/video";

    // 文本
    public final static String URL_TEXT = "/article/list/text";

    /************************查询参数都为 page ***********************************/

    //头像获取(+ id掉后4位 + "/" + id + "/thumb/" + icon图片名.jpg)
    //userIcon======http://pic.qiushibaike.com/system/avtnew/1499/14997026/thumb/20140404194843.jpg
    public final static String URL_USER_ICON="http://pic.qiushibaike.com/system/avtnew/%d/%d/thumb/%s";

    //内容图片获取(+图片名所有数字去掉后4位+"/"+图片名从数字开始数全部+"/"+"/"+small或者medium+"/"+图片名)
    //====图片Url=http://pic.qiushibaike.com/system/pictures/7128/71288069/small/app71288069.jpg
    public final static String URL_IMAGE= "http://pic.qiushibaike.com/system/pictures/%s/%s/%s/%s";
}
