//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.23 at 11:11:43 GMT+01:00 
//


package freemind.controller.actions.generated.instance.impl;

public class CollaborationActionImpl
    extends freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl
    implements freemind.controller.actions.generated.instance.CollaborationAction, com.sun.xml.bind.JAXBObject, com.sun.xml.bind.RIElement, freemind.controller.actions.generated.instance.impl.runtime.UnmarshallableObject, freemind.controller.actions.generated.instance.impl.runtime.XMLSerializable, freemind.controller.actions.generated.instance.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (freemind.controller.actions.generated.instance.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "collaboration_action";
    }

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (freemind.controller.actions.generated.instance.CollaborationAction.class);
    }

    public freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingEventHandler createUnmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
        return new freemind.controller.actions.generated.instance.impl.CollaborationActionImpl.Unmarshaller(context);
    }

    public void serializeElementBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "collaboration_action");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeAttributes(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributeBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "collaboration_action");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElementBody(context);
        context.endElement();
    }

    public void serializeURIs(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (freemind.controller.actions.generated.instance.CollaborationAction.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\n\u00f3i\u00a6p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\n\u00f3i\u009bppsq\u0000~\u0000\u0007\t\u0091\u00a8*ppsq\u0000~\u0000\u0007\u0006\u0080(Eppsq\u0000~\u0000\u0007\u0003\u0088-Oppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001\u00ff\u007f ppsr\u0000 com.sun.msv.gram"
+"mar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000"
+"\u0004\u0001\u00ff\u007f\u0015sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\u001bcom.sun"
+".msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype"
+"/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPa"
+"ir;xq\u0000~\u0000\u0004\u0001\u0086\u00d4\u0094ppsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAto"
+"micType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u001bL\u0000\nw"
+"hiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xp"
+"t\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv."
+"datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com."
+"sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000co"
+"m.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0004\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalN"
+"ameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bxpq\u0000~\u0000\u001fq\u0000~\u0000\u001esr\u0000#com.sun.msv.gram"
+"mar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001bL\u0000\fnamespaceU"
+"RIq\u0000~\u0000\u001bxr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0003mapt"
+"\u0000\u0000sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tsq\u0000~\u0000\u0011\u0001q\u0000~\u0000-sq\u0000~\u0000\r\u0001\u0088\u00ae*ppsq\u0000~\u0000\u000f\u0001\u0088\u00ae\u001fq\u0000~\u0000\u0012pq\u0000~\u0000\u0016"
+"sq\u0000~\u0000\'t\u0000\u0004userq\u0000~\u0000+q\u0000~\u0000-sq\u0000~\u0000\r\u0002\u00f7\u00fa\u00f1ppsq\u0000~\u0000\u000f\u0002\u00f7\u00fa\u00e6q\u0000~\u0000\u0012pq\u0000~\u0000\u0016sq\u0000~"
+"\u0000\'t\u0000\bfilenameq\u0000~\u0000+q\u0000~\u0000-sq\u0000~\u0000\r\u0003\u0011\u007f\u00e0ppsq\u0000~\u0000\u000f\u0003\u0011\u007f\u00d5q\u0000~\u0000\u0012pq\u0000~\u0000\u0016sq\u0000~"
+"\u0000\'t\u0000\ttimestampq\u0000~\u0000+q\u0000~\u0000-sq\u0000~\u0000\u000f\u0001a\u00c1lppsq\u0000~\u0000\u0013\u0000p\u00be\u0098ppsr\u0000)com.sun."
+"msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjav"
+"a/util/Set;xr\u00009com.sun.msv.datatype.xsd.DataTypeWithValueCon"
+"straintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataType"
+"WithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bb"
+"aseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcre"
+"teTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetName"
+"q\u0000~\u0000\u001bxq\u0000~\u0000\u001aq\u0000~\u0000+psr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProc"
+"essor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000!\u0000\u0000sr\u0000\"com.sun.msv.datatype.xs"
+"d.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0017q\u0000~\u0000\u001et\u0000\u0005tokenq\u0000~\u0000E\u0001q\u0000~\u0000Gt\u0000\u000benume"
+"rationsr\u0000\u0011java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0004t\u0000\u0012acc"
+"ept_map_sharingt\u0000\u0013decline_map_sharingt\u0000\u0013request_map_sharingt"
+"\u0000\u0010stop_map_sharingxq\u0000~\u0000$sq\u0000~\u0000%t\u0000\rtoken-derivedq\u0000~\u0000+sq\u0000~\u0000\'t\u0000\u0003"
+"cmdq\u0000~\u0000+sq\u0000~\u0000\'t\u0000\u0014collaboration_actionq\u0000~\u0000+sr\u0000\"com.sun.msv.gr"
+"ammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gr"
+"ammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Ex"
+"pressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006par"
+"entq\u0000~\u0000W[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\b\u0000\u0000"
+"\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppp"
+"ppppppppppppq\u0000~\u0000\tpppppppppppppppppppppppppppppppppppppppppq\u0000"
+"~\u0000\npppppppppq\u0000~\u0000\u000bppppppppppppppppppppppppppppppppppppppppppp"
+"pq\u0000~\u0000\fpppppppppq\u0000~\u0000/ppppppppppppppppppq\u0000~\u00003ppppppppppppppppp"
+"pppppppppppppppppq\u0000~\u0000\u000eq\u0000~\u00007ppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends freemind.controller.actions.generated.instance.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return freemind.controller.actions.generated.instance.impl.CollaborationActionImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("collaboration_action" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "map");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "user");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "filename");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "timestamp");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cmd");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("collaboration_action" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "map");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "user");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "filename");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "timestamp");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cmd");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("map" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("user" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("filename" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("timestamp" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("cmd" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "map");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "user");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "filename");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "timestamp");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cmd");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "map");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "user");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "filename");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "timestamp");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "cmd");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
