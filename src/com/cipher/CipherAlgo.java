package com.cipher;

public interface CipherAlgo {
	public String encrypt(String strToEncrypt, String secret_key);
	public String decrypt(String strToDecrypt, String secret_key);
	public Object keyGenerate(String myKey);
}
