package Windows.Storage.Provider

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(StorageProviderPopulationPolicy.ABI::class)
@Signature("enum(Windows.Storage.Provider.StorageProviderPopulationPolicy;i4)")
@WinRTByReference(brClass = StorageProviderPopulationPolicy.ByReference::class)
public enum class StorageProviderPopulationPolicy(
  public val value: Int
) : NativeMapped {
  Full(1),
  AlwaysFull(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorageProviderPopulationPolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> Full
      2 -> AlwaysFull
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<StorageProviderPopulationPolicy> {
    public fun setValue(newValue: StorageProviderPopulationPolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorageProviderPopulationPolicy =
        StorageProviderPopulationPolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorageProviderPopulationPolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorageProviderPopulationPolicy =
        StorageProviderPopulationPolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorageProviderPopulationPolicy): Int = obj.value
  }
}
