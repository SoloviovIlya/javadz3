/** 
Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
*/
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.Collections;
import java.util.Iterator;

public class javadz3{
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        Random random = new Random();
        int i = 0;
        while (i<10){
            array1.add(random.nextInt(100) +1);
            i = i+1;
        }
        System.out.println("Изначальный список " + array1);
        System.out.println("Максимум: " + Collections.max(array1));
        System.out.println("Минимум: " + Collections.min(array1));
        double avg = array1.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Среднее значение : " + avg);
        for (Iterator<Integer> iterator = array1.iterator(); iterator.hasNext();) {
            int number = iterator.next();
            if (number % 2 == 0) {
            System.out.println("Удаляем: " + number);
            iterator.remove();
            }   
        }
        System.out.println("Список без чётных чисел " + array1);
    }
}