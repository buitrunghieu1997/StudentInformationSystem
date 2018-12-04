package logics.impl;

import dao.impl.StudentDaoImpl;
import entities.TblVPersonalscoreboard;
import logics.StudentLogic;
import validate.StudentValidate;

import java.util.List;

public class StudentLogicImpl implements StudentLogic {
    @Override
    public List showMark(int idStudent) {
        if(new StudentValidate().checkStudent(idStudent)){
            return new StudentDaoImpl().showMark(idStudent);
        };
        return null;
    }

    @Override
    public int searchTuition(int idStudent, String semester) {
        return new StudentDaoImpl().searchTuition(idStudent,semester);
    }

    @Override
    public List<TblVPersonalscoreboard> displayPersonalScoreboard(int idStudent) {

        return new StudentDaoImpl().displayPersonalScoreboard(idStudent);
    }
}
