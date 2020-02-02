package com.ivan.yuyuk;

import com.ivan.yuyuk.testStuff.StudentDao;
import org.primefaces.model.DefaultTreeNode;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.model.TreeNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("TestController")
@ViewScoped
public class TestController implements Serializable {
    private List<Setting> settings;

    TreeNode root;
    @PostConstruct
    public void init() {
        root = new DefaultTreeNode("Root", null);
        TreeNode node0 = new DefaultTreeNode("Node 0", root);
        TreeNode node1 = new DefaultTreeNode("Node 1", root);

        TreeNode node00 = new DefaultTreeNode("Node 0.0", node0);
        TreeNode node01 = new DefaultTreeNode("Node 0.1", node0);

        TreeNode node10 = new DefaultTreeNode("Node 1.0", node1);

        node1.getChildren().add(new DefaultTreeNode("Node 1.1"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.0"));
        node00.getChildren().add(new DefaultTreeNode("Node 0.0.1"));
        node01.getChildren().add(new DefaultTreeNode("Node 0.1.0"));
        node10.getChildren().add(new DefaultTreeNode("Node 1.0.0"));
        root.getChildren().add(new DefaultTreeNode("Node 2"));
    }

    public TreeNode getRoot() {
        return root;
    }

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
