package Windows.Graphics.Printing3D

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

@ABIMarker(Printing3DObjectType.ABI::class)
@Signature("enum(Windows.Graphics.Printing3D.Printing3DObjectType;i4)")
@WinRTByReference(brClass = Printing3DObjectType.ByReference::class)
public enum class Printing3DObjectType(
  public val value: Int
) : NativeMapped {
  Model(0),
  Support(1),
  Others(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Printing3DObjectType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Model
      1 -> Support
      2 -> Others
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Printing3DObjectType> {
    public fun setValue(newValue: Printing3DObjectType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Printing3DObjectType =
        Printing3DObjectType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Printing3DObjectType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Printing3DObjectType =
        Printing3DObjectType.values()[0].fromNative(value, null)

    public override fun toNative(obj: Printing3DObjectType): Int = obj.value
  }
}
