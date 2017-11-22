/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author JoseCarlos
 */
public class ImplLeakyStack<E> implements LeakyStack<E>{
    CircularLinkedList<E> listaCircular = new CircularLinkedList<>();

    

    
    @Override
    public int size() {
        return listaCircular.size();
    }

    @Override
    public boolean isEmpty() {
        return listaCircular.isEmpty();
    }

    @Override
    public E saveHistory(E e) {
        listaCircular.addFirst(e);
        return e;
    }

    @Override
    public E actual() {
        return listaCircular.last();
    }

    @Override
    public E undo() {
        return listaCircular.removeFirst();
    }
    
}
