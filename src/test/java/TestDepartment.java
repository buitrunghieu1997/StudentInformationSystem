import logics.impl.DepartmentLogicImpl;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author vuduchiep
 */
public class TestDepartment {
	
	private DepartmentLogicImpl departmentLogicImpl = new DepartmentLogicImpl();
	
	public void insert() {
		
		System.out.println("Nhap idDepartment: ");
		int id = new Scanner(System.in).nextInt();
		
		System.out.println("Nhap name: ");
		String name = new Scanner(System.in).nextLine();
		
		System.out.println("Nhap description: ");
		String description = new Scanner(System.in).nextLine();
		
		
		if (departmentLogicImpl.insertDepartment(id, name, description)) {
			System.out.println("Them thanh cong");
		} else {
			System.out.println("Them that bai");
			
		}
	}
	
	public void update() {
		
		System.out.println("Nhap idDepartment: ");
		int id = new Scanner(System.in).nextInt();
		
		System.out.println("Nhap name: ");
		String name = new Scanner(System.in).nextLine();
		
		System.out.println("Nhap desciption: ");
		String description = new Scanner(System.in).nextLine();
		
		if (departmentLogicImpl.updateDepartment(id, name, description)) {
			System.out.println("Doi mat khau thanh cong");
		} else {
			System.out.println("Doi mat khau that bai");
		}
	}
	
	public void deleteAccount() {
		
		System.out.println("Nhap idDepartment: ");
		int id = new Scanner(System.in).nextInt();
		
		if (departmentLogicImpl.deleteDepartment(id)) {
			System.out.println("Xoa thanh cong");
		} else {
			System.out.println("Xoa that bai");
		}
	}
}
