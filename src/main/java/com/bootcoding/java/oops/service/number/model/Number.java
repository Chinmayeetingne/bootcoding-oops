package com.bootcoding.java.oops.service.number.model;

public class Number {
    private int num;
    private String even;
    private String primeNo;
    private String palindrome;
    private String armstrong;

    @Override
    public String toString() {
        return num + "," + even + "," + palindrome + "," + primeNo + "," + armstrong;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEven() {
        return even;
    }

    public void setEven(String even) {
        this.even = even;
    }

    public String getPrimeNo() {
        return primeNo;
    }

    public void setPrimeNo(String primeNo) {
        this.primeNo = primeNo;
    }

    public String getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(String palindrome) {
        this.palindrome = palindrome;
    }

    public String getArmstrong() {
        return armstrong;
    }

    public void setArmstrong(String armstrong) {
        this.armstrong = armstrong;
    }

    public void setPrimeNumber(String not_prime_number) {
    }
}
