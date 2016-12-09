package com.packtpub.retrofit.network;

import android.support.annotation.NonNull;

import com.packtpub.retrofit.Student;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Sam on 12/8/2016.
 */
public class NetworkManager {
    public static void retrieveStudentName(
            @NonNull final RetrofitObjectAPI retrofitObjectAPI,
            @NonNull final int numberOfStudents,
            @NonNull final Subscriber<Student> subscriber) {
            retrofitObjectAPI.getStudentDetails(numberOfStudents)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.newThread())
                    .subscribe(subscriber);
    }
}
