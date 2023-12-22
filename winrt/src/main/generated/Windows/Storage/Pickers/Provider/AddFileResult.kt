package Windows.Storage.Pickers.Provider

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

@ABIMarker(AddFileResult.ABI::class)
@Signature("enum(Windows.Storage.Pickers.Provider.AddFileResult;i4)")
@WinRTByReference(brClass = AddFileResult.ByReference::class)
public enum class AddFileResult(
  public val value: Int
) : NativeMapped {
  Added(0),
  AlreadyAdded(1),
  NotAllowed(2),
  Unavailable(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AddFileResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Added
      1 -> AlreadyAdded
      2 -> NotAllowed
      3 -> Unavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AddFileResult> {
    public fun setValue(newValue: AddFileResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AddFileResult =
        AddFileResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AddFileResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AddFileResult =
        AddFileResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: AddFileResult): Int = obj.value
  }
}
