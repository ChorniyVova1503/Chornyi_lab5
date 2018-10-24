package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("19. В строке удвоить все символы из диапазона согласных букв.\n");
        String stroka = new String();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите текст:");
        stroka=scn.next();
        int razmer = stroka.length();
        char[] chars=stroka.toCharArray();
        char[] consonants={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','z',
                'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','Z'};
        char[]result=new char[razmer*2];
        int t=0;
        boolean consonant=false;
        //System.out.println("razmer:"+razmer);
        for (int i = 0; i < razmer; i++) {

            for (int j = 0; j <consonants.length ; j++) {
                consonant=false;
                if(chars[i]==consonants[j]){
                   consonant=true;
                   break ;
                }
            }
            if(consonant==true){
                result[t]=chars[i];
                result[t+1]=chars[i];
                t++;
                t++;
            }
            else {
                result[t]=chars[i];
                t++;
            }

        }
        System.out.println("Результат в варианте без изменений самой строки:");
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]);
        }
        //-----------------------StringBuffer method



        String temp=new String();
        for (int i = 0; i <stroka.length() ; i++) {
            for (int j = 0; j < consonants.length; j++) {
                consonant=false;
                temp="";
                if(stroka.charAt(i)==consonants[j]){
                    consonant=true;
                    //break ;
                    if(consonant==true){
                        temp+=consonants[j];
                        stroka=stroka.replace(temp,temp+temp);
                        i++;
                        break;
                    }
                }

            }
        }
        System.out.println();
        System.out.println("Результат в варианте использования методов StringBuffer:\n"+stroka);
    }
}
