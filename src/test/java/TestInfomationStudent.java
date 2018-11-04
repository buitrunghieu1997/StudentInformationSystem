
import entities.TblStudent;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import logics.impl.InfomationStudentLogicImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vuduchiep
 */
public class TestInfomationStudent {

    InfomationStudentLogicImpl info = new InfomationStudentLogicImpl();

    public void display() {

        System.out.println("Nhap idStudent: ");
        int idStudent = new Scanner(System.in).nextInt();

        List<TblStudent> listInfo = info.displayInfomationStudent(idStudent);

        System.out.println("Ho ten SV: " + listInfo.get(0).getFullname());
        System.out.println("Dia chi: " + listInfo.get(0).getAddress());
        System.out.println("Ngay sinh: " + listInfo.get(0).getDateofbirth());
        System.out.println("Dien thoai: " + listInfo.get(0).getPhonenumber());
        System.out.println("Email: " + listInfo.get(0).getEmail());
    }

    public void update() {

        System.out.println("Nhap idStudent: ");
        int idStudent = new Scanner(System.in).nextInt();

        System.out.println("Nhap ho va ten: ");
        String fullName = new Scanner(System.in).nextLine();

        System.out.println("Nhap dia chi: ");
        String address = new Scanner(System.in).nextLine();

        System.out.println("Nhap so dien thoai: ");
        String phone = new Scanner(System.in).nextLine();

        System.out.println("Nhap email: ");
        String email = new Scanner(System.in).nextLine();

        System.out.println("Nhap ngay sinh (1 <= ngay <= 31): ");
        int ngay = new Scanner(System.in).nextInt();

        System.out.println("Nhap thang sinh (1 <= thang <= 12): ");
        int thang = new Scanner(System.in).nextInt();

        System.out.println("Nhap nam sinh: ");
        int nam = new Scanner(System.in).nextInt();

        if (info.updateInfomationStudent(idStudent, fullName, address, phone, new Date(ngay, thang, nam), email)) {
            System.out.println("Cap nhat thanh cong");
        } else {
            System.out.println("That bai");
        }

    }

    public static void main(String[] args) {

        boolean temp = true;

        do {
            System.out.println("==================MENU==================");
            System.out.println("0. Thoat");
            System.out.println("1. Xem thong tin sinh vien");
            System.out.println("2. Cap nhat thong tin sinh vien");

            System.out.println("========================================");
            System.out.println("Moi ban chon: ");
            int option = new Scanner(System.in).nextInt();

            switch (option) {
                case 0:
                    temp = false;
                    break;
                case 1:
                    new TestInfomationStudent().display();
                    break;
                case 2:
                    new TestInfomationStudent().update();
                    break;

                default:
                    System.out.println("Khong hop le");
                    break;
            }
        } while (temp);
    }

}
