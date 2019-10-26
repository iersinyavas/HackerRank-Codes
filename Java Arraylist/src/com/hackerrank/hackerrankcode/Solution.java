package com.hackerrank.hackerrankcode;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int arrays = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<arrays; i++){
            ArrayList<Integer> array = new ArrayList<Integer>();
            int arraySize = scanner.nextInt();
            for(int j=0; j<arraySize; j++){
                array.add(scanner.nextInt());
            }
            arrayList.add(array);
        }

        int quantity = scanner.nextInt();
        ArrayList<ArrayList<Integer>> queryList = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<quantity; i++){
            ArrayList<Integer> query = new ArrayList<Integer>();
            for(int j=0; j<2; j++){
                query.add(scanner.nextInt()-1);
            }
            queryList.add(query);
        }

        for(int i=0; i<quantity; i++){
            try{
                System.out.println(arrayList.get(queryList.get(i).get(0)).get(queryList.get(i).get(1)));
                
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}


