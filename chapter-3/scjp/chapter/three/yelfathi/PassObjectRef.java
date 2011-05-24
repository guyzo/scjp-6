package scjp.chapter.three.yelfathi;

import java.awt.Dimension;

class PassObjectRef {

	public static void main(String[] args) {

		Dimension plotDimension = new Dimension(20, 30);
		PassObjectRef passObj = new PassObjectRef();
		System.out.println("B4 Updating: " + "H: " + plotDimension.height
				+ " W:" + plotDimension.width);
		// Before the object values are altered
		passObj.updateDimension(plotDimension);
		System.out.println("After Updating: " + "H:" + plotDimension.height
				+ " W:" + plotDimension.width);
		// After the object values are altered

	}

	void updateDimension(Dimension dim) {

		dim.height += 10; 
		dim.width += 20;

	}

}