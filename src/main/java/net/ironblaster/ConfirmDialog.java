package net.ironblaster;
	import com.vaadin.shared.ui.ContentMode;
	import com.vaadin.ui.Alignment;
	import com.vaadin.ui.Button;
	import com.vaadin.ui.Button.ClickListener;
	import com.vaadin.ui.HorizontalLayout;
	import com.vaadin.ui.Label;
	import com.vaadin.ui.VerticalLayout;
	import com.vaadin.ui.Window;

	public class ConfirmDialog extends Window {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String Messaggio;
		Button si = new Button();
		Button no = new Button();
		public ConfirmDialog (String Messaggio) {

			this.Messaggio=Messaggio;
			this.setCaption("Conferma");
			this.setResizable(false);
			this.setDraggable(false);
			this.setClosable(false);
		}
	 	public void buttonYesClickListener (ClickListener Si) {
	 		si.addClickListener(Si);
	 		si.setCaption("si");
	 	}
	 	
	 	public void buttonNoClickListener (ClickListener No) {
	 		no.addClickListener(No);
			no.setCaption("no");
	 	}
	 	
		
		@Override
		public void attach() {
			super.attach();
			
			VerticalLayout layoutSicTot = new VerticalLayout();
			HorizontalLayout layoutSicuro  = new HorizontalLayout();

			
			Label infosql = new Label("<center><h1>"+Messaggio+"</h1></center>",ContentMode.HTML);
			//infosql.setSizeFull();
			layoutSicuro.addComponents(si,no);
			layoutSicuro.setComponentAlignment(si, Alignment.MIDDLE_CENTER);
			layoutSicuro.setComponentAlignment(no, Alignment.MIDDLE_CENTER);
			layoutSicTot.addComponents(infosql,layoutSicuro);
			layoutSicTot.setComponentAlignment(layoutSicuro, Alignment.MIDDLE_CENTER);
			//layoutSicTot.setSizeFull();
			this.setContent(layoutSicTot);
			this.center();
			//this.setHeight("70%");
			//this.setWidth("70%");
			this.setModal(true);
			
			

		}
		

	}



