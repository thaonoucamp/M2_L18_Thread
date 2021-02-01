package Thread;

public class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A" + i);
        }
    }
}
// Cách 2. Kế thừ từ lớp cha;
// Mọi công việc muốn chạy song song đều đặt trong Hàm run();