package Windows.Devices.Sensors

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Compass.ABI::class)
@Signature("rc(Windows.Devices.Sensors.Compass;{292ffa94-1b45-403c-ba06-b106dba69a64})")
@WinRTByReference(brClass = Compass.ByReference::class)
public class Compass(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompass.WithDefault, ICompassDeviceId.WithDefault, ICompass2.WithDefault,
    ICompass3.WithDefault, ICompass4.WithDefault, IWinRTObject {
  private val __1682385318_Interface: ICompass.WithDefault by lazy {
    as_1682385318()
  }


  private val __1922731561_Interface: ICompassDeviceId.WithDefault by lazy {
    as_1922731561()
  }


  private val __614337356_Interface: ICompass2.WithDefault by lazy {
    as_614337356()
  }


  private val __614337357_Interface: ICompass3.WithDefault by lazy {
    as_614337357()
  }


  private val __614337358_Interface: ICompass4.WithDefault by lazy {
    as_614337358()
  }


  public override val __1682385318_Ptr: JNAPointer? by lazy {
    __1682385318_Interface.__1682385318_Ptr
  }


  public override val __1922731561_Ptr: JNAPointer? by lazy {
    __1922731561_Interface.__1922731561_Ptr
  }


  public override val __614337356_Ptr: JNAPointer? by lazy {
    __614337356_Interface.__614337356_Ptr
  }


  public override val __614337357_Ptr: JNAPointer? by lazy {
    __614337357_Interface.__614337357_Ptr
  }


  public override val __614337358_Ptr: JNAPointer? by lazy {
    __614337358_Interface.__614337358_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1682385318_Interface, __1922731561_Interface, __614337356_Interface,
        __614337357_Interface, __614337358_Interface)

  private fun as_1682385318(): ICompass.WithDefault {
    if(pointer == NULL) {
      return(ICompass.ABI.makeICompass(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompass>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompass.ABI.makeICompass(ref.value))
  }

  private fun as_1922731561(): ICompassDeviceId.WithDefault {
    if(pointer == NULL) {
      return(ICompassDeviceId.ABI.makeICompassDeviceId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompassDeviceId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompassDeviceId.ABI.makeICompassDeviceId(ref.value))
  }

  private fun as_614337356(): ICompass2.WithDefault {
    if(pointer == NULL) {
      return(ICompass2.ABI.makeICompass2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompass2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompass2.ABI.makeICompass2(ref.value))
  }

  private fun as_614337357(): ICompass3.WithDefault {
    if(pointer == NULL) {
      return(ICompass3.ABI.makeICompass3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompass3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompass3.ABI.makeICompass3(ref.value))
  }

  private fun as_614337358(): ICompass4.WithDefault {
    if(pointer == NULL) {
      return(ICompass4.ABI.makeICompass4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompass4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompass4.ABI.makeICompass4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Compass> {
    public override fun getValue() = Compass(pointer.getPointer(0))

    public fun setValue(value: Compass): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Compass, MemoryAddress> {
    public val ICompassStatics2_Instance: ICompassStatics2 by lazy {
      createICompassStatics2()
    }


    public val ICompassStatics_Instance: ICompassStatics by lazy {
      createICompassStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompassStatics2(): ICompassStatics2 {
      val refiid = Guid.REFIID(ICompassStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Compass".toHandle(),refiid,interfacePtr)
      val result = ICompassStatics2.ABI.makeICompassStatics2(interfacePtr.value)
      return result
    }

    public fun createICompassStatics(): ICompassStatics {
      val refiid = Guid.REFIID(ICompassStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sensors.Compass".toHandle(),refiid,interfacePtr)
      val result = ICompassStatics.ABI.makeICompassStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Compass {
      val address = segment.toRawLongValue()
      return Compass(Pointer(address))
    }

    public override fun toNative(obj: Compass): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.ICompassStatics2_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) = ABI.ICompassStatics2_Instance.FromIdAsync(deviceId)

    public fun GetDefault() = ABI.ICompassStatics_Instance.GetDefault()
  }
}
