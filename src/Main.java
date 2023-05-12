import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomizer = (random.nextInt(6) + 5) * 2;
        int randomVal;
        int[][] tab = new int[randomizer][randomizer];
        int i=0,j=0,k=0;
        do{
            randomVal=random.nextInt(201)-100;
            if (randomVal>0&&i<randomizer) {
                tab[i][i] = randomVal;
                i++;
            }
            else if(randomVal<0&&j<randomizer){
                tab[randomizer-j-1][k] = randomVal;
                j++;
                k++;
            }
        }while(tab[randomizer-1][randomizer-1]==0||tab[0][randomizer-1]==0);
        for (int l = 0; l < randomizer; l++) {
            for(int n = 0;n<randomizer;n++){
                System.out.print(tab[l][n]+",");
            }
            System.out.println();
        }
    }
}