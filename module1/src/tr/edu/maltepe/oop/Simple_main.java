package tr.edu.maltepe.oop;

class Simple_main {
        public static void main(String[] args) {
            // Create two cat objects
            Cat cat1 = new Cat("Whiskers", "gray", 3);
            Cat cat2 = new Cat("Mittens", "white", 2);

            // Describe the first cat
            cat1.describe();
            // Make the first cat meow with sound
            cat1.meow();

            // Describe the second cat
            cat2.describe();
            // Make the second cat meow with sound
            cat2.meow();
        }
    }