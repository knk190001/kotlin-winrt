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

@ABIMarker(GettingFocusEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.GettingFocusEventArgs;{fa05b9ce-c67c-4be8-8fd4-c44d67877e0d})")
@WinRTByReference(brClass = GettingFocusEventArgs.ByReference::class)
public class GettingFocusEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IGettingFocusEventArgs.WithDefault, IGettingFocusEventArgs2.WithDefault,
    IGettingFocusEventArgs3.WithDefault, IWinRTObject {
  private val __1162887149_Interface: IGettingFocusEventArgs.WithDefault by lazy {
    as_1162887149()
  }


  private val __1689763301_Interface: IGettingFocusEventArgs2.WithDefault by lazy {
    as_1689763301()
  }


  private val __1689763302_Interface: IGettingFocusEventArgs3.WithDefault by lazy {
    as_1689763302()
  }


  public override val __1162887149_Ptr: JNAPointer? by lazy {
    __1162887149_Interface.__1162887149_Ptr
  }


  public override val __1689763301_Ptr: JNAPointer? by lazy {
    __1689763301_Interface.__1689763301_Ptr
  }


  public override val __1689763302_Ptr: JNAPointer? by lazy {
    __1689763302_Interface.__1689763302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1162887149_Interface, __1689763301_Interface, __1689763302_Interface)

  private fun as_1162887149(): IGettingFocusEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGettingFocusEventArgs.ABI.makeIGettingFocusEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGettingFocusEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGettingFocusEventArgs.ABI.makeIGettingFocusEventArgs(ref.value))
  }

  private fun as_1689763301(): IGettingFocusEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IGettingFocusEventArgs2.ABI.makeIGettingFocusEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGettingFocusEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGettingFocusEventArgs2.ABI.makeIGettingFocusEventArgs2(ref.value))
  }

  private fun as_1689763302(): IGettingFocusEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(IGettingFocusEventArgs3.ABI.makeIGettingFocusEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGettingFocusEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGettingFocusEventArgs3.ABI.makeIGettingFocusEventArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GettingFocusEventArgs> {
    public override fun getValue() = GettingFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: GettingFocusEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GettingFocusEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GettingFocusEventArgs {
      val address = segment.toRawLongValue()
      return GettingFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GettingFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
