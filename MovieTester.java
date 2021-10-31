public class MovieTester {
   public static void main(String[] args) {
       Movie testOne = new Movie("The Shawshank Redemption", 1994, 9.2);
       System.out.println(testOne);
       System.out.println("Movie name: The Shawshank Redemption Year released: 1994 IMDb rating: 9.2");
       testOne.setName("New name");
       System.out.println(testOne.getName() + " == New name");
       testOne.setYearReleased(1990);
       System.out.println(testOne.getYearReleased() + " == 1990");
       testOne.setRatingIMDb(8.5);
       System.out.println(testOne.getRatingIMDb() + " == 8.5");
       System.out.println(testOne);
       System.out.println("Movie name: New name Year released: 1990 IMDb rating: 8.5");
   }
}