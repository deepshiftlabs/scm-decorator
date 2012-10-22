scm-decorator
=============

SCM decorator converts log record, produced by SCM command tools into format
which <a target="_blank" href="http://www.nerrvana.com">Nerrvana</a> recognizes. 
Current version supports SVN only.

Example
=======

**Output of the command 'svn log -r 123':**

<pre>--------------------------------------------------------------------------
r123 | john.smith  | 2012-12-12 12:12:12 +0000 (Mon, 12 Dec 2012) | 1 line

Fixed bug #1234
--------------------------------------------------------------------------</pre>

**Will be converted into:**

<pre>Revision: 123
Committer: dev
Date: 2012-12-12 12:12:12 +0000 (Mon, 12 Dec 2012)
Fixed bug #1234</pre>
