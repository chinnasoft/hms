package com.gwtplatform.samples.basic.client.core;

import java.util.ArrayList;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.ToggleGroup;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.state.client.GridStateHandler;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.button.ToolButton;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.form.DateField;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FieldSet;
import com.sencha.gxt.widget.core.client.form.FormPanel;
import com.sencha.gxt.widget.core.client.form.Radio;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.TimeField;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;


public class simple implements IsWidget{
	 private HorizontalPanel vp;
	 private VerticalPanel vp1;
	 public Widget asWidget() {
		    if (vp == null) {
		      vp = new HorizontalPanel();
		      vp.setSpacing(10);
		      
		      
		  
		      opdform();
		      saveform();
		      
		    }
		    return vp;
		   
		  }
	
	public void opdform(){
	FramedPanel fp = new FramedPanel();
	//fp.setPixelSize(1366,768);
	fp.setHeadingText("OP FORM");
	 fp.setWidth(1000);
	 
	 String html = "<h1>ABC Hospital and Services</h1>\n"
	  			;
	  		final HTMLPanel logo = new HTMLPanel(html);
	  	
	 fp.setHeadingHtml(html);
	 FieldSet fieldSet = new FieldSet();
	    fieldSet.setHeadingText("User Information");
	    fieldSet.setCollapsible(true);
	    fp.add(fieldSet);
	
	    
	HorizontalLayoutContainer mainframe = new HorizontalLayoutContainer();
	    
	    
	 VerticalLayoutContainer vlc = new VerticalLayoutContainer();
	 fieldSet.add(vlc,new VerticalLayoutData(1, -1));
	 
	
	 
	
	Radio reg = new Radio();
    reg.setBoxLabel("Registrattion");
    Radio subvst = new Radio();
    subvst.setBoxLabel("SubVisit");    
    Radio invpr = new Radio();
    invpr.setBoxLabel("Investigation/Procedures");
    
    HorizontalLayoutContainer c = new HorizontalLayoutContainer();
    
    
    HorizontalPanel hp1 = new HorizontalPanel();
   HorizontalPanel hp2 = new HorizontalPanel();
    HorizontalPanel hp3 = new HorizontalPanel();
    FieldSet radioSet1 = new FieldSet();
    FieldSet radioSet2= new FieldSet();
    radioSet1.setHeadingText("Registration Type");
    radioSet2.setHeadingText("Visit Type");
    
    radioSet1.add(hp1);
    radioSet1.setWidth(450);
    radioSet2.add(hp1);
    radioSet2.setWidth(450);
    
    hp1.add(reg);
    hp1.add(subvst);
    hp1.add(invpr);
    
    radioSet1.add(hp1);
    
    ToggleGroup group1 = new ToggleGroup();
    group1.add(reg);
    group1.add(subvst);
    group1.add(invpr);
    Radio regular = new Radio();
    regular.setBoxLabel("regular");
    Radio daycare = new Radio();
    daycare.setBoxLabel("Daycare");    
    Radio emer = new Radio();
    emer.setBoxLabel("Emergency"); 
    
    
    
    hp2.add(regular);
    hp2.add(daycare);
    hp2.add(emer);
    ToggleGroup group2 = new ToggleGroup();
    group2.add(regular);
    group2.add(daycare);
    group2.add(emer);
    radioSet2.add(hp2);
    hp3.add(radioSet1);
    hp3.add(radioSet2);
    
    vlc.add(hp3);
//    vlc.add(radioSet2);
    
   
    
    
    HorizontalPanel txt1 = new HorizontalPanel();
    TextField mrno = new TextField();     
    mrno.setWidth(120);
    txt1.add(new FieldLabel(mrno, "MR No"));
    TextField billno = new TextField();    
    billno.setWidth(120);
    txt1.add(new FieldLabel(billno, "Bill No"));

    TextField rcpno = new TextField();
    rcpno.setWidth(120);
    txt1.add(new FieldLabel(rcpno, "Receipt No"));

    TextField vstno = new TextField();
    vstno.setWidth(120);
    txt1.add(new FieldLabel(vstno, "Visit No"));
 
    vlc.add(txt1);
    
    HorizontalPanel txt2 = new HorizontalPanel();
    TextField title = new TextField();    
    title.setWidth(120);
    txt2.add(new FieldLabel(title, "Title"));
    TextField fstnm = new TextField();
    fstnm.setWidth(120);
    txt2.add(new FieldLabel(fstnm, "First Name"));
    
    TextField mdlnm = new TextField();
    mdlnm.setWidth(120);
    txt2.add(new FieldLabel(mdlnm, "Middle Name"));
    TextField lstnm = new TextField();
    lstnm.setWidth(120);
    txt2.add(new FieldLabel(lstnm, "Last Name"));
    vlc.add(txt2);
    
    HorizontalPanel txt3 = new HorizontalPanel();
    TextField age = new TextField();   
    age.setWidth(120);
    txt3.add(new FieldLabel(age, "Age"));
    TextField ageflg = new TextField();
    ageflg.setWidth(120);
    txt3.add(new FieldLabel(ageflg, "Age Flag"));
    TextField sex = new TextField();
    sex.setWidth(120);
    txt3.add(new FieldLabel(sex, "Sex"));
    DateField birthday = new DateField();
    birthday.setWidth(120);
    txt3.add(new FieldLabel(birthday, "DOB"));
    vlc.add(txt3);
    
    TextField address = new TextField();
    address.setWidth(560);
    vlc.add(new FieldLabel(address, "Address"));
    
    HorizontalPanel txt4 = new HorizontalPanel();
    TextField area = new TextField();    
    area.setWidth(120);
    txt4.add(new FieldLabel(area, "Area"));
    TextField city = new TextField();    
    city.setWidth(120);
    txt4.add(new FieldLabel(city, "City"));
    TextField state = new TextField();
    state.setWidth(120);
    txt4.add(new FieldLabel(state, "State"));
    TextField country = new TextField();
    country.setWidth(120);
    txt4.add(new FieldLabel(country, "Country"));
    vlc.add(txt4);
    
    HorizontalPanel txt5 = new HorizontalPanel();
    TextField mobile = new TextField();
    mobile.setWidth(120);
    txt5.add(new FieldLabel(mobile, "Mobile"));
    TextField phno = new TextField();
    phno.setWidth(120);
    txt5.add(new FieldLabel(phno, "Phone no"));
    TextField rfrtyp = new TextField();
    rfrtyp.setWidth(120);
    txt5.add(new FieldLabel(rfrtyp, "Refer Type"));
    vlc.add(txt5);
    /***********************************************************grid*************************************************************************/  
     
    final billingprops props = GWT.create(billingprops.class);
    ColumnConfig<billing, String> sno = new ColumnConfig<billing, String>(props.sno(), 50, "SNo");
    ColumnConfig<billing, Double> code = new ColumnConfig<billing, Double>(props.code(), 75, "Code");
    ColumnConfig<billing, String> desc = new ColumnConfig<billing, String>(props.description(), 75, "Description");
    ColumnConfig<billing, String> dep = new ColumnConfig<billing, String>(props.department(), 100, "Department");
    ColumnConfig<billing, Double> tot = new ColumnConfig<billing, Double>(props.total(), 50, "Total");
    ColumnConfig<billing, Double> disc = new ColumnConfig<billing, Double>(props.discount(), 50, "Discount");
    ColumnConfig<billing, Double> netamt = new ColumnConfig<billing, Double>(props.netamt(), 50, "Net Amount");
    
    List<ColumnConfig<billing, ?>> l = new ArrayList<ColumnConfig<billing, ?>>();
    l.add(sno);
    l.add(code);
    l.add(desc);
    l.add(dep);
    l.add(tot);
    l.add(disc);
    l.add(netamt);
    ColumnModel<billing> cm = new ColumnModel<billing>(l);
    
    ListStore<billing> s = new ListStore<billing>(props.key());
    s.add(new billing("1",001.00,"Fever","General dep",350.45,5.0,335.00));
    s.add(new billing("2",003.00,"cough","Casuality",350.45,5.0,335.00));
    s.add(new billing("3",002.00,"sinus","ENT",350.45,5.0,335.00));
    s.add(new billing("4",006.00,"cold","General dep",350.45,5.0,335.00));
    s.add(new billing("5",022.00,"Fever","General dep",350.45,5.0,335.00));
    s.add(new billing("6",041.00,"Fever","General dep",350.45,5.0,335.00));
    s.add(new billing("7",501.00,"Fever","General dep",350.45,5.0,335.00));
    s.add(new billing("8",701.00,"Fever","General dep",350.45,5.0,335.00));
    s.add(new billing("9",6071.00,"Fever","General dep",350.45,5.0,335.00));
    
     Grid<billing> grid = new Grid<billing>(s, cm);
    grid.getView().setAutoExpandColumn(sno);
    grid.getView().setAutoExpandColumn(code);
    grid.getView().setAutoExpandColumn(desc);
    grid.getView().setAutoExpandColumn(dep);
    grid.getView().setAutoExpandColumn(tot);
    grid.getView().setAutoExpandColumn(disc);
    grid.getView().setAutoExpandColumn(netamt);
    grid.getView().setStripeRows(true);
    grid.getView().setColumnLines(true);
    grid.setBorders(true);
    
//    grid.setSize("10px", "1em");
    grid.setWidth(200);
    grid.setColumnReordering(true);
    grid.setStateful(true);
    grid.setStateId("gridExample");
   /* GridStateHandler<billing> state1 = new GridStateHandler<billing>(grid);
    state1.loadState();
*/
    
    vlc.add(grid, new VerticalLayoutData(1, -1));

    /*
    ContentPanel gridpanel=new ContentPanel();
    gridpanel.setHeadingText("Billing details");
    gridpanel.setPixelSize(600,300);*/
  
  ///**************************************************************grid**********************************************************************/  
    HorizontalPanel txt6 = new HorizontalPanel();
    TextField tamt = new TextField(); 
    tamt.setWidth(120);
    txt6.add(new FieldLabel(tamt, "Total amount"));
    TextField dscamt = new TextField();
    dscamt.setWidth(120);
    txt6.add(new FieldLabel(dscamt, "Discount amount"));
    TextField dscperc = new TextField();
    dscperc.setWidth(120);
    txt6.add(new FieldLabel(dscperc, "Discount %"));
    TextField ntamt = new TextField();
    ntamt.setWidth(120);
    txt6.add(new FieldLabel(ntamt, "Net amount"));
    
    vlc.add(txt6);
    
    HorizontalPanel txt7 = new HorizontalPanel();
    TextField paid = new TextField();   
    paid.setWidth(120);
    txt7.add(new FieldLabel(paid, "Paid"));
    TextField bal = new TextField();
    bal.setWidth(120);
    txt7.add(new FieldLabel(bal, "Balance"));
    TextField dscrsn = new TextField();
    dscrsn.setWidth(120);
    txt7.add(new FieldLabel(dscrsn, "Discount Reason"));
    TextField remarks = new TextField();
    remarks.setWidth(120);
    txt7.add(new FieldLabel(remarks, "Remarks"));
    vlc.add(txt7);
    //mainframe.add(vlc);
    //mainframe.add(saveFrame);
    
    vp.add(fp);
	
	}
	
	public void saveform(){
		FramedPanel fp = new FramedPanel();
		//fp.setHeadingText("OP FORM");
		 fp.setWidth(400);
		 fp.setHeight(620);
		 String html="<h1></h1>\n";
		 fp.setHeadingHtml(html);
		
		    
		    VerticalLayoutContainer vlc1 = new VerticalLayoutContainer();
//		    fieldSet.add(vlc1);
		    
		    FieldSet fieldSet = new FieldSet();
		    fieldSet.setHeadingText("Date/Time");
		    fieldSet.setCollapsible(true);
		   
		 
		 VerticalPanel dttime=new VerticalPanel();

		 DateField date=new DateField();
		 dttime.add(new FieldLabel(date,"Date"));
		 TimeField time=new TimeField();
		 dttime.add(new FieldLabel(time,"Time"));
		 time.setHeight(100);
		 vlc1.add(dttime);  
		 
		 
		 VerticalPanel vpan=new VerticalPanel();
		 FieldSet set = new FieldSet();
		 
		 TextField dce = new TextField();    
		 vpan.add(new FieldLabel(dce, " Day Care / Emergency No"));
		    
		    TextField token = new TextField();    
		    vpan.add(new FieldLabel(token, " Token no"));
		    
		    TextField empno = new TextField();    
		    vpan.add(new FieldLabel(empno, "Emp no"));
		    
		    TextField designaation = new TextField();    
		    vpan.add(new FieldLabel(designaation, "Designation"));
		    
		    TextField branch = new TextField();    
		    vpan.add(new FieldLabel(branch, "Designation"));
		    
		    TextField cardno = new TextField();    
		    vpan.add(new FieldLabel(cardno, "Card no"));
		    
		    TextField userno = new TextField();    
		    vpan.add(new FieldLabel(userno, "User no"));
		    set.add(vpan);
		    vlc1.add(set);
		  
		 
		   
		    
		    
		    
		    HorizontalPanel hp1=new HorizontalPanel(); 
		    FieldSet radioSet1 = new FieldSet();
		    FieldSet radioSet2= new FieldSet();
		    radioSet1.setHeadingText("");
		    Radio est = new Radio();
		    est.setBoxLabel("Estimate");
		    Radio fnl = new Radio();
		    fnl.setBoxLabel("Final"); 
		    hp1.add(est);
		    hp1.add(fnl);
		    
		    radioSet1.add(hp1);
		    vlc1.add(radioSet1);
		    
		    HorizontalPanel btn1=new HorizontalPanel();
		    
		    TextButton prnt=new TextButton("PRINT");
		    prnt.setSize("50px", "2em");
		    btn1.add(prnt);
		    btn1.setSpacing(30);
		    TextButton usrcl=new TextButton("User Collection dtl");
		    usrcl.setSize("50px", "2em");
		    
		    btn1.add(usrcl);
		    vlc1.add(btn1);
		    
		    HorizontalPanel btn2=new HorizontalPanel();
		    btn2.setSpacing(30);
		    btn2.setSize("30px", "2em");
		    TextButton saveall=new TextButton("SAVE");
		    saveall.setSize("80px", "2em");
		    btn2.add(saveall);
		    TextButton close=new TextButton("CLOSE");
		    close.setSize("80px", "2em");
		   
		   
		    btn2.add(close);
		    vlc1.add(btn2);
		    
		    fp.add(vlc1);
		    vp.add(fp);
	}
}
