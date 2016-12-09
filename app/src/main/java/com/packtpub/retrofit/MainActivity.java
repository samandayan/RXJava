package com.packtpub.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.packtpub.retrofit.network.ClientManager;
import com.packtpub.retrofit.network.NetworkManager;
import com.packtpub.retrofit.network.RetrofitObjectAPI;
import com.packtpub.retrofit.util.Constants;

import rx.Subscriber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ButtonObject = (Button) findViewById(R.id.RetrofitObject);

        ButtonObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getRetrofitObject();
            }
        });
    }

    public void getRetrofitObject() {
        NetworkManager.retrieveStudentName(ClientManager.getRetrofitOjectProvider(RetrofitObjectAPI.class), Constants.NUMBER_OF_STUDENT, new Subscriber<Student>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Student student) {
                Toast.makeText(getApplicationContext(), student.getStudentName(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
