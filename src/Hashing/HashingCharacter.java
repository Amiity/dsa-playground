package Hashing;

import java.util.Scanner;

public class HashingCharacter {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character no");
        int n  = sc.nextInt();

        int[] c =  new int[26];

        for(int i = 0 ; i < n ; i++){
            char ch = sc.next().charAt(0);
            c[ch - 'a']++;
        }

        for(int i = 0 ; i< 26; i++){
            if(c[i] > 0){
                System.out.println((char) ('a'+i)+" -> "+ c[i]);
            }
        }

    }
}
