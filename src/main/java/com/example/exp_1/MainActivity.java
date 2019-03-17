package com.example.exp_1;
import android.util.*;
import android.os.Bundle;
import android.app.Activity;
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","oncreate");
        // The activity is being created.
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onstart");
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onresume");
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onpause");
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onstop");
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","ondestroy");
        // The activity is about to be destroyed.
    }
}
