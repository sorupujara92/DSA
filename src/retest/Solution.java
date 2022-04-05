package retest;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer noOfTestCases = Integer.valueOf(bf.readLine().trim());
        for(int i=0;i<noOfTestCases;i++){
            Integer nextValue  = Integer.valueOf(bf.readLine().trim());
            if(nextValue%630==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");

            }
        }
        }catch(Exception e){
                               System.out.println(e);

        }
    
    }
}