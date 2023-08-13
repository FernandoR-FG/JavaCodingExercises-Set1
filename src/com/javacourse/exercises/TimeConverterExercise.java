package com.javacourse.exercises;

class TimeConverter {
     int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        int res = 0;
        if(hours >= 0){
            res = hours * 60;
        }
        else{
            res = -1;
        }
        return res;
    }
    
     int convertDaysToMinutes(int days) {
        // Your task: complete this method
        int res = 0;
        if(days >= 0){
            res = (days*24) * 60;
        }
        else{
            res = -1;
        }
        return res;
    }
}

public class TimeConverterExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeConverter time = new TimeConverter();
		//Convertir horas a minutos
		int dia = 0; int hora = 8;
		int minutos = time.convertHoursToMinutes(hora);
		System.out.printf("%d horas en minutos es: %d",hora,minutos).println();
		//Convertir dias a minutos	
		int minutosd = time.convertDaysToMinutes(dia);
		System.out.printf("%d dias en minutos es: %d",dia,minutosd);

	}

}
