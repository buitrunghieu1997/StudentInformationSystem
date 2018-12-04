package validate;

import dao.impl.StudentDaoImpl;

public class StudentValidate {
    public  boolean checkStudent(int idStudent){
        if(new StudentDaoImpl().checkStudent(idStudent)){
            return true;
        }
        return false;
    }
}
