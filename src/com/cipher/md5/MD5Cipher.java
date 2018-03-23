package com.cipher.md5;



import java.security.MessageDigest;
import java.util.Base64;

import com.cipher.CipherAlgo;

public class MD5Cipher implements CipherAlgo
{


   public MD5Cipher()
   {
   }

   public String encrypt(String clearData)
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

   public String decrypt(String encodedData)
   {
       return null;
   }

   public static void main(String args[])
   {
 		MD5Cipher mc=new MD5Cipher();
		System.out.println("------------------");
		System.out.println(mc.encrypt("OurValue"));
		System.out.println("------------------");
 		System.out.println(mc.decrypt("OurValue"));



   }

@Override
public String encrypt(String strToEncrypt, String secret_key) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String decrypt(String strToDecrypt, String secret_key) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object keyGenerate(String myKey) {
	// TODO Auto-generated method stub
	return null;
}
}

