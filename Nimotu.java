import java.util.Scanner;

//作りかけ
public class Nimotu{


    public static void main(String[] args){

        String[][] field = {{"#","#","#","#","#","#","#","#"}
                        ,{"#"," ",".","."," "," "," ","#"}
                        ,{"#"," ","o","o","p"," "," ","#"}
                        ,{"#"," "," "," "," "," "," ","#"}
                        ,{"#","#","#","#","#","#","#","#"}};    //[4][7] player[2][4]

        int ypl = 2;
        int xpl = 4;

        Scanner scn = new Scanner(System.in);
        do{
            //String operat = " ";  delete later
            for(int i = 0; i < field.length; i++){
                for(int j = 0; j < field[i].length; j ++){
                    System.out.print(field[i][j]);
                }
                System.out.println();

            }
            System.out.println("input \n w: ↑ \n d: →\n s: ↓ \n a: ← ");
            String operat = scn.nextLine();

            String tmp;        
                


            switch(operat){
                case "w":
                    tmp = field[ypl-1][xpl];
                    field[ypl-1][xpl]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    ypl = ypl-1;
                    break;
                case "s":
                    tmp = field[ypl+1][xpl];
                    field[ypl+1][xpl]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    ypl = ypl+1;
                    break;
                case "d":
                    tmp = field[ypl][xpl+1];
                    field[ypl][xpl+1]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    xpl = xpl + 1;
                    break;
                case "a":
                    tmp = field[ypl][xpl-1];
                    field[ypl][xpl-1]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    xpl = xpl - 1;
                    break;
            }
        }while(true);
    }
}
