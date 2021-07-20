package com.logical.question;

public class SecondMaxArray{

public static void main(String args[]){
int a[]={67,29,30,177,29,37,20,10};
int temp;  
for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {  
                if (a[i] < a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
  System.out.println("Second largest Array is : "+a[1]);
}
}