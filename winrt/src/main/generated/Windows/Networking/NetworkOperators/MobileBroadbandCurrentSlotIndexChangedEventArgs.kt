package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandCurrentSlotIndexChangedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandCurrentSlotIndexChangedEventArgs;{f718b184-c370-5fd4-a670-1846cb9bce47})")
@WinRTByReference(brClass = MobileBroadbandCurrentSlotIndexChangedEventArgs.ByReference::class)
public class MobileBroadbandCurrentSlotIndexChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandCurrentSlotIndexChangedEventArgs.WithDefault, IWinRTObject {
  private val __137007770_Interface: IMobileBroadbandCurrentSlotIndexChangedEventArgs.WithDefault by
      lazy {
    as_137007770()
  }


  public override val __137007770_Ptr: JNAPointer? by lazy {
    __137007770_Interface.__137007770_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__137007770_Interface)

  private fun as_137007770(): IMobileBroadbandCurrentSlotIndexChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandCurrentSlotIndexChangedEventArgs.ABI.makeIMobileBroadbandCurrentSlotIndexChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandCurrentSlotIndexChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandCurrentSlotIndexChangedEventArgs.ABI.makeIMobileBroadbandCurrentSlotIndexChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandCurrentSlotIndexChangedEventArgs> {
    public override fun getValue() =
        MobileBroadbandCurrentSlotIndexChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandCurrentSlotIndexChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandCurrentSlotIndexChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandCurrentSlotIndexChangedEventArgs {
      val address = segment.toRawLongValue()
      return MobileBroadbandCurrentSlotIndexChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandCurrentSlotIndexChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
