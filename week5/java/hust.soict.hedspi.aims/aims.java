public class Aims {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        dvd1.setCost(19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars", "Science Fiction", "Geoge Lucas", 124, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Aladdin", "Animaiton", "John Musker", 90, 18.99f);

        Order anOrder = new Order();

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd3);

        System.out.println("Total cost is: " + anOrder.totalCost());
    }
}
