package Windows.Devices.Midi

import Windows.Foundation.IClosable
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

@ABIMarker(MidiInPort.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiInPort;{d5c1d9db-971a-4eaf-a23d-ea19fe607ff9})")
@WinRTByReference(brClass = MidiInPort.ByReference::class)
public class MidiInPort(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiInPort.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1922890925_Interface: IMidiInPort.WithDefault by lazy {
    as_1922890925()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1922890925_Ptr: JNAPointer? by lazy {
    __1922890925_Interface.__1922890925_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1922890925_Interface, __1260617006_Interface)

  private fun as_1922890925(): IMidiInPort.WithDefault {
    if(pointer == NULL) {
      return(IMidiInPort.ABI.makeIMidiInPort(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiInPort>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiInPort.ABI.makeIMidiInPort(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MidiInPort> {
    public override fun getValue() = MidiInPort(pointer.getPointer(0))

    public fun setValue(value: MidiInPort): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiInPort, MemoryAddress> {
    public val IMidiInPortStatics_Instance: IMidiInPortStatics by lazy {
      createIMidiInPortStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiInPortStatics(): IMidiInPortStatics {
      val refiid = Guid.REFIID(IMidiInPortStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiInPort".toHandle(),refiid,interfacePtr)
      val result = IMidiInPortStatics.ABI.makeIMidiInPortStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MidiInPort {
      val address = segment.toRawLongValue()
      return MidiInPort(Pointer(address))
    }

    public override fun toNative(obj: MidiInPort): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(deviceId: String) = ABI.IMidiInPortStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.IMidiInPortStatics_Instance.GetDeviceSelector()
  }
}
