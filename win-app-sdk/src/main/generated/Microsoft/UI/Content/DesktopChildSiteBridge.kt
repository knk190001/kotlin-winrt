package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.WindowId
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DesktopChildSiteBridge.ABI::class)
@Signature("rc(Microsoft.UI.Content.DesktopChildSiteBridge;{b2f2ff7b-1825-51b0-b80b-7599889c569f})")
@WinRTByReference(brClass = DesktopChildSiteBridge.ByReference::class)
public class DesktopChildSiteBridge(
  ptr: JNAPointer? = NULL
) : DesktopSiteBridge(ptr), IDesktopChildSiteBridge.WithDefault, IWinRTObject {
  private val __1567661862_Interface: IDesktopChildSiteBridge.WithDefault by lazy {
    as_1567661862()
  }


  public override val __1567661862_Ptr: JNAPointer? by lazy {
    __1567661862_Interface.__1567661862_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1567661862_Interface)

  private fun as_1567661862(): IDesktopChildSiteBridge.WithDefault {
    if(pointer == NULL) {
      return(IDesktopChildSiteBridge.ABI.makeIDesktopChildSiteBridge(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopChildSiteBridge>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopChildSiteBridge.ABI.makeIDesktopChildSiteBridge(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesktopChildSiteBridge> {
    public override fun getValue() = DesktopChildSiteBridge(pointer.getPointer(0))

    public fun setValue(value: DesktopChildSiteBridge): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesktopChildSiteBridge, MemoryAddress> {
    public val IDesktopChildSiteBridgeStatics_Instance: IDesktopChildSiteBridgeStatics by lazy {
      createIDesktopChildSiteBridgeStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDesktopChildSiteBridgeStatics(): IDesktopChildSiteBridgeStatics {
      val refiid = Guid.REFIID(IDesktopChildSiteBridgeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Content.DesktopChildSiteBridge".toHandle(),refiid,interfacePtr)
      val result =
          IDesktopChildSiteBridgeStatics.ABI.makeIDesktopChildSiteBridgeStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DesktopChildSiteBridge {
      val address = segment.toRawLongValue()
      return DesktopChildSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: DesktopChildSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor, parentWindowId: WindowId) =
        ABI.IDesktopChildSiteBridgeStatics_Instance.Create(compositor, parentWindowId)
  }
}
