package Join_Thread;

public class Test_Join extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Test_Join t1 = new Test_Join();
        t1.setName("a");
        try {
            t1.join(1500);// nếu truyền time cho lệnh join thì hết time các luồng khác được chạy;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Test_Join t2 = new Test_Join();
        t2.setName("b");

        Test_Join t3 = new Test_Join();
        t3.setName("c");

        t1.start();
        t2.start();
        t3.start();
    }
}
// Tạo 3 Obj Thread để setName();
// Dùng lệnh Join() để bắt các luồng phải chờ 1 luồng hoàn thành mới đến các luồng khác;