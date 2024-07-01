public class TriangleMaxHeight {
    public static int maxTriangleHeight(int red, int blue) {
        int height = 0;
        int row = 1;

        while (true) {
            if (row % 2 != 0) {  // Odd rows are red
                if (red >= row) {
                    red -= row;
                    height++;
                } else {
                    break;
                }
            } else {  // Even rows are blue
                if (blue >= row) {
                    blue -= row;
                    height++;
                } else {
                    break;
                }
            }
            row++;
        }

        return height;
    }

    public static void main(String[] args) {
        int red = 10;
        int blue = 12;
        System.out.println(maxTriangleHeight(red, blue));  // Output will be the maximum height of the triangle
    }
}
