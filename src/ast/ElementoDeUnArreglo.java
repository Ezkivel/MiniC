/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author Gabriel
 */
public class ElementoDeUnArreglo {

    public nombreVariable _nombreVariable;
    public corcheteIzquierdo _corIz;
    public OperacionAritmetica _operacionAritmetica;
    public corcheteDerecho _corDer;
    private Tipo tipo;

    public ElementoDeUnArreglo(nombreVariable _nombreVariable, corcheteIzquierdo _corIz, OperacionAritmetica _operacionAritmetica, corcheteDerecho _corDer) {
        this._nombreVariable = _nombreVariable;
        this._corIz = _corIz;
        this._operacionAritmetica = _operacionAritmetica;
        this._corDer = _corDer;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public nombreVariable getNombreVariable() {
        return _nombreVariable;
    }

    public void setNombreVariable(nombreVariable _nombreVariable) {
        this._nombreVariable = _nombreVariable;
    }

}
