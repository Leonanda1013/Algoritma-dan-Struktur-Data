package kuis2;

class Node {
    RaceResult result;
    Node next;

    Node(RaceResult result) {
        this.result = result;
        this.next = null;
    }
}