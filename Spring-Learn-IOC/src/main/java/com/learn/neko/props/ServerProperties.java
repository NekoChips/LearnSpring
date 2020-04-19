package com.learn.neko.props;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author NekoChips
 * @description Server Props
 * @date 2020/4/18
 */
@Component
//@ConditionalOnExpression("'${spring.application.name}'.contains('demo')")
//@ConditionalOnProperty(prefix = "server", name = "port", havingValue = "8080", matchIfMissing = false)
@ConditionalOnProperty(prefix = "spring.redis", name = "address", matchIfMissing = true)
public class ServerProperties implements Serializable {

    private static final long serialVersionUID = 1020374465237548217L;

    private String address;

    private int port;

    public ServerProperties() {
    }

    public ServerProperties(String address, int port) {
        this.address = address;
        this.port = port;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
