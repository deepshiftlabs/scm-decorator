scm-decorator
=============

SCM decorator allows to convert 'svn info' into more pleasant format as shown below. 
We use it in Jenkins CI jobs to convert and pass well formatted commit information
to <a target="_blank" href="https://github.com/deepshiftlabs/nerrvana-plugin-for-jenkins-ci">Nerrvana Jenkins plugin</a>.

Current version supports SVN only. Please feel free to extend.

Example
=======

**Output of the command 'svn log -r 123':**

<pre>--------------------------------------------------------------------------
r123 | john.smith  | 2012-12-12 12:12:12 +0000 (Mon, 12 Dec 2012) | 1 line

Fixed bug #1234
--------------------------------------------------------------------------</pre>

**Will be converted into:**

<pre>Revision: 123
Committer: john.smith
Date: 2012-12-12 12:12:12 +0000 (Mon, 12 Dec 2012)
Fixed bug #1234</pre>
