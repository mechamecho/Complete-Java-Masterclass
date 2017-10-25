package com.CareerDevs;

public class Main {

    public static void main(String[] args) {
	int value=1;
	if(value==1){
        System.out.println("Value was 1");
    }else if(value==2){
        System.out.println("Value was 2");
    }else{
        System.out.println("Was not 1 or 2");
    }

    int switchValue=1;

    switch (switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        default:
            System.out.println("Was not 1 or 2");
            break;
    }

    char myChar='E';
    switch(myChar){
        case 'A':
            System.out.println("It is A!");
            break;
        case 'B':
            System.out.println("It is B!");
            break;
        case 'C': case'D': case'E':
            System.out.println("It was "+ myChar);
            break;
        default:
            System.out.println("Not found!");
    }

    String month="january";
    switch(month.toLowerCase()){
        case "JANUary":
            System.out.println("Jan");
            break;
        case "june":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not sure");
    }

    }
}
