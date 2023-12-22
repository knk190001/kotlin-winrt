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

@ABIMarker(HttpDiagnosticSourceLocation.ABI::class)
@Signature("rc(Windows.Web.Http.Diagnostics.HttpDiagnosticSourceLocation;{54a9d260-8860-423f-b6fa-d77716f647a7})")
@WinRTByReference(brClass = HttpDiagnosticSourceLocation.ByReference::class)
public class HttpDiagnosticSourceLocation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpDiagnosticSourceLocation.WithDefault, IWinRTObject {
  private val __1724752259_Interface: IHttpDiagnosticSourceLocation.WithDefault by lazy {
    as_1724752259()
  }


  public override val __1724752259_Ptr: JNAPointer? by lazy {
    __1724752259_Interface.__1724752259_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1724752259_Interface)

  private fun as_1724752259(): IHttpDiagnosticSourceLocation.WithDefault {
    if(pointer == NULL) {
      return(IHttpDiagnosticSourceLocation.ABI.makeIHttpDiagnosticSourceLocation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpDiagnosticSourceLocation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpDiagnosticSourceLocation.ABI.makeIHttpDiagnosticSourceLocation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpDiagnosticSourceLocation> {
    public override fun getValue() = HttpDiagnosticSourceLocation(pointer.getPointer(0))

    public fun setValue(value: HttpDiagnosticSourceLocation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpDiagnosticSourceLocation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpDiagnosticSourceLocation {
      val address = segment.toRawLongValue()
      return HttpDiagnosticSourceLocation(Pointer(address))
    }

    public override fun toNative(obj: HttpDiagnosticSourceLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
