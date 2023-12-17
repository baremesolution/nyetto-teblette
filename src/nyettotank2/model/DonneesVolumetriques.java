package nyettotank2.model;

import nyettotank2.enums.FormeCapacite;
import nyettotank2.enums.OrientationCapacite;
import nyettotank2.enums.UniteLongueur;
import nyettotank2.enums.UniteVolume;

public class DonneesVolumetriques {

    private FormeCapacite formeCapacite;
    private OrientationCapacite orientation;
    private UniteVolume uniteDesVolumes;
    private UniteLongueur uniteDesLongueurs;
    private Float volumeResiduel;
    private Float diametre;
    private String methode;

    public DonneesVolumetriques() {
    }

    public DonneesVolumetriques(FormeCapacite formeCapacite, OrientationCapacite orientation, UniteVolume uniteDesVolumes, UniteLongueur uniteDesLongueurs, Float volumeResiduel, Float diametre, String methode) {
        this.formeCapacite = formeCapacite;
        this.orientation = orientation;
        this.uniteDesVolumes = uniteDesVolumes;
        this.uniteDesLongueurs = uniteDesLongueurs;
        this.volumeResiduel = volumeResiduel;
        this.diametre = diametre;
    }

    public FormeCapacite getFormeCapacite() {
        return formeCapacite;
    }

    public void setFormeCapacite(FormeCapacite formeCapacite) {
        this.formeCapacite = formeCapacite;
    }

    public OrientationCapacite getOrientation() {
        return orientation;
    }

    public void setOrientation(OrientationCapacite orientation) {
        this.orientation = orientation;
    }

    public UniteVolume getUniteDesVolumes() {
        return uniteDesVolumes;
    }

    public void setUniteDesVolumes(UniteVolume uniteDesVolumes) {
        this.uniteDesVolumes = uniteDesVolumes;
    }

    public UniteLongueur getUniteDesLongueurs() {
        return uniteDesLongueurs;
    }

    public void setUniteDesLongueurs(UniteLongueur uniteDesLongueurs) {
        this.uniteDesLongueurs = uniteDesLongueurs;
    }

    public Float getVolumeResiduel() {
        return volumeResiduel;
    }

    public void setVolumeResiduel(Float volumeResiduel) {
        this.volumeResiduel = volumeResiduel;
    }

    public Float getDiametre() {
        return diametre;
    }

    public void setDiametre(Float diametre) {
        this.diametre = diametre;
    }

    public String getMethode() {
        return methode;
    }

    public void setMethode(String methode) {
        this.methode = methode;
    }

}
