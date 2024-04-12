package Arrays;

public class test1 {
    public static void main(String[] args) {
        double[] randoms;
        randoms = new double[10];
        randoms[0] = Math.random();
        //randoms[1] = randoms[0] * 2;

        for (int i = 0; i <= randoms.length; i++) {
            if (i != randoms.length-1) {
                randoms[i+1] = randoms[i] * 2;
            } else break;
            System.out.println("Das " + (i+1) + ". Element von randoms: " + randoms[i]);
        }

        System.out.println(randoms[9]);
    }
}
