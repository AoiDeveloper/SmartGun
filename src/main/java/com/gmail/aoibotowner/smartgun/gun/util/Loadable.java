package com.gmail.aoibotowner.smartgun.gun.util;

public interface Loadable {
    void load(int amount);
    int getRemaining();
    void setRemaining(int amount);
}
