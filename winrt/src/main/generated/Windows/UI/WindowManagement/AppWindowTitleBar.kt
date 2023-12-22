package Windows.UI.WindowManagement

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

@ABIMarker(AppWindowTitleBar.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.AppWindowTitleBar;{a215a4e3-6e7e-5651-8c3b-624819528154})")
@WinRTByReference(brClass = AppWindowTitleBar.ByReference::class)
public class AppWindowTitleBar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowTitleBarVisibility.WithDefault, IAppWindowTitleBar.WithDefault,
    IWinRTObject {
  private val __1362265385_Interface: IAppWindowTitleBarVisibility.WithDefault by lazy {
    as_1362265385()
  }


  private val __1939368475_Interface: IAppWindowTitleBar.WithDefault by lazy {
    as_1939368475()
  }


  public override val __1362265385_Ptr: JNAPointer? by lazy {
    __1362265385_Interface.__1362265385_Ptr
  }


  public override val __1939368475_Ptr: JNAPointer? by lazy {
    __1939368475_Interface.__1939368475_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1362265385_Interface, __1939368475_Interface)

  private fun as_1362265385(): IAppWindowTitleBarVisibility.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowTitleBarVisibility.ABI.makeIAppWindowTitleBarVisibility(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowTitleBarVisibility>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowTitleBarVisibility.ABI.makeIAppWindowTitleBarVisibility(ref.value))
  }

  private fun as_1939368475(): IAppWindowTitleBar.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowTitleBar.ABI.makeIAppWindowTitleBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowTitleBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowTitleBar.ABI.makeIAppWindowTitleBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppWindowTitleBar> {
    public override fun getValue() = AppWindowTitleBar(pointer.getPointer(0))

    public fun setValue(value: AppWindowTitleBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowTitleBar, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppWindowTitleBar {
      val address = segment.toRawLongValue()
      return AppWindowTitleBar(Pointer(address))
    }

    public override fun toNative(obj: AppWindowTitleBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
