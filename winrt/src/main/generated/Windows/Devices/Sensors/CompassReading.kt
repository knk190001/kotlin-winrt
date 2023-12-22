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

@ABIMarker(CompassReading.ABI::class)
@Signature("rc(Windows.Devices.Sensors.CompassReading;{82911128-513d-4dc9-b781-5eedfbf02d0c})")
@WinRTByReference(brClass = CompassReading.ByReference::class)
public class CompassReading(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompassReading.WithDefault, ICompassReadingHeadingAccuracy.WithDefault,
    ICompassReading2.WithDefault, IWinRTObject {
  private val __1649789434_Interface: ICompassReading.WithDefault by lazy {
    as_1649789434()
  }


  private val __540962357_Interface: ICompassReadingHeadingAccuracy.WithDefault by lazy {
    as_540962357()
  }


  private val __396135148_Interface: ICompassReading2.WithDefault by lazy {
    as_396135148()
  }


  public override val __1649789434_Ptr: JNAPointer? by lazy {
    __1649789434_Interface.__1649789434_Ptr
  }


  public override val __540962357_Ptr: JNAPointer? by lazy {
    __540962357_Interface.__540962357_Ptr
  }


  public override val __396135148_Ptr: JNAPointer? by lazy {
    __396135148_Interface.__396135148_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1649789434_Interface, __540962357_Interface, __396135148_Interface)

  private fun as_1649789434(): ICompassReading.WithDefault {
    if(pointer == NULL) {
      return(ICompassReading.ABI.makeICompassReading(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompassReading>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompassReading.ABI.makeICompassReading(ref.value))
  }

  private fun as_540962357(): ICompassReadingHeadingAccuracy.WithDefault {
    if(pointer == NULL) {
      return(ICompassReadingHeadingAccuracy.ABI.makeICompassReadingHeadingAccuracy(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompassReadingHeadingAccuracy>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompassReadingHeadingAccuracy.ABI.makeICompassReadingHeadingAccuracy(ref.value))
  }

  private fun as_396135148(): ICompassReading2.WithDefault {
    if(pointer == NULL) {
      return(ICompassReading2.ABI.makeICompassReading2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompassReading2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompassReading2.ABI.makeICompassReading2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CompassReading>
      {
    public override fun getValue() = CompassReading(pointer.getPointer(0))

    public fun setValue(value: CompassReading): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompassReading, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompassReading {
      val address = segment.toRawLongValue()
      return CompassReading(Pointer(address))
    }

    public override fun toNative(obj: CompassReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
