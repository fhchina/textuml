/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ASingleMultiplicitySpec extends PMultiplicitySpec
{
    private PMultiplicityValue _multiplicityValue_;

    public ASingleMultiplicitySpec()
    {
        // Constructor
    }

    public ASingleMultiplicitySpec(
        @SuppressWarnings("hiding") PMultiplicityValue _multiplicityValue_)
    {
        // Constructor
        setMultiplicityValue(_multiplicityValue_);

    }

    @Override
    public Object clone()
    {
        return new ASingleMultiplicitySpec(
            cloneNode(this._multiplicityValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASingleMultiplicitySpec(this);
    }

    public PMultiplicityValue getMultiplicityValue()
    {
        return this._multiplicityValue_;
    }

    public void setMultiplicityValue(PMultiplicityValue node)
    {
        if(this._multiplicityValue_ != null)
        {
            this._multiplicityValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multiplicityValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._multiplicityValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multiplicityValue_ == child)
        {
            this._multiplicityValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._multiplicityValue_ == oldChild)
        {
            setMultiplicityValue((PMultiplicityValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
