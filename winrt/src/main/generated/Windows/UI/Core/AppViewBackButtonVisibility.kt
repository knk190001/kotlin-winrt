package Windows.UI.Core

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

@ABIMarker(AppViewBackButtonVisibility.ABI::class)
@Signature("enum(Windows.UI.Core.AppViewBackButtonVisibility;i4)")
@WinRTByReference(brClass = AppViewBackButtonVisibility.ByReference::class)
public enum class AppViewBackButtonVisibility(
  public val value: Int
) : NativeMapped {
  Visible(0),
  Collapsed(1),
  Disabled(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppViewBackButtonVisibility {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Visible
      1 -> Collapsed
      2 -> Disabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppViewBackButtonVisibility> {
    public fun setValue(newValue: AppViewBackButtonVisibility): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppViewBackButtonVisibility =
        AppViewBackButtonVisibility.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppViewBackButtonVisibility, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppViewBackButtonVisibility =
        AppViewBackButtonVisibility.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppViewBackButtonVisibility): Int = obj.value
  }
}
