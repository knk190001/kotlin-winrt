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

@ABIMarker(StorageProviderHydrationPolicy.ABI::class)
@Signature("enum(Windows.Storage.Provider.StorageProviderHydrationPolicy;i4)")
@WinRTByReference(brClass = StorageProviderHydrationPolicy.ByReference::class)
public enum class StorageProviderHydrationPolicy(
  public val value: Int
) : NativeMapped {
  Partial(0),
  Progressive(1),
  Full(2),
  AlwaysFull(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorageProviderHydrationPolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Partial
      1 -> Progressive
      2 -> Full
      3 -> AlwaysFull
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<StorageProviderHydrationPolicy> {
    public fun setValue(newValue: StorageProviderHydrationPolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorageProviderHydrationPolicy =
        StorageProviderHydrationPolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorageProviderHydrationPolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorageProviderHydrationPolicy =
        StorageProviderHydrationPolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorageProviderHydrationPolicy): Int = obj.value
  }
}
