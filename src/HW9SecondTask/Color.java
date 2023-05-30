package HW9SecondTask;

public enum Color {

    WHITE(255, 255, 255) {
        public String toString() { return "white color, RGB is: " + getColorHex(); }
    },
    GREEN(0, 255, 0) {
        public String toString() { return "green color, RGB is: " + getColorHex(); }
    },
    BLUE(0, 0, 255) {
        public String toString() { return "blue color, RGB is: " + getColorHex(); }
    },
    RED(255, 0, 0) {
        public String toString() { return "red color, RGB is: " + getColorHex(); }
    };

    private int red;
    private int green;
    private int blue;

    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getColorHex() {
        String hex = String.format("#%02X%02X%02X", red, green, blue);
        return hex;
    }
}
