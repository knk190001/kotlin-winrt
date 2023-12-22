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

@ABIMarker(LosingFocusEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.LosingFocusEventArgs;{f9f683c7-d789-472b-aa93-6d4105e6dabe})")
@WinRTByReference(brClass = LosingFocusEventArgs.ByReference::class)
public class LosingFocusEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), ILosingFocusEventArgs.WithDefault, ILosingFocusEventArgs2.WithDefault,
    ILosingFocusEventArgs3.WithDefault, IWinRTObject {
  private val __1664528473_Interface: ILosingFocusEventArgs.WithDefault by lazy {
    as_1664528473()
  }


  private val __60775061_Interface: ILosingFocusEventArgs2.WithDefault by lazy {
    as_60775061()
  }


  private val __60775060_Interface: ILosingFocusEventArgs3.WithDefault by lazy {
    as_60775060()
  }


  public override val __1664528473_Ptr: JNAPointer? by lazy {
    __1664528473_Interface.__1664528473_Ptr
  }


  public override val __60775061_Ptr: JNAPointer? by lazy {
    __60775061_Interface.__60775061_Ptr
  }


  public override val __60775060_Ptr: JNAPointer? by lazy {
    __60775060_Interface.__60775060_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1664528473_Interface, __60775061_Interface, __60775060_Interface)

  private fun as_1664528473(): ILosingFocusEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILosingFocusEventArgs.ABI.makeILosingFocusEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILosingFocusEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILosingFocusEventArgs.ABI.makeILosingFocusEventArgs(ref.value))
  }

  private fun as_60775061(): ILosingFocusEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ILosingFocusEventArgs2.ABI.makeILosingFocusEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILosingFocusEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILosingFocusEventArgs2.ABI.makeILosingFocusEventArgs2(ref.value))
  }

  private fun as_60775060(): ILosingFocusEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(ILosingFocusEventArgs3.ABI.makeILosingFocusEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILosingFocusEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILosingFocusEventArgs3.ABI.makeILosingFocusEventArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LosingFocusEventArgs> {
    public override fun getValue() = LosingFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: LosingFocusEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LosingFocusEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LosingFocusEventArgs {
      val address = segment.toRawLongValue()
      return LosingFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LosingFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
