<%@ page import="java.awt.*" %>
<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="java.util.Random" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page contentType="image/jpeg;charset=UTF-8" language="java" %>

<%!
    public Color getColor(){
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
        return new Color(r,g,b);
    }

    public String getNum(){
        int ran = (int)(Math.random() * 10000);
        return String.valueOf(ran);
    }
%>

<%
    //禁止缓存
    response.setHeader("Pragma","no-cache");
    response.setHeader("Cache-Contorl","no-cache");
    response.setHeader("Expires","0");

    //画布
    BufferedImage img = new BufferedImage(80, 30, BufferedImage.TYPE_INT_RGB);
    //画笔
    Graphics graphics = img.getGraphics();
    graphics.fillRect(0,0,80,30);
    //绘制干扰线条
    for(int i = 0;i < 60;i++){
        Random ran = new Random();
        int beginx = ran.nextInt(80);
        int beginy = ran.nextInt(30);

        graphics.setColor(getColor());

        graphics.drawLine(beginx,beginy,beginx + 10,beginy + 10);
    }

    String code = getNum();
    StringBuffer sb = new StringBuffer();
    for(int i = 0;i < code.length();i++){
        sb.append(code.charAt(i) + " ");
    }

    graphics.setColor(Color.black);
    graphics.setFont(new Font("seif",Font.BOLD,20));
    graphics.drawString(sb.toString(),15,25);

    session.setAttribute("code",code);

    ImageIO.write(img,"jpeg",response.getOutputStream());

    out.clear();
    out = pageContext.pushBody();
%>