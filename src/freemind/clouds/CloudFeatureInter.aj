package freemind.clouds;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ListIterator;

import freemind.controller.actions.generated.instance.ObjectFactory;
import freemind.main.FreeMind;
import freemind.main.FreeMindMain;
import freemind.modes.ControllerAdapter;
import freemind.modes.MindMapNode;
import freemind.modes.NodeAdapter;
import freemind.modes.XMLElementAdapter;
import freemind.modes.actions.MindMapActions;
import freemind.modes.browsemode.BrowseXMLElement;
import freemind.modes.mindmapmode.MindMapXMLElement;
import freemind.view.mindmapview.MapView;
import freemind.view.mindmapview.NodeView;

public privileged aspect CloudFeatureInter {

	public abstract CloudAdapter XMLElementAdapter.createCloudAdapter(
			NodeAdapter node, FreeMindMain frame);

	public CloudAdapter MindMapXMLElement.createCloudAdapter(NodeAdapter node,
			FreeMindMain frame) {
		return new MindMapCloudModel(node, frame);
	}

	public CloudAdapter BrowseXMLElement.createCloudAdapter(NodeAdapter node,
			FreeMindMain frame) {
		if (name.equals("cloud")) {
			return new BrowseCloudModel(node, frame);
		}
		return null;
	}

	private void NodeAdapter.changeChildCloudIterativeLevels(int deltaLevel) {
		for (ListIterator e = childrenUnfolded(); e.hasNext();) {
			NodeAdapter childNode = (NodeAdapter) e.next();
			MindMapCloud childCloud = childNode.getCloud();
			if (childCloud != null) {
				childCloud.changeIterativeLevel(deltaLevel);
			}
			childNode.changeChildCloudIterativeLevels(deltaLevel);
		}
	}

	public void NodeAdapter.setCloud(MindMapCloud cloud) {
		// Take care to keep the calculated iterative levels consistent
		if (cloud != null && this.cloud == null) {
			changeChildCloudIterativeLevels(1);
		} else if (cloud == null && this.cloud != null) {
			changeChildCloudIterativeLevels(-1);
		}
		this.cloud = cloud;
	}

	public MindMapCloud NodeAdapter.getCloud() {
		return this.cloud;
	}

	public CloudAction ControllerAdapter.cloud = null;
	public CloudColorAction ControllerAdapter.cloudColor = null;

	declare parents : MindMapActions extends CloudsInterface;

	//
	public interface CloudsInterface {
		void setCloud(MindMapNode node, boolean enable);

		//
		void setCloudColor(MindMapNode node, Color color);
	}

	public void ControllerAdapter.setCloud(MindMapNode node, boolean enable) {
		cloud.setCloud(node, enable);
	}

	public void ControllerAdapter.setCloudColor(MindMapNode node, Color color) {
		cloudColor.setCloudColor(node, color);
	}

	interface CloudMapNodeInterface {
	}

	// alterado de protected pra public
	public MindMapCloud CloudMapNodeInterface.cloud;

	// public List CloudMapNodeInterface.children;

	// public ListIterator CloudMapNodeInterface.childrenUnfolded() {
	// return children != null ? children.listIterator()
	// : Collections.EMPTY_LIST.listIterator();
	// }

	public MindMapCloud CloudMapNodeInterface.getCloud() {
		return cloud;
	}

	public void MindMapNode.setCloud(MindMapCloud cloud) {
		// Take care to keep the calculated iterative levels consistent
		if (cloud != null && this.cloud == null) {
			changeChildCloudIterativeLevels(1);
		} else if (cloud == null && this.cloud != null) {
			changeChildCloudIterativeLevels(-1);
		}
		this.cloud = cloud;
	}

	// o ideal era que esse metodo estivesse declarado apenas no aspecto, nao eh
	// necessario
	// coloca-lo na interface
	private void MindMapNode.changeChildCloudIterativeLevels(int deltaLevel) {
		// objeto criado para chamar método definido em NodeAdapter
		for (ListIterator e = childrenUnfolded(); e.hasNext();) {
			NodeAdapter childNode = (NodeAdapter) e.next();
			MindMapCloud childCloud = getCloud();
			if (childCloud != null) {
				childCloud.changeIterativeLevel(deltaLevel);
			}
			changeChildCloudIterativeLevels(deltaLevel);
		}
	}

	declare parents : MindMapNode extends CloudMapNodeInterface;

	public void MapView.paintClouds(NodeView source, Graphics graphics) {
		for (ListIterator e = source.getChildrenViews().listIterator(); e
				.hasNext();) {
			NodeView target = (NodeView) e.next();
			if (target.getModel().getCloud() != null) {
				CloudView cloud = new CloudView(target.getModel().getCloud(),
						target);
				cloud.paint(graphics);
			}
			paintClouds(target, graphics);
		}
	}

	public int NodeView.getAdditionalCloudHeigth() {
		MindMapCloud cloud = getModel().getCloud();
		if (cloud != null) {
			return CloudView.getAdditionalHeigth(cloud, this);
		} else {
			return 0;
		}
	}

	public AddCloudXmlAction ObjectFactory.createAddCloudXmlAction()
			throws javax.xml.bind.JAXBException {
		return new AddCloudXmlActionImpl();
	}

	public CloudColorXmlAction ObjectFactory.createCloudColorXmlAction()
			throws javax.xml.bind.JAXBException {
		return new CloudColorXmlActionImpl();
	}

	public static final String FreeMind.RESOURCES_CLOUD_COLOR = "standardcloudcolor";

}