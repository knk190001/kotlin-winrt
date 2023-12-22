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

@ABIMarker(WebAccountProviderManageAccountOperation.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Provider.WebAccountProviderManageAccountOperation;{ed20dc5c-d21b-463e-a9b7-c1fd0edae978})")
@WinRTByReference(brClass = WebAccountProviderManageAccountOperation.ByReference::class)
public class WebAccountProviderManageAccountOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountProviderManageAccountOperation.WithDefault,
    IWebAccountProviderOperation.WithDefault, IWinRTObject {
  private val __1959757332_Interface: IWebAccountProviderManageAccountOperation.WithDefault by
      lazy {
    as_1959757332()
  }


  private val __1287167602_Interface: IWebAccountProviderOperation.WithDefault by lazy {
    as_1287167602()
  }


  public override val __1959757332_Ptr: JNAPointer? by lazy {
    __1959757332_Interface.__1959757332_Ptr
  }


  public override val __1287167602_Ptr: JNAPointer? by lazy {
    __1287167602_Interface.__1287167602_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1959757332_Interface, __1287167602_Interface)

  private fun as_1959757332(): IWebAccountProviderManageAccountOperation.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderManageAccountOperation.ABI.makeIWebAccountProviderManageAccountOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderManageAccountOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderManageAccountOperation.ABI.makeIWebAccountProviderManageAccountOperation(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountProviderManageAccountOperation> {
    public override fun getValue() = WebAccountProviderManageAccountOperation(pointer.getPointer(0))

    public fun setValue(value: WebAccountProviderManageAccountOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountProviderManageAccountOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebAccountProviderManageAccountOperation {
      val address = segment.toRawLongValue()
      return WebAccountProviderManageAccountOperation(Pointer(address))
    }

    public override fun toNative(obj: WebAccountProviderManageAccountOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
