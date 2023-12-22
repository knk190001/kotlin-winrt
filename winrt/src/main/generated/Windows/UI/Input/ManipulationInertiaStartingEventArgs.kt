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

@ABIMarker(ManipulationInertiaStartingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.ManipulationInertiaStartingEventArgs;{dd37a898-26bf-467a-9ce5-ccf3fb11371e})")
@WinRTByReference(brClass = ManipulationInertiaStartingEventArgs.ByReference::class)
public class ManipulationInertiaStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IManipulationInertiaStartingEventArgs.WithDefault,
    IManipulationInertiaStartingEventArgs2.WithDefault, IWinRTObject {
  private val __1619351256_Interface: IManipulationInertiaStartingEventArgs.WithDefault by lazy {
    as_1619351256()
  }


  private val __1339718666_Interface: IManipulationInertiaStartingEventArgs2.WithDefault by lazy {
    as_1339718666()
  }


  public override val __1619351256_Ptr: JNAPointer? by lazy {
    __1619351256_Interface.__1619351256_Ptr
  }


  public override val __1339718666_Ptr: JNAPointer? by lazy {
    __1339718666_Interface.__1339718666_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1619351256_Interface, __1339718666_Interface)

  private fun as_1619351256(): IManipulationInertiaStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationInertiaStartingEventArgs.ABI.makeIManipulationInertiaStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationInertiaStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationInertiaStartingEventArgs.ABI.makeIManipulationInertiaStartingEventArgs(ref.value))
  }

  private fun as_1339718666(): IManipulationInertiaStartingEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IManipulationInertiaStartingEventArgs2.ABI.makeIManipulationInertiaStartingEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationInertiaStartingEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationInertiaStartingEventArgs2.ABI.makeIManipulationInertiaStartingEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationInertiaStartingEventArgs> {
    public override fun getValue() = ManipulationInertiaStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ManipulationInertiaStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationInertiaStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ManipulationInertiaStartingEventArgs {
      val address = segment.toRawLongValue()
      return ManipulationInertiaStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ManipulationInertiaStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
