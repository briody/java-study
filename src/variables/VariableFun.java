package variables;

public class VariableFun {



	int intUnderscore = 5_1;
	byte nibbleUnderscore = 0b0010_0101;

  byte byteMin = -128;
  byte byteMax = 127;

  short shortMin = -32768;
  short shortMax = 32767;

  int intMin = -2_147_483_648;
  int intMax = 2_147_483_647;

  long longMin = -9_223_372_036_854_775_808L;
  long longMax = 9_223_372_036_854_775_807L;

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  VariableFun variableFun = new VariableFun();
  variableFun.testRanges();

	}

  public void testRanges(){
    if(byteMin == Byte.MIN_VALUE){
      System.out.println( "The byte min value is: " + byteMin );
    } else {
      System.out.println( "The byte min value is: " + Byte.MIN_VALUE + " not: " + byteMin );
    }

    if(byteMax == Byte.MAX_VALUE){
      System.out.println( "The byte max value is: " + byteMax );
    } else {
      System.out.println( "The byte max value is: " + Byte.MAX_VALUE + " not: " + byteMax );
    }

    if(shortMin == Short.MIN_VALUE){
      System.out.println( "The short min value is: " + shortMin );
    } else {
      System.out.println( "The short min value is: " + Short.MIN_VALUE + " not: " + shortMin );
    }

    if(shortMax == Short.MAX_VALUE){
      System.out.println( "The short max value is: " + shortMax );
    } else {
      System.out.println( "The short max value is: " + Short.MAX_VALUE + " not: " + shortMax );
    }

    if(longMin == Long.MIN_VALUE){
      System.out.println( "The long min value is: " + longMin );
    } else {
      System.out.println( "The long min value is: " + Long.MIN_VALUE + " not: " + longMin );
    }

    if(longMax == Long.MAX_VALUE){
      System.out.println( "The long max value is: " + longMax );
    } else {
      System.out.println( "The long max value is: " + Long.MAX_VALUE + " not: " + longMax );
    }

  }




}
