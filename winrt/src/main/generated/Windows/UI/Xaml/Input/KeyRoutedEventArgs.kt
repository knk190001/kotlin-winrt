package Windows.UI.Xaml.Input

import Windows.UI.Xaml.RoutedEventArgs
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

@ABIMarker(KeyRoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.KeyRoutedEventArgs;{d4cd3dfe-4079-42e9-a39a-3095d3f049c6})")
@WinRTByReference(brClass = KeyRoutedEventArgs.ByReference::class)
public class KeyRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IKeyRoutedEventArgs.WithDefault, IKeyRoutedEventArgs2.WithDefault,
    IKeyRoutedEventArgs3.WithDefault, IWinRTObject {
  private val __1520263827_Interface: IKeyRoutedEventArgs.WithDefault by lazy {
    as_1520263827()
  }


  private val __116461569_Interface: IKeyRoutedEventArgs2.WithDefault by lazy {
    as_116461569()
  }


  private val __116461568_Interface: IKeyRoutedEventArgs3.WithDefault by lazy {
    as_116461568()
  }


  public override val __1520263827_Ptr: JNAPointer? by lazy {
    __1520263827_Interface.__1520263827_Ptr
  }


  public override val __116461569_Ptr: JNAPointer? by lazy {
    __116461569_Interface.__116461569_Ptr
  }


  public override val __116461568_Ptr: JNAPointer? by lazy {
    __116461568_Interface.__116461568_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1520263827_Interface, __116461569_Interface, __116461568_Interface)

  private fun as_1520263827(): IKeyRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IKeyRoutedEventArgs.ABI.makeIKeyRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyRoutedEventArgs.ABI.makeIKeyRoutedEventArgs(ref.value))
  }

  private fun as_116461569(): IKeyRoutedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IKeyRoutedEventArgs2.ABI.makeIKeyRoutedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyRoutedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyRoutedEventArgs2.ABI.makeIKeyRoutedEventArgs2(ref.value))
  }

  private fun as_116461568(): IKeyRoutedEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(IKeyRoutedEventArgs3.ABI.makeIKeyRoutedEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyRoutedEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyRoutedEventArgs3.ABI.makeIKeyRoutedEventArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyRoutedEventArgs> {
    public override fun getValue() = KeyRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: KeyRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyRoutedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeyRoutedEventArgs {
      val address = segment.toRawLongValue()
      return KeyRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: KeyRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
