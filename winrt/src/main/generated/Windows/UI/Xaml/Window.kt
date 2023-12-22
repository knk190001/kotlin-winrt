package Windows.UI.Xaml

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

@ABIMarker(Window.ABI::class)
@Signature("rc(Windows.UI.Xaml.Window;{3276167d-c9f6-462d-9de2-ae4c1fd8c2e5})")
@WinRTByReference(brClass = Window.ByReference::class)
public class Window(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindow.WithDefault, IWindow2.WithDefault, IWindow3.WithDefault,
    IWindow4.WithDefault, IWinRTObject {
  private val __1156965182_Interface: IWindow.WithDefault by lazy {
    as_1156965182()
  }


  private val __1506182224_Interface: IWindow2.WithDefault by lazy {
    as_1506182224()
  }


  private val __1506182223_Interface: IWindow3.WithDefault by lazy {
    as_1506182223()
  }


  private val __1506182222_Interface: IWindow4.WithDefault by lazy {
    as_1506182222()
  }


  public override val __1156965182_Ptr: JNAPointer? by lazy {
    __1156965182_Interface.__1156965182_Ptr
  }


  public override val __1506182224_Ptr: JNAPointer? by lazy {
    __1506182224_Interface.__1506182224_Ptr
  }


  public override val __1506182223_Ptr: JNAPointer? by lazy {
    __1506182223_Interface.__1506182223_Ptr
  }


  public override val __1506182222_Ptr: JNAPointer? by lazy {
    __1506182222_Interface.__1506182222_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1156965182_Interface, __1506182224_Interface, __1506182223_Interface,
        __1506182222_Interface)

  private fun as_1156965182(): IWindow.WithDefault {
    if(pointer == NULL) {
      return(IWindow.ABI.makeIWindow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindow.ABI.makeIWindow(ref.value))
  }

  private fun as_1506182224(): IWindow2.WithDefault {
    if(pointer == NULL) {
      return(IWindow2.ABI.makeIWindow2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindow2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindow2.ABI.makeIWindow2(ref.value))
  }

  private fun as_1506182223(): IWindow3.WithDefault {
    if(pointer == NULL) {
      return(IWindow3.ABI.makeIWindow3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindow3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindow3.ABI.makeIWindow3(ref.value))
  }

  private fun as_1506182222(): IWindow4.WithDefault {
    if(pointer == NULL) {
      return(IWindow4.ABI.makeIWindow4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindow4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindow4.ABI.makeIWindow4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Window> {
    public override fun getValue() = Window(pointer.getPointer(0))

    public fun setValue(value: Window): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Window, MemoryAddress> {
    public val IWindowStatics_Instance: IWindowStatics by lazy {
      createIWindowStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWindowStatics(): IWindowStatics {
      val refiid = Guid.REFIID(IWindowStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Window".toHandle(),refiid,interfacePtr)
      val result = IWindowStatics.ABI.makeIWindowStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Window {
      val address = segment.toRawLongValue()
      return Window(Pointer(address))
    }

    public override fun toNative(obj: Window): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IWindowStatics_Instance.get_Current()
  }
}
