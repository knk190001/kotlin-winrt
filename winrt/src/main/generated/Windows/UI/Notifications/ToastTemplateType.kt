package Windows.UI.Notifications

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

@ABIMarker(ToastTemplateType.ABI::class)
@Signature("enum(Windows.UI.Notifications.ToastTemplateType;i4)")
@WinRTByReference(brClass = ToastTemplateType.ByReference::class)
public enum class ToastTemplateType(
  public val value: Int
) : NativeMapped {
  ToastImageAndText01(0),
  ToastImageAndText02(1),
  ToastImageAndText03(2),
  ToastImageAndText04(3),
  ToastText01(4),
  ToastText02(5),
  ToastText03(6),
  ToastText04(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ToastTemplateType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ToastImageAndText01
      1 -> ToastImageAndText02
      2 -> ToastImageAndText03
      3 -> ToastImageAndText04
      4 -> ToastText01
      5 -> ToastText02
      6 -> ToastText03
      7 -> ToastText04
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ToastTemplateType> {
    public fun setValue(newValue: ToastTemplateType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ToastTemplateType =
        ToastTemplateType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ToastTemplateType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ToastTemplateType =
        ToastTemplateType.values()[0].fromNative(value, null)

    public override fun toNative(obj: ToastTemplateType): Int = obj.value
  }
}
