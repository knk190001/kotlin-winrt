package Windows.ApplicationModel.Contacts

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

@ABIMarker(PinnedContactSurface.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.PinnedContactSurface;i4)")
@WinRTByReference(brClass = PinnedContactSurface.ByReference::class)
public enum class PinnedContactSurface(
  public val value: Int
) : NativeMapped {
  StartMenu(0),
  Taskbar(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PinnedContactSurface {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> StartMenu
      1 -> Taskbar
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PinnedContactSurface> {
    public fun setValue(newValue: PinnedContactSurface): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PinnedContactSurface =
        PinnedContactSurface.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PinnedContactSurface, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PinnedContactSurface =
        PinnedContactSurface.values()[0].fromNative(value, null)

    public override fun toNative(obj: PinnedContactSurface): Int = obj.value
  }
}
