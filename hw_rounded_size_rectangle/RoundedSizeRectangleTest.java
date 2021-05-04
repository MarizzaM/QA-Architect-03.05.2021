package com.company;
import org.junit.Test;

import java.lang.reflect.Field;

import static junit.framework.TestCase.assertEquals;
public class RoundedSizeRectangleTest {
    private int get_m_width(RoundedSizeRectangle sizeRectangle) {
        try {
            int m_width = 0;
            Field privateStringField = null;
            privateStringField = RoundedSizeRectangle.class.
                    getDeclaredField("m_width");
            privateStringField.setAccessible(true);
            m_width = (int) privateStringField.get(sizeRectangle);

            return m_width;
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private int get_m_height(RoundedSizeRectangle sizeRectangle) {
        try {
            int m_height = 0;
            Field privateStringField = null;
            privateStringField = RoundedSizeRectangle.class.
                    getDeclaredField("m_height");
            privateStringField.setAccessible(true);
            m_height = (int) privateStringField.get(sizeRectangle);

            return m_height;
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Test
    public void test_RoundedSizeRectangle_roundedNumbers(){
        RoundedSizeRectangle sizeRectangle = new RoundedSizeRectangle(5.8f,7.1f);

        int width = get_m_width(sizeRectangle);
        int height = get_m_height(sizeRectangle);

        assertEquals(sizeRectangle.getM_width(), width);
        assertEquals(sizeRectangle.getM_height(), height);
    }

    @Test
    public void test_RoundedSizeRectangle_getArea(){
        RoundedSizeRectangle sizeRectangle = new RoundedSizeRectangle(5.8f,7.1f);

        int width = get_m_width(sizeRectangle);
        int height = get_m_height(sizeRectangle);

        assertEquals(sizeRectangle.getArea(width, height), width*height);
    }
}
