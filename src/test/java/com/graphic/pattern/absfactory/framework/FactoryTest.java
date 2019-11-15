package com.graphic.pattern.absfactory.framework;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void testListFactory() {
        testFactory("com.graphic.pattern.absfactory.list.ListFactory");
    }

    @Test
    public void testTableFactory() {
        testFactory("com.graphic.pattern.absfactory.table.TableFactory");
    }

    private void testFactory(String classname) {
        Factory factory = Factory.getFactory(classname);
        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn");

        Link us_yahoo = factory.createLink("YaHoo!", "http://www.yahoo.com");
        Link jp_yahoo = factory.createLink("YaHoo!Japan", "http://www.yahoo.co.jp");
        Link excite = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("YaHoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }

}