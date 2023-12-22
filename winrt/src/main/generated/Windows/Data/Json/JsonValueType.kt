package Windows.Data.Json

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

@ABIMarker(JsonValueType.ABI::class)
@Signature("enum(Windows.Data.Json.JsonValueType;i4)")
@WinRTByReference(brClass = JsonValueType.ByReference::class)
public enum class JsonValueType(
  public val value: Int
) : NativeMapped {
  Null(0),
  Boolean(1),
  Number(2),
  String(3),
  Array(4),
  Object(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      JsonValueType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Null
      1 -> Boolean
      2 -> Number
      3 -> String
      4 -> Array
      5 -> Object
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<JsonValueType> {
    public fun setValue(newValue: JsonValueType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): JsonValueType =
        JsonValueType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<JsonValueType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): JsonValueType =
        JsonValueType.values()[0].fromNative(value, null)

    public override fun toNative(obj: JsonValueType): Int = obj.value
  }
}
