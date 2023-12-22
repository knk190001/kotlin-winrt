package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiChannelPressureMessageFactory.ABI.IID
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

@ABIMarker(MidiChannelPressureMessage.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiChannelPressureMessage;{be1fa860-62b4-4d52-a37e-92e54d35b909})")
@WinRTByReference(brClass = MidiChannelPressureMessage.ByReference::class)
public class MidiChannelPressureMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiChannelPressureMessage.WithDefault, IMidiMessage.WithDefault,
    IWinRTObject {
  private val __1766807692_Interface: IMidiChannelPressureMessage.WithDefault by lazy {
    as_1766807692()
  }


  private val __450265702_Interface: IMidiMessage.WithDefault by lazy {
    as_450265702()
  }


  public override val __1766807692_Ptr: JNAPointer? by lazy {
    __1766807692_Interface.__1766807692_Ptr
  }


  public override val __450265702_Ptr: JNAPointer? by lazy {
    __450265702_Interface.__450265702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1766807692_Interface, __450265702_Interface)

  public constructor(channel: Byte, pressure: Byte) : this(ABI.activate(channel, pressure))

  private fun as_1766807692(): IMidiChannelPressureMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiChannelPressureMessage.ABI.makeIMidiChannelPressureMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiChannelPressureMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiChannelPressureMessage.ABI.makeIMidiChannelPressureMessage(ref.value))
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
      IByReference<MidiChannelPressureMessage> {
    public override fun getValue() = MidiChannelPressureMessage(pointer.getPointer(0))

    public fun setValue(value: MidiChannelPressureMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiChannelPressureMessage, MemoryAddress> {
    public val IMidiChannelPressureMessageFactory_Instance: IMidiChannelPressureMessageFactory by
        lazy {
      createIMidiChannelPressureMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiChannelPressureMessageFactory(): IMidiChannelPressureMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiChannelPressureMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMidiChannelPressureMessageFactory.ABI.makeIMidiChannelPressureMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(channel: Byte, pressure: Byte): JNAPointer? =
        IMidiChannelPressureMessageFactory_Instance.CreateMidiChannelPressureMessage(channel,
        pressure)?.pointer

    public override fun fromNative(segment: MemoryAddress): MidiChannelPressureMessage {
      val address = segment.toRawLongValue()
      return MidiChannelPressureMessage(Pointer(address))
    }

    public override fun toNative(obj: MidiChannelPressureMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
