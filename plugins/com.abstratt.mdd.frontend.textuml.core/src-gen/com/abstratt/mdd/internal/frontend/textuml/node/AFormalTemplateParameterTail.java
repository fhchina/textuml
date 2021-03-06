/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AFormalTemplateParameterTail extends PFormalTemplateParameterTail
{
    private TComma _comma_;
    private PFormalTemplateParameter _formalTemplateParameter_;

    public AFormalTemplateParameterTail()
    {
        // Constructor
    }

    public AFormalTemplateParameterTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PFormalTemplateParameter _formalTemplateParameter_)
    {
        // Constructor
        setComma(_comma_);

        setFormalTemplateParameter(_formalTemplateParameter_);

    }

    @Override
    public Object clone()
    {
        return new AFormalTemplateParameterTail(
            cloneNode(this._comma_),
            cloneNode(this._formalTemplateParameter_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFormalTemplateParameterTail(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PFormalTemplateParameter getFormalTemplateParameter()
    {
        return this._formalTemplateParameter_;
    }

    public void setFormalTemplateParameter(PFormalTemplateParameter node)
    {
        if(this._formalTemplateParameter_ != null)
        {
            this._formalTemplateParameter_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._formalTemplateParameter_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._formalTemplateParameter_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._formalTemplateParameter_ == child)
        {
            this._formalTemplateParameter_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._formalTemplateParameter_ == oldChild)
        {
            setFormalTemplateParameter((PFormalTemplateParameter) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
