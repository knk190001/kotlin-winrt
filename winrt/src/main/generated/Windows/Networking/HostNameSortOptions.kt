package Windows.Networking

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

@ABIMarker(HostNameSortOptions.ABI::class)
@Signature("enum(Windows.Networking.HostNameSortOptions;u4)")
@WinRTByReference(brClass = HostNameSortOptions.ByReference::class)
public enum class HostNameSortOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  OptimizeForLongConnections(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HostNameSortOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      2 -> OptimizeForLongConnections
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HostNameSortOptions> {
    public fun setValue(newValue: HostNameSortOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HostNameSortOptions =
        HostNameSortOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HostNameSortOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HostNameSortOptions =
        HostNameSortOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: HostNameSortOptions): Int = obj.value
  }
}
