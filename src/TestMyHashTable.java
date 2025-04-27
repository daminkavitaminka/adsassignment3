public class TestMyHashTable {
    public static void main(String[] args) {
        MyHashTable<Integer, String> table = new MyHashTable<>();

        table.put(1, "One");
        table.put(2, "Two");
        table.put(3, "Three");

        System.out.println("Test 1:");
        System.out.println("Expected: One, Actual: " + table.get(1));
        System.out.println("Expected: Two, Actual: " + table.get(2));
        System.out.println("Expected: Three, Actual: " + table.get(3));
        System.out.println();

        table.put(2, "Two Updated");
        System.out.println("Test 2:");
        System.out.println("Expected: Two Updated, Actual: " + table.get(2));
        System.out.println();

        table.remove(1);
        System.out.println("Test 3:");
        System.out.println("Expected: null, Actual: " + table.get(1));
        System.out.println();

        System.out.println("Test 4:");
        System.out.println("Expected size: 2, Actual size: " + table.size());
    }
}
