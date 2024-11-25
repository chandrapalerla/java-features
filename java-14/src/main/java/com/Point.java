package com;

public record Point(int x, int y) {
    public int add() {
        return x + y;
    }
}
