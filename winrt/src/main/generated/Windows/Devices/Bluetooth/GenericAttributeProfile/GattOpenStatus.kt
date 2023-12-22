package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattOpenStatus.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.GenericAttributeProfile.GattOpenStatus;i4)")
@WinRTByReference(brClass = GattOpenStatus.ByReference::class)
public enum class GattOpenStatus(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  Success(1),
  AlreadyOpened(2),
  NotFound(3),
  SharingViolation(4),
  AccessDenied(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GattOpenStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Success
      2 -> AlreadyOpened
      3 -> NotFound
      4 -> SharingViolation
      5 -> AccessDenied
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GattOpenStatus> {
    public fun setValue(newValue: GattOpenStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GattOpenStatus =
        GattOpenStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GattOpenStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GattOpenStatus =
        GattOpenStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: GattOpenStatus): Int = obj.value
  }
}
