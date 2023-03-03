package modelo;

import javax.swing.text.AbstractDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.ViewFactory;
import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.*;

public class PanelEditor extends StyledEditorKit {
    ViewFactory defaultFactory = new WrapColumnFactory();
    @Override
    public ViewFactory getViewFactory() {
        return defaultFactory;
    }
    static class WrapColumnFactory implements ViewFactory{
        public View create(Element elem){
            String kind = elem.getName();
            if(kind != null && kind.equals(AbstractDocument.ContentElementName)){
                return new WrapLabelView(elem);
            } else if (kind !=null && kind.equals(AbstractDocument.ParagraphElementName)) {
                return new ParagraphView(elem);
                
            } else if (kind != null && kind.equals(AbstractDocument.SectionElementName)) {
                return new BoxView(elem, View.Y_AXIS);
            } else if (kind != null && kind.equals(StyleConstants.ComponentElementName)) {
                return new ComponentView(elem);
            }else if (kind != null && kind.equals(StyleConstants.IconElementName)) {
                return new IconView(elem);
            } else {
                return new LabelView(elem);
            }
        }
    }
    static class WrapLabelView extends LabelView {
        public WrapLabelView(Element elem) {
            super(elem);
        }
        public float getMinimumSpan(int axis) {
            switch (axis) {
                case View.X_AXIS:
                    return 0;
                case View.Y_AXIS:
                    return super.getMinimumSpan(axis);
                default:
                    throw new IllegalArgumentException("Invalid axis: " + axis);
            }
        }
    }

}
