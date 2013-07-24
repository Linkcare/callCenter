package desertic.database;

public interface LlamadaGenerica {
	
	public String getIdCallRef();
	public void setIdCallRef(String idCallRef);
	public String getNumeroQueTruca();
	public void setNumeroQueTruca(String numeroQueTruca);
	public String getNumeroAlQueTruca();
	public void setNumeroAlQueTruca(String numeroAlQueTruca);
	public Long getIdPersonaTrucada();
	public void setIdPersonaTrucada(Long idPersonaTrucada);
	public String getNomPersonaTrucada();
	public void setNomPersonaTrucada(String nomPersonaTrucada);
	public String getEstat();
	public void setEstat(String estat);
	public String getHoraInici();
	public void setHoraInici(String horaInici);
	public String getHoraIniciConversa();
	public void setHoraIniciConversa(String horaIniciConversa);
	public String getHoraFi();
	public void setHoraFi(String horaFi);

}