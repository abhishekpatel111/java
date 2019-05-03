class Kaliya implements Comparable<Kaliya> {
    String name;
    Kaliya(String name) {
        this.name=name;
    }
    public int compareTo(Kaliya kaliya) {
        return this.name.compareTo(kaliya.name);
    }
}
public class KaliyaSorting {

     public static void main(String []arg) {
        List<kaliyaCharacter> kaliya = new ArrayList<>();
        kaliya.add(new KaliyaCharacter("Abhishek"));
        kaliya.add(new KaliyaCharacter("Avinash "));
        kaliya.add(new KaliyaCharacter("Ajay "));
        kaliya.add(new KaliyaCharacter("Sunil "));
        Collections.sort(kaliya);
        kaliya.stream().map(s->s.name).forEach(System.out::print);
        Collections.reverse(kaliya);
        kaliya.stream().forEach(System.out::print);
    }
}