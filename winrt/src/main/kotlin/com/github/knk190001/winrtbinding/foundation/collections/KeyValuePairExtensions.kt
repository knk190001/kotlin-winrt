package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IKeyValuePair

operator fun <K, V> IKeyValuePair<K, V>.component1(): K = get_Key()
operator fun <K, V> IKeyValuePair<K, V>.component2(): V = get_Value()