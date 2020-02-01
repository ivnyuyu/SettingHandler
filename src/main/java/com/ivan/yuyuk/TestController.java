package com.ivan.yuyuk;

import com.ivan.yuyuk.testStuff.StudentDao;

import javax.inject.Named;
import javax.swing.tree.TreeNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("TestController")
public class TestController implements Serializable {
    private List<Setting> settings;

    public List<Setting> getDataModel() {
        if(settings == null){

            settings = new ArrayList<>();
            settings.add(new Setting(1, "Some configuration"));
            settings.add(new Setting(2, "Another configuration"));
            settings.add(new Setting(1, "Some stuff"));
            StudentDao studentDao = new StudentDao();
            System.out.println("Результат: "+studentDao.getStudents().get(0).getName());
        }
        return settings;
    }

    public TestController() {

    }

    public String getValue() {
        return "The value";
    }

    public void setValue(String str) {

    }

    public class Setting implements Serializable {

        private int id;
        private String name;

        public Setting() {

        }

        public Setting(int id, String name) {
            this.id = id;
            this.name = name;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
