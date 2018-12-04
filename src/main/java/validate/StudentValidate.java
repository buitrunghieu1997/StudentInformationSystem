package validate;

import dao.impl.StudentDaoImpl;

public class StudentValidate {
	public boolean checkStudent(int idStudent) {
		return new StudentDaoImpl().checkStudent(idStudent);
	}
}
