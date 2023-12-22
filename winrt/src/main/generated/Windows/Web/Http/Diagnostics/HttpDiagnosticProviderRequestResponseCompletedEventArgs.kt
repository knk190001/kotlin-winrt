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

@ABIMarker(HttpDiagnosticProviderRequestResponseCompletedEventArgs.ABI::class)
@Signature("rc(Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseCompletedEventArgs;{735f98ee-94f6-4532-b26e-61e1b1e4efd4})")
@WinRTByReference(brClass =
    HttpDiagnosticProviderRequestResponseCompletedEventArgs.ByReference::class)
public class HttpDiagnosticProviderRequestResponseCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpDiagnosticProviderRequestResponseCompletedEventArgs.WithDefault,
    IWinRTObject {
  private val __1017158914_Interface:
      IHttpDiagnosticProviderRequestResponseCompletedEventArgs.WithDefault by lazy {
    as_1017158914()
  }


  public override val __1017158914_Ptr: JNAPointer? by lazy {
    __1017158914_Interface.__1017158914_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1017158914_Interface)

  private fun as_1017158914():
      IHttpDiagnosticProviderRequestResponseCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHttpDiagnosticProviderRequestResponseCompletedEventArgs.ABI.makeIHttpDiagnosticProviderRequestResponseCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpDiagnosticProviderRequestResponseCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpDiagnosticProviderRequestResponseCompletedEventArgs.ABI.makeIHttpDiagnosticProviderRequestResponseCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpDiagnosticProviderRequestResponseCompletedEventArgs> {
    public override fun getValue() =
        HttpDiagnosticProviderRequestResponseCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HttpDiagnosticProviderRequestResponseCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpDiagnosticProviderRequestResponseCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HttpDiagnosticProviderRequestResponseCompletedEventArgs {
      val address = segment.toRawLongValue()
      return HttpDiagnosticProviderRequestResponseCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HttpDiagnosticProviderRequestResponseCompletedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
