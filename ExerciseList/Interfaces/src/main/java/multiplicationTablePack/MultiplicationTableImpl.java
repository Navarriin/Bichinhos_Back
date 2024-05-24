package multiplicationTablePack;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTableImpl implements MultiplicationTable{

    @Override
    public List<Integer> showMultiplicationTable(int number) {
        List<Integer> listNumbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            listNumbers.add(number * i);
        }
        return listNumbers;
    }
}
