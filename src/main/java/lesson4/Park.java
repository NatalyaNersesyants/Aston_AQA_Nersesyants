package lesson4;

public class Park {
    public class Attraction {
        private String title;
        private String workingHours;
        private int cost;

        public Attraction(String title, String workingHours, int cost) {
            this.title = title;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printAttractionInfo() {
            System.out.println("Attraction title: " + title);
            System.out.println("Opening hours: " + workingHours);
            System.out.println("Cost: " + cost);
            System.out.println();
        }
    }
}
