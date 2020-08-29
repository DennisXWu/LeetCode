package 查找.BinarySearchTree;

/**
 * Created by wxg on 2020/8/27.
 */
public class Node {
    private int value;
    private Node rightNode;
    private Node leftNode;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
