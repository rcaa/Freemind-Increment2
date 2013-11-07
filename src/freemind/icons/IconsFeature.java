package freemind.icons;

import java.awt.Color;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import freemind.controller.Controller;
import freemind.controller.MenuBar;
import freemind.controller.StructuredMenuHolder;
import freemind.main.FreeMind;
import freemind.main.FreeMindMain;
import freemind.main.Tools;
import freemind.main.XMLElement;
import freemind.modes.ControllerAdapter;
import freemind.modes.MindMapNode;
import freemind.modes.NodeAdapter;
import freemind.modes.StylePattern;
import freemind.modes.actions.ApplyPatternAction;
import freemind.modes.mindmapmode.EncryptedMindMapNode;
import freemind.modes.mindmapmode.MindMapController;
import freemind.modes.mindmapmode.MindMapNodeModel;
import freemind.modes.mindmapmode.MindMapPopupMenu;
import freemind.modes.mindmapmode.MindMapToolBar;
import freemind.view.mindmapview.EditNodeTextField;
import freemind.view.mindmapview.MultipleImage;
import freemind.view.mindmapview.NodeView;

@Aspect
public class IconsFeature {
	
	private static ImageIcon encryptedIcon;
	private static ImageIcon decryptedIcon;
	public Action toggleLeftToolbar;

	// Esse método não possuía nenhum parâmetro em sua versão original...
	public void updateIcon(EncryptedMindMapNode encrypted) {
		encrypted.setStateIcon("encryptedNode",
				(encrypted.isVisible()) ? decryptedIcon : encryptedIcon);
	}

	public IconAction unknwonIconAction = null;
	public RemoveLastIconAction removeLastIconAction = null;
	public RemoveAllIconsAction removeAllIconsAction = null;
	private MindIcon nodeIcon;
	private boolean appliesToNodeIcon = false;
	public Vector iconActions = new Vector();
	private String iconName;

	public MindIcon getNodeIcon() {
		return nodeIcon;
	}

	public void setNodeIcon(MindIcon nodeIcon) {
		this.nodeIcon = nodeIcon;
	}

	public boolean getAppliesToNodeIcon() {
		return appliesToNodeIcon;
	}

	public void addIconsToMenu(StructuredMenuHolder holder,
			String iconMenuString, MindMapController controller) {
		JMenu iconMenu = holder.addMenu(
				new JMenu(controller.getText("icon_menu")), iconMenuString
						+ "/.");
		holder.addAction(removeLastIconAction, iconMenuString
				+ "/removeLastIcon");
		holder.addAction(removeAllIconsAction, iconMenuString
				+ "/removeAllIcons");
		holder.addSeparator(iconMenuString);
		for (int i = 0; i < iconActions.size(); ++i) {
			JMenuItem item = holder.addAction((Action) iconActions.get(i),
					iconMenuString + "/" + i);
		}
	}

	private void createIconActions(MindMapController controller) {
		Vector iconNames = MindIcon.getAllIconNames();
		for (int i = 0; i < iconNames.size(); ++i) {
			String iconName = ((String) iconNames.get(i));
			MindIcon myIcon = MindIcon.factory(iconName);
			IconAction myAction = new IconAction(controller, myIcon,
					removeLastIconAction);
			iconActions.add(myAction);
		}
	}

	private static Icon blindIcon = new BlindIcon(16);

	public void addIcon(MindMapNode node, MindIcon icon) {
		unknwonIconAction.addIcon(node, icon);
	}

	public void removeAllIcons(MindMapNode node) {
		removeAllIconsAction.removeAllIcons(node);
	}

	public int removeLastIcon(MindMapNode node) {
		return removeLastIconAction.removeLastIcon(node);
	}

	@Pointcut("execution(freemind.modes.mindmapmode.EncryptedMindMapNode.new(Object, freemind.main.FreeMindMain)) && this(encrypted) && args(.., frame)")
	public void encrypted(EncryptedMindMapNode encrypted, FreeMindMain frame) {}
	
	@After("encrypted(encrypted, frame)")
	public void after1(EncryptedMindMapNode encrypted, FreeMindMain frame) {
		if (encryptedIcon == null) {
			encryptedIcon = MindIcon.factory("encrypted").getIcon(frame);
		}
		if (decryptedIcon == null) {
			decryptedIcon = MindIcon.factory("decrypted").getIcon(frame);
		}
		updateIcon(encrypted);
	}
	
	@Pointcut("execution(private void freemind.modes.mindmapmode.EncryptedMindMapNode.setVisible(boolean)) && this(encrypted)")
	public void setVisible(EncryptedMindMapNode encrypted) {}
	
	@After("setVisible(encrypted)")
	public void after2(EncryptedMindMapNode encrypted) {
		updateIcon(encrypted);
	}
	
	@Pointcut("execution(* freemind.modes.ControllerAdapter.iconsActionHook()) && this(cthis)")
	public void iconsActionHook(ControllerAdapter cthis) {}
	
	@Before("iconsActionHook(cthis)")
	public void before1(ControllerAdapter cthis) {
		removeLastIconAction = new RemoveLastIconAction(cthis);
		// this action handles the xml stuff: (undo etc.)
		unknwonIconAction = new IconAction(cthis,
				MindIcon.factory((String) MindIcon.getAllIconNames().get(0)),
				removeLastIconAction);
		removeLastIconAction.setIconAction(unknwonIconAction);
		removeAllIconsAction = new RemoveAllIconsAction(cthis,
				unknwonIconAction);
	}
	
	@Pointcut("execution(private void freemind.modes.mindmapmode.MindMapNodeModel.hookHTMLIcons(java.io.Writer)) && this(model) && args(fileout)")
	public void htmlIcons(MindMapNodeModel model, Writer fileout) {}
	
	@Before("htmlIcons(model, fileout)")
	public void before2(MindMapNodeModel model, Writer fileout) throws IOException {
		if (model.getFrame().getProperty("export_icons_in_html").equals("true")) {
			for (int i = 0; i < model.getIcons().size(); ++i) {
				fileout.write("<img src=\""
						+ ((MindIcon) model.getIcons().get(i))
								.getIconFileName()
						+ "\" alt=\""
						+ ((MindIcon) model.getIcons().get(i))
								.getDescription(model.getFrame()) + "\">");
			}
		}
	}
	
	@Pointcut("execution(freemind.modes.ControllerAdapter.new(..)) && this(adapter)")
	public void controllerAdapter(ControllerAdapter adapter) {}
	
	@After("controllerAdapter(adapter)")
	public void after3(ControllerAdapter adapter) {
		removeLastIconAction = new RemoveLastIconAction(adapter);
		unknwonIconAction = new IconAction(adapter,
				MindIcon.factory((String) MindIcon.getAllIconNames().get(0)),
				removeLastIconAction);
		removeLastIconAction.setIconAction(unknwonIconAction);
		removeAllIconsAction = new RemoveAllIconsAction(adapter,
				unknwonIconAction);

	}
	
	@Pointcut("execution(private void freemind.modes.StylePattern.hookIconStyle(freemind.main.XMLElement)) && args(child)")
	public void applyStyle(XMLElement child) {}
	
	@Before("applyStyle(child)")
	public void before3(XMLElement child) {
		if (child.getStringAttribute("icon") != null) {
			appliesToNodeIcon = true;
			setNodeIcon(child.getStringAttribute("icon").equals("none") ? null
					: MindIcon.factory(child.getStringAttribute("icon")));
		}
	}
	
	@Pointcut("execution(private void freemind.modes.ControllerAdapter.hookCreatePatterns(int, java.util.List, freemind.modes.actions.ApplyPatternAction[])) && args(i, patternsList, patterns) && this(adapter)")
	public void hookPatterns(int i, List patternsList, ApplyPatternAction[] patterns, ControllerAdapter adapter) {}
	
	@Before("hookPatterns(i, patternsList, patterns, adapter) ")
	public void before4(int i, List patternsList, ApplyPatternAction[] patterns,
			ControllerAdapter adapter) {
		// MindIcon patternIcon = ((StylePattern) patternsList.get(i))
		// .getNodeIcon();
		MindIcon patternIcon = getNodeIcon();
		if (patternIcon != null) {
			patterns[i].putValue(Action.SMALL_ICON,
					patternIcon.getIcon(adapter.getFrame()));
		}
	}
	
	@Pointcut("execution(protected void setAllActions(boolean)) && args(enabled)")
	public void setAllActions(boolean enabled) {}
	
	@After("setAllActions(enabled)")
	public void after4(boolean enabled) {
		removeLastIconAction.setEnabled(enabled);
		removeAllIconsAction.setEnabled(enabled);
	}

	@Pointcut("execution(freemind.modes.mindmapmode.MindMapController.new(..)) && this(controller)")
	public void iconActions(MindMapController controller) {}
	
	@After("iconActions(controller)")
	public void after5(MindMapController controller) {
		this.createIconActions(controller);
	}

	@Pointcut("execution(public void freemind.modes.mindmapmode.MindMapController.updateMenus(freemind.controller.StructuredMenuHolder)) && this(controller) && args(holder)")
	public void updateMenus(MindMapController controller, StructuredMenuHolder holder) {}
	
	@After("updateMenus(controller, holder)")
	public void after6(MindMapController controller, StructuredMenuHolder holder) {
		addIconsToMenu(holder, MenuBar.INSERT_MENU + "icons", controller);
	}

	@Pointcut("execution(protected void freemind.modes.mindmapmode.MindMapController.setAllActions(boolean)) && args(enabled)")
	public void setAllIconActions(boolean enabled) {}
	
	@After("setAllIconActions(enabled)")
	public void after7(boolean enabled) {
		for (int i = 0; i < iconActions.size(); ++i) {
			((Action) iconActions.get(i)).setEnabled(enabled);
		}
	}

	@Pointcut("execution(* freemind.controller.StructuredMenuHolder.setIconBlindIcon_hook(..)) && args(item)")
	public void setIconBlindIcon(JMenuItem item)  {}
	
	@Before("setIconBlindIcon(item)")
	public void before5(JMenuItem item) {
		item.setIcon(blindIcon);
	}

	@Pointcut("call(public void freemind.controller.StructuredMenuHolder.updateMenus(javax.swing.JPopupMenu, String)) && this(popupMenu) && target(holder)  && withincode(public void freemind.modes.mindmapmode.MindMapPopupMenu.update(freemind.controller.StructuredMenuHolder))")
	public void update(MindMapPopupMenu popupMenu, StructuredMenuHolder holder) {}
	
	@Before("update(popupMenu, holder) ")
	public void before6(MindMapPopupMenu popupMenu, StructuredMenuHolder holder) {
		addIconsToMenu(holder, MindMapPopupMenu.MINDMAPMODE_POPUP + "icons/",
				popupMenu.c);
	}

	@Pointcut("execution(private void freemind.modes.actions.ApplyPatternAction.hookApplyPattern(freemind.modes.MindMapNode, freemind.modes.StylePattern)) && this(action) && args(node, pattern)")
	public void applyPattern(ApplyPatternAction action, MindMapNode node, StylePattern pattern) {}
	
	@Before("applyPattern(action, node, pattern)")
	public void before7(ApplyPatternAction action, MindMapNode node, StylePattern pattern) {
		if (getAppliesToNodeIcon()) {
			if (getNodeIcon() == null) {
				while (removeLastIcon(node) > 0) {
				}
			} else {
				addIcon(node, getNodeIcon());
			}
		}
	}

	@Pointcut("execution(void freemind.view.mindmapview.NodeView.update()) && this(nodeView)")
	public void updateNodeView(NodeView nodeView) {}
	
	@Before("updateNodeView(nodeView)")
	public void before8(NodeView nodeView) {
		MultipleImage iconImages = new MultipleImage(nodeView.map.getZoom());
		boolean iconPresent = false;
		FreeMindMain frame = nodeView.map.getController().getFrame();
		Map stateIcons = (nodeView.getModel()).getStateIcons();
		for (Iterator i = stateIcons.keySet().iterator(); i.hasNext();) {
			String key = (String) i.next();
			iconPresent = true;
			ImageIcon myIcon = (ImageIcon) stateIcons.get(key);
			iconImages.addImage(myIcon);
		}

		List icons = (nodeView.getModel()).getIcons();
		for (Iterator i = icons.iterator(); i.hasNext();) {
			MindIcon myIcon = (MindIcon) i.next();
			iconPresent = true;
			// System.out.println("print the icon " +
			// myIcon.getIconFileName());
			iconImages.addImage(myIcon.getIcon(frame));
		}

		String link = ((NodeAdapter) nodeView.getModel()).getLink();
		if (link != null) {
			iconPresent = true;
			ImageIcon icon = new ImageIcon(frame.getResource(link
					.startsWith("mailto:") ? "images/Mail.png" : (Tools
					.executableByExtension(link) ? "images/Executable.png"
					: "images/Link.png")));
			iconImages.addImage(icon);
		}

		nodeView.setIcon(iconPresent ? iconImages : null);
	}

	@Pointcut("execution(*  freemind.view.mindmapview.EditNodeTextField.getIconsHook(..)) && this(cthis)")
	public void getIcons(EditNodeTextField cthis)  {}
	
	@Around("getIcons(cthis)")
	public boolean around1(EditNodeTextField cthis) {
		return cthis.getNode().getModel().getIcons().size() != 0;
	}

	@Pointcut("execution(*  freemind.view.mindmapview.EditNodeTextField.linkIconWidthHook(..)) && args(xOffset, linkIconWidth) && this(cthis)")
	public void linkIconWidth(EditNodeTextField cthis, int xOffset, int linkIconWidth) {}
	
	@Around("linkIconWidth(cthis, xOffset, linkIconWidth)")
	public int around2(EditNodeTextField cthis, int xOffset, int linkIconWidth) {
		return xOffset += linkIconWidth
				* cthis.getNode().getModel().getIcons().size();
	}

	@Pointcut("execution(public void freemind.modes.mindmapmode.MindMapToolBar.update(freemind.controller.StructuredMenuHolder)) && this(toolBar)")
	public void updateBar(MindMapToolBar toolBar) {}
	
	@After("updateBar(toolBar)")
	public void after8(MindMapToolBar toolBar) {
		toolBar.buttonToolBar.add(removeLastIconAction);
		toolBar.buttonToolBar.add(removeAllIconsAction);
		toolBar.buttonToolBar.addSeparator();
		for (int i = 0; i < iconActions.size(); ++i) {
			toolBar.buttonToolBar.add((Action) iconActions.get(i));
		}
	}
	

	@Pointcut("execution(public freemind.controller.Controller.new(freemind.main.FreeMindMain)) && this(controller)")
	public void toggleLeft(Controller controller) {}
	
	@After("toggleLeft(controller)")
	public void after9(Controller controller) {
		toggleLeftToolbar = new ToggleLeftToolbarAction(controller);
	}

	@Pointcut("call(public void freemind.main.FreeMindMain.saveProperties()) && withincode(private void freemind.controller.Controller.quit()) && this(controller)")
	public void quit(Controller controller) {}
	
	@Before("quit(controller)")
	public void before9(Controller controller) {
		controller.setProperty("leftToolbarVisible",
				((ToggleLeftToolbarAction) toggleLeftToolbar)
						.getLeftToolbarVisible() ? "true" : "false");
	}

	@Pointcut("execution(* freemind.main.FreeMind.hookLeftToolbar(freemind.main.FreeMind)) && args(frame)")
	public void main(FreeMind frame) {}
	
	@Before("main(frame)")
	public void before10(FreeMind frame) {
		if (Tools.safeEquals(frame.getProperty("leftToolbarVisible"), "false")) {
			((ToggleLeftToolbarAction) toggleLeftToolbar)
					.setLeftToolbarVisible(false);
		}
	}
	
	@Pointcut("execution(private void freemind.controller.MenuBar.addAdditionalPopupActions()) && this(menu)")
	public void additionalPopups(MenuBar menu) {}
	
	@After("additionalPopups(menu)")
	public void after9(MenuBar menu) {
		JMenuItem newPopupItem = new JMenuItem(toggleLeftToolbar);
		newPopupItem.setForeground(new Color(100, 80, 80));
		menu.menuHolder.addMenuItem(newPopupItem, MenuBar.POPUP_MENU
				+ "toggleLeftToolbar");
	}
	

	@Pointcut("execution(private void freemind.controller.MenuBar.updateEditMenu()) && this(menu)")
	public void updateMenu(MenuBar menu) {}
	
	@Before("updateMenu(menu)")
	public void before11(MenuBar menu) {
		menu.menuHolder.addAction(toggleLeftToolbar, MenuBar.VIEW_MENU
				+ "toolbars/toggleLeftToolbar");
	}
}
