public class TopTen {
    /** 
    * The index for the most recent movie which was added
    */
   private int loc;
    /**
   * The Array containing all of the items you are creating.
   */
   private Movie[] list;
   
   /**
    * Creates a new TopTen object with an Array with 10 elements. 
    */
   public TopTen() {
       loc = 0;
       list = new Movie[10];
   }

   public void addMovie(Movie m) {
       list[loc] = m;
       loc++;
   }
   
   /**
    * Finds the Movie with the highest rating in the list.
    * @return the name of the movie with the highest rating.
    */
   public String highestRatingName() {
      double rating = 0.0;
      String movie = "";
      for(int i = 0; i < list.length; i++) {
         if(list[i].getRatingIMDb() > rating) {
             rating = list[i].getRatingIMDb();
             movie = list[i].getName();
         }
      }
      return movie;
   }
}
