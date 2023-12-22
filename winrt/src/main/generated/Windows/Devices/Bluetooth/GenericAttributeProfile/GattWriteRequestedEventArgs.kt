package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattWriteRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteRequestedEventArgs;{2dec8bbe-a73a-471a-94d5-037deadd0806})")
@WinRTByReference(brClass = GattWriteRequestedEventArgs.ByReference::class)
public class GattWriteRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattWriteRequestedEventArgs.WithDefault, IWinRTObject {
  private val __2085936621_Interface: IGattWriteRequestedEventArgs.WithDefault by lazy {
    as_2085936621()
  }


  public override val __2085936621_Ptr: JNAPointer? by lazy {
    __2085936621_Interface.__2085936621_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2085936621_Interface)

  private fun as_2085936621(): IGattWriteRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGattWriteRequestedEventArgs.ABI.makeIGattWriteRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattWriteRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattWriteRequestedEventArgs.ABI.makeIGattWriteRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattWriteRequestedEventArgs> {
    public override fun getValue() = GattWriteRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GattWriteRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattWriteRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattWriteRequestedEventArgs {
      val address = segment.toRawLongValue()
      return GattWriteRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GattWriteRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
