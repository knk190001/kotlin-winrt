package Windows.UI.Input.Inking.Core

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

@ABIMarker(CoreWetStrokeDisposition.ABI::class)
@Signature("enum(Windows.UI.Input.Inking.Core.CoreWetStrokeDisposition;i4)")
@WinRTByReference(brClass = CoreWetStrokeDisposition.ByReference::class)
public enum class CoreWetStrokeDisposition(
  public val value: Int
) : NativeMapped {
  Inking(0),
  Completed(1),
  Canceled(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWetStrokeDisposition {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Inking
      1 -> Completed
      2 -> Canceled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreWetStrokeDisposition>
      {
    public fun setValue(newValue: CoreWetStrokeDisposition): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWetStrokeDisposition =
        CoreWetStrokeDisposition.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWetStrokeDisposition, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWetStrokeDisposition =
        CoreWetStrokeDisposition.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWetStrokeDisposition): Int = obj.value
  }
}
