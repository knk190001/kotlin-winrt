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

@ABIMarker(StorageProviderHardlinkPolicy.ABI::class)
@Signature("enum(Windows.Storage.Provider.StorageProviderHardlinkPolicy;u4)")
@WinRTByReference(brClass = StorageProviderHardlinkPolicy.ByReference::class)
public enum class StorageProviderHardlinkPolicy(
  public val value: Int
) : NativeMapped {
  None(0),
  Allowed(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorageProviderHardlinkPolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Allowed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<StorageProviderHardlinkPolicy> {
    public fun setValue(newValue: StorageProviderHardlinkPolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorageProviderHardlinkPolicy =
        StorageProviderHardlinkPolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorageProviderHardlinkPolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorageProviderHardlinkPolicy =
        StorageProviderHardlinkPolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorageProviderHardlinkPolicy): Int = obj.value
  }
}
