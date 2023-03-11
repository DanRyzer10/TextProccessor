package modelo;
import javax.swing.text.AbstractDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.ViewFactory;
import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.*;
/*
    * Editor de texto que permite que el texto se ajuste al tamaño del panel
    * @extends StyledEditorKit
    * @see javax.swing.text.StyledEditorKit
    * creado el 25 de febrero, 2023, 17:47 hrs
    * @autor Angel Zambrano
    * @version POO -2023
 */

public class PanelEditor extends StyledEditorKit {
    ViewFactory defaultFactory = new WrapColumnFactory();
    @Override
    public ViewFactory getViewFactory() {
        return defaultFactory;
    }
    /*
        *devuelve la vista del panel
        * @implements ViewFactory
        * @see javax.swing.text.ViewFactory
        * @inheritDoc
        * @return View
        * creado el 25 de febrero, 2023, 17:47 hrs
        * @autor Angel Zambrano
        * @version POO -2023
     */
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
    /*
        *envuelve al texto para que se ajuste al tamaño del panel
        * @see javax.swing.text.View
        * @extends LabelView
        * creado el 25 de febrero, 2023, 17:47 hrs
        * @autor Angel Zambrano
        * @version POO -2023
     */
    static class WrapLabelView extends LabelView {
        public WrapLabelView(Element elem) {
            super(elem);
        }
        public float getMinimumSpan(int axis) {
            return switch (axis) {
                case View.X_AXIS -> 0;
                case View.Y_AXIS -> super.getMinimumSpan(axis);
                default -> throw new IllegalArgumentException("Invalid axis: " + axis);
            };
        }
    }

}
