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
public class FactoryProducer {

	public static <E> AbstractFactory<E> getFactory() {
		return new ListFactory<E>();
	}
}
