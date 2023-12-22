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

@ABIMarker(ToastHistoryChangedType.ABI::class)
@Signature("enum(Windows.UI.Notifications.ToastHistoryChangedType;i4)")
@WinRTByReference(brClass = ToastHistoryChangedType.ByReference::class)
public enum class ToastHistoryChangedType(
  public val value: Int
) : NativeMapped {
  Cleared(0),
  Removed(1),
  Expired(2),
  Added(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ToastHistoryChangedType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Cleared
      1 -> Removed
      2 -> Expired
      3 -> Added
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ToastHistoryChangedType> {
    public fun setValue(newValue: ToastHistoryChangedType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ToastHistoryChangedType =
        ToastHistoryChangedType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ToastHistoryChangedType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ToastHistoryChangedType =
        ToastHistoryChangedType.values()[0].fromNative(value, null)

    public override fun toNative(obj: ToastHistoryChangedType): Int = obj.value
  }
}
