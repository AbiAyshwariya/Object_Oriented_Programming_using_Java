// Source code is decompiled from a .class file using FernFlower decompiler.
class TypeWrap {
   TypeWrap() {
   }

   public static void main(String[] var0) {
      System.out.println("Variables Created:");
      char var1 = 'x';
      byte var2 = 50;
      short var3 = 1996;
      int var4 = 123456789;
      long var5 = 1234567654321L;
      float var7 = 3.14F;
      float var8 = 1.2E-5F;
      double var9 = 9.87E-7;
      System.out.println("c=" + var1);
      System.out.println("b=" + var2);
      System.out.println("s=" + var3);
      System.out.println("i=" + var4);
      System.out.println("l=" + var5);
      System.out.println("f1=" + var7);
      System.out.println("f2=" + var8);
      System.out.println("d2=" + var9);
      System.out.println(" ");
      System.out.println("Types Converted: ");
      short var11 = (short)var2;
      short var12 = (short)var4;
      float var13 = (float)var5;
      int var14 = (int)var7;
      System.out.println("(short)b=" + var11);
      System.out.println("(short)i=" + var12);
      System.out.println("(float)l=" + var13);
      System.out.println("(int)f=" + var14);
   }
}
