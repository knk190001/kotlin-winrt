package Windows.Devices.Radios

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

@ABIMarker(Radio.ABI::class)
@Signature("rc(Windows.Devices.Radios.Radio;{252118df-b33e-416a-875f-1cf38ae2d83e})")
@WinRTByReference(brClass = Radio.ByReference::class)
public class Radio(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadio.WithDefault, IWinRTObject {
  private val __96204646_Interface: IRadio.WithDefault by lazy {
    as_96204646()
  }


  public override val __96204646_Ptr: JNAPointer? by lazy {
    __96204646_Interface.__96204646_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__96204646_Interface)

  private fun as_96204646(): IRadio.WithDefault {
    if(pointer == NULL) {
      return(IRadio.ABI.makeIRadio(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadio>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadio.ABI.makeIRadio(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Radio> {
    public override fun getValue() = Radio(pointer.getPointer(0))

    public fun setValue(value: Radio): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Radio, MemoryAddress> {
    public val IRadioStatics_Instance: IRadioStatics by lazy {
      createIRadioStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadioStatics(): IRadioStatics {
      val refiid = Guid.REFIID(IRadioStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Radios.Radio".toHandle(),refiid,interfacePtr)
      val result = IRadioStatics.ABI.makeIRadioStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Radio {
      val address = segment.toRawLongValue()
      return Radio(Pointer(address))
    }

    public override fun toNative(obj: Radio): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetRadiosAsync() = ABI.IRadioStatics_Instance.GetRadiosAsync()

    public fun GetDeviceSelector() = ABI.IRadioStatics_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) = ABI.IRadioStatics_Instance.FromIdAsync(deviceId)

    public fun RequestAccessAsync() = ABI.IRadioStatics_Instance.RequestAccessAsync()
  }
}
