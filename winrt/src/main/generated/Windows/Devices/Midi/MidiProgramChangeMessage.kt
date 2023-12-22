package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiProgramChangeMessageFactory.ABI.IID
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

@ABIMarker(MidiProgramChangeMessage.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiProgramChangeMessage;{9cbb3c78-7a3e-4327-aa98-20b8e4485af8})")
@WinRTByReference(brClass = MidiProgramChangeMessage.ByReference::class)
public class MidiProgramChangeMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiProgramChangeMessage.WithDefault, IMidiMessage.WithDefault, IWinRTObject
    {
  private val __457977696_Interface: IMidiProgramChangeMessage.WithDefault by lazy {
    as_457977696()
  }


  private val __450265702_Interface: IMidiMessage.WithDefault by lazy {
    as_450265702()
  }


  public override val __457977696_Ptr: JNAPointer? by lazy {
    __457977696_Interface.__457977696_Ptr
  }


  public override val __450265702_Ptr: JNAPointer? by lazy {
    __450265702_Interface.__450265702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__457977696_Interface, __450265702_Interface)

  public constructor(channel: Byte, program: Byte) : this(ABI.activate(channel, program))

  private fun as_457977696(): IMidiProgramChangeMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiProgramChangeMessage.ABI.makeIMidiProgramChangeMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiProgramChangeMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiProgramChangeMessage.ABI.makeIMidiProgramChangeMessage(ref.value))
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
      IByReference<MidiProgramChangeMessage> {
    public override fun getValue() = MidiProgramChangeMessage(pointer.getPointer(0))

    public fun setValue(value: MidiProgramChangeMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiProgramChangeMessage, MemoryAddress> {
    public val IMidiProgramChangeMessageFactory_Instance: IMidiProgramChangeMessageFactory by lazy {
      createIMidiProgramChangeMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiProgramChangeMessageFactory(): IMidiProgramChangeMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiProgramChangeMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMidiProgramChangeMessageFactory.ABI.makeIMidiProgramChangeMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(channel: Byte, program: Byte): JNAPointer? =
        IMidiProgramChangeMessageFactory_Instance.CreateMidiProgramChangeMessage(channel,
        program)?.pointer

    public override fun fromNative(segment: MemoryAddress): MidiProgramChangeMessage {
      val address = segment.toRawLongValue()
      return MidiProgramChangeMessage(Pointer(address))
    }

    public override fun toNative(obj: MidiProgramChangeMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
