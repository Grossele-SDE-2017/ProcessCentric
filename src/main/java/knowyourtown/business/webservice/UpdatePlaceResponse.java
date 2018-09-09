
package knowyourtown.business.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updatePlaceResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updatePlaceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePlaceResponse", propOrder = {
    "placeId"
})
public class UpdatePlaceResponse {

    protected int placeId;

    /**
     * Recupera il valore della proprietà placeId.
     * 
     */
    public int getPlaceId() {
        return placeId;
    }

    /**
     * Imposta il valore della proprietà placeId.
     * 
     */
    public void setPlaceId(int value) {
        this.placeId = value;
    }

}
