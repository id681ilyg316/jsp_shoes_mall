package com.xiecheng.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChackCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int IMG_WIDTH=140;
	private static final int IMG_HEIGHT=40;
	private static final String TEXT = "1234567890";
	Color[] color={Color.BLACK,Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW};
	public ChackCode() {
		super();
	}

	public void destroy() {
		super.destroy();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		BufferedImage bImg=new BufferedImage(IMG_WIDTH, IMG_HEIGHT, BufferedImage.TYPE_INT_RGB);
		Graphics gp=bImg.getGraphics();
		imgInit(gp);
		drawLine(gp);
		drawOval(gp);
		String chackCode=drawText(gp);
		request.getSession().setAttribute("chackCode", chackCode);
		ImageIO.write(bImg, "jpg", response.getOutputStream());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

	public void init() throws ServletException {

	}
	private void imgInit(Graphics gp) {
		gp.setColor(Color.WHITE);
		gp.fillRect(0, 0, IMG_WIDTH, IMG_HEIGHT);
		//gp.setColor(Color.BLUE);//画边框
		//gp.drawRect(1, 1, IMG_WIDTH-2, IMG_HEIGHT-2);
	}
	private void drawLine(Graphics gp) {
		int nub=new Random().nextInt(5)+5;//取5个随机数
		for(int i=0;i<nub;i++){
			gp.setColor(color[new Random().nextInt(4)]);
			int x1=new Random().nextInt(10);
			int y1=new Random().nextInt(10);
			int x2=new Random().nextInt(10);
			int y2=new Random().nextInt(10);
			gp.drawLine(x1, y1, x2, y2);
		}
	}
	private void drawOval(Graphics gp) {
		int nub=new Random().nextInt(10)+10;
		for(int i=0;i<nub;i++){
			gp.setColor(color[new Random().nextInt(4)]);
			int x1=new Random().nextInt(10);
			int y1=new Random().nextInt(10);
			int width=new Random().nextInt(5);
			int height=new Random().nextInt(5);
			gp.fillOval(x1, y1, width, height);
		}
	}
	private String drawText(Graphics gp) {
		StringBuffer sb=new StringBuffer();
		String str;
		gp.setFont(new Font("隶书",0,30));
		for(int i=0;i<4;i++){
			gp.setColor(color[new Random().nextInt(4)]);
			int index=new Random().nextInt(10);
			str=TEXT.charAt(index)+"";
			sb.append(str);
			gp.drawString(str, 5+30*i, 30);
		}
		return sb.toString();
	}

}
