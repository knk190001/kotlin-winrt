package Windows.UI.Xaml

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

@ABIMarker(DragEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.DragEventArgs;{b440c7c3-02b4-4980-9342-25dae1c0f188})")
@WinRTByReference(brClass = DragEventArgs.ByReference::class)
public class DragEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IDragEventArgs.WithDefault, IDragEventArgs2.WithDefault,
    IDragEventArgs3.WithDefault, IWinRTObject {
  private val __1007159631_Interface: IDragEventArgs.WithDefault by lazy {
    as_1007159631()
  }


  private val __1157177439_Interface: IDragEventArgs2.WithDefault by lazy {
    as_1157177439()
  }


  private val __1157177438_Interface: IDragEventArgs3.WithDefault by lazy {
    as_1157177438()
  }


  public override val __1007159631_Ptr: JNAPointer? by lazy {
    __1007159631_Interface.__1007159631_Ptr
  }


  public override val __1157177439_Ptr: JNAPointer? by lazy {
    __1157177439_Interface.__1157177439_Ptr
  }


  public override val __1157177438_Ptr: JNAPointer? by lazy {
    __1157177438_Interface.__1157177438_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1007159631_Interface, __1157177439_Interface, __1157177438_Interface)

  private fun as_1007159631(): IDragEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDragEventArgs.ABI.makeIDragEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragEventArgs.ABI.makeIDragEventArgs(ref.value))
  }

  private fun as_1157177439(): IDragEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IDragEventArgs2.ABI.makeIDragEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragEventArgs2.ABI.makeIDragEventArgs2(ref.value))
  }

  private fun as_1157177438(): IDragEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(IDragEventArgs3.ABI.makeIDragEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragEventArgs3.ABI.makeIDragEventArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DragEventArgs>
      {
    public override fun getValue() = DragEventArgs(pointer.getPointer(0))

    public fun setValue(value: DragEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DragEventArgs {
      val address = segment.toRawLongValue()
      return DragEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DragEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
