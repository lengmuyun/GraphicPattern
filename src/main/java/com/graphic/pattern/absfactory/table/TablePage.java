package com.graphic.pattern.absfactory.table;

import com.graphic.pattern.absfactory.framework.Item;
import com.graphic.pattern.absfactory.framework.Page;

public class TablePage extends Page {

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        for (Item item : content) {
            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }
        buffer.append("</table>");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>");
        return buffer.toString();
    }

}
