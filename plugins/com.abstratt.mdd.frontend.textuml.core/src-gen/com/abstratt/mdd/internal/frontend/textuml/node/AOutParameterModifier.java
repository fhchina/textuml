/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AOutParameterModifier extends PParameterModifier
{
    private TOut _out_;

    public AOutParameterModifier()
    {
        // Constructor
    }

    public AOutParameterModifier(
        @SuppressWarnings("hiding") TOut _out_)
    {
        // Constructor
        setOut(_out_);

    }

    @Override
    public Object clone()
    {
        return new AOutParameterModifier(
            cloneNode(this._out_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOutParameterModifier(this);
    }

    public TOut getOut()
    {
        return this._out_;
    }

    public void setOut(TOut node)
    {
        if(this._out_ != null)
        {
            this._out_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._out_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._out_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._out_ == child)
        {
            this._out_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._out_ == oldChild)
        {
            setOut((TOut) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
