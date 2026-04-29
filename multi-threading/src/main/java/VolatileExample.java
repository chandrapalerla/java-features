static volatile boolean flag = true;

void main() {
    new Thread(() -> {
        while (flag) {
            System.out.println("Stopped");
        }
    }).start();

    new Thread(() -> {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        flag = false;
        System.out.println("Flag changed");
    }).start();
}
