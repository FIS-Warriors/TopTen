public class TopTenTester {
        public static void main(String[] args)  {
           
           //Use this code to test the methods in the TopTen class
           TopTen items = new TopTen();

           //Add ten items to the array

           items.addMovie(new Movie("The Shawshank Redemption", 1994, 9.2));
           items.addMovie(new Movie("The Godfather", 1972, 9.1));
           items.addMovie(new Movie("The Godfather: Part II", 1974, 9.0));
           items.addMovie(new Movie("The Dark Knight", 2008, 9.0));
           items.addMovie(new Movie("12 Angry Men", 1957, 8.9));
           items.addMovie(new Movie("Schindler's List", 1993, 8.9));
           items.addMovie(new Movie("The Lord of the Rings: The Return of the King", 2003, 8.9));
           items.addMovie(new Movie("Pulp Fiction", 1994, 8.8));
           items.addMovie(new Movie("The Good, the Bad and the Ugly", 1966, 8.8));
           items.addMovie(new Movie("The Lord of the Rings: The Fellowship of the Ring", 2001, 8.8));
           
           //Test your methods to make sure they are working
           System.out.println(items.highestRatingName());
        }
}
