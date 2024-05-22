package kuis2;

class RaceResultList {
    Node head;

    RaceResultList() {
        this.head = null;
    }

    void addResult(RaceResult result) {
        Node newNode = new Node(result);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void calculatePoints(Driver[] drivers) {
        Node current = head;
        while (current != null) {
            if (current.result.driverId >= 0 && current.result.driverId < drivers.length) {
                drivers[current.result.driverId].addPoints(getPoints(current.result.position));
            }
            current = current.next;
        }
    }

    int getPoints(int position) {
        switch (position) {
            case 1:
                return 25;
            case 2:
                return 18;
            case 3:
                return 15;
            case 4:
                return 12;
            case 5:
                return 10;
            case 6:
                return 8;
            case 7:
                return 6;
            case 8:
                return 4;
            case 9:
                return 2;
            case 10:
                return 1;
            default:
                return 0;
        }
    }
}
