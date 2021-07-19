public class Inversion {

    double diferenciaInversion = 0.0;
    double pCapitalTiempo = 0.0;
    double interesSimple = 0.0;
    double interesCompuesto = 0.0;
    double cTasaI = 0.0;
    
    public String compararInversion (int pTiempo, double pCapital, double pTasaInteres){
        cTasaI = pTasaInteres/100;
        interesSimple = pCapital * cTasaI * pTiempo;
        pCapitalTiempo = Math.pow((1 + cTasaI), pTiempo);
        interesCompuesto = pCapital * (pCapitalTiempo - 1);
        diferenciaInversion = interesCompuesto - interesSimple;
        return("La diferencia en dinero entre los intereses ganados con la inversión A " + 
                            "y la inversión B es de $" + Math.round(diferenciaInversion));
    }
}

