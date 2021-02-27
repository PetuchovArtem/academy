package by.academy.classwork.lesson14;

public class Box {
	double width;
	double height;
	double depth;

	public Box() {
		System.out.println("Конструирование объекта Вох");
		width = 10;
		height = 10;
		depth = 10;
	}

	Box(double depth, double height) {
		this();
		this.getVolume();
	}

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box(double len) {
		width = len;
		height = len;
		depth = len;
	}

	/**
	 * Подсчитать объем коробки
	 *
	 * @return Объем
	 */
	double getVolume() {
		return width * height * depth;
	}

	/**
	 * Установить размер коробки
	 *
	 * @param w - ширина
	 * @param h - высота
	 * @param d - глубина
	 */
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(depth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}
}