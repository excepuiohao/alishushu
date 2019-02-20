package com.alishushu.bean;

public class Messages {
	 private String systeminfoid;

	    private String releasedate;

	    private String sysinfocontext;

	    private String managerid;
	    
	    private String mname;
	    

	  
		@Override
		public String toString() {
			return "Messages [systeminfoid=" + systeminfoid + ", releasedate="
					+ releasedate + ", sysinfocontext=" + sysinfocontext
					+ ", managerid=" + managerid + ", mname=" + mname + "]";
		}

		public Messages() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getMname() {
			return mname;
		}

		public void setMname(String mname) {
			this.mname = mname;
		}

		public String getSysteminfoid() {
	        return systeminfoid;
	    }

	    public void setSysteminfoid(String systeminfoid) {
	        this.systeminfoid = systeminfoid == null ? null : systeminfoid.trim();
	    }

	    public String getReleasedate() {
	        return releasedate;
	    }

	    public void setReleasedate(String releasedate) {
	        this.releasedate = releasedate == null ? null : releasedate.trim();
	    }

	    public String getSysinfocontext() {
	        return sysinfocontext;
	    }

	    public void setSysinfocontext(String sysinfocontext) {
	        this.sysinfocontext = sysinfocontext == null ? null : sysinfocontext.trim();
	    }

	    public String getManagerid() {
	        return managerid;
	    }

	    public void setManagerid(String managerid) {
	        this.managerid = managerid == null ? null : managerid.trim();
	    }

		
}
