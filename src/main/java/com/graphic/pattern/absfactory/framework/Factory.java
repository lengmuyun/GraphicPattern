package com.graphic.pattern.absfactory.framework;

public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到" + classname + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public Page createYahooPage() {
        Page page = createPage("Yahoo!", "Yahoo!");
        page.add(createLink("Yahoo!", "http://www.yahoo.com"));
        return page;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);

}
