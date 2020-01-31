package com.example.criptography;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnEncrypt)
    Button  btnEncrypt;
    @BindView(R.id.btnDecrypt)
    Button btnDecrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnEncrypt)
    public void clickEncrypt(Button button) {

        Intent intent = new Intent(MainActivity.this,EncryptActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.btnDecrypt)
    public void clickDecrypt(Button button) {

        Intent intent = new Intent(MainActivity.this,DecryptionActivity.class);
        startActivity(intent);
    }
}
