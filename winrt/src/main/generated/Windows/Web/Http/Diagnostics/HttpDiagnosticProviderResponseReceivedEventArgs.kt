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

@ABIMarker(HttpDiagnosticProviderResponseReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Web.Http.Diagnostics.HttpDiagnosticProviderResponseReceivedEventArgs;{a0a2566c-ab5f-4d66-bb2d-084cf41635d0})")
@WinRTByReference(brClass = HttpDiagnosticProviderResponseReceivedEventArgs.ByReference::class)
public class HttpDiagnosticProviderResponseReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpDiagnosticProviderResponseReceivedEventArgs.WithDefault, IWinRTObject {
  private val __1466260521_Interface: IHttpDiagnosticProviderResponseReceivedEventArgs.WithDefault
      by lazy {
    as_1466260521()
  }


  public override val __1466260521_Ptr: JNAPointer? by lazy {
    __1466260521_Interface.__1466260521_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1466260521_Interface)

  private fun as_1466260521(): IHttpDiagnosticProviderResponseReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHttpDiagnosticProviderResponseReceivedEventArgs.ABI.makeIHttpDiagnosticProviderResponseReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpDiagnosticProviderResponseReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpDiagnosticProviderResponseReceivedEventArgs.ABI.makeIHttpDiagnosticProviderResponseReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpDiagnosticProviderResponseReceivedEventArgs> {
    public override fun getValue() =
        HttpDiagnosticProviderResponseReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HttpDiagnosticProviderResponseReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpDiagnosticProviderResponseReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HttpDiagnosticProviderResponseReceivedEventArgs {
      val address = segment.toRawLongValue()
      return HttpDiagnosticProviderResponseReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HttpDiagnosticProviderResponseReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
