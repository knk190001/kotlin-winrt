package Windows.Devices.Midi

import Windows.Devices.Enumeration.DeviceInformation
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MidiSynthesizer.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiSynthesizer;{f0da155e-db90-405f-b8ae-21d2e17f2e45})")
@WinRTByReference(brClass = MidiSynthesizer.ByReference::class)
public class MidiSynthesizer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiSynthesizer.WithDefault, IMidiOutPort.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __1743130213_Interface: IMidiSynthesizer.WithDefault by lazy {
    as_1743130213()
  }


  private val __1782702722_Interface: IMidiOutPort.WithDefault by lazy {
    as_1782702722()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1743130213_Ptr: JNAPointer? by lazy {
    __1743130213_Interface.__1743130213_Ptr
  }


  public override val __1782702722_Ptr: JNAPointer? by lazy {
    __1782702722_Interface.__1782702722_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1743130213_Interface, __1782702722_Interface, __1260617006_Interface)

  private fun as_1743130213(): IMidiSynthesizer.WithDefault {
    if(pointer == NULL) {
      return(IMidiSynthesizer.ABI.makeIMidiSynthesizer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiSynthesizer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiSynthesizer.ABI.makeIMidiSynthesizer(ref.value))
  }

  private fun as_1782702722(): IMidiOutPort.WithDefault {
    if(pointer == NULL) {
      return(IMidiOutPort.ABI.makeIMidiOutPort(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiOutPort>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiOutPort.ABI.makeIMidiOutPort(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MidiSynthesizer> {
    public override fun getValue() = MidiSynthesizer(pointer.getPointer(0))

    public fun setValue(value: MidiSynthesizer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiSynthesizer, MemoryAddress> {
    public val IMidiSynthesizerStatics_Instance: IMidiSynthesizerStatics by lazy {
      createIMidiSynthesizerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiSynthesizerStatics(): IMidiSynthesizerStatics {
      val refiid = Guid.REFIID(IMidiSynthesizerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiSynthesizer".toHandle(),refiid,interfacePtr)
      val result = IMidiSynthesizerStatics.ABI.makeIMidiSynthesizerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MidiSynthesizer {
      val address = segment.toRawLongValue()
      return MidiSynthesizer(Pointer(address))
    }

    public override fun toNative(obj: MidiSynthesizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync() = ABI.IMidiSynthesizerStatics_Instance.CreateAsync()

    public fun CreateAsync(audioDevice: DeviceInformation) =
        ABI.IMidiSynthesizerStatics_Instance.CreateAsync(audioDevice)

    public fun IsSynthesizer(midiDevice: DeviceInformation) =
        ABI.IMidiSynthesizerStatics_Instance.IsSynthesizer(midiDevice)
  }
}
