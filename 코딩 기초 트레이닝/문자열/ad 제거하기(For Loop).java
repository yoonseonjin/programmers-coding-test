import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> strList = new ArrayList<String>();
        
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                strList.add(strArr[i]);
            }
        }
        return strList.toArray(new String[strList.size()]);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181870