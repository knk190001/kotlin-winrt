package Windows.Web.Http.Diagnostics

import Windows.System.Diagnostics.ProcessDiagnosticInfo
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(HttpDiagnosticProvider.ABI::class)
@Signature("rc(Windows.Web.Http.Diagnostics.HttpDiagnosticProvider;{bd811501-a056-4d39-b174-833b7b03b02c})")
@WinRTByReference(brClass = HttpDiagnosticProvider.ByReference::class)
public class HttpDiagnosticProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpDiagnosticProvider.WithDefault, IWinRTObject {
  private val __629624514_Interface: IHttpDiagnosticProvider.WithDefault by lazy {
    as_629624514()
  }


  public override val __629624514_Ptr: JNAPointer? by lazy {
    __629624514_Interface.__629624514_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__629624514_Interface)

  private fun as_629624514(): IHttpDiagnosticProvider.WithDefault {
    if(pointer == NULL) {
      return(IHttpDiagnosticProvider.ABI.makeIHttpDiagnosticProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpDiagnosticProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpDiagnosticProvider.ABI.makeIHttpDiagnosticProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpDiagnosticProvider> {
    public override fun getValue() = HttpDiagnosticProvider(pointer.getPointer(0))

    public fun setValue(value: HttpDiagnosticProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpDiagnosticProvider, MemoryAddress> {
    public val IHttpDiagnosticProviderStatics_Instance: IHttpDiagnosticProviderStatics by lazy {
      createIHttpDiagnosticProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpDiagnosticProviderStatics(): IHttpDiagnosticProviderStatics {
      val refiid = Guid.REFIID(IHttpDiagnosticProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Diagnostics.HttpDiagnosticProvider".toHandle(),refiid,interfacePtr)
      val result =
          IHttpDiagnosticProviderStatics.ABI.makeIHttpDiagnosticProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HttpDiagnosticProvider {
      val address = segment.toRawLongValue()
      return HttpDiagnosticProvider(Pointer(address))
    }

    public override fun toNative(obj: HttpDiagnosticProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromProcessDiagnosticInfo(processDiagnosticInfo: ProcessDiagnosticInfo) =
        ABI.IHttpDiagnosticProviderStatics_Instance.CreateFromProcessDiagnosticInfo(processDiagnosticInfo)
  }
}
