import java.util.Random;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            int key = rand.nextInt(100);
            tree.put(key, "Value" + key);
        }

        System.out.println("Size of tree: " + tree.size());

        System.out.println("In-order traversal:");
        for (BST<Integer, String>.Node elem : tree.iterator()) {
            System.out.println("key is " + elem.key + " and value is " + elem.val);
        }

        int searchKey = 50;
        String result = tree.get(searchKey);
        if (result != null) {
            System.out.println("Found key " + searchKey + " with value: " + result);
        } else {
            System.out.println("Key " + searchKey + " not found");
        }

        int deleteKey = 25;
        tree.delete(deleteKey);
        System.out.println("After trying to delete key " + deleteKey + ":");
        for (BST<Integer, String>.Node elem : tree.iterator()) {
            System.out.println("key is " + elem.key + " and value is " + elem.val);
        }
    }
}
