/*
 * This file is generated by jOOQ.
*/
package io.noorulhaq.functional.banking.domain.test.model.tables.records;


import io.noorulhaq.functional.banking.domain.test.model.tables.Accounts;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountsRecord extends UpdatableRecordImpl<AccountsRecord> implements Record5<String, String, Double, Timestamp, Timestamp> {

    private static final long serialVersionUID = -651408790;

    /**
     * Setter for <code>BANKING.ACCOUNTS.NO</code>.
     */
    public void setNo(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>BANKING.ACCOUNTS.NO</code>.
     */
    public String getNo() {
        return (String) get(0);
    }

    /**
     * Setter for <code>BANKING.ACCOUNTS.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>BANKING.ACCOUNTS.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>BANKING.ACCOUNTS.BALANCE</code>.
     */
    public void setBalance(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>BANKING.ACCOUNTS.BALANCE</code>.
     */
    public Double getBalance() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>BANKING.ACCOUNTS.OPENING_DATE</code>.
     */
    public void setOpeningDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>BANKING.ACCOUNTS.OPENING_DATE</code>.
     */
    public Timestamp getOpeningDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>BANKING.ACCOUNTS.CLOSING_DATE</code>.
     */
    public void setClosingDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>BANKING.ACCOUNTS.CLOSING_DATE</code>.
     */
    public Timestamp getClosingDate() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, Double, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, Double, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Accounts.ACCOUNTS.NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Accounts.ACCOUNTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return Accounts.ACCOUNTS.BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Accounts.ACCOUNTS.OPENING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Accounts.ACCOUNTS.CLOSING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getOpeningDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getClosingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value1(String value) {
        setNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value3(Double value) {
        setBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value4(Timestamp value) {
        setOpeningDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value5(Timestamp value) {
        setClosingDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord values(String value1, String value2, Double value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountsRecord
     */
    public AccountsRecord() {
        super(Accounts.ACCOUNTS);
    }

    /**
     * Create a detached, initialised AccountsRecord
     */
    public AccountsRecord(String no, String name, Double balance, Timestamp openingDate, Timestamp closingDate) {
        super(Accounts.ACCOUNTS);

        set(0, no);
        set(1, name);
        set(2, balance);
        set(3, openingDate);
        set(4, closingDate);
    }
}