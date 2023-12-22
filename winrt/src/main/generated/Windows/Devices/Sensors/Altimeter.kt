package Windows.Devices.Sensors

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(Altimeter.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Altimeter;{72f057fd-8f04-49f1-b4a7-f4e363b701a2})")
@WinRTByReference(brClass = Altimeter.ByReference::class)
public class Altimeter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAltimeter.WithDefault, IAltimeter2.WithDefault, IWinRTObject {
  private val __1978889021_Interface: IAltimeter.WithDefault by lazy {
    as_1978889021()
  }


  private val __1216017557_Interface: IAltimeter2.WithDefault by lazy {
    as_1216017557()
  }


  public override val __1978889021_Ptr: JNAPointer? by lazy {
    __1978889021_Interface.__1978889021_Ptr
  }


  public override val __1216017557_Ptr: JNAPointer? by lazy {
    __1216017557_Interface.__1216017557_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1978889021_Interface, __1216017557_Interface)

  private fun as_1978889021(): IAltimeter.WithDefault {
    if(pointer == NULL) {
      return(IAltimeter.ABI.makeIAltimeter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAltimeter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAltimeter.ABI.makeIAltimeter(ref.value))
  }

  private fun as_1216017557(): IAltimeter2.WithDefault {
    if(pointer == NULL) {
      return(IAltimeter2.ABI.makeIAltimeter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAltimeter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAltimeter2.ABI.makeIAltimeter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Altimeter> {
    public override fun getValue() = Altimeter(pointer.getPointer(0))

    public fun setValue(value: Altimeter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Altimeter, MemoryAddress> {
    public val IAltimeterStatics_Instance: IAltimeterStatics by lazy {
      createIAltimeterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAltimeterStatics(): IAltimeterStatics {
      val refiid = Guid.REFIID(IAltimeterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Altimeter".toHandle(),refiid,interfacePtr)
      val result = IAltimeterStatics.ABI.makeIAltimeterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Altimeter {
      val address = segment.toRawLongValue()
      return Altimeter(Pointer(address))
    }

    public override fun toNative(obj: Altimeter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IAltimeterStatics_Instance.GetDefault()
  }
}
