package userVO;

import java.sql.Date;

public class ProfilPVO {
	private int  price;
	private String id, product_idx,thumbnail, title, gu, reserv, sold_chk;
	private Date posted_date;
	
	public ProfilPVO() {
	}

	public ProfilPVO(int price, String id, String product_idx, String thumbnail, String title, String gu, String reserv,
			String sold_chk, Date posted_date) {
		this.price = price;
		this.id = id;
		this.product_idx = product_idx;
		this.thumbnail = thumbnail;
		this.title = title;
		this.gu = gu;
		this.reserv = reserv;
		this.sold_chk = sold_chk;
		this.posted_date = posted_date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct_idx() {
		return product_idx;
	}

	public void setProduct_idx(String product_idx) {
		this.product_idx = product_idx;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGu() {
		return gu;
	}

	public void setGu(String gu) {
		this.gu = gu;
	}

	public String getReserv() {
		return reserv;
	}

	public void setReserv(String reserv) {
		this.reserv = reserv;
	}

	public String getSold_chk() {
		return sold_chk;
	}

	public void setSold_chk(String sold_chk) {
		this.sold_chk = sold_chk;
	}

	public Date getPosted_date() {
		return posted_date;
	}

	public void setPosted_date(Date posted_date) {
		this.posted_date = posted_date;
	}

	@Override
	public String toString() {
		return "ProfilPVO [price=" + price + ", id=" + id + ", product_idx=" + product_idx + ", thumbnail=" + thumbnail
				+ ", title=" + title + ", gu=" + gu + ", reserv=" + reserv + ", sold_chk=" + sold_chk + ", posted_date="
				+ posted_date + "]";
	}

	
	
}
