package Windows.ApplicationModel

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

@ABIMarker(PackageUpdateAvailability.ABI::class)
@Signature("enum(Windows.ApplicationModel.PackageUpdateAvailability;i4)")
@WinRTByReference(brClass = PackageUpdateAvailability.ByReference::class)
public enum class PackageUpdateAvailability(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  NoUpdates(1),
  Available(2),
  Required(3),
  Error(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PackageUpdateAvailability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> NoUpdates
      2 -> Available
      3 -> Required
      4 -> Error
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PackageUpdateAvailability>
      {
    public fun setValue(newValue: PackageUpdateAvailability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PackageUpdateAvailability =
        PackageUpdateAvailability.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PackageUpdateAvailability, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PackageUpdateAvailability =
        PackageUpdateAvailability.values()[0].fromNative(value, null)

    public override fun toNative(obj: PackageUpdateAvailability): Int = obj.value
  }
}
