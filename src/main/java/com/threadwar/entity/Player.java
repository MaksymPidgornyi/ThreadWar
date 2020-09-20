package com.threadwar.entity;

import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

@Data
public class Player extends AbstractPositioned {

    private Gun gun;

    public Player() {

    }

    private void shoot() {
        gun.shoot();
    }
}
