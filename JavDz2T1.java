// 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class JavDz2T1 {
    public static void WriteString(String inStr)  // Ф-ция записи в файл, с аргументом строка  
    throws IOException {
        String filePath = "loger.txt"; // Указываем путь к файлу для записи
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));      
        writer.append(inStr); // Записываем переменную
        writer.append(' '); // Добавляем пробел       
        writer.close();       // Закрываем ф-цию записи
    }            
    public static void main(String[] args) throws IOException {
        Integer[] arr = {25, 474, 17, 4, 37, 3, 88, 0, 7457, 10, -31}; // Заданный массив чисел
        System.out.println(Arrays.toString(arr)); // Вывод результат массива
        int bubble = 0;  // Переменная "пузырёк"
        for (int i = 0; i < arr.length-1;  i++) { // Запускаем цикл по кол-ву эл-в массива для 
            for (int j = 0; j < arr.length-1; j++) { // Сравниваем каждый эл-т массива с последующим
                if (arr[j] > arr[j + 1]) { // если эл-т больше последующего 
                    bubble = arr[j]; // Записываем в буфер 
                    arr[j] = arr[j + 1]; // Меняем местами больший эл-т с меньшим
                    arr[j + 1] = bubble; // Запоминаем для дальнейшего сравнения
                    String bubbleToWrite = Integer.toString(bubble); //; 
                    WriteString(bubbleToWrite);
                   // logger.info(Arrays.toString(array));
                }
            }
        }       
         System.out.println(Arrays.toString(arr)); // Вывод результат массива   
    }


}