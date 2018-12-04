package logics.impl;

import dao.impl.DetailRegisterClassDaoImpl;
import entities.TblStudent;
import logics.DetailRegisterClassLogic;

import java.util.List;

/**
 *
 * @author Bui Minh Hieu
 */
public class DetailRegisterClassLogicImpl implements DetailRegisterClassLogic {
    /**
     * Phuong thuc nay tra ve danh sach sinh vien trong mot lop
     * @param classCode ma lop
     * @return list tra ve danh sach sinh vien trong mot lop
     */
    @Override
    public List<TblStudent> showListStudent(String classCode) {
        if(new DetailRegisterClassDaoImpl().checkClassCode(classCode)){/*Kiem tra xem co ton tai ma lop khong*/
            return new DetailRegisterClassDaoImpl().showListStudent(classCode);
        }
        return null;
    }

    @Override
    public boolean addDetailRegisterClassDao(int idRegister, int idSchedule, String classCode, int tuition, int midSempoint, int finalSempoint) {
        return  new DetailRegisterClassDaoImpl().addDetailRegisterClassDao(idRegister,idSchedule,classCode,tuition,midSempoint,finalSempoint);
    }

    @Override
    public boolean updateDetailRegisterClassDao(int idRegister, int idSchedule, String classCode, int tuition, int midSempoint, int finalSempoint) {
        return new DetailRegisterClassDaoImpl().updateDetailRegisterClassDao(idRegister,idSchedule,classCode,tuition,midSempoint,finalSempoint);
    }

    @Override
    public boolean deleteDetailRegisterClassDao(int idRegister, int idSchedule) {
        return new DetailRegisterClassDaoImpl().deleteDetailRegisterClassDao(idRegister,idSchedule);
    }

    @Override
    public boolean ermanentlyDetailRegisterClassDao(int idRegister, int idSchedule) {
        return new DetailRegisterClassDaoImpl().ermanentlyDetailRegisterClassDao(idRegister,idSchedule);
    }

    @Override
    public List showInfoClass(String classCode) {
        return new DetailRegisterClassDaoImpl().showInfoClass(classCode);
    }
}
