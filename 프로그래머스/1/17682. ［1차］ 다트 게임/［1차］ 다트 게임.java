import java.util.*;
import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        String regex = "(10|[0-9])([SDT])([*#]?)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dartResult);
        
        int[] score = new int[3];
        int[] scoreM = new int[3];
        char[] bonus = new char[3];
        char[] option = new char[3];
        int i = 0;
        
        while(matcher.find()){
            score[i] = Integer.parseInt(matcher.group(1));
            bonus[i] = matcher.group(2).charAt(0);
            option[i] = matcher.group(3).isEmpty() ? ' ' : matcher.group(3).charAt(0);
            
            if(bonus[i] == 'T') scoreM[i] = (int) Math.pow(score[i], 3);
            else if(bonus[i] == 'D') scoreM[i] = (int) Math.pow(score[i], 2);
            else scoreM[i] = (int) Math.pow(score[i], 1);
            
            if(option[i] == '*'){
                scoreM[i] *= 2;
                if (i > 0) scoreM[i - 1] *= 2;
            }
            else if(option[i] == '#'){
                scoreM[i] *= -1;
            }
            
            i++;
        }
        
        int sum = scoreM[0] + scoreM[1] + scoreM[2];
        
        return sum;
    }
}