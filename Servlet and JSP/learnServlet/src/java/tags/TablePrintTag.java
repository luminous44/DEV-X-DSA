package tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class TablePrintTag extends TagSupport {

    public int number;
    public String color;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int doStartTag() throws JspException {

        try {
            JspWriter out = pageContext.getOut();

            out.println("<div style = 'color:" + color + "'>");

            for (int i = 1; i < 10; i++) {

                out.print(i * number + "</br>");
            }
            out.println("</div>");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return SKIP_BODY;

    }

}
