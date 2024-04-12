public class forSchleife {
    public static void main(String[] args) {
        // vorwärts
        System.out.println("vorwärts");
        int start = 0, end = 10;
        for (int j = start; j < end; j++) {
            System.out.println(j + " ");
        }

        System.out.println("rückwärts");
        // rückwärts
        for (int j = end; j > start; j-=2) {
            System.out.println(j + " ");
        }
    }
}
