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

@ABIMarker(GattReadRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadRequestedEventArgs;{93497243-f39c-484b-8ab6-996ba486cfa3})")
@WinRTByReference(brClass = GattReadRequestedEventArgs.ByReference::class)
public class GattReadRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattReadRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1331575430_Interface: IGattReadRequestedEventArgs.WithDefault by lazy {
    as_1331575430()
  }


  public override val __1331575430_Ptr: JNAPointer? by lazy {
    __1331575430_Interface.__1331575430_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1331575430_Interface)

  private fun as_1331575430(): IGattReadRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGattReadRequestedEventArgs.ABI.makeIGattReadRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattReadRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattReadRequestedEventArgs.ABI.makeIGattReadRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattReadRequestedEventArgs> {
    public override fun getValue() = GattReadRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GattReadRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattReadRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattReadRequestedEventArgs {
      val address = segment.toRawLongValue()
      return GattReadRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GattReadRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
