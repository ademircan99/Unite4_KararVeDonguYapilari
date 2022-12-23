package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {

    EditText editTextTextMultiLine, editText_Sayilar;
    Button button_TekSayi, button_CiftSayi, button_TumSayi;
    int uzunluk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);

        editText_Sayilar = findViewById(R.id.editText_Sayilar);
        editTextTextMultiLine = findViewById(R.id.editTextTextMultiLine);
        button_TekSayi = findViewById(R.id.button_TekSayi);
        button_CiftSayi = findViewById(R.id.button_CiftSayi);
        button_TumSayi = findViewById(R.id.button_TumSayi);
    }

    public void button_CiftSayi(View view) {
        editTextTextMultiLine.setText("");
          uzunluk = Integer.parseInt(editText_Sayilar.getText().toString());
          for (int i = 0; i <= uzunluk; i++) {
              if (i % 2 == 0) {
                  editTextTextMultiLine.setText(editTextTextMultiLine.getText()+ "\n" + i);
              }
          }
    }
    public void button_TekSayi(View view) {
        editTextTextMultiLine.setText("");
        uzunluk = Integer.parseInt(editText_Sayilar.getText().toString());
        for (int i = 0; i <= uzunluk; i++) {
            if (i % 2 != 0) {
                editTextTextMultiLine.setText(editTextTextMultiLine.getText()+ "\n" +  i);
            }
        }
    }
    public void button_TumSayi(View view) {
        editTextTextMultiLine.setText("");
        uzunluk = Integer.parseInt(editText_Sayilar.getText().toString());
        for (int i = 0; i <= uzunluk; i++) {

                editTextTextMultiLine.setText(editTextTextMultiLine.getText() + "\n" + i);
            }
        }
    }


