 // Task 16 Create the class.
    public class Product{
        private String name;
        private long id;
        private double price;

        // Task 17 Write the constructor.
        public Product( long id, String name, double price){
            this.id = id;
            this.name = name;
            this.price = price;
        }

        // Task 18 Add the three getters.
        public String getName(){
            return name;
        }
        public Long getId(){
            return id;
        }
        public double getPrice(){
            return price;
        }

        // Activity 21: Product describes itself
        public String describe() {
            String type;
            if (price > 100) {
                type = "premium";
            } else {
                type = "standard";
            }
            return id + " - " + name + " - " + price + " - " + type;
        }
    }
