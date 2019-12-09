import java.util.Scanner;

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
                    if(field[ypl-1][xpl].equals("o")){
                        break;
                    }else if(field[ypl-1][xpl].equals(".")){
                        field[ypl-1][xpl] = " ";
                    }
                    tmp = field[ypl-1][xpl];
                    field[ypl-1][xpl]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    ypl = ypl-1;
                    break;
                case "s":
                    if(field[ypl+1][xpl].equals("o")){
                        break;
                    }else if(field[ypl+1][xpl].equals(".")){
                        field[ypl+1][xpl] = " ";
                    }
                    tmp = field[ypl+1][xpl];
                    field[ypl+1][xpl]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    ypl = ypl+1;
                    break;
                case "d":
                    if(field[ypl][xpl+1].equals("o")){
                        break;
                    }else if(field[ypl][xpl+1].equals(".")){
                        field[ypl][xpl+1] = " ";
                    }
                    tmp = field[ypl][xpl+1];
                    field[ypl][xpl+1]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    xpl = xpl + 1;
                    break;
                case "a":
                    if(field[ypl][xpl-1].equals("o")){
                        break;
                    }else if(field[ypl][xpl-1].equals(".")){
                        field[ypl][xpl-1] = " ";
                    }
                    tmp = field[ypl][xpl-1];
                    field[ypl][xpl-1]  = field[ypl][xpl];
                    field[ypl][xpl] = tmp;
                    xpl = xpl - 1;
                    break;
            }
            if((field[1][2] != ".") && (field[1][3] != ".")){
                break;
            }
        }while(true);
    }
}

