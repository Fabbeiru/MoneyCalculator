package moneycalculator.controller;

/**
 *
 * @author Fabián B.
 */

import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

public interface ExchangeRateLoader {
    ExchangeRate load(Currency currency);
}