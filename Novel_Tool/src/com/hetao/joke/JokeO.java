package com.hetao.joke;

public class JokeO {
	private String title;
	private String link;
	private String innerHtml;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getInnerHtml() {
		return innerHtml;
	}
	public void setInnerHtml(String innerHtml) {
		this.innerHtml = innerHtml;
	}
	
	public String toString(){
		String joke ="title:"+ this.title +";link:"+ this.link +";innerHtml:"+this.innerHtml;
		
		return joke;
		
	}

}
