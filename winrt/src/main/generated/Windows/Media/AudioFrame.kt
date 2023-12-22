package Windows.Media

import Windows.Foundation.IClosable
import Windows.Media.IAudioFrameFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioFrame.ABI::class)
@Signature("rc(Windows.Media.AudioFrame;{e36ac304-aab2-4277-9ed0-43cedf8e29c6})")
@WinRTByReference(brClass = AudioFrame.ByReference::class)
public class AudioFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioFrame.WithDefault, IMediaFrame.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __765788743_Interface: IAudioFrame.WithDefault by lazy {
    as_765788743()
  }


  private val __1156286201_Interface: IMediaFrame.WithDefault by lazy {
    as_1156286201()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __765788743_Ptr: JNAPointer? by lazy {
    __765788743_Interface.__765788743_Ptr
  }


  public override val __1156286201_Ptr: JNAPointer? by lazy {
    __1156286201_Interface.__1156286201_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__765788743_Interface, __1156286201_Interface, __1260617006_Interface)

  public constructor(capacity: WinDef.UINT) : this(ABI.activate(capacity))

  private fun as_765788743(): IAudioFrame.WithDefault {
    if(pointer == NULL) {
      return(IAudioFrame.ABI.makeIAudioFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioFrame.ABI.makeIAudioFrame(ref.value))
  }

  private fun as_1156286201(): IMediaFrame.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrame.ABI.makeIMediaFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrame.ABI.makeIMediaFrame(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AudioFrame> {
    public override fun getValue() = AudioFrame(pointer.getPointer(0))

    public fun setValue(value: AudioFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioFrame, MemoryAddress> {
    public val IAudioFrameFactory_Instance: IAudioFrameFactory by lazy {
      createIAudioFrameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioFrameFactory(): IAudioFrameFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.AudioFrame".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAudioFrameFactory.ABI.makeIAudioFrameFactory(factoryActivatorPtr.value))
    }

    public fun activate(capacity: WinDef.UINT): JNAPointer? =
        IAudioFrameFactory_Instance.Create(capacity)?.pointer

    public override fun fromNative(segment: MemoryAddress): AudioFrame {
      val address = segment.toRawLongValue()
      return AudioFrame(Pointer(address))
    }

    public override fun toNative(obj: AudioFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
