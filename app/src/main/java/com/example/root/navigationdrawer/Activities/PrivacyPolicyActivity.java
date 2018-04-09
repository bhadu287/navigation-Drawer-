package com.example.root.navigationdrawer.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.root.navigationdrawer.R;

public class PrivacyPolicyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.notifications, menu);
//        return true;
//    }
//
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        int id =item.getItemId();
//        if(id == R.id.action_clear_notifications){
//            Toast.makeText(getApplicationContext(),"all notification cleared !",Toast.LENGTH_LONG).show();
//        }
//        return true;
//    }
}
