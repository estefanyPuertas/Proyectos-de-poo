
package tiposenumerados;


public enum Catalogo {
    VESTIDOS(false),
    ZAPATOS(false),
    ROPA_DEPORTIVA(true),
    PIJAMAS(true),
    MAQUILLAJE(true),
    PERFUMES(true);
    
    private boolean disponible;
    private Catalogo (boolean disponible){
        this.disponible= disponible;
        
        
    }

    @Override
    public String toString() {
        if (disponible) {
        return "La sección de " + this.name().toLowerCase()+ " esta disponible";
        }else {
           return "La sección de " + this.name().toLowerCase() + " no esta disponible";
        }
    }
    
}
    

