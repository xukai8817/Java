package com.edu;

import java.util.AbstractList;

/**
 * @author xukai
 * @param <E>
 * @date 2017年3月8日 下午6:29:15
 *
 */
public class TestUnsupportedOperationException<E> extends AbstractList<E> {
    
    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
    
}
