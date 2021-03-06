/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class TRole extends Token
{
    public TRole()
    {
        super.setText("role");
    }

    public TRole(int line, int pos)
    {
        super.setText("role");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRole(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRole(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRole text.");
    }
}
