package Windows.UI.Input

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

@ABIMarker(ManipulationStartedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.ManipulationStartedEventArgs;{ddec873e-cfce-4932-8c1d-3c3d011a34c0})")
@WinRTByReference(brClass = ManipulationStartedEventArgs.ByReference::class)
public class ManipulationStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IManipulationStartedEventArgs.WithDefault,
    IManipulationStartedEventArgs2.WithDefault, IWinRTObject {
  private val __610194271_Interface: IManipulationStartedEventArgs.WithDefault by lazy {
    as_610194271()
  }


  private val __1736153167_Interface: IManipulationStartedEventArgs2.WithDefault by lazy {
    as_1736153167()
  }


  public override val __610194271_Ptr: JNAPointer? by lazy {
    __610194271_Interface.__610194271_Ptr
  }


  public override val __1736153167_Ptr: JNAPointer? by lazy {
    __1736153167_Interface.__1736153167_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__610194271_Interface, __1736153167_Interface)

  private fun as_610194271(): IManipulationStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationStartedEventArgs.ABI.makeIManipulationStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationStartedEventArgs.ABI.makeIManipulationStartedEventArgs(ref.value))
  }

  private fun as_1736153167(): IManipulationStartedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IManipulationStartedEventArgs2.ABI.makeIManipulationStartedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationStartedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationStartedEventArgs2.ABI.makeIManipulationStartedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationStartedEventArgs> {
    public override fun getValue() = ManipulationStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ManipulationStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ManipulationStartedEventArgs {
      val address = segment.toRawLongValue()
      return ManipulationStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ManipulationStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
