/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TDatatype extends Token
{
    public TDatatype()
    {
        super.setText("datatype");
    }

    public TDatatype(int line, int pos)
    {
        super.setText("datatype");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDatatype(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDatatype(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDatatype text.");
    }
}
