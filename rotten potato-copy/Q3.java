public class Q3{
    public static void main (String[] args){
    int[][] ratings = { {4,6,2,5},{7,9,4,8},{6,9,3,7} };
    avgRating2018(ratings);
}
public static int avgRating2018(int[][] ratings){
        int total=0;
        
        //loop through reviewers to get their ratings
        
        for(int i=0; i<ratings.length;i++){
            for(int j=0;j<ratings[0].length;j++){
            total+=ratings[i][j];
            //        i  j
            //1 time [0][0]:0+4
            //2 time [0][1]:+6
            //3 time [0][2]:+2
            //4 time [0][3]:+5
            
            //5 time [1][0]:+7
            //6 time [1][1]:+9
            //7 time [1][2]:+4
            //8 time [1][3]:+8
            
            //9 time [2][0]:+2
            //10 time [2][1]:+9
            //11 time [2][2]:+3
            //12 time [2][3]:+7
            
            
        }
        }
        //calculate the average 
        int totalCal= ratings.length*ratings[0].length;
        return (int)(total/totalCal);
    }
}



