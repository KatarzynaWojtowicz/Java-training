package KlasyAbstrakcyjne;

public abstract class Geometric {
	public abstract float getSurface();

	public abstract float getPerimeter();

	@Override
	public String toString() {
		return "Geometric [getSurface()=" + getSurface() + ", getPerimeter()=" + getPerimeter() + "]";
	}

}
