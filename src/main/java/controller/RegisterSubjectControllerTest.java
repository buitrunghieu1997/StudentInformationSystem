package controller;

import logics.impl.RegisterSubjecLogicImpl;

import java.util.Scanner;
// Bui Minh Hieu
public class RegisterSubjectControllerTest {
    public static void main(String[] args) {
        int idRegister,idSubject;
        String semester;
        System.out.println("Nhap ma dang ki: ");
        idRegister=new Scanner(System.in).nextInt();
        System.out.println("Nhap ma hoc phan: ");
        idSubject = new Scanner(System.in).nextInt();
        System.out.println("Nhap hoc ki can dang ki hoc phan: ");
        semester =new Scanner(System.in).nextLine();
        if(new RegisterSubjecLogicImpl().addRegisterSubject(idRegister,idSubject,semester)){
            System.out.println("Dang ki hoc phan thanh cong");
        }else{
            System.out.println("Dang ki hoc phan khong thanh cong");
        }
    }
}
