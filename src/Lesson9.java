public class Lesson9 {
    public static void main(String[] args) {

        //ARRAYS

        int[] firstArray = new int [3];
        firstArray[0] = 55;
        firstArray[1] = 1900;
        firstArray[2] = 1;

        System.out.println("This is the first element: " + firstArray[0]);
        System.out.println("Here is 1900: " + firstArray[1]);


        //SIMPLER WAY TO DEFINE ELEMENTS IN ARRAYS
        //Shorthand array initialization
        int[] temperatures = {33, 34, 31, 38, 29, 28, 36};
        System.out.println("This is the temperature for Friday: " + temperatures[4]);

        //FINDING OUT THE LENGHT OF YOUR ARRAY
        System.out.println("In temperatures array we have " + temperatures.length + "elements.");

        //FINDING THE LAST ELEMENT OF ARRAY (-1 BECAUSE THE ARRAY STARTS WITH A ZERO)
        System.out.println("The last elemnt in the array is: " + temperatures[temperatures.length - 1]);


        int[] weatherForecast = new int[7];
        weatherForecast[0] = 29;
        weatherForecast[1] = 31;
        weatherForecast[2] = 30;
//        int[] weatherForecast = {29, 31, 30};
        weatherForecast[3] = 30;
        weatherForecast[4] = 37;
        weatherForecast[5] = 30;
        weatherForecast[6] = 19;

        //CALCULATING THE AVERAGE TEMPERATURE FOR A WEEK
        double averageTemperature = ((weatherForecast[0] + weatherForecast[1] + weatherForecast[2] + weatherForecast[3] + weatherForecast[4] + weatherForecast[5] + weatherForecast[6]) / 7d);
        System.out.println("Average temperature for the week is: " + averageTemperature);

        //LOOPS (LOOP 'FOR')
        for (int i = 0; i<10; i++) {
            //The iteration will run 10 times!
            System.out.println("Hello! You are in an iteration! " + i);
        }

        //AN EXAMPLE OF AN INFINITE LOOP
//        for (int i = 0; i < 10 ; i--) {
//            System.out.println("New iteration: " +i);
//        }

        //MORE EXAMPLES
        for (int i = 85; i < 95; i++) {
            System.out.println("The iteration is running! " + i);
        }

        for (int i = 53; i > -47; i--) {
            System.out.println("Running the loop " +i);
        }

        //PRINTING THE ITERATION NUMBER (COUNTER) STARTING FROM ZERO
        //Initialize an integer "counter"
        int counter = 0;
        for (int i = 59; i < 1005; i++) {

            System.out.println("This is iteration #" + counter);
            //Make the counter go up by 1 with each loop
            counter++;
        }

        //alarm example
        counter = 1;
        for (int currentTime = 8; currentTime < 12; currentTime++) {
            System.out.println("Hai! It is " + currentTime + " o'clock");
            System.out.println("This is the " + counter + " time the alarm worked");
            counter++;
        }


        //Arrays with loops
        //Example with calculating the average grade

        //define an array
        int[] grades = {8, 9, 7, 8, 9, 8, 5, 4, 7, 6, 9, 10, 7};

        //use loop to calculate the sum
        int gradeSum = 0;
        for (int i = 0; i < grades.length; i++) {
            gradeSum += grades[i];
        }

        System.out.println("Sum of all the grades is: " + gradeSum);

        double averageGrade = gradeSum / (double)grades.length;
        System.out.println("The average grade is: " + averageGrade);

        boolean[] arrayOfBooleans = {true, false, true, false, true, true, false};
        String[] arrayOfStrings = {"Message 1", "Message 2", "Message 3", "Message 4"};

        double[] monthlySalary = {1000, 1100, 1200, 1300, 1400};

        String[] students = {"Artjoms", "Liza", "Laura", "Tatjana"};

        //Circle k coffee (every 7th is free)
        for (int i = 0; i < 10000; i++) {
            if(i % 7 == 0) {
                System.out.println("This coffee is for free!");
            } else {
                System.out.println("You need to pay for this coffee #" + i);
            }
            

        }


    }

}
