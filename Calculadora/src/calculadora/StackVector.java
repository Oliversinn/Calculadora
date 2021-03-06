package calculadora;
import java.util.ArrayList;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Revilo
 * @param <E> generic
 */
public class StackVector<E> implements Stack<E> {
 protected Vector<E> data;
    
    public StackVector(){
        data = new Vector<E>();
    }
    
    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        return data.remove(size()-1);
    }

    @Override
    public E peek() {
        return data.get(size()-1);
    }

    @Override
    public boolean empty() {
        return size()== 0;
    }

    @Override
    public int size() {
        return data.size();
    }
    
}
