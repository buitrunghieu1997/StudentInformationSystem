package dao;

//Bui Minh Hieu
public interface DetailRegisterSubject {
	boolean addDetailRegisterSubject(int idRegister, int idDetailRegister, Integer idSubject);
	
	boolean deleteDetailRegisterSubject(int idRegister);
}
