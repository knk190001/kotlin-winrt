package Windows.UI.WebUI

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

@ABIMarker(WebUINavigatedDeferral.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUINavigatedDeferral;{d804204d-831f-46e2-b432-3afce211f962})")
@WinRTByReference(brClass = WebUINavigatedDeferral.ByReference::class)
public class WebUINavigatedDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUINavigatedDeferral.WithDefault, IWinRTObject {
  private val __1425355014_Interface: IWebUINavigatedDeferral.WithDefault by lazy {
    as_1425355014()
  }


  public override val __1425355014_Ptr: JNAPointer? by lazy {
    __1425355014_Interface.__1425355014_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1425355014_Interface)

  private fun as_1425355014(): IWebUINavigatedDeferral.WithDefault {
    if(pointer == NULL) {
      return(IWebUINavigatedDeferral.ABI.makeIWebUINavigatedDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUINavigatedDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUINavigatedDeferral.ABI.makeIWebUINavigatedDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUINavigatedDeferral> {
    public override fun getValue() = WebUINavigatedDeferral(pointer.getPointer(0))

    public fun setValue(value: WebUINavigatedDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUINavigatedDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUINavigatedDeferral {
      val address = segment.toRawLongValue()
      return WebUINavigatedDeferral(Pointer(address))
    }

    public override fun toNative(obj: WebUINavigatedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
