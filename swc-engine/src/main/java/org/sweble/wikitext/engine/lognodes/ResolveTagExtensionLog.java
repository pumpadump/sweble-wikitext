package org.sweble.wikitext.engine.lognodes;

import de.fau.cs.osr.ptk.common.ast.AstNodePropertyIterator;

public class ResolveTagExtensionLog
		extends
			LogContainer
{
	private static final long serialVersionUID = 1L;
	
	// =========================================================================
	
	public ResolveTagExtensionLog()
	{
	}
	
	public ResolveTagExtensionLog(String target, boolean success)
	{
		setTarget(target);
		setSuccess(success);
	}
	
	// =========================================================================
	// Properties
	
	private boolean success;
	
	public final boolean getSuccess()
	{
		return this.success;
	}
	
	public final boolean setSuccess(boolean success)
	{
		boolean old = this.success;
		this.success = success;
		return old;
	}
	
	private String target;
	
	public final String getTarget()
	{
		return this.target;
	}
	
	public final String setTarget(String target)
	{
		String old = this.target;
		this.target = target;
		return old;
	}
	
	private String canonical;
	
	public final String getCanonical()
	{
		return this.canonical;
	}
	
	public final String setCanonical(String canonical)
	{
		String old = this.canonical;
		this.canonical = canonical;
		return old;
	}
	
	private Long timeNeeded;
	
	public final Long getTimeNeeded()
	{
		return this.timeNeeded;
	}
	
	public final Long setTimeNeeded(Long timeNeeded)
	{
		Long old = this.timeNeeded;
		this.timeNeeded = timeNeeded;
		return old;
	}
	
	@Override
	public final int getPropertyCount()
	{
		return 4;
	}
	
	@Override
	public final AstNodePropertyIterator propertyIterator()
	{
		return new AstNodePropertyIterator()
		{
			@Override
			protected int getPropertyCount()
			{
				return 4;
			}
			
			@Override
			protected String getName(int index)
			{
				switch (index)
				{
					case 0:
						return "success";
					case 1:
						return "target";
					case 2:
						return "canonical";
					case 3:
						return "timeNeeded";
						
					default:
						throw new IndexOutOfBoundsException();
				}
			}
			
			@Override
			protected Object getValue(int index)
			{
				switch (index)
				{
					case 0:
						return ResolveTagExtensionLog.this.getSuccess();
					case 1:
						return ResolveTagExtensionLog.this.getTarget();
					case 2:
						return ResolveTagExtensionLog.this.getCanonical();
					case 3:
						return ResolveTagExtensionLog.this.getTimeNeeded();
						
					default:
						throw new IndexOutOfBoundsException();
				}
			}
			
			@Override
			protected Object setValue(int index, Object value)
			{
				switch (index)
				{
					case 0:
						return ResolveTagExtensionLog.this.setSuccess((Boolean) value);
					case 1:
						return ResolveTagExtensionLog.this.setTarget((String) value);
					case 2:
						return ResolveTagExtensionLog.this.setCanonical((String) value);
					case 3:
						return ResolveTagExtensionLog.this.setTimeNeeded((Long) value);
						
					default:
						throw new IndexOutOfBoundsException();
				}
			}
		};
	}
}