class DebugBox {
   public static void main (String[] args) {
      DebugBox box = new DebugBox(3, 3, 3);
      box.showData();
   }
   
   private int width;
   private int length;
   private int height;
   
   public DebugBox() {
      width = 1;
      length = 1;
      height = 1;
   }
   
   public DebugBox (int width, int length, int height) {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   
   public double getVolume() {
      return length * width * height;
   }
   
   public void showData() {
      System.out.println("Width: " + width + " Length: " + length + " Height: " + height + " Volume: " + getVolume());
   }
}