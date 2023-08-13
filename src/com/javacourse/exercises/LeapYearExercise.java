package com.javacourse.exercises;
class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if(year == 0){
            return false;
        }
        if((year % 4 == 0)){
            if(year % 100 == 0){
                if(year%400==0){
                    return true; //Divisible para 400 es leap
                }
                return false; //Divisible para 100 pero no 400 es no leap
            }
            return true; //Divisible para 4 pero no 100 es leap
        }
       return false; //No divisible para 4 no es leap
    }
}
public class LeapYearExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYearChecker añob = new LeapYearChecker();
		System.out.println(añob.isLeapYear(2000));
	}

}
