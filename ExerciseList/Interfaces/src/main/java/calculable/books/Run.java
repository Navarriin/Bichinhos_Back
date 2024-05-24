package calculable.books;

import calculable.Calculable;

public class Run {
    public static void main(String[] args) {
        Calculable book = new Books(200, "10%");

        double valueBook = book.calculateFinalPrice();
        System.out.printf("O valor final do livro será: R$%.2f%n", valueBook);
    }
}
