package com.javacourse.exercises;
class SumOfSquares {
    public long calculateSumOfSquares(int n) {
       // write your code here
       long calculateSumOfSquares = 0;
       if(n<0){
           calculateSumOfSquares = -1;
       }
       else{
           for(int i = 1; i <= n; i++){
               calculateSumOfSquares += i*i;
           }
       }
       return calculateSumOfSquares;
    }
}
public class SumOfSquaresExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfSquares cuadrados = new SumOfSquares();
		System.out.println(cuadrados.calculateSumOfSquares(5));
	}

}
