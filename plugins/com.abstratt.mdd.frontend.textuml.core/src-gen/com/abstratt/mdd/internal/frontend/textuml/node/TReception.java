/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TReception extends Token
{
    public TReception()
    {
        super.setText("reception");
    }

    public TReception(int line, int pos)
    {
        super.setText("reception");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TReception(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTReception(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TReception text.");
    }
}
