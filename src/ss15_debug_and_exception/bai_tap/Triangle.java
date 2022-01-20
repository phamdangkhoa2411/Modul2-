package ss15_debug_and_exception.bai_tap;

public class Triangle {
 private int edgeA ;
 private int edgeB ;
 private int edegC ;
 public Triangle(){
 }

 public Triangle(int edgeA, int edgeB, int edegC) throws ExceptionRectangle  {
  if (edgeA<=0 || edgeB <=0 || edegC <=0 || (edgeB+edegC) < edgeA || (edegC+edgeA)<edgeB){
     throw new ExceptionRectangle();
  }

  this.edgeA = edgeA;
  this.edgeB = edgeB;
  this.edegC = edegC;
 }
}
