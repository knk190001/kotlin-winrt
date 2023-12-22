package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiNoteOffMessageFactory.ABI.IID
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
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MidiNoteOffMessage.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiNoteOffMessage;{16fd8af4-198e-4d8f-a654-d305a293548f})")
@WinRTByReference(brClass = MidiNoteOffMessage.ByReference::class)
public class MidiNoteOffMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiNoteOffMessage.WithDefault, IMidiMessage.WithDefault, IWinRTObject {
  private val __1943481399_Interface: IMidiNoteOffMessage.WithDefault by lazy {
    as_1943481399()
  }


  private val __450265702_Interface: IMidiMessage.WithDefault by lazy {
    as_450265702()
  }


  public override val __1943481399_Ptr: JNAPointer? by lazy {
    __1943481399_Interface.__1943481399_Ptr
  }


  public override val __450265702_Ptr: JNAPointer? by lazy {
    __450265702_Interface.__450265702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1943481399_Interface, __450265702_Interface)

  public constructor(
    channel: Byte,
    note: Byte,
    velocity: Byte
  ) : this(ABI.activate(channel, note, velocity))

  private fun as_1943481399(): IMidiNoteOffMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiNoteOffMessage.ABI.makeIMidiNoteOffMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiNoteOffMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiNoteOffMessage.ABI.makeIMidiNoteOffMessage(ref.value))
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
      IByReference<MidiNoteOffMessage> {
    public override fun getValue() = MidiNoteOffMessage(pointer.getPointer(0))

    public fun setValue(value: MidiNoteOffMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiNoteOffMessage, MemoryAddress> {
    public val IMidiNoteOffMessageFactory_Instance: IMidiNoteOffMessageFactory by lazy {
      createIMidiNoteOffMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiNoteOffMessageFactory(): IMidiNoteOffMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiNoteOffMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMidiNoteOffMessageFactory.ABI.makeIMidiNoteOffMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      channel: Byte,
      note: Byte,
      velocity: Byte
    ): JNAPointer? = IMidiNoteOffMessageFactory_Instance.CreateMidiNoteOffMessage(channel, note,
        velocity)?.pointer

    public override fun fromNative(segment: MemoryAddress): MidiNoteOffMessage {
      val address = segment.toRawLongValue()
      return MidiNoteOffMessage(Pointer(address))
    }

    public override fun toNative(obj: MidiNoteOffMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
