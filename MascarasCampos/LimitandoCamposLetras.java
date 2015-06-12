package MascarasCampos;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitandoCamposLetras extends PlainDocument{
    
    private int quantidadeMax;

    public LimitandoCamposLetras(int maxLean) {
        super();
        if(maxLean <= 0)
            throw new IllegalArgumentException("Especifique a quantidade!");
        quantidadeMax=maxLean;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException{
        
        if(str == null || getLength() == quantidadeMax) return;
        
        int totalquantia=(getLength()+str.length());
        if(totalquantia <= quantidadeMax){
            super.insertString(offset, str.replaceAll("[^A-Z|^a-z|^ |^0-9|^à|^á|^ã]",""), attr);
            return;
        }
       String nova = str.substring(0, getLength()- quantidadeMax);
       super.insertString(offset, nova, attr);
    
    }
    
    
}
