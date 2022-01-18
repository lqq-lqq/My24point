package com.example.twenty_four_point;

import android.annotation.SuppressLint;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final float[] four_number;
    private List<String> result = new ArrayList<String>();
    Controller(float[] f){
        four_number=f;
    }
    void compute(){
        char[] mark=new char[]{'+','-','*','/'};
        float a=four_number[0];
        float b=four_number[1];
        float c=four_number[2];
        float d=four_number[3];
        //三个操作符三层循环
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(i==j && i==k && (i==0||i==2)){
                        if(Math.abs(calculate_A(a,b,c,d,i,j,k)-24)<0.001){
                            @SuppressLint("DefaultLocale") String temp=String.format("((%d%c%d)%c%d)%c%d=24", (int)a, mark[i], (int)b, mark[j], (int)c, mark[k], (int)d);
                            result.add(temp);
                            //result.add("("+Integer.toString((int)a)+mark[i]+)
                        }
                    }
                    else{
                        if(Math.abs(calculate_A(a,b,c,d,i,j,k)-24)<0.001){
                            @SuppressLint("DefaultLocale") String temp=String.format("((%d%c%d)%c%d)%c%d=24", (int)a, mark[i], (int)b, mark[j], (int)c, mark[k], (int)d);
                            result.add(temp);
                            //result.add("("+Integer.toString((int)a)+mark[i]+)
                        }
                        if(Math.abs(calculate_B(a,b,c,d,i,j,k)-24)<0.001){
                            @SuppressLint("DefaultLocale") String temp=String.format("(%d%c(%d%c%d))%c%d=24", (int)a, mark[i], (int)b, mark[j], (int)c, mark[k], (int)d);
                            result.add(temp);
                        }
                        if(Math.abs(calculate_C(a,b,c,d,i,j,k)-24)<0.001){
                            @SuppressLint("DefaultLocale") String temp=String.format("%d%c(%d%c(%d%c%d))=24", (int)a, mark[i], (int)b, mark[j], (int)c, mark[k], (int)d);
                            result.add(temp);
                        }
                        if(Math.abs(calculate_D(a,b,c,d,i,j,k)-24)<0.001){
                            @SuppressLint("DefaultLocale") String temp=String.format("%d%c((%d%c%d)%c%d)=24", (int)a, mark[i], (int)b, mark[j], (int)c, mark[k], (int)d);
                            result.add(temp);
                        }
                        if(Math.abs(calculate_E(a,b,c,d,i,j,k)-24)<0.001){
                            @SuppressLint("DefaultLocale") String temp=String.format("(%d%c%d)%c(%d%c%d)=24", (int)a, mark[i], (int)b, mark[j], (int)c, mark[k], (int)d);
                            result.add(temp);
                        }
                    }

                }
            }
        }
        result.add("构成二十四点的方法共有："+result.size()+"种");
    }
    List<String> getResult(){
        return result;
    }

    //操作数a和操作数b经过操作符mark计算的结果
    private float cal(float x,float y,int mark){
        switch (mark){
            case 0:return x + y;
            case 1:return x - y;
            case 2:return x * y;
            case 3:return x / y;
            default:return 0;
        }
    }
    //计算方式从左至右 a\b\c\d
    private float calculate_A(float a, float b, float c, float d, int mark1, int mark2, int mark3) {
        float r1, r2, r3;
        r1 = cal(a, b, mark1);
        r2 = cal(r1, c, mark2);
        r3 = cal(r2, d, mark3);
        return r3;
    }
    //加了括号，有优先级的区别 (a\(b\c))\d
    private float calculate_B(float a, float b, float c, float d, int mark1, int mark2, int mark3) {
        float r1, r2, r3;
        r1 = cal(b, c, mark2);
        r2 = cal(a, r1, mark1);
        r3 = cal(r2, d, mark3);
        return r3;
    }
    // a\(b\(c\d))
    private float calculate_C(float a, float b, float c, float d, int mark1, int mark2, int mark3) {
        float r1, r2, r3;
        r1 = cal(c, d, mark3);
        r2 = cal(b, r1, mark2);
        r3 = cal(a, r2, mark1);
        return r3;
    }
    // a\((b\c)\d)
    private float calculate_D(float a, float b, float c, float d, int mark1, int mark2, int mark3) {
        float r1, r2, r3;
        r1 = cal(b, c, mark2);
        r2 = cal(r1, d, mark3);
        r3 = cal(a, r2, mark1);
        return r3;
    }
    //(a\b)\(c\d)
    private float calculate_E(float a, float b, float c, float d, int mark1, int mark2, int mark3) {
        float r1, r2, r3;
        r1 = cal(a, b, mark1);
        r2 = cal(c, d, mark3);
        r3 = cal(r1, r2, mark2);
        return r3;
    }

}




