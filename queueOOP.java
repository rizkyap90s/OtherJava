package queue;

class proses {

    private int[] queue;
    int indexnow = 0;

    public proses(int n) {
        queue = new int[n];
    }

    private void panjangarray() {
        int[] naik = new int[queue.length + 1];
        for (int i = 0; i < queue.length; i++) {
            naik[i] = queue[i];
        }
        queue = naik;
    }

    public void enquee(int i) {
        if (indexnow >= queue.length) {
            panjangarray();
        }
        queue[indexnow] = i;
        indexnow++;
        System.out.println("enquee: " + i);
    }
    public void moveUp() {
        for (int x = 0; x < queue.length - 1; x++) {
            queue[x] = queue[x + 1];
        }
    }

//    Hapus antrian
    public int dequee() {
        int r = queue[0];
        moveUp();
        indexnow--;
        System.out.println("\nDequeue :" + r);
        return r;
    }

    /**
     * menampilkan data antrian
     */
    public void display() {
        System.out.println("========= display ========== ");
        for (int i = 0; i < queue.length; i++) {
            System.out.println("[" + i + "] = " + queue[i]);
        }
        System.out.println("=============================");
    }

    public void belumdiisi() {
        System.out.println("========= Sebelum Diisi antrian =========");
        for (int i = 0; i < queue.length; i++) {
            System.out.println("[" + i + "] = " + queue[i]);
        }
    }
    public void setelahdiisi() {
        System.out.println(" ========= Setelah DiProses =========");
        for (int i = 0; i < queue.length; i++) {
            System.out.println("[" + i + "] = " + queue[i]);
        }
    }
    
     public void process() {
        System.out.println("========= process =========");
        enquee(1);
        enquee(2);
        enquee(3);
        enquee(4);
        enquee(5);
        dequee();
    }

}
public class queueOOP{
	public static void main(String[] args) {
		int size = 5;
		if (args.length > 0) {
			size = Integer.parseInt(args[0]);
		}
		proses q = new proses(size);
		q.belumdiisi();
		q.process();
		q.setelahdiisi();
		
	}
	
}