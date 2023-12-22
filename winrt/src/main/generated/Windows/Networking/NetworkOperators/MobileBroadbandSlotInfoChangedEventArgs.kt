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

@ABIMarker(MobileBroadbandSlotInfoChangedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandSlotInfoChangedEventArgs;{3158839f-950c-54ce-a48d-ba4529b48f0f})")
@WinRTByReference(brClass = MobileBroadbandSlotInfoChangedEventArgs.ByReference::class)
public class MobileBroadbandSlotInfoChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandSlotInfoChangedEventArgs.WithDefault, IWinRTObject {
  private val __237369237_Interface: IMobileBroadbandSlotInfoChangedEventArgs.WithDefault by lazy {
    as_237369237()
  }


  public override val __237369237_Ptr: JNAPointer? by lazy {
    __237369237_Interface.__237369237_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__237369237_Interface)

  private fun as_237369237(): IMobileBroadbandSlotInfoChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandSlotInfoChangedEventArgs.ABI.makeIMobileBroadbandSlotInfoChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandSlotInfoChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandSlotInfoChangedEventArgs.ABI.makeIMobileBroadbandSlotInfoChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandSlotInfoChangedEventArgs> {
    public override fun getValue() = MobileBroadbandSlotInfoChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandSlotInfoChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandSlotInfoChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandSlotInfoChangedEventArgs {
      val address = segment.toRawLongValue()
      return MobileBroadbandSlotInfoChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandSlotInfoChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
