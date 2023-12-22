package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandModem.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandModem;{d0356912-e9f9-4f67-a03d-43189a316bf1})")
@WinRTByReference(brClass = MobileBroadbandModem.ByReference::class)
public class MobileBroadbandModem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandModem.WithDefault, IMobileBroadbandModem2.WithDefault,
    IMobileBroadbandModem3.WithDefault, IWinRTObject {
  private val __240854638_Interface: IMobileBroadbandModem.WithDefault by lazy {
    as_240854638()
  }


  private val __1123440764_Interface: IMobileBroadbandModem2.WithDefault by lazy {
    as_1123440764()
  }


  private val __1123440763_Interface: IMobileBroadbandModem3.WithDefault by lazy {
    as_1123440763()
  }


  public override val __240854638_Ptr: JNAPointer? by lazy {
    __240854638_Interface.__240854638_Ptr
  }


  public override val __1123440764_Ptr: JNAPointer? by lazy {
    __1123440764_Interface.__1123440764_Ptr
  }


  public override val __1123440763_Ptr: JNAPointer? by lazy {
    __1123440763_Interface.__1123440763_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__240854638_Interface, __1123440764_Interface, __1123440763_Interface)

  private fun as_240854638(): IMobileBroadbandModem.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandModem.ABI.makeIMobileBroadbandModem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandModem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandModem.ABI.makeIMobileBroadbandModem(ref.value))
  }

  private fun as_1123440764(): IMobileBroadbandModem2.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandModem2.ABI.makeIMobileBroadbandModem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandModem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandModem2.ABI.makeIMobileBroadbandModem2(ref.value))
  }

  private fun as_1123440763(): IMobileBroadbandModem3.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandModem3.ABI.makeIMobileBroadbandModem3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandModem3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandModem3.ABI.makeIMobileBroadbandModem3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandModem> {
    public override fun getValue() = MobileBroadbandModem(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandModem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandModem, MemoryAddress> {
    public val IMobileBroadbandModemStatics_Instance: IMobileBroadbandModemStatics by lazy {
      createIMobileBroadbandModemStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMobileBroadbandModemStatics(): IMobileBroadbandModemStatics {
      val refiid = Guid.REFIID(IMobileBroadbandModemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.MobileBroadbandModem".toHandle(),refiid,interfacePtr)
      val result =
          IMobileBroadbandModemStatics.ABI.makeIMobileBroadbandModemStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandModem {
      val address = segment.toRawLongValue()
      return MobileBroadbandModem(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandModem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.IMobileBroadbandModemStatics_Instance.GetDeviceSelector()

    public fun FromId(deviceId: String) = ABI.IMobileBroadbandModemStatics_Instance.FromId(deviceId)

    public fun GetDefault() = ABI.IMobileBroadbandModemStatics_Instance.GetDefault()
  }
}
