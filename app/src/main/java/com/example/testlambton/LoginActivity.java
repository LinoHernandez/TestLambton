package com.example.testlambton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
public static ArrayList<User>userList=new ArrayList<>();
EditText user,pass,name;
Button login;
public static String userN="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillData();
        setContentView(R.layout.activity_login);
        user=findViewById(R.id.etxUser);
        name=findViewById(R.id.etxName);
        pass=findViewById(R.id.etxPass);
        login=findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(verifyLogin(userList,user.getText().toString(),pass.getText().toString())){
                    userN=user.getText().toString();
                    Intent intent= new Intent(getBaseContext(),MainActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(getBaseContext(),"Invalid username or password",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void fillData(){
        userList.add(new User("student1","123456","Emir Mohen"));
        userList.add(new User("Lino1","54321","Lino Hernandez"));
        userList.add(new User("Trudeau1","canada","Trudeau Otta"));
        userList.add(new User("Pablo1","peter1","Pablo Pop"));

    }
    public boolean verifyLogin(ArrayList<User>userList,String userN, String passW){
        for(User usr:userList)
            if(usr.getUserName().equalsIgnoreCase(userN) && usr.getPassword().equals(passW))
                return true;
            return false;
    }
}