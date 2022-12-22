package tw.leonchen.action;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class DemoSpelAction {

	public static void main(String[] args) {

		SpelExpressionParser parser = new SpelExpressionParser();
		Expression express1 = parser.parseExpression("'hola,'+'Amigo!!'");
		String result1 = express1.getValue(String.class);
		System.out.println("result1: " + result1);

		Expression express2 = parser.parseExpression("2*3+1");
		Integer result2 = express2.getValue(Integer.class);
		System.out.println("result2: " +result2);
	}

}
