/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ARepeatStatement extends PRepeatStatement
{
    private TRepeat _repeat_;
    private PRepeatLoopBody _repeatLoopBody_;
    private TUntil _until_;
    private PLoopTest _loopTest_;

    public ARepeatStatement()
    {
        // Constructor
    }

    public ARepeatStatement(
        @SuppressWarnings("hiding") TRepeat _repeat_,
        @SuppressWarnings("hiding") PRepeatLoopBody _repeatLoopBody_,
        @SuppressWarnings("hiding") TUntil _until_,
        @SuppressWarnings("hiding") PLoopTest _loopTest_)
    {
        // Constructor
        setRepeat(_repeat_);

        setRepeatLoopBody(_repeatLoopBody_);

        setUntil(_until_);

        setLoopTest(_loopTest_);

    }

    @Override
    public Object clone()
    {
        return new ARepeatStatement(
            cloneNode(this._repeat_),
            cloneNode(this._repeatLoopBody_),
            cloneNode(this._until_),
            cloneNode(this._loopTest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARepeatStatement(this);
    }

    public TRepeat getRepeat()
    {
        return this._repeat_;
    }

    public void setRepeat(TRepeat node)
    {
        if(this._repeat_ != null)
        {
            this._repeat_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._repeat_ = node;
    }

    public PRepeatLoopBody getRepeatLoopBody()
    {
        return this._repeatLoopBody_;
    }

    public void setRepeatLoopBody(PRepeatLoopBody node)
    {
        if(this._repeatLoopBody_ != null)
        {
            this._repeatLoopBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._repeatLoopBody_ = node;
    }

    public TUntil getUntil()
    {
        return this._until_;
    }

    public void setUntil(TUntil node)
    {
        if(this._until_ != null)
        {
            this._until_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._until_ = node;
    }

    public PLoopTest getLoopTest()
    {
        return this._loopTest_;
    }

    public void setLoopTest(PLoopTest node)
    {
        if(this._loopTest_ != null)
        {
            this._loopTest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._loopTest_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._repeat_)
            + toString(this._repeatLoopBody_)
            + toString(this._until_)
            + toString(this._loopTest_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._repeat_ == child)
        {
            this._repeat_ = null;
            return;
        }

        if(this._repeatLoopBody_ == child)
        {
            this._repeatLoopBody_ = null;
            return;
        }

        if(this._until_ == child)
        {
            this._until_ = null;
            return;
        }

        if(this._loopTest_ == child)
        {
            this._loopTest_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._repeat_ == oldChild)
        {
            setRepeat((TRepeat) newChild);
            return;
        }

        if(this._repeatLoopBody_ == oldChild)
        {
            setRepeatLoopBody((PRepeatLoopBody) newChild);
            return;
        }

        if(this._until_ == oldChild)
        {
            setUntil((TUntil) newChild);
            return;
        }

        if(this._loopTest_ == oldChild)
        {
            setLoopTest((PLoopTest) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
