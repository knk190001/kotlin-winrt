package Windows.Media.MediaProperties

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(AudioEncodingProperties.ABI::class)
@Signature("rc(Windows.Media.MediaProperties.AudioEncodingProperties;{62bc7a16-005c-4b3b-8a0b-0a090e9687f3})")
@WinRTByReference(brClass = AudioEncodingProperties.ByReference::class)
public class AudioEncodingProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioEncodingProperties.WithDefault, IMediaEncodingProperties.WithDefault,
    IAudioEncodingPropertiesWithFormatUserData.WithDefault, IAudioEncodingProperties2.WithDefault,
    IAudioEncodingProperties3.WithDefault, IWinRTObject {
  private val __2055784821_Interface: IAudioEncodingProperties.WithDefault by lazy {
    as_2055784821()
  }


  private val __1294923267_Interface: IMediaEncodingProperties.WithDefault by lazy {
    as_1294923267()
  }


  private val __77954073_Interface: IAudioEncodingPropertiesWithFormatUserData.WithDefault by lazy {
    as_77954073()
  }


  private val __695179939_Interface: IAudioEncodingProperties2.WithDefault by lazy {
    as_695179939()
  }


  private val __695179938_Interface: IAudioEncodingProperties3.WithDefault by lazy {
    as_695179938()
  }


  public override val __2055784821_Ptr: JNAPointer? by lazy {
    __2055784821_Interface.__2055784821_Ptr
  }


  public override val __1294923267_Ptr: JNAPointer? by lazy {
    __1294923267_Interface.__1294923267_Ptr
  }


  public override val __77954073_Ptr: JNAPointer? by lazy {
    __77954073_Interface.__77954073_Ptr
  }


  public override val __695179939_Ptr: JNAPointer? by lazy {
    __695179939_Interface.__695179939_Ptr
  }


  public override val __695179938_Ptr: JNAPointer? by lazy {
    __695179938_Interface.__695179938_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2055784821_Interface, __1294923267_Interface, __77954073_Interface,
        __695179939_Interface, __695179938_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2055784821(): IAudioEncodingProperties.WithDefault {
    if(pointer == NULL) {
      return(IAudioEncodingProperties.ABI.makeIAudioEncodingProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioEncodingProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioEncodingProperties.ABI.makeIAudioEncodingProperties(ref.value))
  }

  private fun as_1294923267(): IMediaEncodingProperties.WithDefault {
    if(pointer == NULL) {
      return(IMediaEncodingProperties.ABI.makeIMediaEncodingProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaEncodingProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaEncodingProperties.ABI.makeIMediaEncodingProperties(ref.value))
  }

  private fun as_77954073(): IAudioEncodingPropertiesWithFormatUserData.WithDefault {
    if(pointer == NULL) {
      return(IAudioEncodingPropertiesWithFormatUserData.ABI.makeIAudioEncodingPropertiesWithFormatUserData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioEncodingPropertiesWithFormatUserData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioEncodingPropertiesWithFormatUserData.ABI.makeIAudioEncodingPropertiesWithFormatUserData(ref.value))
  }

  private fun as_695179939(): IAudioEncodingProperties2.WithDefault {
    if(pointer == NULL) {
      return(IAudioEncodingProperties2.ABI.makeIAudioEncodingProperties2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioEncodingProperties2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioEncodingProperties2.ABI.makeIAudioEncodingProperties2(ref.value))
  }

  private fun as_695179938(): IAudioEncodingProperties3.WithDefault {
    if(pointer == NULL) {
      return(IAudioEncodingProperties3.ABI.makeIAudioEncodingProperties3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioEncodingProperties3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioEncodingProperties3.ABI.makeIAudioEncodingProperties3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioEncodingProperties> {
    public override fun getValue() = AudioEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: AudioEncodingProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioEncodingProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAudioEncodingPropertiesStatics2_Instance: IAudioEncodingPropertiesStatics2 by lazy {
      createIAudioEncodingPropertiesStatics2()
    }


    public val IAudioEncodingPropertiesStatics_Instance: IAudioEncodingPropertiesStatics by lazy {
      createIAudioEncodingPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.AudioEncodingProperties".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIAudioEncodingPropertiesStatics2(): IAudioEncodingPropertiesStatics2 {
      val refiid = Guid.REFIID(IAudioEncodingPropertiesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.AudioEncodingProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAudioEncodingPropertiesStatics2.ABI.makeIAudioEncodingPropertiesStatics2(interfacePtr.value)
      return result
    }

    public fun createIAudioEncodingPropertiesStatics(): IAudioEncodingPropertiesStatics {
      val refiid = Guid.REFIID(IAudioEncodingPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.AudioEncodingProperties".toHandle(),refiid,interfacePtr)
      val result =
          IAudioEncodingPropertiesStatics.ABI.makeIAudioEncodingPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AudioEncodingProperties {
      val address = segment.toRawLongValue()
      return AudioEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: AudioEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAlac(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitsPerSample: WinDef.UINT
    ) = ABI.IAudioEncodingPropertiesStatics2_Instance.CreateAlac(sampleRate, channelCount,
        bitsPerSample)

    public fun CreateFlac(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitsPerSample: WinDef.UINT
    ) = ABI.IAudioEncodingPropertiesStatics2_Instance.CreateFlac(sampleRate, channelCount,
        bitsPerSample)

    public fun CreateAac(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitrate: WinDef.UINT
    ) = ABI.IAudioEncodingPropertiesStatics_Instance.CreateAac(sampleRate, channelCount, bitrate)

    public fun CreateAacAdts(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitrate: WinDef.UINT
    ) = ABI.IAudioEncodingPropertiesStatics_Instance.CreateAacAdts(sampleRate, channelCount,
        bitrate)

    public fun CreateMp3(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitrate: WinDef.UINT
    ) = ABI.IAudioEncodingPropertiesStatics_Instance.CreateMp3(sampleRate, channelCount, bitrate)

    public fun CreatePcm(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitsPerSample: WinDef.UINT
    ) = ABI.IAudioEncodingPropertiesStatics_Instance.CreatePcm(sampleRate, channelCount,
        bitsPerSample)

    public fun CreateWma(
      sampleRate: WinDef.UINT,
      channelCount: WinDef.UINT,
      bitrate: WinDef.UINT
    ) = ABI.IAudioEncodingPropertiesStatics_Instance.CreateWma(sampleRate, channelCount, bitrate)
  }
}
