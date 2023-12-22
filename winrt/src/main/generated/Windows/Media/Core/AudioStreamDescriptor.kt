package Windows.Media.Core

import Windows.Media.Core.IAudioStreamDescriptorFactory.ABI.IID
import Windows.Media.MediaProperties.AudioEncodingProperties
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

@ABIMarker(AudioStreamDescriptor.ABI::class)
@Signature("rc(Windows.Media.Core.AudioStreamDescriptor;{1e3692e4-4027-4847-a70b-df1d9a2a7b04})")
@WinRTByReference(brClass = AudioStreamDescriptor.ByReference::class)
public class AudioStreamDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioStreamDescriptor.WithDefault, IMediaStreamDescriptor.WithDefault,
    IAudioStreamDescriptor2.WithDefault, IMediaStreamDescriptor2.WithDefault,
    IAudioStreamDescriptor3.WithDefault, IWinRTObject {
  private val __1806875824_Interface: IAudioStreamDescriptor.WithDefault by lazy {
    as_1806875824()
  }


  private val __1209088862_Interface: IMediaStreamDescriptor.WithDefault by lazy {
    as_1209088862()
  }


  private val __178575646_Interface: IAudioStreamDescriptor2.WithDefault by lazy {
    as_178575646()
  }


  private val __1172950892_Interface: IMediaStreamDescriptor2.WithDefault by lazy {
    as_1172950892()
  }


  private val __178575645_Interface: IAudioStreamDescriptor3.WithDefault by lazy {
    as_178575645()
  }


  public override val __1806875824_Ptr: JNAPointer? by lazy {
    __1806875824_Interface.__1806875824_Ptr
  }


  public override val __1209088862_Ptr: JNAPointer? by lazy {
    __1209088862_Interface.__1209088862_Ptr
  }


  public override val __178575646_Ptr: JNAPointer? by lazy {
    __178575646_Interface.__178575646_Ptr
  }


  public override val __1172950892_Ptr: JNAPointer? by lazy {
    __1172950892_Interface.__1172950892_Ptr
  }


  public override val __178575645_Ptr: JNAPointer? by lazy {
    __178575645_Interface.__178575645_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1806875824_Interface, __1209088862_Interface, __178575646_Interface,
        __1172950892_Interface, __178575645_Interface)

  public constructor(encodingProperties: AudioEncodingProperties) :
      this(ABI.activate(encodingProperties))

  private fun as_1806875824(): IAudioStreamDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IAudioStreamDescriptor.ABI.makeIAudioStreamDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioStreamDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioStreamDescriptor.ABI.makeIAudioStreamDescriptor(ref.value))
  }

  private fun as_1209088862(): IMediaStreamDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamDescriptor.ABI.makeIMediaStreamDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamDescriptor.ABI.makeIMediaStreamDescriptor(ref.value))
  }

  private fun as_178575646(): IAudioStreamDescriptor2.WithDefault {
    if(pointer == NULL) {
      return(IAudioStreamDescriptor2.ABI.makeIAudioStreamDescriptor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioStreamDescriptor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioStreamDescriptor2.ABI.makeIAudioStreamDescriptor2(ref.value))
  }

  private fun as_1172950892(): IMediaStreamDescriptor2.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamDescriptor2.ABI.makeIMediaStreamDescriptor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamDescriptor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamDescriptor2.ABI.makeIMediaStreamDescriptor2(ref.value))
  }

  private fun as_178575645(): IAudioStreamDescriptor3.WithDefault {
    if(pointer == NULL) {
      return(IAudioStreamDescriptor3.ABI.makeIAudioStreamDescriptor3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioStreamDescriptor3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioStreamDescriptor3.ABI.makeIAudioStreamDescriptor3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioStreamDescriptor> {
    public override fun getValue() = AudioStreamDescriptor(pointer.getPointer(0))

    public fun setValue(value: AudioStreamDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioStreamDescriptor, MemoryAddress> {
    public val IAudioStreamDescriptorFactory_Instance: IAudioStreamDescriptorFactory by lazy {
      createIAudioStreamDescriptorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioStreamDescriptorFactory(): IAudioStreamDescriptorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.AudioStreamDescriptor".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAudioStreamDescriptorFactory.ABI.makeIAudioStreamDescriptorFactory(factoryActivatorPtr.value))
    }

    public fun activate(encodingProperties: AudioEncodingProperties): JNAPointer? =
        IAudioStreamDescriptorFactory_Instance.Create(encodingProperties)?.pointer

    public override fun fromNative(segment: MemoryAddress): AudioStreamDescriptor {
      val address = segment.toRawLongValue()
      return AudioStreamDescriptor(Pointer(address))
    }

    public override fun toNative(obj: AudioStreamDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
