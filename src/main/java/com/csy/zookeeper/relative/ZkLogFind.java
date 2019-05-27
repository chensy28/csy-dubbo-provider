package com.csy.zookeeper.relative;

import org.apache.zookeeper.server.LogFormatter;

/**
 * 查看zk二进制文件
 * https://www.e-learn.cn/content/qita/821768
 *
 *
 *一次zxid打满之后引发的故障
 * https://blog.csdn.net/u011305680/article/details/84566030
 *
 */
public class ZkLogFind {
    public static void main(String[] args) {
        try {
            LogFormatter.main(new String[] {"/usr/local/var/run/zookeeper/data/version-2/log.69b"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
