package Windows.ApplicationModel.Background

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

@ABIMarker(SystemConditionType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.SystemConditionType;i4)")
@WinRTByReference(brClass = SystemConditionType.ByReference::class)
public enum class SystemConditionType(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  UserPresent(1),
  UserNotPresent(2),
  InternetAvailable(3),
  InternetNotAvailable(4),
  SessionConnected(5),
  SessionDisconnected(6),
  FreeNetworkAvailable(7),
  BackgroundWorkCostNotHigh(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SystemConditionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      1 -> UserPresent
      2 -> UserNotPresent
      3 -> InternetAvailable
      4 -> InternetNotAvailable
      5 -> SessionConnected
      6 -> SessionDisconnected
      7 -> FreeNetworkAvailable
      8 -> BackgroundWorkCostNotHigh
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SystemConditionType> {
    public fun setValue(newValue: SystemConditionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SystemConditionType =
        SystemConditionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SystemConditionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SystemConditionType =
        SystemConditionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SystemConditionType): Int = obj.value
  }
}
