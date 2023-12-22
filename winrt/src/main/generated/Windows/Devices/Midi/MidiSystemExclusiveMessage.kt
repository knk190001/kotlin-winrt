package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiSystemExclusiveMessageFactory.ABI.IID
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(MidiSystemExclusiveMessage.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiSystemExclusiveMessage;{79767945-1094-4283-9be0-289fc0ee8334})")
@WinRTByReference(brClass = MidiSystemExclusiveMessage.ByReference::class)
public class MidiSystemExclusiveMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiMessage.WithDefault, IWinRTObject {
  private val __450265702_Interface: IMidiMessage.WithDefault by lazy {
    as_450265702()
  }


  public override val __450265702_Ptr: JNAPointer? by lazy {
    __450265702_Interface.__450265702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__450265702_Interface)

  public constructor(rawData: IBuffer) : this(ABI.activate(rawData))

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
      IByReference<MidiSystemExclusiveMessage> {
    public override fun getValue() = MidiSystemExclusiveMessage(pointer.getPointer(0))

    public fun setValue(value: MidiSystemExclusiveMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiSystemExclusiveMessage, MemoryAddress> {
    public val IMidiSystemExclusiveMessageFactory_Instance: IMidiSystemExclusiveMessageFactory by
        lazy {
      createIMidiSystemExclusiveMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiSystemExclusiveMessageFactory(): IMidiSystemExclusiveMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiSystemExclusiveMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMidiSystemExclusiveMessageFactory.ABI.makeIMidiSystemExclusiveMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(rawData: IBuffer): JNAPointer? =
        IMidiSystemExclusiveMessageFactory_Instance.CreateMidiSystemExclusiveMessage(rawData)?.pointer

    public override fun fromNative(segment: MemoryAddress): MidiSystemExclusiveMessage {
      val address = segment.toRawLongValue()
      return MidiSystemExclusiveMessage(Pointer(address))
    }

    public override fun toNative(obj: MidiSystemExclusiveMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
