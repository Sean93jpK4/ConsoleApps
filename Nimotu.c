#include <stdio.h>

int main()
{

    char field[5][8][1] = {{'#', '#', '#', '#', '#', '#', '#', '#'}
                    , {'#', ' ', '.', '.', ' ', ' ', ' ', '#'}
                    , {'#', ' ', 'o', 'o', 'p', ' ', ' ', '#'}
                    , {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#'}
                    , {'#', '#', '#', '#', '#', '#', '#', '#'}}; //[4][7] player[2][4]

    int ypl = 2;
    int xpl = 4;
    char operat;

    while(1){
        //String operat = ' ';  delete later
        for (int i = 0; i < sizeof(field); i++)
        {
            for (int j = 0; j < sizeof(field[i]); j++)
            {
                printf("%c",field[i][j][1]);
            }
            printf("\n");
        }

        printf("input \n w: ↑ \n d: →\n s: ↓ \n a: ← \n");

        scanf("%c",&operat);

        char tmp;

        switch (operat)
        {
        case 'w':
            if (field[ypl - 1][xpl][1] == 'o')
            {
                break;
            }
            else if (field[ypl - 1][xpl][1] == '.')
            {
                field[ypl - 1][xpl][1] = ' ';
            }
            tmp = field[ypl - 1][xpl][1];
            field[ypl - 1][xpl][1] = field[ypl][xpl][1];
            field[ypl][xpl][1] = tmp;
            ypl = ypl - 1;
            break;
        case 's':
            if (field[ypl + 1][xpl][1] == 'o')
            {
                break;
            }
            else if (field[ypl + 1][xpl][1] == '.')
            {
                field[ypl + 1][xpl][1] = ' ';
            }
            tmp = field[ypl + 1][xpl][1];
            field[ypl + 1][xpl][1] = field[ypl][xpl][1];
            field[ypl][xpl][1] = tmp;
            ypl = ypl + 1;
            break;
        case 'd':
            if (field[ypl][xpl + 1][1] == 'o')
            {
                break;
            }
            else if (field[ypl][xpl + 1][1] == '.')
            {
                field[ypl][xpl + 1][1] = ' ';
            }
            tmp = field[ypl][xpl + 1][1];
            field[ypl][xpl + 1][1] = field[ypl][xpl][1];
            field[ypl][xpl][1] = tmp;
            xpl = xpl + 1;
            break;
        case 'a':
            if (field[ypl][xpl - 1][1] == 'o')
            {
                break;
            }
            else if (field[ypl][xpl - 1][1] == '.')
            {
                field[ypl][xpl - 1][1] = ' ';
            }
            tmp = field[ypl][xpl - 1][1];
            field[ypl][xpl - 1][1] = field[ypl][xpl][1];
            field[ypl][xpl][1] = tmp;
            xpl = xpl - 1;
            break;
        }
        if ((field[1][2][1] != '.') && (field[1][3][1] != '.'))
        {
            printf("Congrats!");
            break;
        }
    }
    return 0;
}