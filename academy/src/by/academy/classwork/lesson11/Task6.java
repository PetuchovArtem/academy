package by.academy.classwork.lesson11;

import java.io.Serializable;

public class Task6<T extends Comparable , V extends Animal & Serializable , K extends Number> {
	T t;
	V v;
	K k;
 
	protected Task6(T t, K k, V v){
		this.t=t;
		this.k=k;
		this.v=v;
	}

	public Class<? extends Object> getT() {
		return t.getClass();
	}

	public Class<? extends Object> getK() {
		return  k.getClass();
	}

	public Class<? extends Object> getV() {
		return v.getClass();
	}

	@Override
	public String toString() {
		return "Task6 [t=" + t + ", v=" + v + ", k=" + k + ", getT()=" + getT() + ", getK()=" + getK() + ", getV()="
				+ getV() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
