package com.example.calculator_1;

public class Calculation {
    int inputNum1;                  //入力値(画面項目の「引数1」の値)
    int inputNum2;                  //入力値(画面項目の「引数2」の値)
    Operator operator;              //入力値(画面項目の「計算記号」部分の値)
    int calculateResult;            //出力値(画面項目の「計算結果」部分の値)

    public Calculation(int inputNum1, int inputNum2, Operator operator) {
        this.inputNum1 = inputNum1;
        this.inputNum2 = inputNum2;
        this.operator = operator;
    }

    String calculate() {

        switch (operator) {
            case add:
                calculateResult = inputNum1 + inputNum2;
                break;
            case subtract:
                calculateResult = inputNum1 - inputNum2;
                break;
            case multiply:
                calculateResult = inputNum1 * inputNum2;
                break;
            case divide:
                calculateResult = inputNum1 / inputNum2;
                break;
        }
        return String.valueOf(calculateResult);
    }
}
