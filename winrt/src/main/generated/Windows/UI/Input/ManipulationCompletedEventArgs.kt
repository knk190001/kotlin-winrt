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

@ABIMarker(ManipulationCompletedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.ManipulationCompletedEventArgs;{b34ab22b-d19b-46ff-9f38-dec7754bb9e7})")
@WinRTByReference(brClass = ManipulationCompletedEventArgs.ByReference::class)
public class ManipulationCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IManipulationCompletedEventArgs.WithDefault,
    IManipulationCompletedEventArgs2.WithDefault, IWinRTObject {
  private val __1076110167_Interface: IManipulationCompletedEventArgs.WithDefault by lazy {
    as_1076110167()
  }


  private val __1000323141_Interface: IManipulationCompletedEventArgs2.WithDefault by lazy {
    as_1000323141()
  }


  public override val __1076110167_Ptr: JNAPointer? by lazy {
    __1076110167_Interface.__1076110167_Ptr
  }


  public override val __1000323141_Ptr: JNAPointer? by lazy {
    __1000323141_Interface.__1000323141_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1076110167_Interface, __1000323141_Interface)

  private fun as_1076110167(): IManipulationCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationCompletedEventArgs.ABI.makeIManipulationCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationCompletedEventArgs.ABI.makeIManipulationCompletedEventArgs(ref.value))
  }

  private fun as_1000323141(): IManipulationCompletedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IManipulationCompletedEventArgs2.ABI.makeIManipulationCompletedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationCompletedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationCompletedEventArgs2.ABI.makeIManipulationCompletedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationCompletedEventArgs> {
    public override fun getValue() = ManipulationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ManipulationCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ManipulationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return ManipulationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ManipulationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
