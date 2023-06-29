package com.bootcoding.java.oops.service.number;


import com.bootcoding.java.oops.service.number.model.Number;
import com.bootcoding.java.oops.service.number.service.EvenOddService;
import com.bootcoding.java.oops.service.number.service.NumberService;
import com.bootcoding.java.oops.service.number.service.PalindromeService;
import com.bootcoding.java.oops.service.number.service.PrimeNumberService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class NumberApp {
    public static void main(String[] args) throws Exception{
        NumberService ns = new NumberService();
        EvenOddService eos = new EvenOddService();
        PalindromeService ps = new PalindromeService();
        PrimeNumberService pns = new PrimeNumberService();
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Desktop\\test files\\file.csv"));

        ArrayList<Number> numbers = new ArrayList<>();
        for(int i = 0; i < 50; i++){

            Number randomNumber = ns.getRandomNumber();
            eos.evenOdd(randomNumber);
            ps.palindrome(randomNumber);
            pns.primeNumber(randomNumber);
            numbers.add(randomNumber);
        }
        writer.append("number, even-or-odd, palindrome, primeNo");
        for(Number number : numbers) {
            writer.write(number.toString());
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }
}
