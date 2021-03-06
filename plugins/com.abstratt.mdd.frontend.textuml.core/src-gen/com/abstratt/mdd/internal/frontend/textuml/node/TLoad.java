/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TLoad extends Token
{
    public TLoad()
    {
        super.setText("load");
    }

    public TLoad(int line, int pos)
    {
        super.setText("load");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLoad(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLoad(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLoad text.");
    }
}
