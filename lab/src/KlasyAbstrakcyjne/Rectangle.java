package KlasyAbstrakcyjne;

public class Rectangle extends Geometric {
	protected float width;
	protected float height;

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float getSurface() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return width + width + height + height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + "]";
	}

}
