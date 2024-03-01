package com.example;

public class Demo {
    // Phương thức cộng
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Phương thức trừ
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Phương thức nhân
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Phương thức chia
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Lỗi: Không thể chia cho 0");
            return Double.NaN; // Trả về NaN (không có kết quả) trong trường hợp lỗi
        }

    }
}
