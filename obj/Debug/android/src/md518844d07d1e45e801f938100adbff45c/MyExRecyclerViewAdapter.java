package md518844d07d1e45e801f938100adbff45c;


public class MyExRecyclerViewAdapter
	extends md5024271f292c652587ebde13297e986d0.ExpandableRecyclerAdapter_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ExpandableRecyclerViewDemo.Adapter.MyExRecyclerViewAdapter, ExpandableRecyclerViewDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MyExRecyclerViewAdapter.class, __md_methods);
	}


	public MyExRecyclerViewAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MyExRecyclerViewAdapter.class)
			mono.android.TypeManager.Activate ("ExpandableRecyclerViewDemo.Adapter.MyExRecyclerViewAdapter, ExpandableRecyclerViewDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
