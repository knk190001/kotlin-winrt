package Windows.UI.Core

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

@ABIMarker(CoreWindow.ABI::class)
@Signature("rc(Windows.UI.Core.CoreWindow;{79b9d5f2-879e-4b89-b798-79e47598030c})")
@WinRTByReference(brClass = CoreWindow.ByReference::class)
public class CoreWindow(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWindow.WithDefault, ICoreWindow2.WithDefault,
    ICorePointerRedirector.WithDefault, ICoreWindow3.WithDefault, ICoreWindow4.WithDefault,
    ICoreWindow5.WithDefault, ICoreWindowWithContext.WithDefault, IWinRTObject {
  private val __937522826_Interface: ICoreWindow.WithDefault by lazy {
    as_937522826()
  }


  private val __1001563416_Interface: ICoreWindow2.WithDefault by lazy {
    as_1001563416()
  }


  private val __683430402_Interface: ICorePointerRedirector.WithDefault by lazy {
    as_683430402()
  }


  private val __1001563415_Interface: ICoreWindow3.WithDefault by lazy {
    as_1001563415()
  }


  private val __1001563414_Interface: ICoreWindow4.WithDefault by lazy {
    as_1001563414()
  }


  private val __1001563413_Interface: ICoreWindow5.WithDefault by lazy {
    as_1001563413()
  }


  private val __1816106721_Interface: ICoreWindowWithContext.WithDefault by lazy {
    as_1816106721()
  }


  public override val __937522826_Ptr: JNAPointer? by lazy {
    __937522826_Interface.__937522826_Ptr
  }


  public override val __1001563416_Ptr: JNAPointer? by lazy {
    __1001563416_Interface.__1001563416_Ptr
  }


  public override val __683430402_Ptr: JNAPointer? by lazy {
    __683430402_Interface.__683430402_Ptr
  }


  public override val __1001563415_Ptr: JNAPointer? by lazy {
    __1001563415_Interface.__1001563415_Ptr
  }


  public override val __1001563414_Ptr: JNAPointer? by lazy {
    __1001563414_Interface.__1001563414_Ptr
  }


  public override val __1001563413_Ptr: JNAPointer? by lazy {
    __1001563413_Interface.__1001563413_Ptr
  }


  public override val __1816106721_Ptr: JNAPointer? by lazy {
    __1816106721_Interface.__1816106721_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__937522826_Interface, __1001563416_Interface, __683430402_Interface,
        __1001563415_Interface, __1001563414_Interface, __1001563413_Interface,
        __1816106721_Interface)

  private fun as_937522826(): ICoreWindow.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindow.ABI.makeICoreWindow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindow.ABI.makeICoreWindow(ref.value))
  }

  private fun as_1001563416(): ICoreWindow2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindow2.ABI.makeICoreWindow2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindow2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindow2.ABI.makeICoreWindow2(ref.value))
  }

  private fun as_683430402(): ICorePointerRedirector.WithDefault {
    if(pointer == NULL) {
      return(ICorePointerRedirector.ABI.makeICorePointerRedirector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICorePointerRedirector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICorePointerRedirector.ABI.makeICorePointerRedirector(ref.value))
  }

  private fun as_1001563415(): ICoreWindow3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindow3.ABI.makeICoreWindow3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindow3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindow3.ABI.makeICoreWindow3(ref.value))
  }

  private fun as_1001563414(): ICoreWindow4.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindow4.ABI.makeICoreWindow4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindow4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindow4.ABI.makeICoreWindow4(ref.value))
  }

  private fun as_1001563413(): ICoreWindow5.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindow5.ABI.makeICoreWindow5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindow5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindow5.ABI.makeICoreWindow5(ref.value))
  }

  private fun as_1816106721(): ICoreWindowWithContext.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowWithContext.ABI.makeICoreWindowWithContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowWithContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowWithContext.ABI.makeICoreWindowWithContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CoreWindow> {
    public override fun getValue() = CoreWindow(pointer.getPointer(0))

    public fun setValue(value: CoreWindow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWindow, MemoryAddress> {
    public val ICoreWindowStatic_Instance: ICoreWindowStatic by lazy {
      createICoreWindowStatic()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreWindowStatic(): ICoreWindowStatic {
      val refiid = Guid.REFIID(ICoreWindowStatic.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.CoreWindow".toHandle(),refiid,interfacePtr)
      val result = ICoreWindowStatic.ABI.makeICoreWindowStatic(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreWindow {
      val address = segment.toRawLongValue()
      return CoreWindow(Pointer(address))
    }

    public override fun toNative(obj: CoreWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentThread() = ABI.ICoreWindowStatic_Instance.GetForCurrentThread()
  }
}
