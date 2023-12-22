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

@ABIMarker(WebAccountProviderRetrieveCookiesOperation.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation;{5a040441-0fa3-4ab1-a01c-20b110358594})")
@WinRTByReference(brClass = WebAccountProviderRetrieveCookiesOperation.ByReference::class)
public class WebAccountProviderRetrieveCookiesOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountProviderRetrieveCookiesOperation.WithDefault,
    IWebAccountProviderOperation.WithDefault, IWebAccountProviderBaseReportOperation.WithDefault,
    IWinRTObject {
  private val __15814537_Interface: IWebAccountProviderRetrieveCookiesOperation.WithDefault by
      lazy {
    as_15814537()
  }


  private val __1287167602_Interface: IWebAccountProviderOperation.WithDefault by lazy {
    as_1287167602()
  }


  private val __515081933_Interface: IWebAccountProviderBaseReportOperation.WithDefault by lazy {
    as_515081933()
  }


  public override val __15814537_Ptr: JNAPointer? by lazy {
    __15814537_Interface.__15814537_Ptr
  }


  public override val __1287167602_Ptr: JNAPointer? by lazy {
    __1287167602_Interface.__1287167602_Ptr
  }


  public override val __515081933_Ptr: JNAPointer? by lazy {
    __515081933_Interface.__515081933_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__15814537_Interface, __1287167602_Interface, __515081933_Interface)

  private fun as_15814537(): IWebAccountProviderRetrieveCookiesOperation.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderRetrieveCookiesOperation.ABI.makeIWebAccountProviderRetrieveCookiesOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderRetrieveCookiesOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderRetrieveCookiesOperation.ABI.makeIWebAccountProviderRetrieveCookiesOperation(ref.value))
  }

  private fun as_1287167602(): IWebAccountProviderOperation.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderOperation.ABI.makeIWebAccountProviderOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderOperation.ABI.makeIWebAccountProviderOperation(ref.value))
  }

  private fun as_515081933(): IWebAccountProviderBaseReportOperation.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderBaseReportOperation.ABI.makeIWebAccountProviderBaseReportOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderBaseReportOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderBaseReportOperation.ABI.makeIWebAccountProviderBaseReportOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountProviderRetrieveCookiesOperation> {
    public override fun getValue() =
        WebAccountProviderRetrieveCookiesOperation(pointer.getPointer(0))

    public fun setValue(value: WebAccountProviderRetrieveCookiesOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountProviderRetrieveCookiesOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebAccountProviderRetrieveCookiesOperation {
      val address = segment.toRawLongValue()
      return WebAccountProviderRetrieveCookiesOperation(Pointer(address))
    }

    public override fun toNative(obj: WebAccountProviderRetrieveCookiesOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
