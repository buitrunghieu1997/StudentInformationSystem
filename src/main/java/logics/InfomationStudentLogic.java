/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import entities.TblStudent;

import java.sql.Date;
import java.util.List;

/**
 * @author vuduchiep
 */
public interface InfomationStudentLogic {

    // Ham lay thong tin sinh vien theo 'idStudent'
    List<TblStudent> displayInfomationStudent(int idStudent);

    // Ham xu ly logic cap nhat thong tin sinh vien theo 'idStudent'
    boolean updateInfomationStudent(int idStudent, String fullName, String address, String phone, Date dateOfBith, String email);
}
