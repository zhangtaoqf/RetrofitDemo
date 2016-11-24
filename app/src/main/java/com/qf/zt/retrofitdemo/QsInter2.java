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

public interface QsInter2 {
    /**
     *
     * http://m2.qiushibaike.com/article/list/text?page=%d
     public final static String URL_PIC= "/article/list/pic";
     * @return
     */
    @GET("/article/list/{path}")
    Call<QsEntity> getDatas(@Path("path") String path, @Query("page") int page);


}
