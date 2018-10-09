package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int  []  Array={4,1,4,9,2,4,3,4,6,7};
        ////////////////////////////////
        int min=Arr.SearchMinimalElement(Array);
        int max=Arr.SearchMaxElement(Array);
        int avg=Arr.FindAVG(Array);
        double gAVG=Arr.FindGeometryAVG(Array);
        double median=Arr.findMEDIAN(Array);
        /////////////////////////////////
        System.out.println("Min="+min);
        System.out.println("Max="+max);
        System.out.println("Average="+avg);
        System.out.println("GeometryAverage="+gAVG);
        System.out.println("Median="+median);
    }
}
