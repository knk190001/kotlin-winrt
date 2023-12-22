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

@ABIMarker(WebAccountProviderRequestTokenOperation.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation;{95c613be-2034-4c38-9434-d26c14b2b4b2})")
@WinRTByReference(brClass = WebAccountProviderRequestTokenOperation.ByReference::class)
public class WebAccountProviderRequestTokenOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountProviderTokenOperation.WithDefault,
    IWebAccountProviderOperation.WithDefault, IWebAccountProviderUIReportOperation.WithDefault,
    IWebAccountProviderBaseReportOperation.WithDefault, IWinRTObject {
  private val __742558019_Interface: IWebAccountProviderTokenOperation.WithDefault by lazy {
    as_742558019()
  }


  private val __1287167602_Interface: IWebAccountProviderOperation.WithDefault by lazy {
    as_1287167602()
  }


  private val __1262601334_Interface: IWebAccountProviderUIReportOperation.WithDefault by lazy {
    as_1262601334()
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


  public override val __1262601334_Ptr: JNAPointer? by lazy {
    __1262601334_Interface.__1262601334_Ptr
  }


  public override val __515081933_Ptr: JNAPointer? by lazy {
    __515081933_Interface.__515081933_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__742558019_Interface, __1287167602_Interface, __1262601334_Interface,
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

  private fun as_1262601334(): IWebAccountProviderUIReportOperation.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderUIReportOperation.ABI.makeIWebAccountProviderUIReportOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderUIReportOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderUIReportOperation.ABI.makeIWebAccountProviderUIReportOperation(ref.value))
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
      IByReference<WebAccountProviderRequestTokenOperation> {
    public override fun getValue() = WebAccountProviderRequestTokenOperation(pointer.getPointer(0))

    public fun setValue(value: WebAccountProviderRequestTokenOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountProviderRequestTokenOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebAccountProviderRequestTokenOperation {
      val address = segment.toRawLongValue()
      return WebAccountProviderRequestTokenOperation(Pointer(address))
    }

    public override fun toNative(obj: WebAccountProviderRequestTokenOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
