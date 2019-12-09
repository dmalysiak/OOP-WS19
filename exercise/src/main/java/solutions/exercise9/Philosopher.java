package solutions.exercise9;

import java.util.stream.IntStream;

public class Philosopher extends Thread{

    final static int SLEEP_TIME_IN_MS = 1;
    final static int MAX_ITERATIONS = 10000;
    private String name;
    private Fork leftFork;
    private Fork rightFork;


    public Philosopher(String name,Fork leftFork,Fork rightFork)
    {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run()
    {
        IntStream.range(0,MAX_ITERATIONS).forEach( i -> {
            try {
                think();
                eat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    private void think() throws InterruptedException
    {
        System.out.println(name+" is thinking!");
        Thread.sleep(SLEEP_TIME_IN_MS);
    }

    private void eat() throws InterruptedException
    {
        //'fix' determines if we circumvent the deadlock by following the lectures convention :-)
        Integer number = Integer.parseInt(name.split(" ")[1]);
        boolean fix = true;

        if(number%2==0 && fix) {
            leftFork.get();
            rightFork.get();
        }
        else{
            rightFork.get();
            leftFork.get();
        }
        System.out.println(name+" is eating!");
        if(number%2==0 && fix) {
            rightFork.layBack();
            leftFork.layBack();
        }
        else{
            leftFork.layBack();
            rightFork.layBack();
        }
    }
}
