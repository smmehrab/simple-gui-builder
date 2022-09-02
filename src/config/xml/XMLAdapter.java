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
This is an adapter class for XML conig files.

*/

package config.xml;

import java.io.File;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import config.ConfigManager;
import config.component.Component;

public class XMLAdapter extends ConfigManager {

    private XML xml = new XML();
    private NodeList nodes;
    private int nodeIndex = 0;

    public XMLAdapter(String[] configInfo) {
        super(configInfo);
        super.configFile = new File(configFilePath);
        nodes = xml.parse(super.configFile);
    }

    @Override
    public boolean hasNextItem() {
        return !(nodeIndex==nodes.getLength());
    }

    @Override
    public Component nextItem() {
        Node node = nodes.item(nodeIndex);
        nodeIndex++;
        return xml.getComponent(node);
    }

    @Override
    public void closeFile() {

    }
}
