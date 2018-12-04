package controller;

import logics.impl.StudentLogicImpl;

import java.util.Scanner;

public class StudentControllerTest {
    public static void main(String[] args) {
        System.out.println("Nhap MSSV muon tra diem");
        int mSSV= new Scanner(System.in).nextInt();
        new StudentLogicImpl().showMark(mSSV);
    }
}
