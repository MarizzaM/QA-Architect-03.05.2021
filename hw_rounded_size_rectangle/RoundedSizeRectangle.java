package com.company;

public class RoundedSizeRectangle {
    private int m_width;
    private int m_height;

    public RoundedSizeRectangle(float m_width, float m_height) {
        this.m_width = Math.round(m_width);
        this.m_height = Math.round(m_height);
    }

    public int getM_width() {
        return this.m_width;
    }

    public int getM_height() {
        return this.m_height;
    }

    public int getArea(int a, int b){
        return a * b;
    }
}
