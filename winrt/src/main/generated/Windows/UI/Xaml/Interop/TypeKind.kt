package Windows.UI.Xaml.Interop

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

@ABIMarker(TypeKind.ABI::class)
@Signature("enum(Windows.UI.Xaml.Interop.TypeKind;i4)")
@WinRTByReference(brClass = TypeKind.ByReference::class)
public enum class TypeKind(
  public val value: Int
) : NativeMapped {
  Primitive(0),
  Metadata(1),
  Custom(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): TypeKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Primitive
      1 -> Metadata
      2 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TypeKind> {
    public fun setValue(newValue: TypeKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TypeKind =
        TypeKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TypeKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TypeKind =
        TypeKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: TypeKind): Int = obj.value
  }
}
