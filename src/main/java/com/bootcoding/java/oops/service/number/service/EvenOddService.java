package com.bootcoding.java.oops.service.number.service;


import com.bootcoding.java.oops.service.number.model.Number;

public class EvenOddService {
    public void evenOdd(Number number){
        if(number.getNum() % 2 == 0){
            number.setEven("EVEN");
        }else{
            number.setEven("ODD");
        }
    }
}
