package com.CareerDevs;

public class Main {

    public static void main(String[] args) {
//        //int has a width of 32
//	    int myMinValue=-2_147_483_648;
//	    int myMaxValue=2_147_483_647;
//	    int myInt=(myMaxValue/2);
//
//	    //byte has a width of 8
//	    /*a byte would be more efficient to use for this range, because it takes a third of the memory that an int would*/
//	    byte myMinByteValue=-128;
//        byte myMaxByteValue=127;
//        byte myByte= (byte) (myMaxByteValue/2);
//
//        //short has a width of 16
//        short myShortMax=32767;
//        short myShortMin=-32768;
//
//        //long has width of 64
//        long myMinLongValue= -9_223_372_036_854_775_808L;
//        long myMaxLongValue= 9_223_372_036_854_775_807L;
//
//        System.out.println((int)Character.MAX_VALUE);
        byte myByte=84;
        int myInt=1000;
        short myShort=2;
        long myLong=(5000L+10L*(myByte+myShort+myInt));
        System.out.println("Long total is: "+myLong);

    }
}
