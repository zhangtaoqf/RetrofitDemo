package com.qf.zt.retrofitdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 作者：Tony
 * 日期：2016年11月24日
 * 时间：上午 11:17
 */

public interface QsInter {
    /**
     *
     *  // 图片
     public final static String URL_PIC= "/article/list/pic";
     * @return
     */
    @GET("/article/list/{path}")
    Call<String> getDatas(@Path("path")String path,@Query("page")int page);


}
