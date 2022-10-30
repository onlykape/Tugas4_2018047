package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class siam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siam);
    }

    public void ragdollklik(View view) {
        Intent a = new Intent(siam.this, ragdoll.class);
        startActivity(a);
    }
    public void persiaklik(View view) {
        Intent a = new Intent(siam.this, ragdoll.class);
        startActivity(a);
    }
    public void foldklik(View view) {
        Intent a = new Intent(siam.this, ragdoll.class);
        startActivity(a);
    }
    public boolean kembali(View view){
        onBackPressed();
        return true;
    }
    public void onBackPressed(){
        super.onBackPressed();
    }
}