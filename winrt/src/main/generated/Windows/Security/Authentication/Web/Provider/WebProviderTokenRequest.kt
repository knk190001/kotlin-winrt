package Windows.Security.Authentication.Web.Provider

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

@ABIMarker(WebProviderTokenRequest.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest;{1e18778b-8805-454b-9f11-468d2af1095a})")
@WinRTByReference(brClass = WebProviderTokenRequest.ByReference::class)
public class WebProviderTokenRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebProviderTokenRequest.WithDefault, IWebProviderTokenRequest2.WithDefault,
    IWebProviderTokenRequest3.WithDefault, IWinRTObject {
  private val __1777736176_Interface: IWebProviderTokenRequest.WithDefault by lazy {
    as_1777736176()
  }


  private val __724753442_Interface: IWebProviderTokenRequest2.WithDefault by lazy {
    as_724753442()
  }


  private val __724753443_Interface: IWebProviderTokenRequest3.WithDefault by lazy {
    as_724753443()
  }


  public override val __1777736176_Ptr: JNAPointer? by lazy {
    __1777736176_Interface.__1777736176_Ptr
  }


  public override val __724753442_Ptr: JNAPointer? by lazy {
    __724753442_Interface.__724753442_Ptr
  }


  public override val __724753443_Ptr: JNAPointer? by lazy {
    __724753443_Interface.__724753443_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1777736176_Interface, __724753442_Interface, __724753443_Interface)

  private fun as_1777736176(): IWebProviderTokenRequest.WithDefault {
    if(pointer == NULL) {
      return(IWebProviderTokenRequest.ABI.makeIWebProviderTokenRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebProviderTokenRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebProviderTokenRequest.ABI.makeIWebProviderTokenRequest(ref.value))
  }

  private fun as_724753442(): IWebProviderTokenRequest2.WithDefault {
    if(pointer == NULL) {
      return(IWebProviderTokenRequest2.ABI.makeIWebProviderTokenRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebProviderTokenRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebProviderTokenRequest2.ABI.makeIWebProviderTokenRequest2(ref.value))
  }

  private fun as_724753443(): IWebProviderTokenRequest3.WithDefault {
    if(pointer == NULL) {
      return(IWebProviderTokenRequest3.ABI.makeIWebProviderTokenRequest3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebProviderTokenRequest3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebProviderTokenRequest3.ABI.makeIWebProviderTokenRequest3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebProviderTokenRequest> {
    public override fun getValue() = WebProviderTokenRequest(pointer.getPointer(0))

    public fun setValue(value: WebProviderTokenRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebProviderTokenRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebProviderTokenRequest {
      val address = segment.toRawLongValue()
      return WebProviderTokenRequest(Pointer(address))
    }

    public override fun toNative(obj: WebProviderTokenRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
