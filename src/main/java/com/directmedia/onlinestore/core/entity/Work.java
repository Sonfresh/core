package com.directmedia.onlinestore.core.entity;

public class Work {
	private String title;
	private String genre;
	private int release;
	private String summary;
	Artist mainArtist;
	
	public Work() {
		
	}
	
	public Work(String pTitle) {
		this.title = pTitle;
	}
	
	public Work(String pTitle, int pRelease, Artist pMainArtist) {
		this.title = pTitle;
		this.release = pRelease;
		this.mainArtist = pMainArtist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRelease() {
		return release;
	}

	public void setRelease(int release) {
		this.release = release;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Artist getMainArtist() {
		return mainArtist;
	}

	public void setMainArtist(Artist mainArtist) {
		this.mainArtist = mainArtist;
	}
	
	public String toString() {
		String message = this.getTitle() + "(" + this.getRelease() + ")";
		return message;
	}
}
