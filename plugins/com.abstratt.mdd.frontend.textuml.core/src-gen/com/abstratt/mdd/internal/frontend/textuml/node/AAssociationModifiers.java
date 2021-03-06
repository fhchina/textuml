/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AAssociationModifiers extends PAssociationModifiers
{
    private PAssociationModifierList _associationModifierList_;

    public AAssociationModifiers()
    {
        // Constructor
    }

    public AAssociationModifiers(
        @SuppressWarnings("hiding") PAssociationModifierList _associationModifierList_)
    {
        // Constructor
        setAssociationModifierList(_associationModifierList_);

    }

    @Override
    public Object clone()
    {
        return new AAssociationModifiers(
            cloneNode(this._associationModifierList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssociationModifiers(this);
    }

    public PAssociationModifierList getAssociationModifierList()
    {
        return this._associationModifierList_;
    }

    public void setAssociationModifierList(PAssociationModifierList node)
    {
        if(this._associationModifierList_ != null)
        {
            this._associationModifierList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._associationModifierList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._associationModifierList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._associationModifierList_ == child)
        {
            this._associationModifierList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._associationModifierList_ == oldChild)
        {
            setAssociationModifierList((PAssociationModifierList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
