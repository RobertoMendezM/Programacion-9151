public class UsaVeteFeliz {

    public static  void main(String[] algo) {
        VeteFeliz vf = new VeteFeliz("Roberto", "Perrichonis");
        VeteFeliz perrichonis = new VeteFeliz("Roberto", "Perrichonis", "Pitbull");
        perrichonis.setFriend("MiAmadaPerrichinos");
        vf.setRaza("TortugaDeOrejasRojas");
        System.out.println(vf.getRaza());
        System.out.println(perrichonis.getFriend());
    }
}
