import java.util.Scanner;
class Clock{
    private int hours;   // 0 - 23
    private int minutes; // 0 - 59
    private int seconds; // 0 - 59

    // Default constructor: 12:00:00
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor with hours, minutes, seconds
    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Constructor with seconds since midnight
    public Clock(int totalSeconds) {
        setClock(totalSeconds);
    }

    // Set clock using seconds since midnight
    public void setClock(int totalSeconds) {
        totalSeconds = ((totalSeconds % 86400) + 86400) % 86400; // wrap around 24h
        this.hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        this.minutes = totalSeconds / 60;
        this.seconds = totalSeconds % 60;
    }

    // Getters
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Setters
    public void setHours(int hours) {
        this.hours = (hours >= 0 && hours < 24) ? hours : 0;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes >= 0 && minutes < 60) ? minutes : 0;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds >= 0 && seconds < 60) ? seconds : 0;
    }

    // Tick: increment time by one second
    public void tick() {
        setClock(toSeconds() + 1);
    }

    // TickDown: decrement time by one second
    public void tickDown() {
        setClock(toSeconds() - 1);
    }

    // Add another Clock's time
    public void addClock(Clock other) {
        setClock(this.toSeconds() + other.toSeconds());
    }

    // Subtract another Clock's time and return result as new Clock
    public Clock subtractClock(Clock other) {
        int diff = this.toSeconds() - other.toSeconds();
        return new Clock(diff);
    }

    // Convert current time to total seconds since midnight
    private int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
    }
}


public class ClockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instantiate firstClock using seconds since midnight
        System.out.print("Enter seconds since midnight for firstClock: ");
        int secondsSinceMidnight = sc.nextInt();
        Clock firstClock = new Clock(secondsSinceMidnight);

        System.out.println("\nTicking firstClock 10 times:");
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println("Tick " + (i + 1) + ": " + firstClock);
        }

        // Instantiate secondClock using hours, minutes, seconds
        System.out.print("\nEnter hours for secondClock: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes for secondClock: ");
        int m = sc.nextInt();
        System.out.print("Enter seconds for secondClock: ");
        int s = sc.nextInt();
        Clock secondClock = new Clock(h, m, s);

        System.out.println("\nTicking secondClock 10 times:");
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println("Tick " + (i + 1) + ": " + secondClock);
        }

        // Add secondClock to firstClock
        firstClock.addClock(secondClock);

        System.out.println("\nAfter adding secondClock to firstClock:");
        System.out.println("firstClock: " + firstClock);
        System.out.println("secondClock: " + secondClock);

        // Subtract secondClock from firstClock
        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("thirdClock (difference): " + thirdClock);

        sc.close();
    }
}