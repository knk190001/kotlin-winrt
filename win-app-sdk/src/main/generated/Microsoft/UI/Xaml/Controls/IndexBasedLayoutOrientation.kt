package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IndexBasedLayoutOrientation.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.IndexBasedLayoutOrientation;i4)")
@WinRTByReference(brClass = IndexBasedLayoutOrientation.ByReference::class)
public enum class IndexBasedLayoutOrientation(
  public val value: Int
) : NativeMapped {
  None(0),
  TopToBottom(1),
  LeftToRight(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IndexBasedLayoutOrientation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> TopToBottom
      2 -> LeftToRight
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<IndexBasedLayoutOrientation> {
    public fun setValue(newValue: IndexBasedLayoutOrientation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IndexBasedLayoutOrientation =
        IndexBasedLayoutOrientation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IndexBasedLayoutOrientation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IndexBasedLayoutOrientation =
        IndexBasedLayoutOrientation.values()[0].fromNative(value, null)

    public override fun toNative(obj: IndexBasedLayoutOrientation): Int = obj.value
  }
}
