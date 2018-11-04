package controller;

import dao.impl.ToeicDaoImpl;
import entities.TblToeic;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ToeicControllerTest {
    public static void main(String[] args) {
        System.out.println("Cac chuc nang can test");
        System.out.println("1.Them diem toeic");
        System.out.println("2.Xoa diem toeic");
        System.out.println("3.Update diem toeic");
        System.out.println("4.Tim kiem diem toeic");
        int choose;
        System.out.println("Chon chuc nang can test");
        choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
                new ToeicControllerTest().addToeic();
                break;
            case 2:
                new ToeicControllerTest().deleteToeic();
                break;
            case 3:
                new ToeicControllerTest().updateToeic();
                break;
            case 4:
                new ToeicControllerTest().searchToeic();
        }
    }

    public void addToeic() {
        System.out.println("Nhap idStudent");
        int id = new Scanner(System.in).nextInt();
        System.out.println("Nhap hoc ki");
        String semester = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngay thi");
        System.out.println("Nhap ngay");
        int ngay = new Scanner(System.in).nextInt();
        System.out.println("Nhap thang");
        int thang = new Scanner(System.in).nextInt();
        System.out.println("Nhap nam");
        int nam = new Scanner(System.in).nextInt();
        System.out.println("Nhap diem");
        int point = new Scanner(System.in).nextInt();
        if (new ToeicDaoImpl().addToeic(id, semester, new Date(ngay, thang, nam), point)) {
            System.out.println("Them thanh cong");
        } else {
            System.out.println("them that bai");
        }
    }

    public void deleteToeic() {
        System.out.println("Nhap idStudent");
        int id = new Scanner(System.in).nextInt();
        if (new ToeicDaoImpl().deleteToeic(id)) {
            System.out.println("Xoa diem toeic thanh cong");
        } else {
            System.out.println("Xoa diem toiec khong thanh cong");
        }
    }

    public void updateToeic() {
        System.out.println("Nhap idStudent");
        int id = new Scanner(System.in).nextInt();
        System.out.println("Nhap hoc ki");
        String semester = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngay thi");
        System.out.println("Nhap ngay");
        int ngay = new Scanner(System.in).nextInt();
        System.out.println("Nhap thang");
        int thang = new Scanner(System.in).nextInt();
        System.out.println("Nhap nam");
        int nam = new Scanner(System.in).nextInt();
        System.out.println("Nhap diem");
        int point = new Scanner(System.in).nextInt();
        if (new ToeicDaoImpl().updateToeic(id, semester, new Date(ngay, thang, nam), point)) {
            System.out.println("Update thanh cong");
        } else {
            System.out.println("Update that bai");
        }
    }

    public void searchToeic() {
        System.out.println("Nhap idStudent");
        int id = new Scanner(System.in).nextInt();
        if (new ToeicDaoImpl().searchToeic(id) != null) {
            // System.out.println("Xoa diem toeic thanh cong");
            List     danhSach = new ToeicDaoImpl().searchToeic(20151290);
            Iterator iterator = danhSach.iterator();
            {
                TblToeic toeic = (TblToeic) iterator.next();
                System.out.println(toeic.getIdstudent());
                System.out.println(toeic.getSemester());
                System.out.println(toeic.getDate());
                System.out.println(toeic.getPoint());
            }
            while (iterator.hasNext()) ;
        } else {
            System.out.println("Danh sach rong");
        }
    }
}
