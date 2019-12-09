#include <iostream>
using namespace std;

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

    while(true){
        //String operat = ' ';  delete later
        for (int i = 0; i < sizeof(field); i++)
        {
            for (int j = 0; j < sizeof(field[i]); j++)
            {
                cout << field[i][j];
            }
            cout << endl;
        }

        cout << "input \n w: ↑ \n d: →\n s: ↓ \n a: ← \n" << endl;

        cin >> operat;

        char tmp;

        switch (operat)
        {
        case 'w':
            if (field[ypl - 1][xpl] == 'o')
            {
                break;
            }
            else if (field[ypl - 1][xpl] == '.')
            {
                field[ypl - 1][xpl] = ' ';
            }
            tmp = field[ypl - 1][xpl];
            field[ypl - 1][xpl] = field[ypl][xpl];
            field[ypl][xpl] = tmp;
            ypl = ypl - 1;
            break;
        case 's':
            if (field[ypl + 1][xpl] == 'o')
            {
                break;
            }
            else if (field[ypl + 1][xpl] == '.')
            {
                field[ypl + 1][xpl] = ' ';
            }
            tmp = field[ypl + 1][xpl];
            field[ypl + 1][xpl] = field[ypl][xpl];
            field[ypl][xpl] = tmp;
            ypl = ypl + 1;
            break;
        case 'd':
            if (field[ypl][xpl + 1] == 'o')
            {
                break;
            }
            else if (field[ypl][xpl + 1] == '.')
            {
                field[ypl][xpl + 1] = ' ';
            }
            tmp = field[ypl][xpl + 1];
            field[ypl][xpl + 1] = field[ypl][xpl];
            field[ypl][xpl] = tmp;
            xpl = xpl + 1;
            break;
        case 'a':
            if (field[ypl][xpl - 1] == 'o')
            {
                break;
            }
            else if (field[ypl][xpl - 1] == '.')
            {
                field[ypl][xpl - 1] = ' ';
            }
            tmp = field[ypl][xpl - 1];
            field[ypl][xpl - 1] = field[ypl][xpl];
            field[ypl][xpl] = tmp;
            xpl = xpl - 1;
            break;
        }
        if ((field[1][2] != '.') && (field[1][3] != '.'))
        {
            cout << "Congrats!";
            break;
        }
    }
    return 0;
}