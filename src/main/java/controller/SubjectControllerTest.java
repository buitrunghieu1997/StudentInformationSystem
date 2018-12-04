package controller;

import dao.impl.SubjectDaoImpl;
import entities.TblSubject;
import logics.impl.SubjectLogicImpl;

import java.util.Scanner;

//Bui Minh Hieu//
public class SubjectControllerTest {
    public void addSubject(){
        int subject;
        String name;
        int creditSubject, credittuition;
        System.out.println("Nhap ma hoc phan: ");
        subject= new Scanner(System.in).nextInt();
        System.out.println("Nhap ten hoc phan:");
        name=new Scanner(System.in).next();
        System.out.println("Nhap so tin chi hoc phan: ");
        creditSubject=new Scanner(System.in).nextInt();
        System.out.println("Nhap so tin chi hoc phi");
        credittuition=new Scanner(System.in).nextInt();
        if(new SubjectLogicImpl().addSubject(subject,name,creditSubject,credittuition)){
            System.out.println("Them hoc phan thanh cong");
        }else{
            System.out.println("Them hoc phan khong thanh cong");
        }
    }
    public void deleteSubject(){
        int subject;
        System.out.println("Nhap ma hoc phan: ");
        subject= new Scanner(System.in).nextInt();
        if(new SubjectLogicImpl().deleteSubject(subject)){
            System.out.println("Xoa hoc phan thanh cong");
        }else{
            System.out.println("Xoa hoc phan khong thanh cong");
        }
    }
    public void updateSubject(){
        int subject;
        String name;
        int creditSubject, credittuition;
        System.out.println("Nhap ma hoc phan: ");
        subject= Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Nhap ten hoc phan:");
        name=new Scanner(System.in).next();
        System.out.println("Nhap so tin chi hoc phan: ");
        creditSubject=new Scanner(System.in).nextInt();
        System.out.println("Nhap so tin chi hoc phi");
        credittuition=new Scanner(System.in).nextInt();
        if(new SubjectLogicImpl().upateSubject(subject,name,creditSubject,credittuition)){
            System.out.println("Update hoc phan thanh cong");
        }else{
            System.out.println("Update hoc phan khong thanh cong");
        }
    }
    public void searchSubject(){
        int subject;
        System.out.println("Nhap ma hoc phan: ");
        subject= new Scanner(System.in).nextInt();
        if(new SubjectLogicImpl().searchSubject(subject)==null){
            System.out.println("Khong ton tan hoc phan can tim trong danh sach");
        }else{
            TblSubject tblSubject= new SubjectLogicImpl().searchSubject(subject);
            System.out.println("Thong tin ve hoc phan: "+ subject + "/"+ tblSubject.getName()+"/"+tblSubject.getCreditSubject()+"/"+tblSubject.getCreditTuition());
        }
    }
    public void addSubjectToFile(){
        new SubjectDaoImpl().addSubjectToFile();
    }
    public static void main(String[] args) {
        int choose;
        System.out.println("Danh sach cac chuc nang");
        System.out.println("1.Then hoc phan");
        System.out.println("2.Xoa hoc phan");
        System.out.println("3.Sua danh muc hoc phan");
        System.out.println("4.Tim kiem danh muc hoc phan");
        System.out.println("5.Them hoc phan tu file");
        System.out.println("Lua chon chuc nang ban muon:");
        choose= new Scanner(System.in).nextInt();
        switch (choose){
            case 1:
                new SubjectControllerTest().addSubject();
                break;
            case  2:
                new SubjectControllerTest().deleteSubject();
                break;
            case 3:
                new SubjectControllerTest().updateSubject();
                break;
            case 4:
                new SubjectControllerTest().searchSubject();
                break;
            case 5:
                new SubjectControllerTest().addSubjectToFile();
        }
    }
}
