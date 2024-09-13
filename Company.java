
    public class Company implements Printable {
        private String name;
        private String city;

        public Company(String name, String city) {
            this.name = name;
            this.city = city;
        }

        @Override
        public void print() {
            System.out.println(name + ". " + city);
        }
    }

