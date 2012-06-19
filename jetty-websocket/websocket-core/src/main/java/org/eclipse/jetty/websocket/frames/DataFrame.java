package org.eclipse.jetty.websocket.frames;

import org.eclipse.jetty.websocket.api.OpCode;

public abstract class DataFrame extends BaseFrame
{
    public DataFrame()
    {
        super();
    }

    public DataFrame(OpCode opcode)
    {
        super(opcode);
    }
}
