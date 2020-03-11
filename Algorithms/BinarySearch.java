package Algorithms;


public class BinarySearch{
    public static void main(String[] args) {
        int tam=100000;
        int [] N=new int[tam];
        for (int i = 0; i < tam; i++) {
            N[i]=i*2;
        }
        System.out.println(binarySearch(N, 96));
    }

    public static int binarySearch(int [] num, int n){
        int top, bot, mid;
        bot=0;
        top=num.length-1; 
        while(bot <= top){
            mid = (bot + top) /2;
            if(num[mid] == n){
                return num[mid];
            }
            if(num[mid] < n){
                bot = mid+1;
            }
            else {
                top = mid-1;
            }
        }
        return -1;
    }
}