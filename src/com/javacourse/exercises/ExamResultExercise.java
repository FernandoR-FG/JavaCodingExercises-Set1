package com.javacourse.exercises;
class ExamResult {
    public boolean isPass(int marks) {
        
        // Update Code : If the student's marks are greater than 50, they have passed the exam.
        if(marks >50){
            return true;
        }
        else{
            return false;
        }
       
    }
}
public class ExamResultExercise {

	public static void main(String[] args) {
		ExamResult fer = new ExamResult();
		boolean pass = fer.isPass(51);
		System.out.println(pass);
	}

}
