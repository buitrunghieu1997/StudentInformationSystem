/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblDetailsubject;
import java.util.List;

/**
 *
 * @author vuduchiep
 */
public interface DetailSubjectDAO {
    

    public boolean add(int idDetailSubject, String idSubject, String idSubjectParent, Integer creditSubject, Integer creditTuition, Integer lenght, String subjectCode);

    public boolean update(int idDetailSubject, String idSubject, String idSubjectParent, Integer creditSubject, Integer creditTuition, Integer lenght, String subjectCode);

    public boolean delete(int idDetailSubject);
    
    public List<Object> displayListSubject();

    public TblDetailsubject checkExistDetailSubject(int idDetailSubject);

}
