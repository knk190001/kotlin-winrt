package Windows.Devices.Gpio

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

@ABIMarker(GpioPinValueChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Gpio.GpioPinValueChangedEventArgs;{3137aae1-703d-4059-bd24-b5b25dffb84e})")
@WinRTByReference(brClass = GpioPinValueChangedEventArgs.ByReference::class)
public class GpioPinValueChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGpioPinValueChangedEventArgs.WithDefault, IWinRTObject {
  private val __911477452_Interface: IGpioPinValueChangedEventArgs.WithDefault by lazy {
    as_911477452()
  }


  public override val __911477452_Ptr: JNAPointer? by lazy {
    __911477452_Interface.__911477452_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__911477452_Interface)

  private fun as_911477452(): IGpioPinValueChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGpioPinValueChangedEventArgs.ABI.makeIGpioPinValueChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGpioPinValueChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGpioPinValueChangedEventArgs.ABI.makeIGpioPinValueChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GpioPinValueChangedEventArgs> {
    public override fun getValue() = GpioPinValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GpioPinValueChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GpioPinValueChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GpioPinValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return GpioPinValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GpioPinValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
