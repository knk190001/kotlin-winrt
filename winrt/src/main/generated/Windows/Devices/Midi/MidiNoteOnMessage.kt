package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiNoteOnMessageFactory.ABI.IID
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

@ABIMarker(MidiNoteOnMessage.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiNoteOnMessage;{e0224af5-6181-46dd-afa2-410004c057aa})")
@WinRTByReference(brClass = MidiNoteOnMessage.ByReference::class)
public class MidiNoteOnMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiNoteOnMessage.WithDefault, IMidiMessage.WithDefault, IWinRTObject {
  private val __2077361321_Interface: IMidiNoteOnMessage.WithDefault by lazy {
    as_2077361321()
  }


  private val __450265702_Interface: IMidiMessage.WithDefault by lazy {
    as_450265702()
  }


  public override val __2077361321_Ptr: JNAPointer? by lazy {
    __2077361321_Interface.__2077361321_Ptr
  }


  public override val __450265702_Ptr: JNAPointer? by lazy {
    __450265702_Interface.__450265702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2077361321_Interface, __450265702_Interface)

  public constructor(
    channel: Byte,
    note: Byte,
    velocity: Byte
  ) : this(ABI.activate(channel, note, velocity))

  private fun as_2077361321(): IMidiNoteOnMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiNoteOnMessage.ABI.makeIMidiNoteOnMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiNoteOnMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiNoteOnMessage.ABI.makeIMidiNoteOnMessage(ref.value))
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
      IByReference<MidiNoteOnMessage> {
    public override fun getValue() = MidiNoteOnMessage(pointer.getPointer(0))

    public fun setValue(value: MidiNoteOnMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiNoteOnMessage, MemoryAddress> {
    public val IMidiNoteOnMessageFactory_Instance: IMidiNoteOnMessageFactory by lazy {
      createIMidiNoteOnMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiNoteOnMessageFactory(): IMidiNoteOnMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiNoteOnMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMidiNoteOnMessageFactory.ABI.makeIMidiNoteOnMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      channel: Byte,
      note: Byte,
      velocity: Byte
    ): JNAPointer? = IMidiNoteOnMessageFactory_Instance.CreateMidiNoteOnMessage(channel, note,
        velocity)?.pointer

    public override fun fromNative(segment: MemoryAddress): MidiNoteOnMessage {
      val address = segment.toRawLongValue()
      return MidiNoteOnMessage(Pointer(address))
    }

    public override fun toNative(obj: MidiNoteOnMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
