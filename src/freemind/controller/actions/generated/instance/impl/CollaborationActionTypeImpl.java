//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.23 at 11:11:43 GMT+01:00 
//


package freemind.controller.actions.generated.instance.impl;

public class CollaborationActionTypeImpl
    extends freemind.controller.actions.generated.instance.impl.XmlActionImpl
    implements freemind.controller.actions.generated.instance.CollaborationActionType, com.sun.xml.bind.JAXBObject, freemind.controller.actions.generated.instance.impl.runtime.UnmarshallableObject, freemind.controller.actions.generated.instance.impl.runtime.XMLSerializable, freemind.controller.actions.generated.instance.impl.runtime.ValidatableObject
{

    protected java.lang.String _User;
    protected java.lang.String _Map;
    protected java.lang.String _Cmd;
    protected java.lang.String _Timestamp;
    protected java.lang.String _Filename;
    public final static java.lang.Class version = (freemind.controller.actions.generated.instance.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (freemind.controller.actions.generated.instance.CollaborationActionType.class);
    }

    public java.lang.String getUser() {
        return _User;
    }

    public void setUser(java.lang.String value) {
        _User = value;
    }

    public java.lang.String getMap() {
        return _Map;
    }

    public void setMap(java.lang.String value) {
        _Map = value;
    }

    public java.lang.String getCmd() {
        return _Cmd;
    }

    public void setCmd(java.lang.String value) {
        _Cmd = value;
    }

    public java.lang.String getTimestamp() {
        return _Timestamp;
    }

    public void setTimestamp(java.lang.String value) {
        _Timestamp = value;
    }

    public java.lang.String getFilename() {
        return _Filename;
    }

    public void setFilename(java.lang.String value) {
        _Filename = value;
    }

    public freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingEventHandler createUnmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
        return new freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl.Unmarshaller(context);
    }

    public void serializeElementBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeElementBody(context);
    }

    public void serializeAttributes(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Map!= null) {
            context.startAttribute("", "map");
            try {
                context.text(((java.lang.String) _Map));
            } catch (java.lang.Exception e) {
                freemind.controller.actions.generated.instance.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_User!= null) {
            context.startAttribute("", "user");
            try {
                context.text(((java.lang.String) _User));
            } catch (java.lang.Exception e) {
                freemind.controller.actions.generated.instance.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Filename!= null) {
            context.startAttribute("", "filename");
            try {
                context.text(((java.lang.String) _Filename));
            } catch (java.lang.Exception e) {
                freemind.controller.actions.generated.instance.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Timestamp!= null) {
            context.startAttribute("", "timestamp");
            try {
                context.text(((java.lang.String) _Timestamp));
            } catch (java.lang.Exception e) {
                freemind.controller.actions.generated.instance.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        context.startAttribute("", "cmd");
        try {
            context.text(((java.lang.String) _Cmd));
        } catch (java.lang.Exception e) {
            freemind.controller.actions.generated.instance.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        super.serializeAttributes(context);
    }

    public void serializeAttributeBody(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributeBody(context);
    }

    public void serializeURIs(freemind.controller.actions.generated.instance.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (freemind.controller.actions.generated.instance.CollaborationActionType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\n\u00f3i\u009bppsq\u0000~\u0000\u0000\t\u0091\u00a8*ppsq\u0000~\u0000\u0000\u0006"
+"\u0080(Eppsq\u0000~\u0000\u0000\u0003\u0088-Oppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0001\u0001\u00ff\u007f ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002"
+"L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xq\u0000"
+"~\u0000\u0003\u0001\u00ff\u007f\u0015sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\u001bcom.s"
+"un.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dataty"
+"pe/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/String"
+"Pair;xq\u0000~\u0000\u0003\u0001\u0086\u00d4\u0094ppsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinA"
+"tomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0018L\u0000"
+"\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;"
+"xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.ms"
+"v.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,co"
+"m.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000"
+"com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tloca"
+"lNameq\u0000~\u0000\u0018L\u0000\fnamespaceURIq\u0000~\u0000\u0018xpq\u0000~\u0000\u001cq\u0000~\u0000\u001bsr\u0000#com.sun.msv.gr"
+"ammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0018L\u0000\fnamespac"
+"eURIq\u0000~\u0000\u0018xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0003ma"
+"pt\u0000\u0000sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tsq\u0000~\u0000\u000e\u0001q\u0000~\u0000*sq\u0000~\u0000\t\u0001\u0088\u00ae*ppsq\u0000~\u0000\u000b\u0001\u0088\u00ae\u001fq\u0000~\u0000\u000fpq\u0000~"
+"\u0000\u0013sq\u0000~\u0000$t\u0000\u0004userq\u0000~\u0000(q\u0000~\u0000*sq\u0000~\u0000\t\u0002\u00f7\u00fa\u00f1ppsq\u0000~\u0000\u000b\u0002\u00f7\u00fa\u00e6q\u0000~\u0000\u000fpq\u0000~\u0000\u0013sq"
+"\u0000~\u0000$t\u0000\bfilenameq\u0000~\u0000(q\u0000~\u0000*sq\u0000~\u0000\t\u0003\u0011\u007f\u00e0ppsq\u0000~\u0000\u000b\u0003\u0011\u007f\u00d5q\u0000~\u0000\u000fpq\u0000~\u0000\u0013sq"
+"\u0000~\u0000$t\u0000\ttimestampq\u0000~\u0000(q\u0000~\u0000*sq\u0000~\u0000\u000b\u0001a\u00c1lppsq\u0000~\u0000\u0010\u0000p\u00be\u0098ppsr\u0000)com.su"
+"n.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLj"
+"ava/util/Set;xr\u00009com.sun.msv.datatype.xsd.DataTypeWithValueC"
+"onstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTy"
+"peWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000"
+"\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconc"
+"reteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNa"
+"meq\u0000~\u0000\u0018xq\u0000~\u0000\u0017q\u0000~\u0000(psr\u00005com.sun.msv.datatype.xsd.WhiteSpacePr"
+"ocessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001e\u0000\u0000sr\u0000\"com.sun.msv.datatype."
+"xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0014q\u0000~\u0000\u001bt\u0000\u0005tokenq\u0000~\u0000B\u0001q\u0000~\u0000Dt\u0000\u000benu"
+"merationsr\u0000\u0011java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0004t\u0000\u0012a"
+"ccept_map_sharingt\u0000\u0013decline_map_sharingt\u0000\u0013request_map_sharin"
+"gt\u0000\u0010stop_map_sharingxq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\rtoken-derivedq\u0000~\u0000(sq\u0000~\u0000$t"
+"\u0000\u0003cmdq\u0000~\u0000(sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L"
+"\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;"
+"xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002"
+"\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000R[\u0000\u0005tablet\u0000![Lcom/sun/msv"
+"/grammar/Expression;xp\u0000\u0000\u0000\b\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Exp"
+"ression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppppq\u0000~\u0000\u0005ppppppppppppppp"
+"ppppppppppppppppppppppppppq\u0000~\u0000\u0006pppppppppq\u0000~\u0000\u0007ppppppppppppppp"
+"pppppppppppppppppppppppppppppq\u0000~\u0000\bpppppppppq\u0000~\u0000,pppppppppppp"
+"ppppppq\u0000~\u00000ppppppppppppppppppppppppppppppppppq\u0000~\u0000\nq\u0000~\u00004ppppp"
+"pppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends freemind.controller.actions.generated.instance.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------------");
        }

        protected Unmarshaller(freemind.controller.actions.generated.instance.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        attIdx = context.getAttribute("", "filename");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  12 :
                        attIdx = context.getAttribute("", "cmd");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 15;
                            continue outer;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("", "timestamp");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 12;
                            continue outer;
                        }
                        state = 12;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "user");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  15 :
                        spawnHandlerFromEnterElement((((freemind.controller.actions.generated.instance.impl.XmlActionImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl.this).new Unmarshaller(context)), 16, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "map");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText4(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  16 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText0(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Filename = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Cmd = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Timestamp = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _User = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Map = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        attIdx = context.getAttribute("", "filename");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  12 :
                        attIdx = context.getAttribute("", "cmd");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 15;
                            continue outer;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("", "timestamp");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 12;
                            continue outer;
                        }
                        state = 12;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "user");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  15 :
                        spawnHandlerFromLeaveElement((((freemind.controller.actions.generated.instance.impl.XmlActionImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl.this).new Unmarshaller(context)), 16, ___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "map");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText4(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  16 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
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
                    case  6 :
                        if (("filename" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  12 :
                        if (("cmd" == ___local)&&("" == ___uri)) {
                            state = 13;
                            return ;
                        }
                        break;
                    case  9 :
                        if (("timestamp" == ___local)&&("" == ___uri)) {
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                    case  3 :
                        if (("user" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  15 :
                        spawnHandlerFromEnterAttribute((((freemind.controller.actions.generated.instance.impl.XmlActionImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl.this).new Unmarshaller(context)), 16, ___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("map" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  16 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
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
                    case  6 :
                        attIdx = context.getAttribute("", "filename");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText0(v);
                            state = 9;
                            continue outer;
                        }
                        state = 9;
                        continue outer;
                    case  12 :
                        attIdx = context.getAttribute("", "cmd");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 15;
                            continue outer;
                        }
                        break;
                    case  11 :
                        if (("timestamp" == ___local)&&("" == ___uri)) {
                            state = 12;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("user" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  14 :
                        if (("cmd" == ___local)&&("" == ___uri)) {
                            state = 15;
                            return ;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("", "timestamp");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 12;
                            continue outer;
                        }
                        state = 12;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "user");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  15 :
                        spawnHandlerFromLeaveAttribute((((freemind.controller.actions.generated.instance.impl.XmlActionImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl.this).new Unmarshaller(context)), 16, ___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "map");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText4(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  2 :
                        if (("map" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  16 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        if (("filename" == ___local)&&("" == ___uri)) {
                            state = 9;
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
                        case  4 :
                            eatText3(value);
                            state = 5;
                            return ;
                        case  6 :
                            attIdx = context.getAttribute("", "filename");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText0(v);
                                state = 9;
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  12 :
                            attIdx = context.getAttribute("", "cmd");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 15;
                                continue outer;
                            }
                            break;
                        case  7 :
                            eatText0(value);
                            state = 8;
                            return ;
                        case  9 :
                            attIdx = context.getAttribute("", "timestamp");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 12;
                                continue outer;
                            }
                            state = 12;
                            continue outer;
                        case  13 :
                            eatText1(value);
                            state = 14;
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "user");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText3(v);
                                state = 6;
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  15 :
                            spawnHandlerFromText((((freemind.controller.actions.generated.instance.impl.XmlActionImpl)freemind.controller.actions.generated.instance.impl.CollaborationActionTypeImpl.this).new Unmarshaller(context)), 16, value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "map");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText4(v);
                                state = 3;
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  10 :
                            eatText2(value);
                            state = 11;
                            return ;
                        case  16 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            eatText4(value);
                            state = 2;
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
