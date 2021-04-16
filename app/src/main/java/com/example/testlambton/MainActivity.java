package com.example.testlambton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<Courses>coursesList=new ArrayList<>();
    //public static HashMap<String,String>coursesList=new HashMap<>();//
    /*ArrayAdapter<Courses> adapter = new ArrayAdapter<Courses>(
        MainActivity.this,
            android.R.layout.simple_spinner_dropdown_item,
            coursesList);*/

    TextView welcome;
    String userN;
    ArrayList<User>users=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillDataC();
        setContentView(R.layout.activity_main);
        welcome = findViewById(R.id.tvWelcome);
        userN=LoginActivity.userN;
        users=LoginActivity.userList;
        User user=findObject(userN,users);
        welcome.setText("Welcome "+user.getName());
    }
    public User findObject(String userN,ArrayList<User>users){
        for(User usr:users)
            if(usr.getUserName().equalsIgnoreCase(userN))
                return usr;
            return null;
    }

    public void fillDataC(){
        coursesList.add(new Courses("Java","1300","6"));
        coursesList.add(new Courses("Swift","1500","5"));
        coursesList.add(new Courses("iOS","1350","5"));
        coursesList.add(new Courses("Android","1400","7"));
        coursesList.add(new Courses("Database","1000","4"));
    }
}