public class votacion {
    private String nombre;
    private Integer votos;

    public votacion(){

    }
    public votacion(String nombre,Integer votos){
        super();
        this.nombre = nombre;
        this.votos  =votos;
    }

    public String getNombre() {
        return nombre;
    }
    public Integer getVotos() {
        return votos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVotos(Integer votos) {
        this.votos = votos;
    }
}
