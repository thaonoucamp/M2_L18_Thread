package Thread;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B" + i);
        }
    }
}
// Cách 1. Tạp Obj trong Thread triển khai interface.
// Tất cả phải Override lại Hàm run();