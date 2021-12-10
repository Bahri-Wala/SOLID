package com.directi.training.lsp.my_work;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        electricDuck.turnOn();
        swim(donaldDuck, electricDuck);
    }

    private void quack(ParentDuck... ducks)
    {
        for (ParentDuck duck : ducks) {
            try {
                duck.quack();
            }catch (RuntimeException e){
                e.getStackTrace();
            }
        }
    }

    private void swim(ParentDuck... ducks)
    {
        for (ParentDuck duck : ducks) {
            try {
                duck.swim();
            }catch (RuntimeException e){
                e.getStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
