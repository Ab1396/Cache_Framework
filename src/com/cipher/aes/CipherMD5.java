package com.cipher.aes;
import java.security.MessageDigest;
import java.util.Base64;



public class CipherMD5 implements CipherAlgo
{
	public Object keyGenerate(String myKey) {}
	
	public String decrypt(String strToDecrypt, String secret_key) 
	{return null;}
	
	public String encrypt(String strToEncrypt, String secret_key) 
	{
		try
	       {

	           MessageDigest alg = MessageDigest.getInstance("MD5", "SUN");
	           byte bs[] = clearData.getBytes();
	           byte digest[] = alg.digest(bs);
	           return Base64.getEncoder().encodeToString(digest);
	       }
	       catch(Exception e)
	       {
	           System.out.println("there appears to have been an error " + e);
	       }
	       return null;
	}
	/*public static void main(String args[])
	   {
	 		MD5Cipher mc=new MD5Cipher();
			System.out.println("------------------");
			System.out.println(mc.encrypt("OurValue","myKey"));
			System.out.println("------------------");
	 		System.out.println(mc.decrypt("OurValue"));
	   }*/

}
