package Windows.ApplicationModel.Background

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

@ABIMarker(BackgroundAccessRequestKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.BackgroundAccessRequestKind;i4)")
@WinRTByReference(brClass = BackgroundAccessRequestKind.ByReference::class)
public enum class BackgroundAccessRequestKind(
  public val value: Int
) : NativeMapped {
  AlwaysAllowed(0),
  AllowedSubjectToSystemPolicy(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BackgroundAccessRequestKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AlwaysAllowed
      1 -> AllowedSubjectToSystemPolicy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BackgroundAccessRequestKind> {
    public fun setValue(newValue: BackgroundAccessRequestKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BackgroundAccessRequestKind =
        BackgroundAccessRequestKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BackgroundAccessRequestKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BackgroundAccessRequestKind =
        BackgroundAccessRequestKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: BackgroundAccessRequestKind): Int = obj.value
  }
}
