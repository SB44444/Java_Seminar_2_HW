// 3. Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).
// "abracadarbaabradacarba" ;  "abracadarba"

import java.util.Scanner;

public class JavDz2T3 {

    public static boolean palindrome(String stroka) {   // Ф-ция проверки строки на палиндромомность
        return stroka.replaceAll("\\W","")   // Заменяем по маске "\\W" все символы кроме букв, цифр и знака подчёркивания на пустую строку
                    .equalsIgnoreCase(new StringBuilder(stroka.replaceAll("\\W","")) // Метод .equalsIgnoreCase() сравнивает строки без учета регистра
                    .reverse().toString()); // Метод .reverse() возвращает стторку, обратную исходной
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "utf-8");
        System.out.print("Input phrase: ");
        String phrase = sc.nextLine();
        sc.close();
        System.out.println(palindrome(phrase));  // Запуск ф-ции и вывод
    }
}