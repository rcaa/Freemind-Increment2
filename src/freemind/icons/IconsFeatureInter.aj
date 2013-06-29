package freemind.icons;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

import freemind.controller.actions.generated.instance.ObjectFactory;
import freemind.modes.MindMapNode;

public privileged aspect IconsFeatureInter {

	interface IconsInterface {
	}

	declare parents : MindMapNode extends IconsInterface;

	private Vector<MindIcon> IconsInterface.icons = null;

	public List IconsInterface.getIcons() {
		if (icons == null) {
			return Collections.EMPTY_LIST;
		}
		return icons;
	}

	public void IconsInterface.addIcon(MindIcon _icon) {
		createIcons();
		icons.add(_icon);
	}

	public int IconsInterface.removeLastIcon() {
		createIcons();
		if (icons.size() > 0) {
			icons.setSize(icons.size() - 1);
		}
		int returnSize = icons.size();
		if (returnSize == 0) {
			icons = null;
		}
		return returnSize;
	}

	private void IconsInterface.createIcons() {
		if (icons == null) {
			icons = new Vector();
		}
	}

	public freemind.controller.actions.generated.instance.AddIconActionType ObjectFactory.createAddIconActionType()
			throws javax.xml.bind.JAXBException {
		return new freemind.icons.AddIconActionTypeImpl();
	}

	public freemind.controller.actions.generated.instance.AddIconAction ObjectFactory.createAddIconAction()
			throws javax.xml.bind.JAXBException {
		return new freemind.icons.AddIconActionImpl();
	}

	public freemind.controller.actions.generated.instance.RemoveLastIconXmlAction ObjectFactory.createRemoveLastIconXmlAction()
			throws javax.xml.bind.JAXBException {
		return new freemind.icons.RemoveLastIconXmlActionImpl();
	}

	public freemind.controller.actions.generated.instance.RemoveLastIconXmlActionType ObjectFactory.createRemoveLastIconXmlActionType()
			throws javax.xml.bind.JAXBException {
		return new freemind.icons.RemoveLastIconXmlActionTypeImpl();
	}

	public freemind.controller.actions.generated.instance.RemoveAllIconsXmlActionType ObjectFactory.createRemoveAllIconsXmlActionType()
			throws javax.xml.bind.JAXBException {
		return new freemind.icons.RemoveAllIconsXmlActionTypeImpl();
	}

	public freemind.controller.actions.generated.instance.RemoveAllIconsXmlAction ObjectFactory.createRemoveAllIconsXmlAction()
			throws javax.xml.bind.JAXBException {
		return new freemind.icons.RemoveAllIconsXmlActionImpl();
	}
}