package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiPitchBendChangeMessageFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MidiPitchBendChangeMessage.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiPitchBendChangeMessage;{29df4cb1-2e9f-4faf-8c2b-9cb82a9079ca})")
@WinRTByReference(brClass = MidiPitchBendChangeMessage.ByReference::class)
public class MidiPitchBendChangeMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiPitchBendChangeMessage.WithDefault, IMidiMessage.WithDefault,
    IWinRTObject {
  private val __2118569003_Interface: IMidiPitchBendChangeMessage.WithDefault by lazy {
    as_2118569003()
  }


  private val __450265702_Interface: IMidiMessage.WithDefault by lazy {
    as_450265702()
  }


  public override val __2118569003_Ptr: JNAPointer? by lazy {
    __2118569003_Interface.__2118569003_Ptr
  }


  public override val __450265702_Ptr: JNAPointer? by lazy {
    __450265702_Interface.__450265702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2118569003_Interface, __450265702_Interface)

  public constructor(channel: Byte, bend: WinDef.USHORT) : this(ABI.activate(channel, bend))

  private fun as_2118569003(): IMidiPitchBendChangeMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiPitchBendChangeMessage.ABI.makeIMidiPitchBendChangeMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiPitchBendChangeMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiPitchBendChangeMessage.ABI.makeIMidiPitchBendChangeMessage(ref.value))
  }

  private fun as_450265702(): IMidiMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiMessage.ABI.makeIMidiMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiMessage.ABI.makeIMidiMessage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MidiPitchBendChangeMessage> {
    public override fun getValue() = MidiPitchBendChangeMessage(pointer.getPointer(0))

    public fun setValue(value: MidiPitchBendChangeMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiPitchBendChangeMessage, MemoryAddress> {
    public val IMidiPitchBendChangeMessageFactory_Instance: IMidiPitchBendChangeMessageFactory by
        lazy {
      createIMidiPitchBendChangeMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiPitchBendChangeMessageFactory(): IMidiPitchBendChangeMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiPitchBendChangeMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMidiPitchBendChangeMessageFactory.ABI.makeIMidiPitchBendChangeMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(channel: Byte, bend: WinDef.USHORT): JNAPointer? =
        IMidiPitchBendChangeMessageFactory_Instance.CreateMidiPitchBendChangeMessage(channel,
        bend)?.pointer

    public override fun fromNative(segment: MemoryAddress): MidiPitchBendChangeMessage {
      val address = segment.toRawLongValue()
      return MidiPitchBendChangeMessage(Pointer(address))
    }

    public override fun toNative(obj: MidiPitchBendChangeMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
