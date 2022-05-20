package com.example.a2048;

public interface SwipeCallback {
    void onSwipe(Direction direction);

    enum Direction{
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
}
