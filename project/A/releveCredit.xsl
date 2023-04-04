<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
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
                            <th colspan="4">Operations de type CREDIT du: <xsl:value-of select="operations/@dateDebut"/> a <xsl:value-of select="operations/@dateFin"/></th>
                        </tr>
                        <tr>
                            <td>date</td>
                            <td>montant</td>
                            <td>description</td>
                            <td>type</td>
                        </tr>
                        <xsl:for-each select="operations/operation[@type='CREDIT']">
                            <tr>
                                <td><xsl:value-of select="@date"/></td>
                                <td><xsl:value-of select="@montant"/></td>
                                <td><xsl:value-of select="@description"/></td>
                                <td><xsl:value-of select="@type"/></td>
                            </tr>
                        </xsl:for-each>
                    </table>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
    
    
</xsl:stylesheet>