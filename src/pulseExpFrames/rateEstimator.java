
package pulseExpFrames;



import simView.*;
import genDevs.plots.*;
import java.awt.*;
import java.lang.*;
import genDevs.modeling.*;
import genDevs.simulation.*;
import GenCol.*;


public class rateEstimator extends  ViewableDigraph{

public rateEstimator(){
this("rateEstimator",10);
}

public rateEstimator(String nm,double threshold){
super(nm);
addInport("in");
addInport("time?");
addInport("setThreshold");
addOutport("timeIs");
addOutport("rate");
addTestInput("in",new doubleEnt(1),10);
addTestInput("setThreshold",new doubleEnt(2),0);
addTestInput("time?",new doubleEnt(1),4);
ViewableAtomic sum = new sum("sum",0);//state
add(sum);
addCoupling(this,"in",sum,"in");

ViewableAtomic t = new thresholdTester(threshold);
add(t);

addCoupling(this,"setThreshold",t,"setThreshold");

addCoupling(sum,"out",t,"in");

ViewableAtomic cl = new stopWatch();
add(cl);
addCoupling(sum,"out",cl,"start");
addCoupling(t,"out",sum,"reset");
addCoupling(this,"time?",cl,"time?");

addCoupling(t,"out",cl,"stop");
addCoupling(t,"out",cl,"time?");

addCoupling(cl,"timeIs",this,"timeIs");

ViewableAtomic d = new instantReal.divide("divide",threshold);
add(d);

addCoupling(this,"setThreshold",d,"setDividend");
addCoupling(cl,"timeIs",d,"in");
addCoupling(d,"out",this,"rate");
addCoupling(d,"out",cl,"reset");
}

    /**
     * Automatically generated by the SimView program.
     * Do not edit this manually, as such changes will get overwritten.
     */
    public void layoutForSimView()
    {
ComputeLayout = false;
        preferredSize = new Dimension(501, 268);
        if (withName("sum")!=null)
             ((ViewableComponent)withName("sum")).setPreferredLocation(new Point(-15, 41));
        if (withName("thresholdTester")!=null)
             ((ViewableComponent)withName("thresholdTester")).setPreferredLocation(new Point(176, 60));
        if (withName("divide")!=null)
             ((ViewableComponent)withName("divide")).setPreferredLocation(new Point(180, 136));
        if (withName("stopWatch")!=null)
             ((ViewableComponent)withName("stopWatch")).setPreferredLocation(new Point(-6, 141));
    }
}
