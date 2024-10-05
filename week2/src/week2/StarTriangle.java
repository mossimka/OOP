package week2;

public class StarTriangle {
    public int width;

    public StarTriangle(int triangleWidth) {
        this.width = triangleWidth;
    }
    
    public String toString() {
        String triangle = new String();
        for (int l=1; l<=width; l++) {
            for (int j=0; j<l; j++) {
                triangle = triangle + "[*]";
            }
            triangle = triangle + '\n';
        }
        return triangle;
    }
}
