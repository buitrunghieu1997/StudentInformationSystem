package validate;


import utils.Constants;

/**
 *
 * @author Bui Minh Hieu
 */
public class RegisterSubjectValidate {
    /**
     * Phuong thuc nay kiem tra xem viec dang ki hoc phan co nhieu hon tin chi cho phep hay khong
     * @param currentCredit tin chi da dang ki hien tai
     * @param creditSubject tin chi cua mon hoc dinh dang ki
     * @return boolean neu nho hon hoac bang ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
   public boolean checkSumCredit(int currentCredit, int creditSubject){
       if((currentCredit+creditSubject)<= Constants.MAX_CREDIT_REGISTER)return true;
       return false;
   }
}
