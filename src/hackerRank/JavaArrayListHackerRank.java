package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayListHackerRank {
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                row.add(in.nextInt());
            }
            rows.add(row);
        }

        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList> listArray = new ArrayList<>();

        int numLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numLines; i++) {
            int numOfIntegers = scanner.nextInt();
            ArrayList<Integer> intArrayList = new ArrayList<Integer>();

            for (int j = 0; j < numOfIntegers; j++) {
                intArrayList.add(scanner.nextInt());
            }
            listArray.add(intArrayList);
            scanner.nextLine();
        }

        int numQueries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numQueries; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            scanner.nextLine();
            if (x < listArray.size() && y < listArray.get(x).size()) {
                System.out.println(listArray.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
