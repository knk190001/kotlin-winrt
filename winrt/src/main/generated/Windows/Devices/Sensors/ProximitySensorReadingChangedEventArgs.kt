package Windows.Devices.Sensors

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

@ABIMarker(ProximitySensorReadingChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Sensors.ProximitySensorReadingChangedEventArgs;{cfc2f366-c3e8-40fd-8cc3-67e289004938})")
@WinRTByReference(brClass = ProximitySensorReadingChangedEventArgs.ByReference::class)
public class ProximitySensorReadingChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProximitySensorReadingChangedEventArgs.WithDefault, IWinRTObject {
  private val __1284025214_Interface: IProximitySensorReadingChangedEventArgs.WithDefault by lazy {
    as_1284025214()
  }


  public override val __1284025214_Ptr: JNAPointer? by lazy {
    __1284025214_Interface.__1284025214_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1284025214_Interface)

  private fun as_1284025214(): IProximitySensorReadingChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IProximitySensorReadingChangedEventArgs.ABI.makeIProximitySensorReadingChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProximitySensorReadingChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProximitySensorReadingChangedEventArgs.ABI.makeIProximitySensorReadingChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProximitySensorReadingChangedEventArgs> {
    public override fun getValue() = ProximitySensorReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ProximitySensorReadingChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProximitySensorReadingChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProximitySensorReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return ProximitySensorReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ProximitySensorReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
