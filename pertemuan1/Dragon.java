public class Dragon {
    int x, y, width, height;

    void moveLeft() {
        x -= 1;
        if (x < 0 || x > width) {
            detectCollision(x, 0);
        }
    }

    void moveRight() {
        x = +1;
        if (x < 0 || x > width) {
            detectCollision(x, 0);
        }
    }

    void moveDown() {
        y += 1;
        if (x < 0 || x > width) {
            detectCollision(0, y);
        }
    }

    void moveUp() {
        y -= 1;
        if (x < 0 || x > width) {
            detectCollision(0, y);
        }
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }

}
