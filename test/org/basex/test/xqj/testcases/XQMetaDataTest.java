// Copyright (c) 2003, 2006, 2007, Oracle. All rights reserved.
package org.basex.test.xqj.testcases;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQConstants;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQMetaData;
import javax.xml.xquery.XQSequence;
import javax.xml.xquery.XQStaticContext;

@SuppressWarnings("all")
public class XQMetaDataTest extends XQJTestCase {

  public void testGetProductMajorVersion() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getProductMajorVersion();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getProductMajorVersion();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testGetProductMinorVersion() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getProductMinorVersion();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getProductMinorVersion();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testGetProductName() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getProductName();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getProductName();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testGetProductVersion() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getProductVersion();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getProductVersion();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testGetXQJMajorVersion() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getXQJMajorVersion();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getXQJMajorVersion();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testGetXQJMinorVersion() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getXQJMinorVersion();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getXQJMinorVersion();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testGetXQJVersion() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getXQJVersion();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getXQJMinorVersion();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testIsReadOnly() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isReadOnly();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.isReadOnly();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testIsXQueryXSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isXQueryXSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsXQueryX = true;
    
    try {
      supportsXQueryX = xqmd.isXQueryXSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsXQueryX) {
      try {
        String xqueryx = 
          "<xqx:module xmlns:xqx='http://www.w3.org/2005/XQueryX'>" +
          "  <xqx:mainModule>" +
          "    <xqx:queryBody>" +
          "      <xqx:stringConstantExpr>" +
          "        <xqx:value>Hello world!</xqx:value>" +
          "      </xqx:stringConstantExpr>" +
          "    </xqx:queryBody>" +
          "  </xqx:mainModule>" +
          "</xqx:module>";
        
        XQStaticContext xqsc = xqc.getStaticContext();
        xqsc.setQueryLanguageTypeAndVersion(XQConstants.LANGTYPE_XQUERYX);
        XQExpression xqe = xqc.createExpression(xqsc);
        XQSequence xqs = xqe.executeQuery(xqueryx);
        xqs.next();
        String s = xqs.getAtomicValue();
        xqe.close();
        assertEquals("XQueryX is supported, executing an XQueryX query yields unexpected results.", "Hello world!", s);
      } catch (XQException e) {
        fail("A-XQMD-2.1: XQueryX is supported, executing an XQueryX query failed with message: " + e.getMessage());
      }
    }
  }

  public void testIsTransactionSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isTransactionSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsTransaction = true;
    
    try {
      supportsTransaction = xqmd.isTransactionSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsTransaction) {
      try {
        xqc.setAutoCommit(false);
        xqc.rollback();
      } catch (XQException e) {
        fail("A-XQMD-3.1: Transactions are supported, starting and ending a transaction failed with message: " + e.getMessage());
      }
    }
  }

  public void testIsStaticTypingFeatureSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isStaticTypingFeatureSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsStaticTyping = true;
    
    try {
      supportsStaticTyping = xqmd.isStaticTypingFeatureSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsStaticTyping) {
      try {
        // According to the XQuery Formal Semantics, the following query must result in a static type  error.
        xqc.prepareExpression("declare variable $v as item() external; $v + 1");
        fail("A-XQMD-4.1: XQMetaData reports support for static typing feature, successfully generate a static type error.");
      } catch (XQException e) {
        e = null;
        // Expect an xQException
      }
    }
  }

  public void testIsSchemaImportFeatureSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isSchemaImportFeatureSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsSchemaImport = true;
    
    try {
      supportsSchemaImport = xqmd.isSchemaImportFeatureSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsSchemaImport) {
      // optional feature, not tested.
    }
  }

  public void testIsSchemaValidationFeatureSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isSchemaValidationFeatureSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsSchemaValidation = true;
    
    try {
      supportsSchemaValidation = xqmd.isSchemaValidationFeatureSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsSchemaValidation) {
      // optional feature, not tested.
    }
  }

  public void testIsFullAxisFeatureSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isFullAxisFeatureSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsFullAxis = true;
    
    try {
      supportsFullAxis = xqmd.isFullAxisFeatureSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsFullAxis) {
      try {
        String xquery = 
          "let $e := <root><e1/><e2/></root>" +
          "return" +
          "  count($e/e1/following::element())";
        XQExpression xqe = xqc.createExpression();
        XQSequence xqs = xqe.executeQuery(xquery);
        xqs.next();
        String count = xqs.getAtomicValue();
        xqe.close();
        xqe.close();
        assertEquals("Full Axis feature is supported, executing a query with full axis yields unexpected results.", "1", count);
      } catch (XQException e) {
        fail("A-XQMD-7.1: Full Axis feature is supported, executing a query with full axis failed with message: " + e.getMessage());
      }
    }
  }

  public void testIsModuleFeatureSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isModuleFeatureSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsModules = true;
    
    try {
      xqmd.isModuleFeatureSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsModules) {
      // optional feature, not tested.
    }
  }

  public void testIsSerializationFeatureSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isSerializationFeatureSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsSerialization = true;
    
    try {
      xqmd.isSerializationFeatureSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsSerialization) {
      // optional feature, not tested.
    }
  }

  public void testIsStaticTypingExtensionsSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isStaticTypingExtensionsSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsStaticTypingExtensions = true;
    
    try {
      xqmd.isStaticTypingExtensionsSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsStaticTypingExtensions) {
      // optional feature, not tested.
    }
  }

  public void testGetUserName() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getUserName();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getUserName();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testGetMaxExpressionLength() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getMaxExpressionLength();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getMaxExpressionLength();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testGetMaxUserNameLength() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getMaxUserNameLength();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.getMaxUserNameLength();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testWasCreatedFromJDBCConnection() throws XQException {

    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.wasCreatedFromJDBCConnection();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      boolean wasFromJDBC = xqmd.wasCreatedFromJDBCConnection();
      assertFalse("A-XQMD-11.1: XQMetaData reports that the connection was not created from a JDBC Connection.", wasFromJDBC);
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testIsXQueryEncodingDeclSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isXQueryEncodingDeclSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    boolean supportsXQueryEncodingDecls = true;
    
    try {
      xqmd.isXQueryEncodingDeclSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    if (supportsXQueryEncodingDecls) {
      // optional feature, not tested.
    }
  }

  public void testGetSupportedXQueryEncodings() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.getSupportedXQueryEncodings();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.isXQueryEncodingDeclSupported();
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testIsXQueryEncodingSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isXQueryEncodingSupported("UTF-8");
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.isXQueryEncodingSupported("UTF-8");;
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
  }

  public void testIsUserDefinedXMLSchemaTypeSupported() throws XQException {   
    try {
      XQConnection my_xqc;
      my_xqc = xqds.getConnection();
      XQMetaData my_xqmd = my_xqc.getMetaData();
      my_xqc.close();
      my_xqmd.isUserDefinedXMLSchemaTypeSupported();
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    } catch (XQException e) {
      // Expect an XQException
    } catch (Exception other_e) {
      fail("A-XQMD-1.1: XQMetaData methods throw an XQException when the parent XQConnection object is closed.");
    }

    XQMetaData xqmd = xqc.getMetaData();
    
    try {
      xqmd.isUserDefinedXMLSchemaTypeSupported();;
    } catch (XQException e) {
      fail("A-XQMD-1.2: XQMetaData method failed with message: " + e.getMessage());
    }
    
    // if user defined XML schema is supported.
    // optional feature, not tested.
  }
}
