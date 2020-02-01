package com.ivan.yuyuk.testStuff;

import java.util.List;
import com.ivan.yuyuk.entity.Setting;
public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Setting setting=new Setting(1L,"First setting");
        studentDao.saveStudent(setting);
        List <Setting> students = studentDao.getStudents();
        students.forEach(s->{
            System.out.println(s.getName());
        });
    }
}
