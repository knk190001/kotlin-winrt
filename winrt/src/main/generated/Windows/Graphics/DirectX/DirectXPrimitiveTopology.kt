package Windows.Graphics.DirectX

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

@ABIMarker(DirectXPrimitiveTopology.ABI::class)
@Signature("enum(Windows.Graphics.DirectX.DirectXPrimitiveTopology;i4)")
@WinRTByReference(brClass = DirectXPrimitiveTopology.ByReference::class)
public enum class DirectXPrimitiveTopology(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  PointList(1),
  LineList(2),
  LineStrip(3),
  TriangleList(4),
  TriangleStrip(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DirectXPrimitiveTopology {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> PointList
      2 -> LineList
      3 -> LineStrip
      4 -> TriangleList
      5 -> TriangleStrip
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DirectXPrimitiveTopology>
      {
    public fun setValue(newValue: DirectXPrimitiveTopology): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DirectXPrimitiveTopology =
        DirectXPrimitiveTopology.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DirectXPrimitiveTopology, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DirectXPrimitiveTopology =
        DirectXPrimitiveTopology.values()[0].fromNative(value, null)

    public override fun toNative(obj: DirectXPrimitiveTopology): Int = obj.value
  }
}
