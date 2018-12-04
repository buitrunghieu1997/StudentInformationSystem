package controller;

import entities.TblDetailsubject;
import logics.impl.DetailSubjectLogicImpl;

import java.util.Scanner;

public class DetailSubjectControllerTest {
    public void addDetailSubject(){
        int detailSubject, idSubject;
        String semester, room, time;
        System.out.println("Nhap ma lop:");
        detailSubject =new Scanner(System.in).nextInt();
        System.out.println("Nhap ma hoc phan");
        idSubject= new Scanner(System.in).nextInt();
        System.out.println("Nhap hoc ki:");
        semester = new Scanner(System.in).nextLine();
        System.out.println("Nhap phong hoc:");
        room = new Scanner(System.in).nextLine();
        System.out.println("Nhap thoi gian hoc:");
        time = new Scanner(System.in).nextLine();
        if(new DetailSubjectLogicImpl().addDetailSubject(detailSubject,idSubject,semester,room,time)){
            System.out.println("Them lop hoc thanh cong");
        }else{
            System.out.println("Them lop hoc khong thanh cong");
        }
    }
    public void deleteDetailSubject(){
        int idDetailSubject;
        System.out.println("Nhap ma lop:");
        idDetailSubject =new Scanner(System.in).nextInt();
        if(new DetailSubjectLogicImpl().deleteDetailSubject(idDetailSubject)){
            System.out.println("Xoa lop hoc thanh cong");
        }else{
            System.out.println("Xoa lop hoc khong thanh cong");
        }
    }
    public void updateDetailSubject(){
        int detailSubject, idSubject;
        String semester, room, time;
        System.out.println("Nhap ma lop:");
        detailSubject =new Scanner(System.in).nextInt();
        System.out.println("Nhap ma hoc phan");
        idSubject= new Scanner(System.in).nextInt();
        System.out.println("Nhap hoc ki:");
        semester = new Scanner(System.in).nextLine();
        System.out.println("Nhap phong hoc:");
        room = new Scanner(System.in).nextLine();
        System.out.println("Nhap thoi gian hoc:");
        time = new Scanner(System.in).nextLine();
        if(new DetailSubjectLogicImpl().updateDetailSubject(detailSubject,idSubject,semester,room,time)){
            System.out.println("Update lop hoc thanh cong");
        }else{
            System.out.println("Update lop hoc khong thanh cong");
        }
    }
    public void searchDetailSubject(){
        int idDetailSubject;
        System.out.println("Nhap ma lop:");
        idDetailSubject =new Scanner(System.in).nextInt();
        TblDetailsubject tblDetailsubject=new DetailSubjectLogicImpl().searchDetailSubject(idDetailSubject);
        if(tblDetailsubject!=null){
            System.out.println("Thong tin lop:"+ tblDetailsubject.getIdDetailSubject()+"/"+tblDetailsubject.getIdSubject()+"/"+tblDetailsubject.getRoom());
        }else{
            System.out.println("Khong co lop can tim trong danh sach");
        }
    }
    public static void main(String[] args) {
        int choose;
        System.out.println("Danh sach cac chuc nang");
        System.out.println("1.Them lop hoc");
        System.out.println("2.Xoa lop hoc");
        System.out.println("3.Update thong tin ve lop hoc");
        System.out.println("4.Tim kiem lop hoc");
        System.out.println("Nhap lua chon ve chuc nang ma ban muon:");
        choose= new Scanner(System.in).nextInt();
        switch (choose){
            case 1:
                new DetailSubjectControllerTest().addDetailSubject();
                break;
            case 2:
                new DetailSubjectControllerTest().deleteDetailSubject();
                break;
            case 3:
                new DetailSubjectControllerTest().updateDetailSubject();
                break;
            case 4:
                new DetailSubjectControllerTest().searchDetailSubject();
                break;
        }
    }
}
