/*2. Дана строка (получение через обычный текстовый файл!!!)

    "фамилия":"Иванов","оценка":"5","предмет":"Математика"
    "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
    Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
    Студент Иванов получил 5 по предмету Математика.
    Студент Петрова получил 4 по предмету Информатика.
    Студент Краснов получил 5 по предмету Физика.*/
    
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavDz2T2 {
    public static void main(String[] args) throws IOException{       // Ф-ция main
        String content = new String(Files.readAllBytes(Paths.get("InText.txt")));   // Получаем копию данных побайтовым копированием
        System.out.println(content);                                                      // Вывод полученных данных в теминал 
        String [] my_array = content.split("\n");                                 // Создаем массив строк, делим по переходу строки         
        for(int i = 0; i < my_array.length; i++) {                                     // Проходим по всем эл-там массива
            System.out.println(ShowNeed(my_array[i]));                                // Запукаем ф-цию "ПоказатьНужное" 
        }
    }
    public static StringBuilder ShowNeed(String line) {
        String line1 = line.replaceAll("\"", "");    // Заменяем перевод строки на пустую строку
        StringBuilder out_res = new StringBuilder("");             // Запускам конструктор
        String [] pers_list = line1.split(",");               // Разделяем по маске "," и получаем список с данными по каждой фамилии
        String [] need_worlds = {"Студент ", " получил ", " по предмету "};  //  Создем список слов, которые нужно добавить     
        for (int i =0; i < pers_list.length; i++) {                       // В цикле списка с данными 
            String[] arr = pers_list[i].split(":");            // Делим по маске ":"
            out_res.append(need_worlds[i]);                          // Добавляем нужное слово
            out_res.append(arr[1]);                                  // Добавляем данные
            }
        return out_res;                                             // Возвращаем итоговый список
    }
}
