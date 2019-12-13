import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Nimotu{

    public static void main(String[] args){

        String[][] field = {
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}
        
        };    //field[y][x]

        String[][] compari = {
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#"," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#"}
            ,{"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}
        
        };    //field[y][x]
        
        Random rnd = new Random();
        int xnd =  rnd.nextInt(13) + 1;
        int ynd = rnd.nextInt(7) + 1;

        for(int i = 0; i < field.length; i++){
            field[rnd.nextInt(7) + 1][rnd.nextInt(13) + 1]  = ".";
        }

        for(int i = 0; i < field.length; i++){
            int yblock = rnd.nextInt(7) + 1;
            int xblock = rnd.nextInt(13) + 1;
            field[yblock][xblock]  = "#";
            compari[yblock][xblock]  = "#";
        }
                
        int xpl = xnd;
        int ypl = ynd;

        field[ypl][xpl] = "p";
        compari[ypl][xpl] = "p";

        Scanner scn = new Scanner(System.in);
        end: while(true){
            //String operat = " ";  delete later
            for(int i = 0; i < field.length; i++){
                for(int j = 0; j < field[i].length; j ++){
                    System.out.print(field[i][j]);
                }
                System.out.println();

            }

            for(int i = 0; i < field.length; i++){
                for(int j = 0; j < field[i].length; j ++){
                    System.out.print(compari[i][j]);
                }
                System.out.println();

            }

            if(Arrays.deepEquals(field, compari)){
                System.out.println("Congrats!");
                break end;
            }

            System.out.println("input \n w: ↑ \n d: →\n s: ↓ \n a: ← ");
            String operat = scn.nextLine();

            String tmp;        
                
            switch(operat){
                case "w":
                    if(field[ypl-1][xpl].equals("#")){
                        break;
                    }else if(field[ypl-1][xpl].equals(".")){
                        field[ypl-1][xpl] = " ";
                    }
                    tmp = field[ypl-1][xpl];
                    field[ypl-1][xpl]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    tmp = compari[ypl-1][xpl];
                    compari[ypl-1][xpl]  = compari[ypl][xpl];
                    compari[ypl][xpl] = tmp;
                    ypl = ypl-1;
                    break;
                case "s":
                    if(field[ypl+1][xpl].equals("#")){
                        break;
                    }else if(field[ypl+1][xpl].equals(".")){
                        field[ypl+1][xpl] = " ";
                    }
                    tmp = field[ypl+1][xpl];
                    field[ypl+1][xpl]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    tmp = compari[ypl+1][xpl];
                    compari[ypl+1][xpl]  = compari[ypl][xpl];
                    compari[ypl][xpl] = tmp;
                    ypl = ypl+1;
                    break;
                case "d":
                    if(field[ypl][xpl+1].equals("#")){
                        break;
                    }else if(field[ypl][xpl+1].equals(".")){
                        field[ypl][xpl+1] = " ";
                    }
                    tmp = field[ypl][xpl+1];
                    field[ypl][xpl+1]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    tmp = compari[ypl][xpl+1];
                    compari[ypl][xpl+1]  = compari[ypl][xpl];
                    compari[ypl][xpl] = tmp;
                    xpl = xpl + 1;
                    break;
                case "a":
                    if(field[ypl][xpl-1].equals("#")){
                        break;
                    }else if(field[ypl][xpl-1].equals(".")){
                        field[ypl][xpl-1] = " ";
                    }
                    tmp = field[ypl][xpl-1];
                    field[ypl][xpl-1]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    tmp = compari[ypl][xpl-1];
                    compari[ypl][xpl-1]  = compari[ypl][xpl];
                    compari[ypl][xpl] = tmp;
                    xpl = xpl - 1;
                    break;
            }
            

            
        }
        scn.close();
    }
}

