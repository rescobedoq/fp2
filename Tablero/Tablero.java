public class Tablero{
    
    public static void main (String args[]){
        
        int[][]  alumnosfxniveleidioma= new int[3][4];        

        alumnosfxniveleidioma[0][0] = 7; 
        alumnosfxniveleidioma[0][1] = 14;
        alumnosfxniveleidioma[0][2]= 8; 
        alumnosfxniveleidioma[0][3] = 3;
        
        alumnosfxniveleidioma[1][0] = 6; 
        alumnosfxniveleidioma[1][1]= 19;
        alumnosfxniveleidioma[1][2] = 7; 
        alumnosfxniveleidioma[1][3] = 2;
        
        alumnosfxniveleidioma[2][0] = 3; 
        alumnosfxniveleidioma[2][1]= 13;
        alumnosfxniveleidioma[2][2] = 4; 
        alumnosfxniveleidioma[2][3] = 1;

        imprimir(alumnosfxniveleidioma);


    }

    public static void imprimir(int[][] m){
        for( int i=0; i<m.length; i=i+1){
            //System.out.println("");
            for(int j=0; j<m[0].length; j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
    }

}
