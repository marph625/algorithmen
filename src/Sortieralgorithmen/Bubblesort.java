package Sortieralgorithmen;

public class Bubblesort {
    static int[] ul = {4, 1, 6, 3, 5, 2};

    static void bubble_sort(int[] list) {
        int n = list.length;

        for (int i = 0; i < (n-1); i++) {
            boolean tausch = false;
            for (int j = 0; j < (n - i - 1); j++) {
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    tausch = true;
                }
            }
            if (!tausch) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Unsortierte Elemente einer Liste:");
        for (int t = 0; t < ul.length; t++) {
            System.out.println(ul[t]);
        }

        bubble_sort(ul);
        System.out.println("Sortierte Elemente einer Liste:");
        for (int t = 0; t < ul.length; t++) {
            System.out.println(ul[t]);
        }
    }
}
