/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionDecl extends PFunctionDecl
{
    private TFunction _function_;
    private TIdentifier _identifier_;
    private PSimpleSignature _simpleSignature_;
    private TSemicolon _semicolon_;

    public AFunctionDecl()
    {
        // Constructor
    }

    public AFunctionDecl(
        @SuppressWarnings("hiding") TFunction _function_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") PSimpleSignature _simpleSignature_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setFunction(_function_);

        setIdentifier(_identifier_);

        setSimpleSignature(_simpleSignature_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionDecl(
            cloneNode(this._function_),
            cloneNode(this._identifier_),
            cloneNode(this._simpleSignature_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionDecl(this);
    }

    public TFunction getFunction()
    {
        return this._function_;
    }

    public void setFunction(TFunction node)
    {
        if(this._function_ != null)
        {
            this._function_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._function_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public PSimpleSignature getSimpleSignature()
    {
        return this._simpleSignature_;
    }

    public void setSimpleSignature(PSimpleSignature node)
    {
        if(this._simpleSignature_ != null)
        {
            this._simpleSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpleSignature_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._function_)
            + toString(this._identifier_)
            + toString(this._simpleSignature_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._function_ == child)
        {
            this._function_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._simpleSignature_ == child)
        {
            this._simpleSignature_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._function_ == oldChild)
        {
            setFunction((TFunction) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._simpleSignature_ == oldChild)
        {
            setSimpleSignature((PSimpleSignature) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
