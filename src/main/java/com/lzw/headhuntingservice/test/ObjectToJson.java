package com.lzw.headhuntingservice.test;

import com.lzw.headhuntingservice.bean.Applicant;
import net.sf.json.JSONObject;
import org.junit.Test;


public class ObjectToJson {
    Applicant applicant;

    @Test
    public void ApplicantToJson(){
        applicant=new Applicant();
        applicant.setId(1);
        applicant.setName("lin");
        applicant.setGender("man");
        applicant.setAge(22);
        applicant.setEducation("abc");
        applicant.setTel("0920329125");
        applicant.setResume("txt");

        JSONObject jsonObject=JSONObject.fromObject(applicant);
        System.out.println(jsonObject);
    }
}
