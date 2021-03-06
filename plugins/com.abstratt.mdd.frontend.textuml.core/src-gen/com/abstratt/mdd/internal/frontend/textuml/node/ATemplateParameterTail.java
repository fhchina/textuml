/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ATemplateParameterTail extends PTemplateParameterTail
{
    private TComma _comma_;
    private PTemplateParameter _templateParameter_;

    public ATemplateParameterTail()
    {
        // Constructor
    }

    public ATemplateParameterTail(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PTemplateParameter _templateParameter_)
    {
        // Constructor
        setComma(_comma_);

        setTemplateParameter(_templateParameter_);

    }

    @Override
    public Object clone()
    {
        return new ATemplateParameterTail(
            cloneNode(this._comma_),
            cloneNode(this._templateParameter_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATemplateParameterTail(this);
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

    public PTemplateParameter getTemplateParameter()
    {
        return this._templateParameter_;
    }

    public void setTemplateParameter(PTemplateParameter node)
    {
        if(this._templateParameter_ != null)
        {
            this._templateParameter_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._templateParameter_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._templateParameter_);
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

        if(this._templateParameter_ == child)
        {
            this._templateParameter_ = null;
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

        if(this._templateParameter_ == oldChild)
        {
            setTemplateParameter((PTemplateParameter) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
