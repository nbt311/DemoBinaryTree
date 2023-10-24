import src.MyTree;

public class Main {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(7);
        tree.insert(14);
        tree.insert(16);
        tree.readTree(tree.root);
    }
}
