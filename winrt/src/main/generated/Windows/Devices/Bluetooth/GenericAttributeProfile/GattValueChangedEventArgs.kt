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

@ABIMarker(GattValueChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattValueChangedEventArgs;{d21bdb54-06e3-4ed8-a263-acfac8ba7313})")
@WinRTByReference(brClass = GattValueChangedEventArgs.ByReference::class)
public class GattValueChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattValueChangedEventArgs.WithDefault, IWinRTObject {
  private val __921022457_Interface: IGattValueChangedEventArgs.WithDefault by lazy {
    as_921022457()
  }


  public override val __921022457_Ptr: JNAPointer? by lazy {
    __921022457_Interface.__921022457_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__921022457_Interface)

  private fun as_921022457(): IGattValueChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGattValueChangedEventArgs.ABI.makeIGattValueChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattValueChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattValueChangedEventArgs.ABI.makeIGattValueChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattValueChangedEventArgs> {
    public override fun getValue() = GattValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GattValueChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattValueChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return GattValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GattValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
