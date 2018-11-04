package dao;

import entities.TblToeic;

import java.sql.Date;
import java.util.List;

public interface ToeicDao {
    boolean addToeic(int idStudent, String semester, Date date, Integer point);

    boolean deleteToeic(int idStudent);

    boolean updateToeic(int idStudent, String semester, Date date, Integer point);

    List<TblToeic> searchToeic(int idStudent);
}
