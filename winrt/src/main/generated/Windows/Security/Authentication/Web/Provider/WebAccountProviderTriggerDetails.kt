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

@ABIMarker(WebAccountProviderTriggerDetails.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Provider.WebAccountProviderTriggerDetails;{408f284b-1328-42db-89a4-0bce7a717d8e})")
@WinRTByReference(brClass = WebAccountProviderTriggerDetails.ByReference::class)
public class WebAccountProviderTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountProviderTokenObjects.WithDefault,
    IWebAccountProviderTokenObjects2.WithDefault, IWinRTObject {
  private val __2031009776_Interface: IWebAccountProviderTokenObjects.WithDefault by lazy {
    as_2031009776()
  }


  private val __1463206334_Interface: IWebAccountProviderTokenObjects2.WithDefault by lazy {
    as_1463206334()
  }


  public override val __2031009776_Ptr: JNAPointer? by lazy {
    __2031009776_Interface.__2031009776_Ptr
  }


  public override val __1463206334_Ptr: JNAPointer? by lazy {
    __1463206334_Interface.__1463206334_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2031009776_Interface, __1463206334_Interface)

  private fun as_2031009776(): IWebAccountProviderTokenObjects.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderTokenObjects.ABI.makeIWebAccountProviderTokenObjects(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderTokenObjects>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderTokenObjects.ABI.makeIWebAccountProviderTokenObjects(ref.value))
  }

  private fun as_1463206334(): IWebAccountProviderTokenObjects2.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderTokenObjects2.ABI.makeIWebAccountProviderTokenObjects2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderTokenObjects2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderTokenObjects2.ABI.makeIWebAccountProviderTokenObjects2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountProviderTriggerDetails> {
    public override fun getValue() = WebAccountProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: WebAccountProviderTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountProviderTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebAccountProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return WebAccountProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: WebAccountProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
