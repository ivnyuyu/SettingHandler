package com.ivan.yuyuk;

import com.ivan.yuyuk.entity.Setting;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("treeBean")
public class TreeBean {
    private TreeNode animalNode;

    public TreeBean() {
        animalNode = new DefaultTreeNode("Animal", null);
        addNode(animalNode, "Reptiles", "Lizard", "Snake", "Turtle");
        addNode(animalNode, "Insets", "Ladybird", "Butterfly", "Bee");
        addNode(animalNode, "Fish", "Goldfish", "Shark", "Swordfish");
        addNode(animalNode, "Birds", "Parrot", "Sparrow", "Kingfisher");
        addNode(animalNode, "Mammals", "Deer", "Human", "Ape");
    }

    private void addNode(TreeNode parentNode, String nodeName, String... children) {
        TreeNode node = new DefaultTreeNode(new Setting(1L,"New Setting"), parentNode);
        node.setExpanded(true);
        if (children != null) {
            for (String child : children) {
                addNode(node, child, null);
            }
        }
    }

    public TreeNode getAnimalNode() {
        return animalNode;
    }
}
