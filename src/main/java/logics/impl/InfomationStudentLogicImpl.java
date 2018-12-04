/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics.impl;

import dao.impl.InfomationStudentDAOImpl;
import entities.TblStudent;
import logics.InfomationStudentLogic;
import validate.InfomationStudentValidate;

import java.sql.Date;
import java.util.List;

/**
 * @author vuduchiep
 */
public class InfomationStudentLogicImpl implements InfomationStudentLogic {

    InfomationStudentDAOImpl info = new InfomationStudentDAOImpl();

    @Override
    public List<TblStudent> displayInfomationStudent(int idStudent) {


        return info.list(idStudent);
    }

    @Override
    public boolean updateInfomationStudent(int idStudent, String fullName, String address, String phone, Date dateOfBith, String email) {

        if (new InfomationStudentValidate().infoStudentValidate(fullName, address, phone, dateOfBith, email)) {
            return info.update(idStudent, fullName, address, phone, dateOfBith, email);
        }
        return false;
    }

}
