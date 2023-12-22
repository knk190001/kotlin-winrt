package Windows.UI.Xaml.Input

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

@ABIMarker(KeyboardAcceleratorInvokedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.KeyboardAcceleratorInvokedEventArgs;{c00b03f2-04e7-4415-b17d-d76b9490de2b})")
@WinRTByReference(brClass = KeyboardAcceleratorInvokedEventArgs.ByReference::class)
public class KeyboardAcceleratorInvokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyboardAcceleratorInvokedEventArgs.WithDefault,
    IKeyboardAcceleratorInvokedEventArgs2.WithDefault, IWinRTObject {
  private val __1022074521_Interface: IKeyboardAcceleratorInvokedEventArgs.WithDefault by lazy {
    as_1022074521()
  }


  private val __1619539129_Interface: IKeyboardAcceleratorInvokedEventArgs2.WithDefault by lazy {
    as_1619539129()
  }


  public override val __1022074521_Ptr: JNAPointer? by lazy {
    __1022074521_Interface.__1022074521_Ptr
  }


  public override val __1619539129_Ptr: JNAPointer? by lazy {
    __1619539129_Interface.__1619539129_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1022074521_Interface, __1619539129_Interface)

  private fun as_1022074521(): IKeyboardAcceleratorInvokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IKeyboardAcceleratorInvokedEventArgs.ABI.makeIKeyboardAcceleratorInvokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyboardAcceleratorInvokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyboardAcceleratorInvokedEventArgs.ABI.makeIKeyboardAcceleratorInvokedEventArgs(ref.value))
  }

  private fun as_1619539129(): IKeyboardAcceleratorInvokedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IKeyboardAcceleratorInvokedEventArgs2.ABI.makeIKeyboardAcceleratorInvokedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyboardAcceleratorInvokedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyboardAcceleratorInvokedEventArgs2.ABI.makeIKeyboardAcceleratorInvokedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyboardAcceleratorInvokedEventArgs> {
    public override fun getValue() = KeyboardAcceleratorInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: KeyboardAcceleratorInvokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyboardAcceleratorInvokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeyboardAcceleratorInvokedEventArgs {
      val address = segment.toRawLongValue()
      return KeyboardAcceleratorInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: KeyboardAcceleratorInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
