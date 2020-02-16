package homework.beginner.basic;


// task18
// Write a program that convert 78 Fahrenheit temperature into celsius


public class task18 {

    public static void main(String[] args) {

        float temperatureForFahrenheit = 78;
        float temperatureForCelsius = (float) ((temperatureForFahrenheit - 32) / 1.8);


        System.out.println ("78 Fahrenheit temperature is " + temperatureForCelsius  + " degrees celsius");
    }
}
