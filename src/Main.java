public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {1, 4, 2, 5, 6};
        int[] b = {4, 2, 2, 7, 9};
        int n = 5;
        char[] c = {'a','d','d','b','d'};
        int a1 = main.task261(a);
        int b1 = main.task261(b);
        System.out.println("Task 261) " + a1 * b1);

        int aQarakusi = main.task270(a);
        int bQarakusi = main.task270(b);
        System.out.println("Task 270) " + aQarakusi + bQarakusi);

        boolean c1 = main.task272(c, n);

        System.out.println("Task 272) " + c1);

        char[] d = main.task277(c);
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
    }

    public int task261(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int j : arr) {
            sum += j;
            count++;
        }
        return sum / count;
    }

    public int task270(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (arr[i] * arr[i]);
        }
        return sum;
    }

    public boolean task272(char[] arr, int n) {
        boolean t = true;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'b') {
                count++;
            }
        }
        if (count >= n / 2) {
            return t;
        } else {
            t = false;
            return t;
        }
    }

    public char[] task277(char[] a) {
        int countOfD = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'd') {
                countOfD++;
            }
        }
        char[] b = new char[a.length-countOfD];
        for (int i = 0; i < b.length; i++) {
            if (a[i] == 'd') {
                continue;
            }
            b[i] = a[i];
        }
        return b;
    }

}