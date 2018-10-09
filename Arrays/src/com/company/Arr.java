package com.company;

public class Arr {
    public static int SearchMinimalElement(int [] Array){
        if(Array.length!=0){
            int min=Array[0];
            for (int  i=0;i<Array.length;i++){
                if (Array[i]<min){
                    min=Array[i];
                }

            }
            return min;
        }
        else return 0;
    }
    public static int SearchMaxElement(int [] Array){
        if(Array.length!=0){
            int max=Array[0];
            for (int  i=0;i<Array.length;i++){
                if (Array[i]>max){
                    max=Array[i];
                }

            }
            return max;
        }
        else return 0;
    }

    public static int FindAVG(int [] Array) {
        if (Array.length != 0) {
            int avg = 0;
            for (int i = 0; i < Array.length; i++) {
                avg = avg + Array[i];
            }
          return avg/Array.length;
        }
        else return 0;
    }
    public static double FindGeometryAVG(int [] Array){
        try{
            double gAVG=1;
            for (int i=0;i<Array.length;i++) {
                gAVG = gAVG * Array[i];
            }
            gAVG=Math.pow(gAVG,(double)1/Array.length);
            return gAVG;
        }
       catch (Exception e){
            e.getMessage();
            return 0;

       }
    }

    public static double findMEDIAN(int [] Array){
        if (Array.length%2==0){
            return (double)(Array[Array.length/2]+Array[Array.length/2-1])/2;
        }
        else{
            return (double)Array[Array.length/2];
        }

    }
}
