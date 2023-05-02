public abstract class Animal {
    private int hoursSlept;

    public int getHoursSlept() {
        return hoursSlept;
    }

    void sleep(int hours) {
        hoursSlept += hours;
        if(hoursSlept > 4) {
            hoursSlept -= hours;
            System.out.println("The animal can't sleep more than 4 hours.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.sleep(4);
        dog.sleep(2);

        System.out.println(dog.getHoursSlept());

    }

}
