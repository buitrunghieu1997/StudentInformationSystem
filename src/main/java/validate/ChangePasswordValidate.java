/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

/**
 * @author vuduchiep
 */
public class ChangePasswordValidate {

    public boolean passwordValidate(String currentPassword, String newPassword, String confirmNewPassword) {

        if (currentPassword.equals("") || newPassword.equals("") || confirmNewPassword.equals("")) {
            return false;
        } else {
            return newPassword.equals(confirmNewPassword);
        }
    }
}
