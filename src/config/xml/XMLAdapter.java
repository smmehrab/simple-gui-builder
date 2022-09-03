/*
-----------------------------------------------------
# fullname      :   s.m.mehrabul islam
# roll          :   sh-86
# registration  :   2017614964
# session       :   2017-2018
# email         :   smmehrabul-2017614964@cs.du.ac.bd
# department    :   computer science & engineering
# institute     :   university of dhaka, bangladesh
-----------------------------------------------------

** Adapter Design Pattern **

XMLAdapter

From: XMLAdaptee (Service)
To: ConfigReader (ClientInterface)

*/

package config.xml;

import java.io.File;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import config.ConfigReader;
import config.component.Component;

public class XMLAdapter extends ConfigReader {

    private XMLAdaptee xmlAdaptee = new XMLAdaptee();
    private NodeList nodes;
    private int nodeIndex = 0;

    public XMLAdapter(String path) {
        super(path);
        super.file = new File(path);
        nodes = xmlAdaptee.parse(super.file);
    }

    @Override
    public boolean hasNextItem() {
        return !(nodeIndex==nodes.getLength());
    }

    @Override
    public Component nextItem() {
        Node node = nodes.item(nodeIndex);
        nodeIndex++;
        return xmlAdaptee.getComponent(node);
    }

    @Override
    public void closeFile() {
        super.closeFile();
    }
}
