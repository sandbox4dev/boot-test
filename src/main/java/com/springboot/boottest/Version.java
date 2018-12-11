package com.springboot.boottest;

import java.util.Formatter;

public final class Version {

    private static Version instance = null;

    private final int maj = 0;
    private final int release = 1;
    private final int branch = 0;
    private final int patch = 0;
    private final long build = 20181211L;

    private final int buildYear = /* year   */ 2018,
            buildMonth = /* month  */ 12,
            buildDay = /* day    */ 11,
            buildHour = /* hour   */ 13,
            buildMinute = /* minute */ 30;

    private transient String stringRep=null;
    private transient Integer savedHashCode=null;


    private Version()
    {
    }

    public static Version getInstance()
    {
        if(instance == null)
            synchronized(Version.class)
            {
                if(instance == null)
                    instance=new Version();
            }
        return instance;
    }

    public int getMaj()
    {
        return maj;
    }

    public int getRelease()
    {
        return release;
    }

    public int getBranch()
    {
        return branch;
    }

    public int getPatch()
    {
        return patch;
    }

    public long getBuild()
    {
        return build;
    }

    public int getBuildYear()
    {
        return buildYear;
    }

    public int getBuildMonth()
    {
        return buildMonth;
    }

    public int getBuildDay()
    {
        return buildDay;
    }

    public int getBuildHour()
    {
        return buildHour;
    }

    public int getBuildMinute()
    {
        return buildMinute;
    }
    public String getVersionString()
    {
        if(stringRep == null)
        {
            synchronized(this)
            {
                if(stringRep == null)
                {
                    StringBuilder sb=new StringBuilder();
                    sb.append(maj);
                    sb.append(".");
                    Formatter formatter=new Formatter(sb);
                    formatter.format("%02d",release);
                    sb.append(".");
                    if(branch != 0 || patch != 0)
                    {
                        sb.append(branch);
                        sb.append(".");
                        if(patch != 0)
                        {
                            sb.append(patch);
                            sb.append(".");
                        }
                    }
                    sb.append(build);
                    stringRep=sb.toString();
                }
            }
        }
        return stringRep;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Version))
            return false;
        Version v=(Version)obj;
        return maj == v.maj &&
                release == v.release &&
                branch == v.branch &&
                patch == v.patch &&
                build == v.build;
    }

    @Override
    public int hashCode()
    {
        if(savedHashCode == null)
        {
            synchronized(this)
            {
                if(savedHashCode == null)
                {
                    int result=17;
                    result=37*result + maj;
                    result=37*result + release;
                    result=37*result + branch;
                    result=37*result + patch;
                    result=37*result + Long.valueOf(build).hashCode();
                    savedHashCode=Integer.valueOf(result);
                }
            }
        }
        return savedHashCode.intValue();
    }

    @Override
    public String toString()
    {
        return getVersionString();
    }

}
