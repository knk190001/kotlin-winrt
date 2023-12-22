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

@ABIMarker(WebAccountProviderGetTokenSilentOperation.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Provider.WebAccountProviderGetTokenSilentOperation;{95c613be-2034-4c38-9434-d26c14b2b4b2})")
@WinRTByReference(brClass = WebAccountProviderGetTokenSilentOperation.ByReference::class)
public class WebAccountProviderGetTokenSilentOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountProviderTokenOperation.WithDefault,
    IWebAccountProviderOperation.WithDefault, IWebAccountProviderSilentReportOperation.WithDefault,
    IWebAccountProviderBaseReportOperation.WithDefault, IWinRTObject {
  private val __742558019_Interface: IWebAccountProviderTokenOperation.WithDefault by lazy {
    as_742558019()
  }


  private val __1287167602_Interface: IWebAccountProviderOperation.WithDefault by lazy {
    as_1287167602()
  }


  private val __834397687_Interface: IWebAccountProviderSilentReportOperation.WithDefault by lazy {
    as_834397687()
  }


  private val __515081933_Interface: IWebAccountProviderBaseReportOperation.WithDefault by lazy {
    as_515081933()
  }


  public override val __742558019_Ptr: JNAPointer? by lazy {
    __742558019_Interface.__742558019_Ptr
  }


  public override val __1287167602_Ptr: JNAPointer? by lazy {
    __1287167602_Interface.__1287167602_Ptr
  }


  public override val __834397687_Ptr: JNAPointer? by lazy {
    __834397687_Interface.__834397687_Ptr
  }


  public override val __515081933_Ptr: JNAPointer? by lazy {
    __515081933_Interface.__515081933_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__742558019_Interface, __1287167602_Interface, __834397687_Interface,
        __515081933_Interface)

  private fun as_742558019(): IWebAccountProviderTokenOperation.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderTokenOperation.ABI.makeIWebAccountProviderTokenOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderTokenOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderTokenOperation.ABI.makeIWebAccountProviderTokenOperation(ref.value))
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

  private fun as_834397687(): IWebAccountProviderSilentReportOperation.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderSilentReportOperation.ABI.makeIWebAccountProviderSilentReportOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderSilentReportOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderSilentReportOperation.ABI.makeIWebAccountProviderSilentReportOperation(ref.value))
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
      IByReference<WebAccountProviderGetTokenSilentOperation> {
    public override fun getValue() =
        WebAccountProviderGetTokenSilentOperation(pointer.getPointer(0))

    public fun setValue(value: WebAccountProviderGetTokenSilentOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountProviderGetTokenSilentOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebAccountProviderGetTokenSilentOperation {
      val address = segment.toRawLongValue()
      return WebAccountProviderGetTokenSilentOperation(Pointer(address))
    }

    public override fun toNative(obj: WebAccountProviderGetTokenSilentOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
