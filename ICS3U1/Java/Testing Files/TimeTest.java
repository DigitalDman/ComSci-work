/*
Name: Daniel Leftley
Date: 9/12/2024
Teacher: Carreiro
Description: Messing with the TimeUnit functon
*/

import java.util.concurrent.TimeUnit; // Imports the TimeUnit function

class TimeTest {
   public static void main (String [] args) throws InterruptedException { // MUST include throws InterruptedException to make time work, otherwise there is an error message
   // TimeUnit can delay by:Nanoseconds,microseconds,milliseconds,seconds,minutes,hours,days (When declareing the wait time it must be in ALLCAPS)
       
       TimeUnit.NANOSECONDS.sleep(10); // Delays for a NanoSecond
       System.out.println("I waited for 10 nanoseconds, How long is a nonosecond?");
       
       TimeUnit.MICROSECONDS.sleep(10); // Delays for 10 Microseconds
       System.out.println("I waited for 10 Micro seconds");
       
       TimeUnit.MILLISECONDS.sleep(10); // Delays for 5 milliseconds
       System.out.println("I waited 5 milliseconds");
       
       TimeUnit.SECONDS.sleep(1); // Delays by 1 second 
       System.out.println("I waited 1 second");
       
       TimeUnit.MINUTES.sleep(1); // Delays for a miniute
       System.out.println("I waited for a miniute. \nI can also wait for HOURS and DAYS");
       
       
   }
}