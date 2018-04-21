//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.amazon.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Arrays;
import java.util.Enumeration;

public class IPUtil {

    private static final Logger logger = LoggerFactory.getLogger(IPUtil.class);

    private static volatile String localIp = null;
    private static volatile Integer port = null;

    public IPUtil() {
    }

    public static String getLocalIp() {
        if (localIp == null) {
            synchronized (logger) {
                if (localIp == null) {
                    localIp = getLocalIpInternal();
                }
            }
        }
        return localIp;
    }

    private static String getLocalIpInternal() {
        try {
            Enumeration e = NetworkInterface.getNetworkInterfaces();
            while (true) {
                while (e.hasMoreElements()) {
                    NetworkInterface netInterface = (NetworkInterface) e.nextElement();
                    Enumeration addresses = netInterface.getInetAddresses();

                    while (addresses.hasMoreElements()) {
                        InetAddress inetAddress = (InetAddress) addresses.nextElement();
                        if (inetAddress != null && inetAddress instanceof Inet4Address) {
                            String ip = inetAddress.getHostAddress();
                            if (ip.startsWith("192.") || ip.startsWith("10.")) {
                                return ip;
                            }
                        }
                    }
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }
        return "127.0.0.1";
    }

    public static Integer getPort() {
        if (port == null) {
            synchronized (logger) {
                if (port == null) {
                    port = getPortInternal();
                }
            }
        }
        return port;
    }

    private static Integer getPortInternal() {
        try {
            logger.info("获取容器端口开始...");
            int tc = Thread.activeCount();
            Thread[] ts = new Thread[tc];
            Thread.enumerate(ts);
            for (Thread t : Arrays.asList(ts)) {
                if (t.getName().startsWith("http-bio-")) {
                    logger.info("发现是tomcat容器...");
                    if (t.getName().replaceAll("http-bio-", "").split("-")[1].equals("Acceptor")) {
                        return Integer.valueOf(t.getName().replaceAll("http-bio-", "").split("-")[0]);
                    } else {
                        return Integer.valueOf(t.getName().replaceAll("http-bio-", "").split("-")[1]);
                    }
                }
                if (t.getName().startsWith("http") && t.getName().endsWith("Acceptor-0")) {
                    logger.info("发现是tomcat插件容器...");
                    return Integer.valueOf(t.getName().split("-")[1]);
                }
            }
        } catch (Exception e) {
            logger.error("获取容器端口失败...", e);
        }
        return 1111;
    }
}
