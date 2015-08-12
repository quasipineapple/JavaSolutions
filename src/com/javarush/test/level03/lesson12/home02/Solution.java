package com.javarush.test.level03.lesson12.home02;

/* Я не хочу изучать Java, я хочу большую зарплату
Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
*/

public class Solution
{
    public static void main(String[] args)
    {
        String Jerk = "Я не хочу изучать Java, я хочу большую зарплату";
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) ten(Jerk);


    }

    private static void ten(String s) {
        System.out.println(s);
    }
}
