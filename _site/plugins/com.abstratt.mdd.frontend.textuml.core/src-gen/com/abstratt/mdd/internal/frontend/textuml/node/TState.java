/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TState extends Token
{
    public TState()
    {
        super.setText("state");
    }

    public TState(int line, int pos)
    {
        super.setText("state");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TState(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTState(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TState text.");
    }
}