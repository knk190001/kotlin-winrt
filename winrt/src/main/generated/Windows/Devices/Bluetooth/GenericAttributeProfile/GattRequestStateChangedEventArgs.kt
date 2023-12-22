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

@ABIMarker(GattRequestStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattRequestStateChangedEventArgs;{e834d92c-27be-44b3-9d0d-4fc6e808dd3f})")
@WinRTByReference(brClass = GattRequestStateChangedEventArgs.ByReference::class)
public class GattRequestStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattRequestStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __1807730656_Interface: IGattRequestStateChangedEventArgs.WithDefault by lazy {
    as_1807730656()
  }


  public override val __1807730656_Ptr: JNAPointer? by lazy {
    __1807730656_Interface.__1807730656_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1807730656_Interface)

  private fun as_1807730656(): IGattRequestStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGattRequestStateChangedEventArgs.ABI.makeIGattRequestStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattRequestStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattRequestStateChangedEventArgs.ABI.makeIGattRequestStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattRequestStateChangedEventArgs> {
    public override fun getValue() = GattRequestStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GattRequestStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattRequestStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattRequestStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return GattRequestStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GattRequestStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
