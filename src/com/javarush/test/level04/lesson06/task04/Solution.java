package com.javarush.test.level04.lesson06.task04;

/* �������� �����
������ � ���������� ��� �����, � ���� ����� ���������� ������� ��������� ������ ����������. ���� ����� ������, �� �� ����� ����� � ������� ��������� � ������ ���� ������.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //�������� ��� ��� ���
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = reader.readLine();
        String secondName = reader.readLine();

        if (firstName.equals(secondName))
        {
            System.out.println("����� ���������");
        }
        if (firstName.length() == secondName.length())
        {
            System.out.println("����� ���� �����");
        }

    }
}
