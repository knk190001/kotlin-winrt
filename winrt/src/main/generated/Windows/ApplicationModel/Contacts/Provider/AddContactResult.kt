package Windows.ApplicationModel.Contacts.Provider

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

@ABIMarker(AddContactResult.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.Provider.AddContactResult;i4)")
@WinRTByReference(brClass = AddContactResult.ByReference::class)
public enum class AddContactResult(
  public val value: Int
) : NativeMapped {
  Added(0),
  AlreadyAdded(1),
  Unavailable(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AddContactResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Added
      1 -> AlreadyAdded
      2 -> Unavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AddContactResult> {
    public fun setValue(newValue: AddContactResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AddContactResult =
        AddContactResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AddContactResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AddContactResult =
        AddContactResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: AddContactResult): Int = obj.value
  }
}
