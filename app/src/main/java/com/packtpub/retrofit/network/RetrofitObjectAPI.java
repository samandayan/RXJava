package com.packtpub.retrofit.network;

import com.packtpub.retrofit.Student;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

;

public interface RetrofitObjectAPI {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
    */
    @GET("api/RetrofitAndroidObjectResponse")
    Observable<Student> getStudentDetails();

    @GET("api/RetrofitAndroidArrayResponse")
    Observable<List<Student>> getStudentList();
}