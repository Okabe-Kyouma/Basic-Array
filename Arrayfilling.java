import java.util.*;

public class Arrayfilling{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int size = input.nextInt();

int[] arr = new int[size];

int count = 1;

for(int a =0;a<size-a;a++){

arr[a] = count++;

if((size-1-a)==a)
break;

arr[(size-1)-a] = count++;

}

for(int a =0;a<size;a++){

System.out.println(arr[a]);

}



}

}