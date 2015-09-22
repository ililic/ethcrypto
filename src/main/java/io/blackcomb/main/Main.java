package io.blackcomb.main;

import io.blackcomb.crypto.ECKey;
import org.spongycastle.util.encoders.Hex;

public class Main {

    public static void main(String[] args) {
        ECKey key = new ECKey();
        System.out.println(Hex.toHexString(key.getPrivKey().toByteArray()));
        System.out.println(Hex.toHexString(key.getPubKey()));
        System.out.println(Hex.toHexString(key.getAddress()));
    }

}