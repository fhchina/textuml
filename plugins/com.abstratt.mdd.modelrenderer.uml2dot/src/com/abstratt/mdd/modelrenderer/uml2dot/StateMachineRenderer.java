package com.abstratt.mdd.modelrenderer.uml2dot;

import static com.abstratt.mdd.modelrenderer.uml2dot.UML2DOTPreferences.SHOW_STATEMACHINES;

import org.eclipse.uml2.uml.StateMachine;

import com.abstratt.modelrenderer.IRenderingSession;
import com.abstratt.modelrenderer.IndentedPrintWriter;
import com.abstratt.modelrenderer.RenderingUtils;

public class StateMachineRenderer implements IElementRenderer<StateMachine> {
    @Override
    public boolean renderObject(StateMachine element, IndentedPrintWriter out, IRenderingSession session) {
        boolean shouldRender = session.getSettings().getBoolean(SHOW_STATEMACHINES);
        if (!shouldRender)
            return false;
        out.println("compound = true;");
        out.println("subgraph \"cluster_"+ element.getName() + "\" {");
        out.println("label = \""+ element.getQualifiedName() + "\";");
        out.enterLevel();
        RenderingUtils.renderAll(session, element.getRegions());
        out.exitLevel();
        out.println("}");
        return true; 
    }
}