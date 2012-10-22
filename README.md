scm-decorator
=============

SCM decorator converts log record, produced by SCM command tools into format
which <a target="_blank" href="http://www.nerrvana.com">Nerrvana</a> recognizes. 
Current version supports SVN only.

Example
=======

Output of the command 'svn log -r 123':

------------------------------------------------------------------------
r123 | dev  | 2012-12-12 12:12:12 +0000 (Mon, 12 Dec 2012) | 2 lines

Tags entered by user will be deleted on click (was moved to popular).
Default values for install params to correct process start from any step.
------------------------------------------------------------------------

Will be converted into:

Revision: 123
Committer: dev
Date: 2012-12-12 12:12:12 +0000 (Mon, 12 Dec 2012)
Tags entered by user will be deleted on click (was moved to popular).
Default values for install params to correct process start from any step.