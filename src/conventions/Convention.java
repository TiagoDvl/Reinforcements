package conventions;

public class Convention {
    String topico1;
    String topico2;
    String topico3;
    String topico4;


    public Convention(String topico1, String topico2,  String topico3, String topico4) {
        this.topico1 = topico1;
        this.topico2 = topico2;
        this.topico3 = topico3;
        this.topico4 = topico4;
        System.out.println(this.toString() + " created");
    }
}
