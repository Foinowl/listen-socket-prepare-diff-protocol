package ru.rt.payment;

import java.net.Socket;

public class SSHSocketHandler<TR extends SSHTransport<SSHRequest, SSHResponse>>
    extends AbstractSocketHandler<SSHRequest, SSHResponse>{


    protected SSHSocketHandler(final Transport<SSHRequest, SSHResponse> transport, final Socket socket) {
        super(transport, socket);
    }

    @Override
    protected void handle() {

    }

    @Override
    public void run() {

    }
}
