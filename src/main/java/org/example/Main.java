package org.example;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
  // 创建一个Logger实例
  private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
  
  public static void main(String[] args) {
    int[] numbers = { 9, 3, 1, 5, 13, 12 };
    
    // 使用Arrays类的sort方法对数组进行排序
    Arrays.sort(numbers);
    
    // 输出排序后的数组
    // 替代System.err.println的用法
    LOGGER.log(Level.INFO, Arrays.toString(numbers));
  }
}