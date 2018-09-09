
package knowyourtown.business.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import knowyourtown.localdb.webservice.Suggestion;


/**
 * <p>Classe Java per updateSuggestion complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updateSuggestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suggestion" type="{http://webservice.localdb.knowyourtown/}suggestion" minOccurs="0" form="qualified"/>
 *         &lt;element name="oldTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSuggestion", propOrder = {
    "personId",
    "suggestion",
    "oldTitle"
})
public class UpdateSuggestion {

    protected int personId;
    @XmlElement(namespace = "http://webservice.business.knowyourtown/")
    protected Suggestion suggestion;
    protected String oldTitle;

    /**
     * Recupera il valore della proprietà personId.
     * 
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Imposta il valore della proprietà personId.
     * 
     */
    public void setPersonId(int value) {
        this.personId = value;
    }

    /**
     * Recupera il valore della proprietà suggestion.
     * 
     * @return
     *     possible object is
     *     {@link Suggestion }
     *     
     */
    public Suggestion getSuggestion() {
        return suggestion;
    }

    /**
     * Imposta il valore della proprietà suggestion.
     * 
     * @param value
     *     allowed object is
     *     {@link Suggestion }
     *     
     */
    public void setSuggestion(Suggestion value) {
        this.suggestion = value;
    }

    /**
     * Recupera il valore della proprietà oldTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldTitle() {
        return oldTitle;
    }

    /**
     * Imposta il valore della proprietà oldTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldTitle(String value) {
        this.oldTitle = value;
    }

}
