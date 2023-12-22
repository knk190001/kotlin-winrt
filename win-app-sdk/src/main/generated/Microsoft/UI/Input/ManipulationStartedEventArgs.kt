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

@ABIMarker(ManipulationStartedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.ManipulationStartedEventArgs;{4a616613-eef1-5f1b-a768-0775478d49d4})")
@WinRTByReference(brClass = ManipulationStartedEventArgs.ByReference::class)
public class ManipulationStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IManipulationStartedEventArgs.WithDefault, IWinRTObject {
  private val __1317791028_Interface: IManipulationStartedEventArgs.WithDefault by lazy {
    as_1317791028()
  }


  public override val __1317791028_Ptr: JNAPointer? by lazy {
    __1317791028_Interface.__1317791028_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1317791028_Interface)

  private fun as_1317791028(): IManipulationStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IManipulationStartedEventArgs.ABI.makeIManipulationStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationStartedEventArgs.ABI.makeIManipulationStartedEventArgs(ref.value))
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
