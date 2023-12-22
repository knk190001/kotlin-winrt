package Windows.Media.MediaProperties

import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaEncodingProfile.ABI::class)
@Signature("rc(Windows.Media.MediaProperties.MediaEncodingProfile;{e7dbf5a8-1db9-4783-876b-3dfe12acfdb3})")
@WinRTByReference(brClass = MediaEncodingProfile.ByReference::class)
public class MediaEncodingProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaEncodingProfile.WithDefault, IMediaEncodingProfile2.WithDefault,
    IMediaEncodingProfile3.WithDefault, IWinRTObject {
  private val __868373209_Interface: IMediaEncodingProfile.WithDefault by lazy {
    as_868373209()
  }


  private val __1149765753_Interface: IMediaEncodingProfile2.WithDefault by lazy {
    as_1149765753()
  }


  private val __1149765754_Interface: IMediaEncodingProfile3.WithDefault by lazy {
    as_1149765754()
  }


  public override val __868373209_Ptr: JNAPointer? by lazy {
    __868373209_Interface.__868373209_Ptr
  }


  public override val __1149765753_Ptr: JNAPointer? by lazy {
    __1149765753_Interface.__1149765753_Ptr
  }


  public override val __1149765754_Ptr: JNAPointer? by lazy {
    __1149765754_Interface.__1149765754_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__868373209_Interface, __1149765753_Interface, __1149765754_Interface)

  public constructor() : this(ABI.activate())

  private fun as_868373209(): IMediaEncodingProfile.WithDefault {
    if(pointer == NULL) {
      return(IMediaEncodingProfile.ABI.makeIMediaEncodingProfile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaEncodingProfile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaEncodingProfile.ABI.makeIMediaEncodingProfile(ref.value))
  }

  private fun as_1149765753(): IMediaEncodingProfile2.WithDefault {
    if(pointer == NULL) {
      return(IMediaEncodingProfile2.ABI.makeIMediaEncodingProfile2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaEncodingProfile2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaEncodingProfile2.ABI.makeIMediaEncodingProfile2(ref.value))
  }

  private fun as_1149765754(): IMediaEncodingProfile3.WithDefault {
    if(pointer == NULL) {
      return(IMediaEncodingProfile3.ABI.makeIMediaEncodingProfile3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaEncodingProfile3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaEncodingProfile3.ABI.makeIMediaEncodingProfile3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaEncodingProfile> {
    public override fun getValue() = MediaEncodingProfile(pointer.getPointer(0))

    public fun setValue(value: MediaEncodingProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaEncodingProfile, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMediaEncodingProfileStatics_Instance: IMediaEncodingProfileStatics by lazy {
      createIMediaEncodingProfileStatics()
    }


    public val IMediaEncodingProfileStatics3_Instance: IMediaEncodingProfileStatics3 by lazy {
      createIMediaEncodingProfileStatics3()
    }


    public val IMediaEncodingProfileStatics2_Instance: IMediaEncodingProfileStatics2 by lazy {
      createIMediaEncodingProfileStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingProfile".toHandle(),
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

    public fun createIMediaEncodingProfileStatics(): IMediaEncodingProfileStatics {
      val refiid = Guid.REFIID(IMediaEncodingProfileStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingProfile".toHandle(),refiid,interfacePtr)
      val result =
          IMediaEncodingProfileStatics.ABI.makeIMediaEncodingProfileStatics(interfacePtr.value)
      return result
    }

    public fun createIMediaEncodingProfileStatics3(): IMediaEncodingProfileStatics3 {
      val refiid = Guid.REFIID(IMediaEncodingProfileStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingProfile".toHandle(),refiid,interfacePtr)
      val result =
          IMediaEncodingProfileStatics3.ABI.makeIMediaEncodingProfileStatics3(interfacePtr.value)
      return result
    }

    public fun createIMediaEncodingProfileStatics2(): IMediaEncodingProfileStatics2 {
      val refiid = Guid.REFIID(IMediaEncodingProfileStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.MediaEncodingProfile".toHandle(),refiid,interfacePtr)
      val result =
          IMediaEncodingProfileStatics2.ABI.makeIMediaEncodingProfileStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaEncodingProfile {
      val address = segment.toRawLongValue()
      return MediaEncodingProfile(Pointer(address))
    }

    public override fun toNative(obj: MediaEncodingProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateM4a(quality: AudioEncodingQuality) =
        ABI.IMediaEncodingProfileStatics_Instance.CreateM4a(quality)

    public fun CreateMp3(quality: AudioEncodingQuality) =
        ABI.IMediaEncodingProfileStatics_Instance.CreateMp3(quality)

    public fun CreateWma(quality: AudioEncodingQuality) =
        ABI.IMediaEncodingProfileStatics_Instance.CreateWma(quality)

    public fun CreateMp4(quality: VideoEncodingQuality) =
        ABI.IMediaEncodingProfileStatics_Instance.CreateMp4(quality)

    public fun CreateWmv(quality: VideoEncodingQuality) =
        ABI.IMediaEncodingProfileStatics_Instance.CreateWmv(quality)

    public fun CreateFromFileAsync(`file`: IStorageFile) =
        ABI.IMediaEncodingProfileStatics_Instance.CreateFromFileAsync(file)

    public fun CreateFromStreamAsync(stream: IRandomAccessStream) =
        ABI.IMediaEncodingProfileStatics_Instance.CreateFromStreamAsync(stream)

    public fun CreateAlac(quality: AudioEncodingQuality) =
        ABI.IMediaEncodingProfileStatics3_Instance.CreateAlac(quality)

    public fun CreateFlac(quality: AudioEncodingQuality) =
        ABI.IMediaEncodingProfileStatics3_Instance.CreateFlac(quality)

    public fun CreateHevc(quality: VideoEncodingQuality) =
        ABI.IMediaEncodingProfileStatics3_Instance.CreateHevc(quality)

    public fun CreateWav(quality: AudioEncodingQuality) =
        ABI.IMediaEncodingProfileStatics2_Instance.CreateWav(quality)

    public fun CreateAvi(quality: VideoEncodingQuality) =
        ABI.IMediaEncodingProfileStatics2_Instance.CreateAvi(quality)
  }
}
