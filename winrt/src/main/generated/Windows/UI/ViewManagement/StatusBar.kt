package Windows.UI.ViewManagement

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

@ABIMarker(StatusBar.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.StatusBar;{0ffcc5bf-98d0-4864-b1e8-b3f4020be8b4})")
@WinRTByReference(brClass = StatusBar.ByReference::class)
public class StatusBar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStatusBar.WithDefault, IWinRTObject {
  private val __1523338351_Interface: IStatusBar.WithDefault by lazy {
    as_1523338351()
  }


  public override val __1523338351_Ptr: JNAPointer? by lazy {
    __1523338351_Interface.__1523338351_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1523338351_Interface)

  private fun as_1523338351(): IStatusBar.WithDefault {
    if(pointer == NULL) {
      return(IStatusBar.ABI.makeIStatusBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStatusBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStatusBar.ABI.makeIStatusBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StatusBar> {
    public override fun getValue() = StatusBar(pointer.getPointer(0))

    public fun setValue(value: StatusBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StatusBar, MemoryAddress> {
    public val IStatusBarStatics_Instance: IStatusBarStatics by lazy {
      createIStatusBarStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStatusBarStatics(): IStatusBarStatics {
      val refiid = Guid.REFIID(IStatusBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.StatusBar".toHandle(),refiid,interfacePtr)
      val result = IStatusBarStatics.ABI.makeIStatusBarStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StatusBar {
      val address = segment.toRawLongValue()
      return StatusBar(Pointer(address))
    }

    public override fun toNative(obj: StatusBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IStatusBarStatics_Instance.GetForCurrentView()
  }
}
