package com.packtpub.retrofit;

import retrofit.Call;
import retrofit.http.GET;

public interface RetrofitObjectAPI {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
    */
    @GET("api/RetrofitAndroidObjectResponse")
    Call<Student> getStudentDetails();
}