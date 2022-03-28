public class VeteFeliz {
    private double peso;
    private String tipo;
    private String raza;
    protected int edad;
    protected String Friend;

    VeteFeliz(){
    }

    public VeteFeliz(String Friend, String tipo){
        this.Friend = Friend;
        this.tipo = tipo;
    }

    VeteFeliz(String Friend, String tipo, String raza ){
        this.Friend = Friend;
        this.tipo = tipo;
        this.raza = raza;
    }

    public String getFriend() {
        return Friend;
    }

    public void setFriend(String friend) {
        Friend = friend;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
