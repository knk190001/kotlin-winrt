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

@ABIMarker(WebAccountProviderAddAccountOperation.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Provider.WebAccountProviderAddAccountOperation;{73ebdccf-4378-4c79-9335-a5d7ab81594e})")
@WinRTByReference(brClass = WebAccountProviderAddAccountOperation.ByReference::class)
public class WebAccountProviderAddAccountOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountProviderAddAccountOperation.WithDefault,
    IWebAccountProviderOperation.WithDefault, IWinRTObject {
  private val __1278353350_Interface: IWebAccountProviderAddAccountOperation.WithDefault by lazy {
    as_1278353350()
  }


  private val __1287167602_Interface: IWebAccountProviderOperation.WithDefault by lazy {
    as_1287167602()
  }


  public override val __1278353350_Ptr: JNAPointer? by lazy {
    __1278353350_Interface.__1278353350_Ptr
  }


  public override val __1287167602_Ptr: JNAPointer? by lazy {
    __1287167602_Interface.__1287167602_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1278353350_Interface, __1287167602_Interface)

  private fun as_1278353350(): IWebAccountProviderAddAccountOperation.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderAddAccountOperation.ABI.makeIWebAccountProviderAddAccountOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderAddAccountOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderAddAccountOperation.ABI.makeIWebAccountProviderAddAccountOperation(ref.value))
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
      IByReference<WebAccountProviderAddAccountOperation> {
    public override fun getValue() = WebAccountProviderAddAccountOperation(pointer.getPointer(0))

    public fun setValue(value: WebAccountProviderAddAccountOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountProviderAddAccountOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebAccountProviderAddAccountOperation {
      val address = segment.toRawLongValue()
      return WebAccountProviderAddAccountOperation(Pointer(address))
    }

    public override fun toNative(obj: WebAccountProviderAddAccountOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
