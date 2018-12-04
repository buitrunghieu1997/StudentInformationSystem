/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import dao.impl.SubjectDaoImpl;

/**
 *
 * @author vuduchiep
 */
public class ScheduleValidate {
    
    public boolean validate(String idSubject, int idSchedule, String room, String time, Integer startWeek, Integer size, Integer maxSize, Integer status, Integer stt){
        
        if(!idSubject.equals("") || !room.equals("") || !time.equals("") || !startWeek.equals("") || !size.equals("") || !maxSize.equals("") || !status.equals("") || !stt.equals("")){
            if(new SubjectDaoImpl().searchSubject(idSubject) != null){
                return true;
            }
            return false;
        }
        return false;
    }
}
