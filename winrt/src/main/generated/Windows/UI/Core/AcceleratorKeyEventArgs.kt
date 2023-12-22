package Windows.UI.Core

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

@ABIMarker(AcceleratorKeyEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.AcceleratorKeyEventArgs;{ff1c4c4a-9287-470b-836e-9086e3126ade})")
@WinRTByReference(brClass = AcceleratorKeyEventArgs.ByReference::class)
public class AcceleratorKeyEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAcceleratorKeyEventArgs.WithDefault, ICoreWindowEventArgs.WithDefault,
    IAcceleratorKeyEventArgs2.WithDefault, IWinRTObject {
  private val __46393656_Interface: IAcceleratorKeyEventArgs.WithDefault by lazy {
    as_46393656()
  }


  private val __407060269_Interface: ICoreWindowEventArgs.WithDefault by lazy {
    as_407060269()
  }


  private val __1438203286_Interface: IAcceleratorKeyEventArgs2.WithDefault by lazy {
    as_1438203286()
  }


  public override val __46393656_Ptr: JNAPointer? by lazy {
    __46393656_Interface.__46393656_Ptr
  }


  public override val __407060269_Ptr: JNAPointer? by lazy {
    __407060269_Interface.__407060269_Ptr
  }


  public override val __1438203286_Ptr: JNAPointer? by lazy {
    __1438203286_Interface.__1438203286_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__46393656_Interface, __407060269_Interface, __1438203286_Interface)

  private fun as_46393656(): IAcceleratorKeyEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAcceleratorKeyEventArgs.ABI.makeIAcceleratorKeyEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAcceleratorKeyEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAcceleratorKeyEventArgs.ABI.makeIAcceleratorKeyEventArgs(ref.value))
  }

  private fun as_407060269(): ICoreWindowEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowEventArgs.ABI.makeICoreWindowEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowEventArgs.ABI.makeICoreWindowEventArgs(ref.value))
  }

  private fun as_1438203286(): IAcceleratorKeyEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IAcceleratorKeyEventArgs2.ABI.makeIAcceleratorKeyEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAcceleratorKeyEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAcceleratorKeyEventArgs2.ABI.makeIAcceleratorKeyEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AcceleratorKeyEventArgs> {
    public override fun getValue() = AcceleratorKeyEventArgs(pointer.getPointer(0))

    public fun setValue(value: AcceleratorKeyEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AcceleratorKeyEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AcceleratorKeyEventArgs {
      val address = segment.toRawLongValue()
      return AcceleratorKeyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AcceleratorKeyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
