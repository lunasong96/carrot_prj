package userVO;

public class ImgVO {
	private int product_idx, img_num;
	private String product_img;
	
	public ImgVO() {
		// TODO Auto-generated constructor stub
	}

	public ImgVO(int product_idx, int img_num, String product_img) {
		super();
		this.product_idx = product_idx;
		this.img_num = img_num;
		this.product_img = product_img;
	}

	public int getProduct_idx() {
		return product_idx;
	}

	public void setProduct_idx(int product_idx) {
		this.product_idx = product_idx;
	}

	public int getImg_num() {
		return img_num;
	}

	public void setImg_num(int img_num) {
		this.img_num = img_num;
	}

	public String getProduct_img() {
		return product_img;
	}

	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}

	@Override
	public String toString() {
		return "ImgVO [product_idx=" + product_idx + ", img_num=" + img_num + ", product_img=" + product_img + "]";
	}
	
}
