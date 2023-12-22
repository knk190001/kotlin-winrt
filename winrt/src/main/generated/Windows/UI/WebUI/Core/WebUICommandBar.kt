package Windows.UI.WebUI.Core

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

@ABIMarker(WebUICommandBar.ABI::class)
@Signature("rc(Windows.UI.WebUI.Core.WebUICommandBar;{a4fc0016-dbe5-41ad-8d7b-14698bd6911d})")
@WinRTByReference(brClass = WebUICommandBar.ByReference::class)
public class WebUICommandBar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUICommandBar.WithDefault, IWinRTObject {
  private val __438915259_Interface: IWebUICommandBar.WithDefault by lazy {
    as_438915259()
  }


  public override val __438915259_Ptr: JNAPointer? by lazy {
    __438915259_Interface.__438915259_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__438915259_Interface)

  private fun as_438915259(): IWebUICommandBar.WithDefault {
    if(pointer == NULL) {
      return(IWebUICommandBar.ABI.makeIWebUICommandBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUICommandBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUICommandBar.ABI.makeIWebUICommandBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUICommandBar> {
    public override fun getValue() = WebUICommandBar(pointer.getPointer(0))

    public fun setValue(value: WebUICommandBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUICommandBar, MemoryAddress> {
    public val IWebUICommandBarStatics_Instance: IWebUICommandBarStatics by lazy {
      createIWebUICommandBarStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebUICommandBarStatics(): IWebUICommandBarStatics {
      val refiid = Guid.REFIID(IWebUICommandBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WebUI.Core.WebUICommandBar".toHandle(),refiid,interfacePtr)
      val result = IWebUICommandBarStatics.ABI.makeIWebUICommandBarStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebUICommandBar {
      val address = segment.toRawLongValue()
      return WebUICommandBar(Pointer(address))
    }

    public override fun toNative(obj: WebUICommandBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IWebUICommandBarStatics_Instance.GetForCurrentView()
  }
}
