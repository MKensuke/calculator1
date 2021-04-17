package com.example.calculator_1;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタン
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //出力値
        String strOUTFIZZBUZZ = "";
        //入力値
        int iInputnum;
        //入力値FIZZ値
        int iInputFIZZ;
        //入力値BUZZ値
        int iInputBUZZ;

        int iFizzFlag = 0;
        int iBuzzFlag = 0;

        // 数値FIZZBUZZを表示するテキスト
        TextView textView = findViewById(R.id.textView1);
        //　入力値
//        EditText editText = findViewById(R.id.editText1);
//        SpannableStringBuilder sb = (SpannableStringBuilder) editText.getText();
//        String string1 = sb.toString();
//        iInputnum = Integer.parseInt(string1);
        //　FIZZ値
        EditText editTextFIZZ = findViewById(R.id.editTextFIZZ);
        SpannableStringBuilder sbfizz = (SpannableStringBuilder) editTextFIZZ.getText();
        String stringfizz = sbfizz.toString();
        iInputFIZZ = Integer.parseInt(stringfizz);
        //　BUZZ値
        EditText editTextBUZZ = findViewById(R.id.editTextBUZZ);
        SpannableStringBuilder sbbuzz = (SpannableStringBuilder) editTextBUZZ.getText();
        String stringbuzz = sbbuzz.toString();
        iInputBUZZ = Integer.parseInt(stringbuzz);

//        //フラグ設定
//        if (0 == (iInputFIZZ % iInputnum)) {
//            iFizzFlag = 1;
//        }

//        if (0 == (iInputBUZZ % iInputnum)) {
//            iBuzzFlag = 1;
//        }

        // iFizzFlagが立っている場合、FIZZを設定
        if (1 == iFizzFlag) {
            strOUTFIZZBUZZ = strOUTFIZZBUZZ + "FIZZ";
        }

        // iBuzzFlagが立っている場合、BUZZを設定
        if (1 == iBuzzFlag) {
            strOUTFIZZBUZZ = strOUTFIZZBUZZ + "BUZZ";
        }

        // フラグ立ってない場合、出力値に入力した値を設定
//        if ((0 == iFizzFlag) && (0 == iBuzzFlag)) {
//            strOUTFIZZBUZZ = String.valueOf(iInputnum);
//        }
        // strOUTFIZZBUZZをテキストを設定して表示
        textView.setText(strOUTFIZZBUZZ);

//        FIZZBUZZ fizzbuzz = new FIZZBUZZ(iInputFIZZ, iInputBUZZ);
//
//        strOUTFIZZBUZZ = fizzbuzz.FIZZBUZZStrChk(iInputnum);
    }
}