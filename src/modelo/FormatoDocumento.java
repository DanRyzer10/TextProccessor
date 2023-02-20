package modelo;
import javax.swing.text.*;
import java.awt.*;

public class FormatoDocumento {


    public final DefaultStyledDocument doc;

    public FormatoDocumento(){
        this.doc = new DefaultStyledDocument();
        //hacer un formato al estilo word
        StyleContext sc = new StyleContext();
        Style defaultStyle = sc.getStyle(StyleContext.DEFAULT_STYLE);
        StyleConstants.setFontFamily(defaultStyle, "Arial");
        StyleConstants.setFontSize(defaultStyle, 12);
        StyleConstants.setForeground(defaultStyle, Color.BLACK);
        StyleConstants.setBold(defaultStyle, false);
        StyleConstants.setItalic(defaultStyle, false);
        //aplicar margenes de 2,54 cm
        StyleConstants.setLeftIndent(defaultStyle, 2.54f);
        StyleConstants.setRightIndent(defaultStyle, 2.54f);
        StyleConstants.setSpaceAbove(defaultStyle, 2.54f);
        StyleConstants.setSpaceBelow(defaultStyle, 2.54f);
        StyleConstants.setLineSpacing(defaultStyle, 2.54f);
        //aplicar formato
        doc.setLogicalStyle(0, defaultStyle);

    }
}
