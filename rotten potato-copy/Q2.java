public class Q2{
public static void main (String[] args){
    int[][] ratings = { {4,6,2,5},{7,9,4,8},{6,9,3,7} };
    reviewerAvgRating(ratings, 1);
}
     public static int reviewerAvgRating(int[][] ratings, int reviewer){ 
//System.out.println(ratings[0].length); // length of y
//System.out.println(ratings.length); //length of x 
        //find all ratings for movie x
        //add them up 
        //divide total by the number of reviewer
        //return result-average rating from 3 
        
        int total=0;
        //loop for movies to get their ratings 
        for(int i=0; i<ratings[0].length;i++){
          total+=ratings[reviewer][i];  
         // System.out.println(ratings[i][movie]);
    }
  //calculate the average 
  
    return (int)(total/ratings[0].length);
}
}

