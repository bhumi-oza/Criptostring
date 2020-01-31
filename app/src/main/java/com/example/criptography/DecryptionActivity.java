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

public class DecryptionActivity extends AppCompatActivity {

    @BindView(R.id.btnSubmit)
    Button btnSubmit;
    @BindView(R.id.edtText)
    EditText editText;
    @BindView(R.id.txtResText)
    TextView txtResText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decryption);

        ButterKnife.bind(this);

        editText.setText("a1n1 1a1p2l1e1 1l1a2p1t1o1p2");

    }
    @OnClick(R.id.btnSubmit)
    public void clickEncrypt(Button button) {

        if (editText.getText().toString().isEmpty()) {
            txtResText.setText("");
            txtResText.setVisibility(View.VISIBLE);
            txtResText.setText("Enter some text to convert");

        }
        else {
            String s = editText.getText().toString();
            int i;
            int p = -1;
            String s1 = "";
            String s2 = "";
            txtResText.setText("");
            txtResText.setVisibility(View.VISIBLE);

            if (s.length() % 2 == 0) {
                for (i = 0; i < s.length(); i++) {
                    p = i;
                    s2 = s.charAt(i) + "";
                    i++;

                    char c = s.charAt(i);
                    boolean isDigit = (c >= '1' && c <= '9');
                    if (isDigit) {
                        for (int j = 0; j < Integer.parseInt(String.valueOf(s.charAt(i))); j++) {

                            if (j <= s.charAt(i)) {
                                s1 = s1 + s2;
                                txtResText.setText(s1);
                            } else {
                                break;
                            }
                        }

                        if (p != -1) {
                        }

                    } else {
                        txtResText.setText("");
                        txtResText.setVisibility(View.VISIBLE);
                        txtResText.setText("Enter some valid text to Decrypt");
                    }
                }

            } else {
                txtResText.setText("");
                txtResText.setVisibility(View.VISIBLE);
                txtResText.setText("Enter some valid text to Decrypt");
            }

        }

    }
}
