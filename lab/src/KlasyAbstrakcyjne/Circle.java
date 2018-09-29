package KlasyAbstrakcyjne;

public class Circle extends Geometric {
	protected double r;

	public double getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	@Override
	public float getSurface() {
		return (float) (Math.PI * (r * r));
	}

	@Override
	public float getPerimeter() {
		return (float) ((2 * Math.PI) * r);
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", getR()=" + getR() + ", getSurface()=" + getSurface() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}

}
