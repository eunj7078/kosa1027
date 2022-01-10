package controller.goods;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import model.DAO.GoodsDAO;

public class GoodsDeleteController {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		GoodsDAO dao = new GoodsDAO();
		String goodImages = dao.getImages(goodsNum);
		//apple-bg.jpg`6.png`6.gif
		String [] fileImages = goodImages.split("`");
		//fileImages ={"/apple-bg.jpg","6.png", "6.gif"}
		if(fileImages.length>=1) { //파일 정보가 있는지 확인하기 위해 배열의 크기가 1이상인지 확인
			String path = "/goods/upload";//파일의 절대 경로
			//파일의 절대 경로 디렉터리를 가져 옴
			String realPath = request.getServletContext().getRealPath(path);
			File file = null;
			
			for(String fileName : fileImages) {
				file = new File(realPath = "/" + fileName);// 경로+파일 이름
				if(file.exists()) file.delete(); //파일이 있다면 삭제
			}
		}
		dao.goodsDelete(goodsNum);
	}
}
