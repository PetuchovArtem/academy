package by.academy.classwork.lesson14;

public class HeavyBox extends Box implements Comparable<HeavyBox>{

	double weight;

	public HeavyBox() {
		super();
	}

	public HeavyBox(double weight, double width, double height, double depth) {
		this.weight = weight;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [weight=");
		builder.append(weight);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeavyBox other = (HeavyBox) obj;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public int compareTo(HeavyBox o) {

        int result = weight.compareTo(o.getWeight());

        if (result == 0) {
            result = weight.compareTo(o.getWeight());
        }
        return result;
    }


}