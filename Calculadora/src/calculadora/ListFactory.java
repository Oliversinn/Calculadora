/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Revilo
 */
public class ListFactory<E> extends AbstractFactory<E> {

	@Override
	public List<E> getList(String type) {
		if (type.equals(null)){
			return null;
		}
		if (type.equals("SINGLE")) {
			return new SinglyLinkedList<E>();
		} else if (type.equals("DOUBLE")) {
			return new DoublyLinkedList<E>();
		} else if (type.endsWith("CIRCLE")) {
			return new CircularList<E>();
		}
		return null;
	}

}
