package freemind.clouds;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Vector;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import freemind.main.FreeMind;
import freemind.main.Tools;
import freemind.main.XMLElement;
import freemind.modes.ControllerAdapter;
import freemind.modes.NodeAdapter;
import freemind.modes.XMLElementAdapter;
import freemind.preferences.layout.OptionPanel;
import freemind.preferences.layout.OptionPanel.ColorProperty;
import freemind.preferences.layout.OptionPanel.KeyProperty;
import freemind.view.mindmapview.MapView;
import freemind.view.mindmapview.NodeView;

@Aspect
public class CloudFeature {

	@Pointcut("execution(boolean freemind.modes.XMLElementAdapter.instanceofCloudAdapter(..)) && args(child)")
	public void instanceofCloudAdapter(XMLElement child) {}
	
	@Around("instanceofCloudAdapter(child)")
	public boolean around1(XMLElement child) {
		return child.getUserObject() instanceof CloudAdapter;
	}
	
	@Pointcut("execution(int freemind.view.mindmapview.MindMapLayout.getAdditionalCloudHeight(..)) && args(node)")
	public void getAdditionalCloudHeight(NodeView node) {}
	
	@Around("getAdditionalCloudHeight(node)")
	public int around2(NodeView node) {
		return node.getAdditionalCloudHeigth();
	}
	
	@Pointcut("execution(* freemind.modes.ControllerAdapter.inicializarCloudAction(..)) && this(cthis)")
	public void inicializarCloudAction(ControllerAdapter cthis) {}
	
	@Before("inicializarCloudAction(cthis)")
	public void before1(ControllerAdapter cthis) {
		cthis.cloud = new CloudAction(cthis);
		cthis.cloudColor = new CloudColorAction(cthis);
	}
	
	@Pointcut("execution(* freemind.modes.ControllerAdapter.enableCloud(..)) && this(cthis) && args(enabled)")
	public void enableCloud(ControllerAdapter cthis, boolean enabled) {}
	
	@Before("enableCloud(cthis, enabled)")
	public void before2(ControllerAdapter cthis, boolean enabled) {
		cthis.cloudColor.setEnabled(enabled);
	}
	
	@Pointcut("execution(* freemind.modes.XMLElementAdapter.createCloudAdapterHook(..)) && this(cthis)")
	public void createCloudAdapter(XMLElementAdapter cthis) {}
	
	@Before("createCloudAdapter(cthis)")
	public void before3(XMLElementAdapter cthis) {
		cthis.userObject = cthis.createCloudAdapter(null, cthis.frame);
	}
	
	@Pointcut("execution(* freemind.modes.XMLElementAdapter.getCloudHook(..)) && this(cthis) && args(child, node)")
	public void getCloudHook(XMLElementAdapter cthis, XMLElement child, NodeAdapter node) {}
	
	@Before("getCloudHook(cthis, child, node)")
	public void before4(XMLElementAdapter cthis, XMLElement child, NodeAdapter node) {
		CloudAdapter cloud = (CloudAdapter) child.getUserObject();
		cloud.setTarget(node);
		node.setCloud(cloud);
	}
	
	@Pointcut("execution(* freemind.modes.XMLElementAdapter.setCloudPropertiesHook(..)) && this(cthis) && args(name, sValue)")
	public void setCloudPropertiesHook(XMLElementAdapter cthis, String name,String sValue) {}
	
	@Before("setCloudPropertiesHook(cthis, name, sValue)")
	public void before5(XMLElementAdapter cthis, String name, String sValue) {
		if (cthis.userObject instanceof CloudAdapter) {
			CloudAdapter cloud = (CloudAdapter) cthis.userObject;
			if (name.equals("STYLE")) {
				cloud.setStyle(sValue);
			} else if (name.equals("COLOR")) {
				cloud.setColor(Tools.xmlToColor(sValue));
			} else if (name.equals("WIDTH")) {
				cloud.setWidth(Integer.parseInt(sValue));
			}
			return;
		}
	}
	
	@Pointcut("execution(* freemind.modes.NodeAdapter.saveCloudHook(..)) && args(node) && this(cthis)")
	public void saveCloudHook(NodeAdapter cthis, XMLElement node) {}
	
	@Before("saveCloudHook(cthis, node)")
	public void before6(NodeAdapter cthis, XMLElement node) {
		if (cthis.getCloud() != null) {
			XMLElement cloud = (cthis.getCloud()).save();
			node.addChild(cloud);
		}
	}
	
	@Pointcut("execution(* freemind.view.mindmapview.MapView.paintChildren(..)) && args(graphics) && this(cthis)")
	public void paintChildren(Graphics graphics, MapView cthis) {}
	
	@Before("paintChildren(graphics, cthis)")
	public void before7(Graphics graphics, MapView cthis) {
		cthis.paintClouds(cthis.rootView, graphics);
	}
	
	@Pointcut("execution(* freemind.view.mindmapview.MapView.addHeightOfTheCloud(..)) && args(source, innerBounds)")
	public void addHeightOfTheCloud(NodeView source, Rectangle innerBounds) {}
	
	@Before("addHeightOfTheCloud(source, innerBounds)")
	public void before8(NodeView source, Rectangle innerBounds) {
		int additionalCloudHeigth = (source.getAdditionalCloudHeigth() + 1) / 2;
		if (additionalCloudHeigth != 0) {
			innerBounds.grow(additionalCloudHeigth, additionalCloudHeigth);
		}
	}
	
	@Pointcut("execution(* freemind.view.mindmapview.NodeView.coordinatesCloudHook(..)) && this(cthis) && args(additionalDistanceForConvexHull, byChildren)")
	public void coordinatesCloudHook(NodeView cthis, int additionalDistanceForConvexHull, boolean byChildren) {}
	
	@Before("coordinatesCloudHook(cthis, additionalDistanceForConvexHull, byChildren)")
	public void before9(NodeView cthis, int additionalDistanceForConvexHull, boolean byChildren) {
		MindMapCloud cloud = cthis.getModel().getCloud();

		// consider existing clouds of children
		if (byChildren && cloud != null) {
			additionalDistanceForConvexHull += CloudView.getAdditionalHeigth(
					cloud, cthis) / 2;
		}
	}
	
	@Pointcut("execution(* freemind.preferences.layout.OptionPanel.cloudPanelHook(..)) && this(cthis) && args(controls)")
	public void cloudPanelHook(OptionPanel cthis, Vector controls)  {}
	
	@Before("cloudPanelHook(cthis, controls)")
	public void before10(OptionPanel cthis, Vector controls) {
		controls.add(new KeyProperty(cthis.frame, null,
				"keystroke_node_toggle_cloud"));
	}
	
	@Pointcut("execution(* freemind.preferences.layout.OptionPanel.colorPropertyHook(..)) && this(cthis) && args(controls)")
	public void colorPropertyHook(OptionPanel cthis, Vector controls) {}
	
	@Before("colorPropertyHook(cthis, controls)")
	public void before11(OptionPanel cthis, Vector controls) {
		controls.add(new ColorProperty("standardcloudcolor.tooltip",
				FreeMind.RESOURCES_CLOUD_COLOR, "#f0f0f0")); // #f0f0f0
	}
	
}
