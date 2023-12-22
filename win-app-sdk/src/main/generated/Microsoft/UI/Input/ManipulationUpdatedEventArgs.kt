package Microsoft.UI.Input

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

@ABIMarker(ManipulationUpdatedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.ManipulationUpdatedEventArgs;{406e1961-0c98-5fc0-b3d8-116492ef0053})")
@WinRTByReference(brClass = ManipulationUpdatedEventArgs.ByReference::class)
public class ManipulationUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IManipulationUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __602924078_Interface: IManipulationUpdatedEventArgs.WithDefault by lazy {
    as_602924078()
  }


  public override val __602924078_Ptr: JNAPointer? by lazy {
    __602924078_Interface.__602924078_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__602924078_Interface)

  private fun as_602924078(): IManipulationUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationUpdatedEventArgs.ABI.makeIManipulationUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationUpdatedEventArgs.ABI.makeIManipulationUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationUpdatedEventArgs> {
    public override fun getValue() = ManipulationUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ManipulationUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ManipulationUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return ManipulationUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ManipulationUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
