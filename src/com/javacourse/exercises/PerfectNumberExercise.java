package com.javacourse.exercises;
class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        int res = 0;
        boolean isPerfectNumber = false;
        if(number > 0){
            for(int i = 1; i < number; i++){
                if(number % i == 0){
                    res += i;
                }
            } 
        }
        if(res == number && res != 0){
            isPerfectNumber = true;
        }
        return isPerfectNumber;
    }
}
public class PerfectNumberExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumberChecker num = new PerfectNumberChecker();
		System.out.println(num.isPerfectNumber(0));
	}

}
