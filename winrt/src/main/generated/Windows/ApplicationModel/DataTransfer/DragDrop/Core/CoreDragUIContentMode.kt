package Windows.ApplicationModel.DataTransfer.DragDrop.Core

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

@ABIMarker(CoreDragUIContentMode.ABI::class)
@Signature("enum(Windows.ApplicationModel.DataTransfer.DragDrop.Core.CoreDragUIContentMode;u4)")
@WinRTByReference(brClass = CoreDragUIContentMode.ByReference::class)
public enum class CoreDragUIContentMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Deferred(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreDragUIContentMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Deferred
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreDragUIContentMode> {
    public fun setValue(newValue: CoreDragUIContentMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreDragUIContentMode =
        CoreDragUIContentMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreDragUIContentMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreDragUIContentMode =
        CoreDragUIContentMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreDragUIContentMode): Int = obj.value
  }
}
