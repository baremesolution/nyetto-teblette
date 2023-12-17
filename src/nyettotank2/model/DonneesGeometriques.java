package nyettotank2.model;

import nyettotank2.enums.FormeCapacite;
import nyettotank2.enums.FormeConvexe;
import nyettotank2.enums.OrientationCapacite;
import nyettotank2.enums.UniteLongueur;
import nyettotank2.enums.UniteVolume;

public class DonneesGeometriques {

    private FormeCapacite formeCapacite;
    private OrientationCapacite orientation;
    private UniteVolume uniteDesVolumes;
    private UniteLongueur uniteDesLongueurs;

    private Float positionX;
    private Float positionY;
    private Float positionZ;
    private Float angleInclinaison;

    private Float longueur1;
    private Float longueur2;
    private Float longueur3;

    private Float volumeResiduel;

    private Float petitDiametre;
    private Float grandDiametre;

    private FormeConvexe rightBottomCapRadius;
    private FormeConvexe leftTopCapRadius;

    private Float RightTopCapRadius;
    private Float leftBottomCapRadius;

    private String methode;

    public DonneesGeometriques() {
    }

    public DonneesGeometriques(FormeCapacite formeCapacite, OrientationCapacite orientation, UniteVolume uniteDesVolumes, UniteLongueur uniteDesLongueurs, Float positionX, Float positionY, Float positionZ, Float angleInclinaison, Float longueur1, Float longueur2, Float longueur3, Float volumeResiduel, Float petitDiametre, Float grandDiametre, FormeConvexe rightBottomCapRadius, FormeConvexe leftTopCapRadius, Float RightTopCapRadius, Float leftBottomCapRadius, String methode) {
        this.formeCapacite = formeCapacite;
        this.orientation = orientation;
        this.uniteDesVolumes = uniteDesVolumes;
        this.uniteDesLongueurs = uniteDesLongueurs;
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
        this.angleInclinaison = angleInclinaison;
        this.longueur1 = longueur1;
        this.longueur2 = longueur2;
        this.longueur3 = longueur3;
        this.volumeResiduel = volumeResiduel;
        this.petitDiametre = petitDiametre;
        this.grandDiametre = grandDiametre;
        this.rightBottomCapRadius = rightBottomCapRadius;
        this.leftTopCapRadius = leftTopCapRadius;
        this.RightTopCapRadius = RightTopCapRadius;
        this.leftBottomCapRadius = leftBottomCapRadius;
        this.methode = methode;
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

    public Float getPositionX() {
        return positionX;
    }

    public void setPositionX(Float positionX) {
        this.positionX = positionX;
    }

    public Float getPositionY() {
        return positionY;
    }

    public void setPositionY(Float positionY) {
        this.positionY = positionY;
    }

    public Float getPositionZ() {
        return positionZ;
    }

    public void setPositionZ(Float positionZ) {
        this.positionZ = positionZ;
    }

    public Float getAngleInclinaison() {
        return angleInclinaison;
    }

    public void setAngleInclinaison(Float angleInclinaison) {
        this.angleInclinaison = angleInclinaison;
    }

    public Float getLongueur1() {
        return longueur1;
    }

    public void setLongueur1(Float longueur1) {
        this.longueur1 = longueur1;
    }

    public Float getLongueur2() {
        return longueur2;
    }

    public void setLongueur2(Float longueur2) {
        this.longueur2 = longueur2;
    }

    public Float getLongueur3() {
        return longueur3;
    }

    public void setLongueur3(Float longueur3) {
        this.longueur3 = longueur3;
    }

    public Float getVolumeResiduel() {
        return volumeResiduel;
    }

    public void setVolumeResiduel(Float volumeResiduel) {
        this.volumeResiduel = volumeResiduel;
    }

    public Float getPetitDiametre() {
        return petitDiametre;
    }

    public void setPetitDiametre(Float petitDiametre) {
        this.petitDiametre = petitDiametre;
    }

    public Float getGrandDiametre() {
        return grandDiametre;
    }

    public void setGrandDiametre(Float grandDiametre) {
        this.grandDiametre = grandDiametre;
    }

    public FormeConvexe getRightBottomCapRadius() {
        return rightBottomCapRadius;
    }

    public void setRightBottomCapRadius(FormeConvexe rightBottomCapRadius) {
        this.rightBottomCapRadius = rightBottomCapRadius;
    }

    public FormeConvexe getLeftTopCapRadius() {
        return leftTopCapRadius;
    }

    public void setLeftTopCapRadius(FormeConvexe leftTopCapRadius) {
        this.leftTopCapRadius = leftTopCapRadius;
    }

    public Float getRightTopCapRadius() {
        return RightTopCapRadius;
    }

    public void setRightTopCapRadius(Float RightTopCapRadius) {
        this.RightTopCapRadius = RightTopCapRadius;
    }

    public Float getLeftBottomCapRadius() {
        return leftBottomCapRadius;
    }

    public void setLeftBottomCapRadius(Float leftBottomCapRadius) {
        this.leftBottomCapRadius = leftBottomCapRadius;
    }

    public String getMethode() {
        return methode;
    }

    public void setMethode(String methode) {
        this.methode = methode;
    }

}
