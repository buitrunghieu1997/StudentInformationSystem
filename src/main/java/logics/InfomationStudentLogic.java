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

    /**
     * Ham lay thong tin sinh vien theo 'idStudent'
     *
     * @param idStudent
     * @return
     */
    List<TblStudent> displayInfomationStudent(int idStudent);

    /**
     * Ham xu ly logic cap nhat thong tin sinh vien theo 'idStudent'
     *
     * @param idStudent
     * @param fullName
     * @param address
     * @param phone
     * @param dateOfBirth
     * @param email
     * @return
     */
    boolean updateInfomationStudent(int idStudent, String fullName, String address, String phone, Date dateOfBirth, String email);
}
