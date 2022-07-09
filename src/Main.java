// libs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//code

//teams class
class Teams{
    BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    String name;
    int tmc = 5; // teammates count
    ArrayList<String> team =  new ArrayList<String>(); //создание списка
    public Teams(String teamName) throws IOException {
        System.out.println("введите имя команды");
        name = teamName + bR.readLine();
        int i;
        for (i = 0; i < (tmc - 1); i++) { //запись фрагов
            System.out.println("введите количество фрагов игрока номер" + i+1);
            team.add((bR.readLine()));

        }
    }
    public float Score(){ //счет КД
        int i;
        float KD = 0;
        for (i = 0; i < (tmc - 1); i++) {
            KD += Integer.parseInt(team.get(i));
        }
        KD = KD/tmc;
        return KD;
    }



}

// main code
public class Main {

    public static void main(String[] args) throws IOException {


        Teams t1 = new Teams(""); // создание команды номер 1
        Teams t2 = new Teams(""); // создание команды номер 2
        float kd1 = t1.Score(); // вывод КД первой команды
        float kd2 = t2.Score(); // вывод КД второй команды
        if(kd1>kd2){
            System.out.println("победила команда "+t1.name + " со счетом " + kd1);

        }
        else{
            System.out.println("победила команда "+t2.name + " со счетом " + kd2);
        }
    }
    }

