package Windows.UI.ViewManagement

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

@ABIMarker(ViewSizePreference.ABI::class)
@Signature("enum(Windows.UI.ViewManagement.ViewSizePreference;i4)")
@WinRTByReference(brClass = ViewSizePreference.ByReference::class)
public enum class ViewSizePreference(
  public val value: Int
) : NativeMapped {
  Default(0),
  UseLess(1),
  UseHalf(2),
  UseMore(3),
  UseMinimum(4),
  UseNone(5),
  Custom(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ViewSizePreference {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> UseLess
      2 -> UseHalf
      3 -> UseMore
      4 -> UseMinimum
      5 -> UseNone
      6 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ViewSizePreference> {
    public fun setValue(newValue: ViewSizePreference): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ViewSizePreference =
        ViewSizePreference.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ViewSizePreference, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ViewSizePreference =
        ViewSizePreference.values()[0].fromNative(value, null)

    public override fun toNative(obj: ViewSizePreference): Int = obj.value
  }
}
