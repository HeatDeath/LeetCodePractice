package com.heatdeath.leetcode.practice.range_451_500;

/**
 * Author:  heatdeath
 * Date:    2018/10/19
 * Desc:
 */
public class _461_Hamming_Distance {
//    public int hammingDistance(int x, int y) {
//        int counter = 0;
//        for (int i = 0; i < 32; i++) {
//            int xBit = (x >> i) & 1;
//            int yBit = (y >> i) & 1;
//            if ((xBit ^ yBit) == 1) {
//                counter++;
//            }
//        }
//        return counter;
//    }

    /**
     * 先将 x 与 y 进行异或，再将异或结果的每一位 &1
     * 如果结果为 1，则 x 与 y 在该位上的 bit 不同；反之，则相同
     */
    public int hammingDistance(int x, int y) {
        int counter = 0;
        int xor = (x ^ y);
        while (xor != 0) {
            counter += (xor & 1);
            xor >>= 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        new _461_Hamming_Distance().hammingDistance(5, 8);
    }
}
