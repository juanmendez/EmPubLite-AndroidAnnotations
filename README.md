EmPubLite-AndroidAnnotations
============================

This demo recreates the EmPubLite app made by Common's Guy at <a href="https://github.com/commonsguy/cw-omnibus/tree/master/EmPubLite/T19-LargeScreen" target="_blank">https://github.com/commonsguy/cw-omnibus/tree/master/EmPubLite/T19-LargeScreen</a>

The main purpose of this update is to use <a href="http://androidannotations.org/" target="_blank">Android Annotations</a> which is a Dependency Injection framework.
In this way, we can compare how Android Annotations works by going over the original app.

Listing of Dependency Injections

<ul>
<li><a href="https://github.com/excilys/androidannotations/wiki/Enhance%20Activities" target="_blank">Activities</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/Extras" target="_blank">Activity Extras</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/Enhance-Fragments" target="_blank">Fragments</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/FragmentArg" target="_blank">Fragment Arguments</a>
<li><a href="https://github.com/excilys/androidannotations/wiki/Enhance%20BroadcastReceivers" target="_blank">Broadcast Receivers</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/Enhance%20custom%20classes" target="_blank">Custom Classes</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/Injecting-Views" target="_blank">View injections</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/Enhance%20Services" target="_blank">Services</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/Handling%20Options%20Menu" target="_blank">Activity/Fragment Options Menu</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/WorkingWithThreads" target="_blank">Simplified Threading Model</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/Resources" target="_blank">Resources</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/SharedPreferencesHelpers" target="_blank">Shared Preferences</a></li>
<li><a href="https://github.com/excilys/androidannotations/wiki/Simple-HTTPS" target="_blank">Simple HTTPS</a></li>
</ul>


Additional files made for this version:
src\com\commonsware\empublite\DownloadPrefs.java (This file states members of Application's shared preferences)
res\layout\simplecontent.xml (Required for \src\com\commonsware\empublite\NoteActivity.java and \src\com\commonsware\empublite\SimpleContentActivity.java
in order to apply @FragmentById)

Feel free to contact me and ask me qustions.
