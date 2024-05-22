
package kuis2;

class Driver {
    String name;
    int points;

    Driver(String name) {
        this.name = name;
        this.points = 0;
    }

    void addPoints(int points) {
        this.points += points;
    }

    public String toString() {
        return name + " - " + points + " points";
    }
}