
/* First created by JCasGen Tue Sep 23 19:10:36 EDT 2014 */
package UIMATypes;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Different types of tokens
 * Updated by JCasGen Wed Sep 24 01:23:52 EDT 2014
 *  */
public class Token_Type extends Annotation_Type {
  /**  
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /**  */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /**  */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /**  
      */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("UIMATypes.Token");
 
  /**  */
  final Feature casFeat_WordForm;
  /**  */
  final int     casFeatCode_WordForm;
  /** 
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWordForm(int addr) {
        if (featOkTst && casFeat_WordForm == null)
      jcas.throwFeatMissing("WordForm", "UIMATypes.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_WordForm);
  }
  /** 
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWordForm(int addr, String v) {
        if (featOkTst && casFeat_WordForm == null)
      jcas.throwFeatMissing("WordForm", "UIMATypes.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_WordForm, v);}
    
  
 
  /**  */
  final Feature casFeat_PartOfSpeech;
  /**  */
  final int     casFeatCode_PartOfSpeech;
  /** 
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPartOfSpeech(int addr) {
        if (featOkTst && casFeat_PartOfSpeech == null)
      jcas.throwFeatMissing("PartOfSpeech", "UIMATypes.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_PartOfSpeech);
  }
  /** 
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPartOfSpeech(int addr, String v) {
        if (featOkTst && casFeat_PartOfSpeech == null)
      jcas.throwFeatMissing("PartOfSpeech", "UIMATypes.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_PartOfSpeech, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * 
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_WordForm = jcas.getRequiredFeatureDE(casType, "WordForm", "uima.cas.String", featOkTst);
    casFeatCode_WordForm  = (null == casFeat_WordForm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_WordForm).getCode();

 
    casFeat_PartOfSpeech = jcas.getRequiredFeatureDE(casType, "PartOfSpeech", "uima.cas.String", featOkTst);
    casFeatCode_PartOfSpeech  = (null == casFeat_PartOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PartOfSpeech).getCode();

  }
}



    