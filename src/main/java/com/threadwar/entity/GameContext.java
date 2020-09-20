package com.threadwar.entity;

import lombok.Data;

import java.util.List;

@Data
public class GameContext {
    private Player player;
    private List<Enemy> enemies;
}
