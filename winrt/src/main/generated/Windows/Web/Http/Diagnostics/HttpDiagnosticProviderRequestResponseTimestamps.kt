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

@ABIMarker(HttpDiagnosticProviderRequestResponseTimestamps.ABI::class)
@Signature("rc(Windows.Web.Http.Diagnostics.HttpDiagnosticProviderRequestResponseTimestamps;{e0afde10-55cf-4c01-91d4-a20557d849f0})")
@WinRTByReference(brClass = HttpDiagnosticProviderRequestResponseTimestamps.ByReference::class)
public class HttpDiagnosticProviderRequestResponseTimestamps(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpDiagnosticProviderRequestResponseTimestamps.WithDefault, IWinRTObject {
  private val __829228687_Interface: IHttpDiagnosticProviderRequestResponseTimestamps.WithDefault by
      lazy {
    as_829228687()
  }


  public override val __829228687_Ptr: JNAPointer? by lazy {
    __829228687_Interface.__829228687_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__829228687_Interface)

  private fun as_829228687(): IHttpDiagnosticProviderRequestResponseTimestamps.WithDefault {
    if(pointer == NULL) {
      return(IHttpDiagnosticProviderRequestResponseTimestamps.ABI.makeIHttpDiagnosticProviderRequestResponseTimestamps(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpDiagnosticProviderRequestResponseTimestamps>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpDiagnosticProviderRequestResponseTimestamps.ABI.makeIHttpDiagnosticProviderRequestResponseTimestamps(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpDiagnosticProviderRequestResponseTimestamps> {
    public override fun getValue() =
        HttpDiagnosticProviderRequestResponseTimestamps(pointer.getPointer(0))

    public fun setValue(value: HttpDiagnosticProviderRequestResponseTimestamps): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpDiagnosticProviderRequestResponseTimestamps, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        HttpDiagnosticProviderRequestResponseTimestamps {
      val address = segment.toRawLongValue()
      return HttpDiagnosticProviderRequestResponseTimestamps(Pointer(address))
    }

    public override fun toNative(obj: HttpDiagnosticProviderRequestResponseTimestamps):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
