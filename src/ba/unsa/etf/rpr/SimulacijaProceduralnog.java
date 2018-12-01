package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class SimulacijaProceduralnog {
    static public  Integer vracaZbrirAkoIma2(ArrayList<Integer> s ) {
        if(s.contains(2)){
            int x=0;
            for(int y  :  s){
                x+=y;
            }
            return x;
        }
        else return 0;
    }
}
