/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
/**
 *
 * @author Revilo
 * @param <E>
 */
public abstract class AbstractList<E> implements List<E> {
    public AbstractList()
   // post: does nothing
   {
   }

    @Override
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
    @Override
  public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
  {
	return -1 != indexOf(value);
}
}
