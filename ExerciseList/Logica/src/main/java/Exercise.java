import java.util.*;

public class Exercise {
    public static void main(String[] args) {

        System.out.println("Olá!!");
        System.out.println("Insira uma lista numérica, separando cada elemento por ',': ");

        List<Integer> listOfNumbers = receivingListOfNumbersAndConvert();

        sortedListAndPrint(listOfNumbers);
    }

    private static List<Integer> receivingListOfNumbersAndConvert() {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();
        String[] numbers = scan.nextLine().split(",");


        for(String number : numbers) {
            try {
                int numberConvert = Integer.parseInt(number.trim());
                listOfNumbers.add(numberConvert);
            } catch (NumberFormatException exception) {
                System.out.printf("%s não é um número válido. \n", number);
            }
        }
        return listOfNumbers;
    }

    private static void sortedListAndPrint(List<Integer> list) {
        Collections.sort(list);

        // Pensei em converter o array para string e a printar, mas deixei assim por não saber qual seria melhor.
        System.out.println("Sua lista de números válidos ordenada de forma crescente: ");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
    }
}
