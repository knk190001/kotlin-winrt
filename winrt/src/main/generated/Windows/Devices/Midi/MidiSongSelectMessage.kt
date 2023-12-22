package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiSongSelectMessageFactory.ABI.IID
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

@ABIMarker(MidiSongSelectMessage.ABI::class)
@Signature("rc(Windows.Devices.Midi.MidiSongSelectMessage;{49f0f27f-6d83-4741-a5bf-4629f6be974f})")
@WinRTByReference(brClass = MidiSongSelectMessage.ByReference::class)
public class MidiSongSelectMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMidiSongSelectMessage.WithDefault, IMidiMessage.WithDefault, IWinRTObject {
  private val __1007932969_Interface: IMidiSongSelectMessage.WithDefault by lazy {
    as_1007932969()
  }


  private val __450265702_Interface: IMidiMessage.WithDefault by lazy {
    as_450265702()
  }


  public override val __1007932969_Ptr: JNAPointer? by lazy {
    __1007932969_Interface.__1007932969_Ptr
  }


  public override val __450265702_Ptr: JNAPointer? by lazy {
    __450265702_Interface.__450265702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1007932969_Interface, __450265702_Interface)

  public constructor(song: Byte) : this(ABI.activate(song))

  private fun as_1007932969(): IMidiSongSelectMessage.WithDefault {
    if(pointer == NULL) {
      return(IMidiSongSelectMessage.ABI.makeIMidiSongSelectMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMidiSongSelectMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMidiSongSelectMessage.ABI.makeIMidiSongSelectMessage(ref.value))
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
      IByReference<MidiSongSelectMessage> {
    public override fun getValue() = MidiSongSelectMessage(pointer.getPointer(0))

    public fun setValue(value: MidiSongSelectMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MidiSongSelectMessage, MemoryAddress> {
    public val IMidiSongSelectMessageFactory_Instance: IMidiSongSelectMessageFactory by lazy {
      createIMidiSongSelectMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMidiSongSelectMessageFactory(): IMidiSongSelectMessageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Midi.MidiSongSelectMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMidiSongSelectMessageFactory.ABI.makeIMidiSongSelectMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(song: Byte): JNAPointer? =
        IMidiSongSelectMessageFactory_Instance.CreateMidiSongSelectMessage(song)?.pointer

    public override fun fromNative(segment: MemoryAddress): MidiSongSelectMessage {
      val address = segment.toRawLongValue()
      return MidiSongSelectMessage(Pointer(address))
    }

    public override fun toNative(obj: MidiSongSelectMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
