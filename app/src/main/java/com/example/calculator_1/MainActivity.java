package com.example.calculator_1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.calculator_1.Operator.add;
import static com.example.calculator_1.Operator.divide;
import static com.example.calculator_1.Operator.multiply;
import static com.example.calculator_1.Operator.subtract;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //演算子指定ボタン
        Button operator_1 = (Button) findViewById(R.id.operator_1);
        Button operator_2 = (Button) findViewById(R.id.operator_2);
        Button operator_3 = (Button) findViewById(R.id.operator_3);
        Button operator_4 = (Button) findViewById(R.id.operator_4);

        operator_1.setOnClickListener(this);
        operator_2.setOnClickListener(this);
        operator_3.setOnClickListener(this);
        operator_4.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        //入力値チェック(UI側で検知したい。余裕あればvalidateクラスに切り出す)
        //引数二つあるかチェック
        //計算記号の未選択チェック(今回は2つ以上の洗濯もUI的には可能なので仕方なくここで確認する)
        //0除算チェック

        //クラス変数宣言
        int inputNum1;                  //入力値(画面項目の「引数1」の値)
        int inputNum2;                  //入力値(画面項目の「引数2」の値)
        Operator operator = null;                //入力値(画面項目の「計算記号」部分の値)

        //　入力値
        //　引数1
        EditText editTextFIZZ = findViewById(R.id.inputNum1);
        SpannableStringBuilder sbInputNum1 = (SpannableStringBuilder) editTextFIZZ.getText();
        inputNum1 = Integer.parseInt(sbInputNum1.toString());

        //　引数2
        EditText editTextBUZZ = findViewById(R.id.inputNum2);
        SpannableStringBuilder sbInputNum2 = (SpannableStringBuilder) editTextBUZZ.getText();
        inputNum2 = Integer.parseInt(sbInputNum2.toString());

        //出力値
        // 計算結果を表示するテキスト
        TextView calculateResult = findViewById(R.id.calculateResult);

        //演算子のフラグ
        switch (v.getId()) {
            case R.id.operator_1:
                operator = add;
                break;
            case R.id.operator_2:
                operator = subtract;
                break;
            case R.id.operator_3:
                operator = multiply;
                break;
            case R.id.operator_4:
                if (inputNum2 != 0) {
                    operator = divide;
                } else {
                    System.out.println("0除算です");
//                    calculateResult.setText(Message.MSG003);//ここで処理をおわらせたい、また後で
                }
                break;
        }

        Calculation calc = new Calculation(inputNum1, inputNum2, operator);

        //テキストを設定して表示
        calculateResult.setText(calc.calculate());
    }
}