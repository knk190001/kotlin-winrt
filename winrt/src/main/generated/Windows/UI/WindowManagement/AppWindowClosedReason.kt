package Windows.UI.WindowManagement

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

@ABIMarker(AppWindowClosedReason.ABI::class)
@Signature("enum(Windows.UI.WindowManagement.AppWindowClosedReason;i4)")
@WinRTByReference(brClass = AppWindowClosedReason.ByReference::class)
public enum class AppWindowClosedReason(
  public val value: Int
) : NativeMapped {
  Other(0),
  AppInitiated(1),
  UserInitiated(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppWindowClosedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Other
      1 -> AppInitiated
      2 -> UserInitiated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppWindowClosedReason> {
    public fun setValue(newValue: AppWindowClosedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppWindowClosedReason =
        AppWindowClosedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppWindowClosedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppWindowClosedReason =
        AppWindowClosedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppWindowClosedReason): Int = obj.value
  }
}
