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

@ABIMarker(AltimeterReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.AltimeterReading;{fbe8ef73-7f5e-48c8-aa1a-f1f3befc1144})")
@WinRTByReference(brClass = AltimeterReading.ByReference::class)
public class AltimeterReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAltimeterReading.WithDefault, IAltimeterReading2.WithDefault, IWinRTObject {
  private val __236668047_Interface: IAltimeterReading.WithDefault by lazy {
    as_236668047()
  }


  private val __1253225085_Interface: IAltimeterReading2.WithDefault by lazy {
    as_1253225085()
  }


  public override val __236668047_Ptr: JNAPointer? by lazy {
    __236668047_Interface.__236668047_Ptr
  }


  public override val __1253225085_Ptr: JNAPointer? by lazy {
    __1253225085_Interface.__1253225085_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__236668047_Interface, __1253225085_Interface)

  private fun as_236668047(): IAltimeterReading.WithDefault {
    if(pointer == NULL) {
      return(IAltimeterReading.ABI.makeIAltimeterReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAltimeterReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAltimeterReading.ABI.makeIAltimeterReading(ref.value))
  }

  private fun as_1253225085(): IAltimeterReading2.WithDefault {
    if(pointer == NULL) {
      return(IAltimeterReading2.ABI.makeIAltimeterReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAltimeterReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAltimeterReading2.ABI.makeIAltimeterReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AltimeterReading> {
    public override fun getValue() = AltimeterReading(pointer.getPointer(0))

    public fun setValue(value: AltimeterReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AltimeterReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AltimeterReading {
      val address = segment.toRawLongValue()
      return AltimeterReading(Pointer(address))
    }

    public override fun toNative(obj: AltimeterReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
