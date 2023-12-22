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

@ABIMarker(UIStatus.ABI::class)
@Signature("enum(Windows.Storage.Provider.UIStatus;i4)")
@WinRTByReference(brClass = UIStatus.ByReference::class)
public enum class UIStatus(
  public val value: Int
) : NativeMapped {
  Unavailable(0),
  Hidden(1),
  Visible(2),
  Complete(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): UIStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unavailable
      1 -> Hidden
      2 -> Visible
      3 -> Complete
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UIStatus> {
    public fun setValue(newValue: UIStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UIStatus =
        UIStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UIStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UIStatus =
        UIStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: UIStatus): Int = obj.value
  }
}
