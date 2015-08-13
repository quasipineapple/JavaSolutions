package com.javarush.test.level04.lesson06.task04;

/* —равнить имена
¬вести с клавиатуры два имени, и если имена одинаковые вывести сообщение Ђ»мена идентичныї. ≈сли имена разные, но их длины равны Ц вывести сообщение Ц Ђƒлины имен равныї.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = reader.readLine();
        String secondName = reader.readLine();

        if (firstName.equals(secondName))
        {
            System.out.println("»мена идентичны");
        }
        if (firstName.length() == secondName.length())
        {
            System.out.println("ƒлины имен равны");
        }

    }
}
