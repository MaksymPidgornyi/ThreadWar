package com.threadwar.entity;

public abstract class AbstractPositioned implements Positioned {
    private Position position = new Position();

    public Integer setXPos(Integer xPos) {
        position.setXPos(xPos);
        return position.getXPos();
    }

    public Integer setYPos(Integer yPos) {
        position.setYPos(yPos);
        return position.getYPos();
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
