package Windows.Devices.Lights.Effects

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

@ABIMarker(LampArrayUpdateRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Lights.Effects.LampArrayUpdateRequestedEventArgs;{73560d6a-576a-48af-8539-67ffa0ab3516})")
@WinRTByReference(brClass = LampArrayUpdateRequestedEventArgs.ByReference::class)
public class LampArrayUpdateRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampArrayUpdateRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1570509609_Interface: ILampArrayUpdateRequestedEventArgs.WithDefault by lazy {
    as_1570509609()
  }


  public override val __1570509609_Ptr: JNAPointer? by lazy {
    __1570509609_Interface.__1570509609_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1570509609_Interface)

  private fun as_1570509609(): ILampArrayUpdateRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILampArrayUpdateRequestedEventArgs.ABI.makeILampArrayUpdateRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArrayUpdateRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArrayUpdateRequestedEventArgs.ABI.makeILampArrayUpdateRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LampArrayUpdateRequestedEventArgs> {
    public override fun getValue() = LampArrayUpdateRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: LampArrayUpdateRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampArrayUpdateRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LampArrayUpdateRequestedEventArgs {
      val address = segment.toRawLongValue()
      return LampArrayUpdateRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LampArrayUpdateRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
