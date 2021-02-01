package Thread;

public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        // Do implement interface;
        Thread t = new Thread(t1);

        Thread2 t2 = new Thread2();

        t.start();
        t2.start();

    }
}
// Khởi tạo Obj;
// Gọi Hàm start() để chạy thead;
// Các thread chạy song song lên kết quả in ra cũng khác nhau;