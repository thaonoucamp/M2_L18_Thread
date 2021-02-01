package Thread_Alive;

public class Test_Thread extends Thread{
    private String threadName;

    public Test_Thread() {
    }

    public Test_Thread(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String thread) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getThreadName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test_Thread t1 = new Test_Thread("a");
        Test_Thread t2 = new Test_Thread("b");

        t1.start();
        t2.start();


    }
}
// Tạo lớp Tést Thread;
// Thực hiện cho thread ngủ đông;
// Phải bắt lỗi ngủ đông;
// Tao vòng lặp for để xem luồng chạy;
// Tao Ham main de xem ket qua;
// De vong lap ben trong se thay ro su khac la cua luong ngu dong;
