//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.06.17 at 10:47:59 PM MST 
//


package com.acims.fddevs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.acims.fddevs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TimeAdvance_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "TimeAdvance");
    private final static QName _ScheduleIndicator_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "scheduleIndicator");
    private final static QName _InternalTransition_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "InternalTransition");
    private final static QName _NextState_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "NextState");
    private final static QName _StartState_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "StartState");
    private final static QName _Deltext_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "deltext");
    private final static QName _Ta_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "ta");
    private final static QName _IncomingMessage_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "IncomingMessage");
    private final static QName _ExternalTransition_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "ExternalTransition");
    private final static QName _Deltint_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "deltint");
    private final static QName _OutgoingMessage_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "OutgoingMessage");
    private final static QName _Atomic_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "atomic");
    private final static QName _LamdaSet_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "LamdaSet");
    private final static QName _State_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "state");
    private final static QName _States_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "states");
    private final static QName _Transition_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "transition");
    private final static QName _Outport_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "outport");
    private final static QName _Inports_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "inports");
    private final static QName _Lamda_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "lamda");
    private final static QName _Timeout_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "Timeout");
    private final static QName _Outports_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "outports");
    private final static QName _Inport_QNAME = new QName("http://www.saurabh-mittal.com/NewXMLSchema", "inport");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.acims.fddevs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LambdaType }
     * 
     */
    public LambdaType createLambdaType() {
        return new LambdaType();
    }

    /**
     * Create an instance of {@link AtomicType }
     * 
     */
    public AtomicType createAtomicType() {
        return new AtomicType();
    }

    /**
     * Create an instance of {@link ExtTransitionType }
     * 
     */
    public ExtTransitionType createExtTransitionType() {
        return new ExtTransitionType();
    }

    /**
     * Create an instance of {@link StatesType }
     * 
     */
    public StatesType createStatesType() {
        return new StatesType();
    }

    /**
     * Create an instance of {@link InportType }
     * 
     */
    public InportType createInportType() {
        return new InportType();
    }

    /**
     * Create an instance of {@link LamdaAllType }
     * 
     */
    public LamdaAllType createLamdaAllType() {
        return new LamdaAllType();
    }

    /**
     * Create an instance of {@link DeltintType }
     * 
     */
    public DeltintType createDeltintType() {
        return new DeltintType();
    }

    /**
     * Create an instance of {@link IntTransitionType }
     * 
     */
    public IntTransitionType createIntTransitionType() {
        return new IntTransitionType();
    }

    /**
     * Create an instance of {@link TaType }
     * 
     */
    public TaType createTaType() {
        return new TaType();
    }

    /**
     * Create an instance of {@link OutportType }
     * 
     */
    public OutportType createOutportType() {
        return new OutportType();
    }

    /**
     * Create an instance of {@link TimeAdvanceType }
     * 
     */
    public TimeAdvanceType createTimeAdvanceType() {
        return new TimeAdvanceType();
    }

    /**
     * Create an instance of {@link DeltextType }
     * 
     */
    public DeltextType createDeltextType() {
        return new DeltextType();
    }

    /**
     * Create an instance of {@link TransitionType }
     * 
     */
    public TransitionType createTransitionType() {
        return new TransitionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeAdvanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "TimeAdvance")
    public JAXBElement<TimeAdvanceType> createTimeAdvance(TimeAdvanceType value) {
        return new JAXBElement<TimeAdvanceType>(_TimeAdvance_QNAME, TimeAdvanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "scheduleIndicator")
    public JAXBElement<Boolean> createScheduleIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ScheduleIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntTransitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "InternalTransition")
    public JAXBElement<IntTransitionType> createInternalTransition(IntTransitionType value) {
        return new JAXBElement<IntTransitionType>(_InternalTransition_QNAME, IntTransitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "NextState")
    public JAXBElement<String> createNextState(String value) {
        return new JAXBElement<String>(_NextState_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "StartState")
    public JAXBElement<String> createStartState(String value) {
        return new JAXBElement<String>(_StartState_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeltextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "deltext")
    public JAXBElement<DeltextType> createDeltext(DeltextType value) {
        return new JAXBElement<DeltextType>(_Deltext_QNAME, DeltextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "ta")
    public JAXBElement<TaType> createTa(TaType value) {
        return new JAXBElement<TaType>(_Ta_QNAME, TaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "IncomingMessage")
    public JAXBElement<String> createIncomingMessage(String value) {
        return new JAXBElement<String>(_IncomingMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtTransitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "ExternalTransition")
    public JAXBElement<ExtTransitionType> createExternalTransition(ExtTransitionType value) {
        return new JAXBElement<ExtTransitionType>(_ExternalTransition_QNAME, ExtTransitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeltintType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "deltint")
    public JAXBElement<DeltintType> createDeltint(DeltintType value) {
        return new JAXBElement<DeltintType>(_Deltint_QNAME, DeltintType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "OutgoingMessage")
    public JAXBElement<String> createOutgoingMessage(String value) {
        return new JAXBElement<String>(_OutgoingMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtomicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "atomic")
    public JAXBElement<AtomicType> createAtomic(AtomicType value) {
        return new JAXBElement<AtomicType>(_Atomic_QNAME, AtomicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LamdaAllType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "LamdaSet")
    public JAXBElement<LamdaAllType> createLamdaSet(LamdaAllType value) {
        return new JAXBElement<LamdaAllType>(_LamdaSet_QNAME, LamdaAllType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "state")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "states")
    public JAXBElement<StatesType> createStates(StatesType value) {
        return new JAXBElement<StatesType>(_States_QNAME, StatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "transition")
    public JAXBElement<TransitionType> createTransition(TransitionType value) {
        return new JAXBElement<TransitionType>(_Transition_QNAME, TransitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "outport")
    public JAXBElement<String> createOutport(String value) {
        return new JAXBElement<String>(_Outport_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "inports")
    public JAXBElement<InportType> createInports(InportType value) {
        return new JAXBElement<InportType>(_Inports_QNAME, InportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LambdaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "lamda")
    public JAXBElement<LambdaType> createLamda(LambdaType value) {
        return new JAXBElement<LambdaType>(_Lamda_QNAME, LambdaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "Timeout")
    public JAXBElement<Double> createTimeout(Double value) {
        return new JAXBElement<Double>(_Timeout_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "outports")
    public JAXBElement<OutportType> createOutports(OutportType value) {
        return new JAXBElement<OutportType>(_Outports_QNAME, OutportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.saurabh-mittal.com/NewXMLSchema", name = "inport")
    public JAXBElement<String> createInport(String value) {
        return new JAXBElement<String>(_Inport_QNAME, String.class, null, value);
    }

}