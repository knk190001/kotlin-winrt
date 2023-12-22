package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiPolyphonicKeyPressureMessageFactory.ABI.IID
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

@ABIMarker(MidiPolyphonicKeyPressureMessage.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage;{1f7337fe-ace8-48a0-868e-7cdbf20f04d6})")
@WinRTByReference(brClass = MidiPolyphonicKeyPressureMessage.ByReference::class)
public class MidiPolyphonicKeyPressureMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiPolyphonicKeyPressureMessage.WithDefault, IMidiMessage.WithDefault,
    IWinRTObject {
  private val __480242893_Interface: IMidiPolyphonicKeyPressureMessage.WithDefault by lazy {
    as_480242893()
  }


  private val __450265702_Interface: IMidiMessage.WithDefault by lazy {
    as_450265702()
  }


  public override val __480242893_Ptr: JNAPointer? by lazy {
    __480242893_Interface.__480242893_Ptr
  }


  public override val __450265702_Ptr: JNAPointer? by lazy {
    __450265702_Interface.__450265702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__480242893_Interface, __450265702_Interface)

  public constructor(
    channel: Byte,
    note: Byte,
    pressure: Byte
  ) : this(ABI.activate(channel, note, pressure))

  private fun as_480242893(): IMidiPolyphonicKeyPressureMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiPolyphonicKeyPressureMessage.ABI.makeIMidiPolyphonicKeyPressureMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiPolyphonicKeyPressureMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiPolyphonicKeyPressureMessage.ABI.makeIMidiPolyphonicKeyPressureMessage(ref.value))
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
      IByReference<MidiPolyphonicKeyPressureMessage> {
    public override fun getValue() = MidiPolyphonicKeyPressureMessage(pointer.getPointer(0))

    public fun setValue(value: MidiPolyphonicKeyPressureMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiPolyphonicKeyPressureMessage, MemoryAddress> {
    public val IMidiPolyphonicKeyPressureMessageFactory_Instance:
        IMidiPolyphonicKeyPressureMessageFactory by lazy {
      createIMidiPolyphonicKeyPressureMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiPolyphonicKeyPressureMessageFactory():
        IMidiPolyphonicKeyPressureMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMidiPolyphonicKeyPressureMessageFactory.ABI.makeIMidiPolyphonicKeyPressureMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      channel: Byte,
      note: Byte,
      pressure: Byte
    ): JNAPointer? =
        IMidiPolyphonicKeyPressureMessageFactory_Instance.CreateMidiPolyphonicKeyPressureMessage(channel,
        note, pressure)?.pointer

    public override fun fromNative(segment: MemoryAddress): MidiPolyphonicKeyPressureMessage {
      val address = segment.toRawLongValue()
      return MidiPolyphonicKeyPressureMessage(Pointer(address))
    }

    public override fun toNative(obj: MidiPolyphonicKeyPressureMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
