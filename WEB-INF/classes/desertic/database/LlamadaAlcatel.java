package desertic.database;

import java.io.Serializable;

import com.espaitic.util.XMLUtils;

public class LlamadaAlcatel implements LlamadaGenerica, Serializable {
	
	private static final long serialVersionUID = -2460690250979304404L;
	
	public LlamadaAlcatel() {
		super();
	}
	
	public LlamadaAlcatel(String idCallRef, String numeroQueTruca,
			String numeroAlQueTruca,Long idPersonaTrucada, String nomPersonaTrucada, String estat, String horaInici,
			String horaIniciConversa, String horaFi) {
		super();
		this.idCallRef = idCallRef;
		this.numeroQueTruca = numeroQueTruca;
		this.numeroAlQueTruca = numeroAlQueTruca;
		this.idPersonaTrucada= idPersonaTrucada; 
		this.nomPersonaTrucada = nomPersonaTrucada;
		this.estat = estat;
		this.horaInici = horaInici;
		this.horaIniciConversa = horaIniciConversa;
		this.horaFi = horaFi;
	}
	private String idCallRef=null;
	private String numeroQueTruca=null;
	private String numeroAlQueTruca=null;
	private Long idPersonaTrucada=null;
	private String nomPersonaTrucada=null;
	private String estat=null;
	private String horaInici=null;
	private String horaIniciConversa=null;
	private String horaFi=null;
	public String getIdCallRef() {
		return idCallRef;
	}
	public void setIdCallRef(String idCallRef) {
		this.idCallRef = idCallRef;
	}
	public String getNumeroQueTruca() {
		return numeroQueTruca;
	}
	public void setNumeroQueTruca(String numeroQueTruca) {
		this.numeroQueTruca = numeroQueTruca;
	}
	public String getNumeroAlQueTruca() {
		return numeroAlQueTruca;
	}
	public void setIdPersonaTrucada(Long idPersonaTrucada) {
		this.idPersonaTrucada = idPersonaTrucada;
	}
	public Long getIdPersonaTrucada() {
		return idPersonaTrucada;
	}
	public void setNomPersonaTrucada(String nomPersonaTrucada) {
		this.nomPersonaTrucada = nomPersonaTrucada;
	}
	public String getNomPersonaTrucada() {
		return nomPersonaTrucada;
	}
	public void setNumeroAlQueTruca(String numeroAlQueTruca) {
		this.numeroAlQueTruca = numeroAlQueTruca;
	}
	public String getEstat() {
		return estat;
	}
	public void setEstat(String estat) {
		this.estat = estat;
	}
	public String getHoraInici() {
		return horaInici;
	}
	public void setHoraInici(String horaInici) {
		this.horaInici = horaInici;
	}
	public String getHoraIniciConversa() {
		return horaIniciConversa;
	}
	public void setHoraIniciConversa(String horaIniciConversa) {
		this.horaIniciConversa = horaIniciConversa;
	}
	public String getHoraFi() {
		return horaFi;
	}
	public void setHoraFi(String horaFi) {
		this.horaFi = horaFi;
	}
	
	public String toXML(){
		return XMLUtils.marshalFromFile(this);
	}
	
	public static LlamadaAlcatel toObject(String xml){
		return XMLUtils.unmarshallLlamadaAlcatel(xml);
	}

	public String toString() {
		return "LlamadaAlcatel [estat=" + estat + ", horaFi=" + horaFi
				+ ", horaInici=" + horaInici + ", horaIniciConversa="
				+ horaIniciConversa + ", idCallRef=" + idCallRef
				+ ", idPersonaTrucada=" + idPersonaTrucada
				+ ", nomPersonaTrucada=" + nomPersonaTrucada
				+ ", numeroAlQueTruca=" + numeroAlQueTruca
				+ ", numeroQueTruca=" + numeroQueTruca + "]";
	}

}