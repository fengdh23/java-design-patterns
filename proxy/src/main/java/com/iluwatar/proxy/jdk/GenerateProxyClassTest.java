package com.iluwatar.proxy.jdk;

import org.junit.Test;

import sun.misc.ProxyGenerator;
import java.io.File;
import java.io.FileOutputStream;

public class GenerateProxyClassTest {
    @SuppressWarnings("resource")
    @Test
    public void proxyTest() throws Exception {
        byte[] bs = ProxyGenerator.generateProxyClass("AudiImpl", new Class<?>[] {ICar.class});
        new FileOutputStream(new File("d:/AudiImpl.class")).write(bs);
    }
}
