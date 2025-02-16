//package Behavioural.Mediator;
//
//import javafx.scene.control.TextField;
//
//public class TextBox extends TextField implements UIControl {
//	private UIMediator mediator;
//	private boolean mediatorUpdate;
//	public TextBox(UIMediator mediator) {
//		this.mediator = mediator;
//		this.setText("Textbox");
//		this.mediator.register(this);
//
//		this.textProperty().addListener((v, o, n) -> {
//			if(!mediatorUpdate)
//				this.mediator.valueChanged(this);
//		});
//	}
//
//	@Override
//	public void controlChanged(UIControl control) {
//		this.mediatorUpdate = true;
//		this.setText(control.getControlValue());
//		this.mediatorUpdate = false;
//	}
//
//	@Override
//	public String getControlValue() {
//		return getText();
//	}
//
//	@Override
//	public String getControlName() {
//		return "Textbox";
//	}
//}
