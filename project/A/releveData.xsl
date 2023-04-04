<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"  version="2.0">
    <xsl:template match="/">
        <html>
            <head></head>
            <body>
                <xsl:for-each select="releve">
                    <h3>RIB: <xsl:value-of select="@RIB"/> </h3>
                    <h3>Date Releve :<xsl:value-of select="dateReleve"/> </h3>
                    <h3>Solde :<xsl:value-of select="solde"/> </h3>
                    <table border="1" width="80%">
                        <tr>
                            <th colspan="4">Operations de <xsl:value-of select="operations/@dateDebut"/> a <xsl:value-of select="operations/@dateFin"/></th>
                        </tr>
                         <tr>
                             <td>date</td>
                             <td>montant</td>
                             <td>description</td>
                             <td>type</td>
                         </tr>
                      <xsl:for-each select="operations/operation">
                          <tr>
                          <td><xsl:value-of select="@date"/></td>
                          <td><xsl:value-of select="@montant"/></td>
                          <td><xsl:value-of select="@description"/></td>
                          <td><xsl:value-of select="@type"/></td>
                          </tr>
                      </xsl:for-each>
                      </table>
                    <h4>le total des opérations de débit  :<xsl:value-of select="count(operations/operation[@type='DEBIT'])"/></h4>
                    <h4>le total des opérations de crédit :<xsl:value-of select="count(operations/operation[@type='CREDIT'])"/></h4>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
    
</xsl:stylesheet>