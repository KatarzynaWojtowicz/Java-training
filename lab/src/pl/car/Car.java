package pl.car;

import java.time.LocalDate;

public class Car {
	private String marka;
	private String numerRejestracyjny;
	private Kolor kolor;
	private int liczbaMiejsc;
	private int przebieg;
	private LocalDate dataPrzegladu;
	private boolean czyWypozyczony;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getNumerRejestracyjny() {
		return numerRejestracyjny;
	}

	public void setNumerRejestracyjny(String numerRejestracyjny) {
		this.numerRejestracyjny = numerRejestracyjny;
	}

	public Kolor getKolor() {
		return kolor;
	}

	public void setKolor(Kolor kolor) {
		this.kolor = kolor;
	}

	public int getLiczbaMiejsc() {
		return liczbaMiejsc;
	}

	public void setLiczbaMiejsc(int liczbaMiejsc) {
		this.liczbaMiejsc = liczbaMiejsc;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}

	public LocalDate getDataPrzegladu() {
		return dataPrzegladu;
	}

	public void setDataPrzegladu(LocalDate dataPrzegladu) {
		this.dataPrzegladu = dataPrzegladu;
	}

	@Override
	public String toString() {
		return "Samochód [marka=" + marka + ", numerRejestracyjny=" + numerRejestracyjny + ", kolor=" + kolor
				+ ", liczbaMiejsc=" + liczbaMiejsc + ", przebieg=" + przebieg + ", dataPrzegladu=" + dataPrzegladu
				+ "]";
	}

	public boolean needTechnicalReview() {
		LocalDate today = LocalDate.now();
		LocalDate nextTechnicalReview = this.dataPrzegladu.plusYears(1);
		return nextTechnicalReview.isBefore(today);

	}

	public boolean isCzyWypozyczony() {
		return czyWypozyczony;
	}

	public void setCzyWypozyczony(boolean czyWypozyczony) {
		this.czyWypozyczony = czyWypozyczony;
	}

}
