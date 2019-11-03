package chester.calculator;

import antlr4_calculator.*;

import java.util.HashMap;

public class CalculatorVisitorImpl extends calculatorBaseVisitor<Double> {

	private HashMap< String, Double> Vars = new HashMap< String, Double>();
	
	@Override 
	public Double visitPrintExpr(calculatorParser.PrintExprContext ctx) {
		return visit(ctx.expr());
	}
	
	@Override 
	public Double visitAssign(calculatorParser.AssignContext ctx) {
		Double val = visit(ctx.expr());
		Vars.put(ctx.VARIABLE().getText(), val);
		return val;
	}
	
	@Override
    public Double visitBlank(calculatorParser.BlankContext ctx) {
        return (Double)null;
    }
	
    @Override
    public Double visitACosine(calculatorParser.ACosineContext ctx) {	
        return Math.acos(visit(ctx.expr()));
    }
    
    @Override 
    public Double visitMulDiv(calculatorParser.MulDivContext ctx) {
    	Double left = visit(ctx.expr(0));
    	Double right = visit(ctx.expr(1));
        if (ctx.op.getType() == calculatorParser.TIMES) {
            return left * right;
        } else {
            return left / right;
        }
    }
    
    @Override 
    public Double visitAddSub(calculatorParser.AddSubContext ctx) {
    	Double left = visit(ctx.expr(0));
    	Double right = visit(ctx.expr(1));
        if (ctx.op.getType() == calculatorParser.PLUS) {
            return left + right;
        } else {
            return left - right;
        }
    }
    
    @Override 
    public Double visitSigned(calculatorParser.SignedContext ctx) {
    	Double val = visit(ctx.atom());
    	if (ctx.op.getType() == calculatorParser.PLUS) {
            return val;
        } else {
            return -val;
        }
    }
    
    @Override 
    public Double visitSine(calculatorParser.SineContext ctx) {
    	return Math.sin(visit(ctx.expr()));
    }
    
    @Override 
    public Double visitTangent(calculatorParser.TangentContext ctx) {
    	return Math.tan(visit(ctx.expr()));
    }
    
    @Override 
    public Double visitNaturalLogarithm(calculatorParser.NaturalLogarithmContext ctx) {
    	return Math.log(visit(ctx.expr()));
    }
    
    @Override
    public Double visitASine(calculatorParser.ASineContext ctx) {
    	return Math.asin(visit(ctx.expr()));
    }
    
    @Override 
    public Double visitLogarithm(calculatorParser.LogarithmContext ctx) {
    	return Math.log(visit(ctx.expr(1))) / Math.log(visit(ctx.expr(0)));
    }
    
    @Override 
    public Double visitSquareRoot(calculatorParser.SquareRootContext ctx) {
    	return Math.sqrt(visit(ctx.expr()));
    }
    
    @Override 
    public Double visitATangent(calculatorParser.ATangentContext ctx) {
    	return Math.atan(visit(ctx.expr()));
    }
    
    @Override 
    public Double visitPower(calculatorParser.PowerContext ctx) {
    	return Math.pow(visit(ctx.expr(0)), visit(ctx.expr(1)));
    }
    
    @Override 
    public Double visitCosine(calculatorParser.CosineContext ctx) {
    	return Math.cos(visit(ctx.expr()));
    }
    
    @Override 
    public Double visitInteger(calculatorParser.IntegerContext ctx) {
    	return Double.valueOf(ctx.INT().getText());
    }  
    
    @Override
    public Double visitDouble(calculatorParser.DoubleContext ctx) {
    	return Double.valueOf(ctx.DOUBLE().getText());
    }
    
    @Override 
    public Double visitConstantPI(calculatorParser.ConstantPIContext ctx) {
    	return Math.PI;
    }
    
    @Override 
    public Double visitConstantE(calculatorParser.ConstantEContext ctx) {
    	return Math.E;
    }
    
    @Override 
    public Double visitScientific(calculatorParser.ScientificContext ctx) {
    	return Double.valueOf(ctx.getText());
    }
    
    @Override 
    public Double visitVariable(calculatorParser.VariableContext ctx) {
    	String key = ctx.VARIABLE().getText();
    	if (Vars.containsKey(key)) {
    		return Vars.get(key);
    	} else {
    		return 0.0;
    	}
    	
    }
    
    @Override 
    public Double visitBraces(calculatorParser.BracesContext ctx) {
    	return visit(ctx.expr());
    }
}