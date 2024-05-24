package multiplicationTablePack;

import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MultiplicationTable multiplicationTable = new MultiplicationTableImpl();

        System.out.println("Digite o número que deseja a tabuada: ");
        int number = scan.nextInt();
        List<Integer> showMultiplicationTable = multiplicationTable.showMultiplicationTable(number);

        for (int i = 0; i < showMultiplicationTable.size(); i++) {
            System.out.printf("%d x %d = %d%n", number, i, showMultiplicationTable.get(i));
        }
    }
}
