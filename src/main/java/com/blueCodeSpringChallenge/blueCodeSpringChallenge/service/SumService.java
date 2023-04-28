package com.blueCodeSpringChallenge.blueCodeSpringChallenge.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class SumService {

    public Integer uniqueSum(String stringArray){
        stringArray = stringArray.replaceAll(" ","");
        int[] integerArray = Arrays.stream(stringArray.split(",")).mapToInt(Integer::parseInt).toArray();
        return getSum(integerArray);
    }

    public Integer getSum(int[] array){
        Map<Integer, Boolean> intHashMap = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            if(intHashMap.containsKey(array[i])){
                intHashMap.put(array[i],false);
            }
            else{
                intHashMap.put(array[i],true);
            }
        }
        Integer sum = 0;

        for (Map.Entry<Integer,Boolean> set:intHashMap.entrySet()){
            if(set.getValue()==true){
                sum=sum+set.getKey();
            }
        }

        return sum;
    }
}
