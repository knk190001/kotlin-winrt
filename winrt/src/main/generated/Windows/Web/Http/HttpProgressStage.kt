package Windows.Web.Http

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

@ABIMarker(HttpProgressStage.ABI::class)
@Signature("enum(Windows.Web.Http.HttpProgressStage;i4)")
@WinRTByReference(brClass = HttpProgressStage.ByReference::class)
public enum class HttpProgressStage(
  public val value: Int
) : NativeMapped {
  None(0),
  DetectingProxy(10),
  ResolvingName(20),
  ConnectingToServer(30),
  NegotiatingSsl(40),
  SendingHeaders(50),
  SendingContent(60),
  WaitingForResponse(70),
  ReceivingHeaders(80),
  ReceivingContent(90),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HttpProgressStage {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      10 -> DetectingProxy
      20 -> ResolvingName
      30 -> ConnectingToServer
      40 -> NegotiatingSsl
      50 -> SendingHeaders
      60 -> SendingContent
      70 -> WaitingForResponse
      80 -> ReceivingHeaders
      90 -> ReceivingContent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HttpProgressStage> {
    public fun setValue(newValue: HttpProgressStage): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HttpProgressStage =
        HttpProgressStage.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HttpProgressStage, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HttpProgressStage =
        HttpProgressStage.values()[0].fromNative(value, null)

    public override fun toNative(obj: HttpProgressStage): Int = obj.value
  }
}
