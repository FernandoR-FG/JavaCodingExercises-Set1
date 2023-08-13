package com.javacourse.exercises;
class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		// Verificar si los angulos dados son positivos y suman 180
        // write your code here
        boolean res = false;
        if((angle1 <1) || (angle2 < 1) || (angle3 < 1)){
            res = false;
        }
        else if ((angle1 + angle2 + angle3) == 180){
            res = true;
        }
        return res;
    }
    public boolean isRightAngled(int side1, int side2, int side3) {
        // write your code
        boolean isRightAngled = false;
        
        if(side1 < 1 || side2 < 1 || side3 < 1){
            return isRightAngled;
        }
        //Calculo de los cuadrados de cada lado
        int side1C = side1 * side1;
        int side2C = side2 * side2;
        int side3C = side3 * side3;
        //Verificar con el teorema de pitagoras que lado es hipotenusa
        if(side1C == side2C + side3C){
            isRightAngled = true;
        }
        else if(side2C == side1C + side3C){
            isRightAngled = true;
        }
        else if(side3C == side2C + side1C){
            isRightAngled = true;
        }      
        return isRightAngled;
        
    }
}
public class TriangleExercise {

	public static void main(String[] args) {
		TriangleValidator t1 = new TriangleValidator();
		boolean res = false;
		res = t1.isValidTriangle(50, -40, 90);
		System.out.println(res);
		res = t1.isRightAngled(5, 12, 13);
		System.out.println(res);
	}

}
