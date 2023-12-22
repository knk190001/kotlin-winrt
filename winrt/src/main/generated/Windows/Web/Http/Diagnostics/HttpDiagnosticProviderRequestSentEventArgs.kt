package Windows.Web.Http.Diagnostics

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HttpDiagnosticProviderRequestSentEventArgs.ABI::class)
@Signature("rc(Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestSentEventArgs;{3f5196d0-4c1f-4ebe-a57a-06930771c50d})")
@WinRTByReference(brClass = HttpDiagnosticProviderRequestSentEventArgs.ByReference::class)
public class HttpDiagnosticProviderRequestSentEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpDiagnosticProviderRequestSentEventArgs.WithDefault, IWinRTObject {
  private val __329568786_Interface: IHttpDiagnosticProviderRequestSentEventArgs.WithDefault by
      lazy {
    as_329568786()
  }


  public override val __329568786_Ptr: JNAPointer? by lazy {
    __329568786_Interface.__329568786_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__329568786_Interface)

  private fun as_329568786(): IHttpDiagnosticProviderRequestSentEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHttpDiagnosticProviderRequestSentEventArgs.ABI.makeIHttpDiagnosticProviderRequestSentEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpDiagnosticProviderRequestSentEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpDiagnosticProviderRequestSentEventArgs.ABI.makeIHttpDiagnosticProviderRequestSentEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpDiagnosticProviderRequestSentEventArgs> {
    public override fun getValue() =
        HttpDiagnosticProviderRequestSentEventArgs(pointer.getPointer(0))

    public fun setValue(value: HttpDiagnosticProviderRequestSentEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpDiagnosticProviderRequestSentEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HttpDiagnosticProviderRequestSentEventArgs {
      val address = segment.toRawLongValue()
      return HttpDiagnosticProviderRequestSentEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HttpDiagnosticProviderRequestSentEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
