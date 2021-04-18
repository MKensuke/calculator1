package com.example.calculator_1;

//メッセージを管理するクラス、エラーメッセージも通常メッセージもここで管理
public enum Message {
    MSG001 {
        @Override
        public String toString() {
            return "数字を二つ入力してください";
        }
    },
    MSG002 {
        @Override
        public String toString() {
            return "0除算です";
        }
    },
}
