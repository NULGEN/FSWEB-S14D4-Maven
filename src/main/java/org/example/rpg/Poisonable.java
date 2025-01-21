package org.example.rpg;

import org.example.rpg.utils.Constant;

public interface Poisonable {
//    double poison();
//
//    double poison(int level);

    default double poison(){
        return  Constant.POISON_PERCENTAGE;
    }
}
