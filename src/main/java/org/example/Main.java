package org.example;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] numbers = { 9, 3, 1, 5, 13, 12 };
    
    // 使用Arrays类的sort方法对数组进行排序
    Arrays.sort(numbers);
    
    // 输出排序后的数组
    System.err.println(Arrays.toString(numbers));
  }
}