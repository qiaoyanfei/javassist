/*
 * This file is part of the Javassist toolkit.
 *
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * either http://www.mozilla.org/MPL/.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.  See
 * the License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is Javassist.
 *
 * The Initial Developer of the Original Code is Shigeru Chiba.  Portions
 * created by Shigeru Chiba are Copyright (C) 1999-2003 Shigeru Chiba.
 * All Rights Reserved.
 *
 * Contributor(s):
 *
 * The development of this software is supported in part by the PRESTO
 * program (Sakigake Kenkyu 21) of Japan Science and Technology Corporation.
 */

package javassist.compiler.ast;

import javassist.compiler.CompileError;

public class FieldDecl extends ASTList {
    public FieldDecl(ASTree _head, ASTList _tail) {
	super(_head, _tail);
    }

    public ASTList getModifiers() { return (ASTList)getLeft(); }

    public Declarator getDeclarator() { return (Declarator)tail().head(); }

    public ASTree getInit() { return (ASTree)sublist(2).head(); }

    public void accept(Visitor v) throws CompileError {
	v.atFieldDecl(this);
    }
}
