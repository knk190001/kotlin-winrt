package Microsoft.UI.Content

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PopupWindowSiteBridge.ABI::class)
@Signature("rc(Microsoft.UI.Content.PopupWindowSiteBridge;{044597a2-e6ee-5dab-abe0-1923ebe34c2e})")
@WinRTByReference(brClass = PopupWindowSiteBridge.ByReference::class)
public class PopupWindowSiteBridge(
  ptr: JNAPointer? = NULL
) : DesktopSiteBridge(ptr), IPopupWindowSiteBridge.WithDefault, IWinRTObject {
  private val __1788809378_Interface: IPopupWindowSiteBridge.WithDefault by lazy {
    as_1788809378()
  }


  public override val __1788809378_Ptr: JNAPointer? by lazy {
    __1788809378_Interface.__1788809378_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1788809378_Interface)

  private fun as_1788809378(): IPopupWindowSiteBridge.WithDefault {
    if(pointer == NULL) {
      return(IPopupWindowSiteBridge.ABI.makeIPopupWindowSiteBridge(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPopupWindowSiteBridge>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPopupWindowSiteBridge.ABI.makeIPopupWindowSiteBridge(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PopupWindowSiteBridge> {
    public override fun getValue() = PopupWindowSiteBridge(pointer.getPointer(0))

    public fun setValue(value: PopupWindowSiteBridge): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PopupWindowSiteBridge, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PopupWindowSiteBridge {
      val address = segment.toRawLongValue()
      return PopupWindowSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: PopupWindowSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
