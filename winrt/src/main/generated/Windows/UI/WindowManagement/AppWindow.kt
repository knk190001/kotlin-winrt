package Windows.UI.WindowManagement

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppWindow.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.AppWindow;{663014a6-b75e-5dbd-995c-f0117fa3fb61})")
@WinRTByReference(brClass = AppWindow.ByReference::class)
public class AppWindow(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindow.WithDefault, IWinRTObject {
  private val __741497130_Interface: IAppWindow.WithDefault by lazy {
    as_741497130()
  }


  public override val __741497130_Ptr: JNAPointer? by lazy {
    __741497130_Interface.__741497130_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__741497130_Interface)

  private fun as_741497130(): IAppWindow.WithDefault {
    if(pointer == NULL) {
      return(IAppWindow.ABI.makeIAppWindow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindow.ABI.makeIAppWindow(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppWindow> {
    public override fun getValue() = AppWindow(pointer.getPointer(0))

    public fun setValue(value: AppWindow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindow, MemoryAddress> {
    public val IAppWindowStatics_Instance: IAppWindowStatics by lazy {
      createIAppWindowStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppWindowStatics(): IAppWindowStatics {
      val refiid = Guid.REFIID(IAppWindowStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WindowManagement.AppWindow".toHandle(),refiid,interfacePtr)
      val result = IAppWindowStatics.ABI.makeIAppWindowStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppWindow {
      val address = segment.toRawLongValue()
      return AppWindow(Pointer(address))
    }

    public override fun toNative(obj: AppWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryCreateAsync() = ABI.IAppWindowStatics_Instance.TryCreateAsync()

    public fun ClearAllPersistedState() = ABI.IAppWindowStatics_Instance.ClearAllPersistedState()

    public fun ClearPersistedState(key: String) =
        ABI.IAppWindowStatics_Instance.ClearPersistedState(key)
  }
}
