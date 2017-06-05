package Models;

import java.util.ArrayList;
import java.util.Comparator;

public class ListaOrdenadaGenerica<E> extends ArrayList<E> {

	Comparator<? super E> comparador;

	public ListaOrdenadaGenerica(Comparator<? super E> c) {
		comparador = c;
	}
	

	@Override
	public boolean add(E e) {
		boolean retorno = super.add(e);
		super.sort(comparador);
		return retorno;
	}

	@Override
	public boolean remove(Object o) {
		boolean retorno = super.remove(o);
		super.sort(comparador);
		return retorno;
	}

	@Override
	public E remove(int index) {
		E elemento=super.remove(index);
		super.sort(comparador);
		return elemento;
	}
}
