package Windows.Devices.Lights

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

@ABIMarker(LampAvailabilityChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Lights.LampAvailabilityChangedEventArgs;{4f6e3ded-07a2-499d-9260-67e304532ba4})")
@WinRTByReference(brClass = LampAvailabilityChangedEventArgs.ByReference::class)
public class LampAvailabilityChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampAvailabilityChangedEventArgs.WithDefault, IWinRTObject {
  private val __1197079610_Interface: ILampAvailabilityChangedEventArgs.WithDefault by lazy {
    as_1197079610()
  }


  public override val __1197079610_Ptr: JNAPointer? by lazy {
    __1197079610_Interface.__1197079610_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1197079610_Interface)

  private fun as_1197079610(): ILampAvailabilityChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILampAvailabilityChangedEventArgs.ABI.makeILampAvailabilityChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampAvailabilityChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampAvailabilityChangedEventArgs.ABI.makeILampAvailabilityChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LampAvailabilityChangedEventArgs> {
    public override fun getValue() = LampAvailabilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: LampAvailabilityChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampAvailabilityChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LampAvailabilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return LampAvailabilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LampAvailabilityChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
