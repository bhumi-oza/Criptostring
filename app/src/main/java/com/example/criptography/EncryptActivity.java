package com.example.criptography;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EncryptActivity extends AppCompatActivity {

    @BindView(R.id.btnSubmit)
    Button btnSubmit;
    @BindView(R.id.edtText)
    EditText editText;
    @BindView(R.id.txtResText)
    TextView txtResText;
    String s = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);

        ButterKnife.bind(this);

        editText.setText("an apple laaptopp");

    }

    @OnClick(R.id.btnSubmit)
    public void clickEncrypt(Button button) {
        if (editText.getText().toString().isEmpty()) {
            txtResText.setText("");
            txtResText.setVisibility(View.VISIBLE);
            txtResText.setText("Enter some text to convert");

        } else {

            txtResText.setText("");
            txtResText.setVisibility(View.VISIBLE);
            s = editText.getText().toString();
            String s1 = "";
            int count = 1;
            int i;
            for (i = 0; i < s.length(); i++) {
                if (i < s.length() - 1) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        for (int j = 0; j < (s.length() - (i + 1)); j++) {
                            if (s.charAt(i + j) == s.charAt(i + j + 1)) {
                                // Log.v("Encryption", "=>>  " + s.charAt(i + j) + " = " + s.charAt(i + j + 1));
                                count++;
                               /* Log.v("Encryption", "count is  " + count);
                                Log.v("Encryption", "logic is  " + (s.length() - (i + 1)));
                                Log.v("Encryption", "j is  " + j);*/
                            } else {
                                break;
                            }
                        }
                        i = i + (count - 1);
                        s1 = s1 + s.charAt(i) + count;
                        count = 1;
                    } else {
                        s1 = s1 + s.charAt(i) + count;
                        // Log.v("Encryption", "if not eq " + s1);
                    }
                } else {
                    s1 = s1 + s.charAt(i) + count;
                }
            }
            txtResText.setText(s1);
        }

    }
}
