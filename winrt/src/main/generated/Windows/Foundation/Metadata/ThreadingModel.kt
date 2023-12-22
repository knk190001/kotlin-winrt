package Windows.Foundation.Metadata

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

@ABIMarker(ThreadingModel.ABI::class)
@Signature("enum(Windows.Foundation.Metadata.ThreadingModel;i4)")
@WinRTByReference(brClass = ThreadingModel.ByReference::class)
public enum class ThreadingModel(
  public val value: Int
) : NativeMapped {
  STA(1),
  MTA(2),
  Both(3),
  InvalidThreading(0),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ThreadingModel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> STA
      2 -> MTA
      3 -> Both
      0 -> InvalidThreading
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ThreadingModel> {
    public fun setValue(newValue: ThreadingModel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ThreadingModel =
        ThreadingModel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ThreadingModel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ThreadingModel =
        ThreadingModel.values()[0].fromNative(value, null)

    public override fun toNative(obj: ThreadingModel): Int = obj.value
  }
}
