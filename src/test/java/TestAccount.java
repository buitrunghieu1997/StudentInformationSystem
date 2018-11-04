

import dao.impl.AccountDAOImpl;
import java.util.Date;
import java.util.Scanner;
import logics.impl.AccountLogicImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vuduchiep
 */
public class TestAccount {
    
    AccountDAOImpl accountDAOImpl = new AccountDAOImpl();
    AccountLogicImpl accountLogicImpl = new AccountLogicImpl();

    public void addAccount() {

        System.out.println("Nhap idAccount: ");
        int id = new Scanner(System.in).nextInt();

        System.out.println("Nhap username: ");
        String username = new Scanner(System.in).nextLine();

        System.out.println("Nhap password: ");
        String password = new Scanner(System.in).nextLine();

        System.out.println("Nhap idPermission: ");
        Integer idPermission = new Scanner(System.in).nextInt();
        
        System.out.println("Nhap stt: ");
        Integer stt = new Scanner(System.in).nextInt();
        
        System.out.println("Nhap ngay: ");
        int ngay = new Scanner(System.in).nextInt();
        
        System.out.println("Nhap thang: ");
        int thang = new Scanner(System.in).nextInt();
        
        System.out.println("Nhap nam: ");
        int nam = new Scanner(System.in).nextInt();

        if (accountDAOImpl.addAccount(id, username, password, idPermission, stt, (java.sql.Date) new Date(ngay, thang, nam))) {
            System.out.println("Them thanh cong");
        } else {
            System.out.println("Them that bai");

        }
    }

    public void login() {

        System.out.println("Nhap username: ");
        String username = new Scanner(System.in).nextLine();

        System.out.println("Nhap password: ");
        String password = new Scanner(System.in).nextLine();

        if (accountLogicImpl.login(username, password)) {
            System.out.println("Dang nhap thanh cong");
        } else {
            System.out.println("Dang nhap that bai");
        }
    }
    
    public void changePassword(){
        System.out.println("Nhap username: ");
        String username = new Scanner(System.in).nextLine();

        System.out.println("Nhap password hien tai: ");
        String currentPassword = new Scanner(System.in).nextLine();
        
        System.out.println("Nhap password moi: ");
        String newPassword = new Scanner(System.in).nextLine();

        System.out.println("Xac nhan password moi: ");
        String confirmNewPassword = new Scanner(System.in).nextLine();
        
        if(accountLogicImpl.changePassword(username, currentPassword, newPassword, confirmNewPassword)){
            System.out.println("Doi mat khau thanh cong");
        }
        else{
            System.out.println("Doi mat khau that bai");
        }
    }

    public void deleteAccount() {

        System.out.println("Nhap idAccount: ");
        int id = new Scanner(System.in).nextInt();

        if (accountDAOImpl.deleteAccount(id)) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Xoa that bai");
        }
    }

    public static void main(String[] args) {

        boolean temp = true;
        do {
            System.out.println("==================MENU==================");
            System.out.println("0. Thoat");
            System.out.println("1. Them tai khoan");
            System.out.println("2. Xoa tai khoan");
            System.out.println("3. Doi mat khau");
            System.out.println("4. Dang nhap");

            System.out.println("========================================");
            System.out.println("Moi ban chon: ");
            int option = new Scanner(System.in).nextInt();
            

            switch (option) {
                case 0:
                    temp = false;
                    break;
                case 1:
                    new TestAccount().addAccount();
                    break;
                case 2:
                    new TestAccount().deleteAccount();
                    break;
                case 3:
                    new TestAccount().changePassword();
                    break;
                case 4:
                    new TestAccount().login();
                    break;
                default:
                    System.out.println("Khong hop le");
                    break;
            }

        } while (temp);
    }
}
