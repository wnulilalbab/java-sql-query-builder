package com.github.danfickle.javasqlquerybuilder.generic;

import com.github.danfickle.javasqlquerybuilder.QbField;

class QbStdFieldImp implements QbField
{
	private final String m_fieldName;

	QbStdFieldImp(String field)
	{
		m_fieldName = field;
	}
	
	@Override
	public String toString() 
	{
		return '`' + m_fieldName + '`';
	}
}
