package Windows.Media.Capture

import Windows.Foundation.IClosable
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaCapture.ABI::class)
@Signature("rc(Windows.Media.Capture.MediaCapture;{c61afbb4-fb10-4a34-ac18-ca80d9c8e7ee})")
@WinRTByReference(brClass = MediaCapture.ByReference::class)
public class MediaCapture(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaCapture.WithDefault, IMediaCaptureVideoPreview.WithDefault,
    IMediaCapture2.WithDefault, IClosable.WithDefault, IMediaCapture3.WithDefault,
    IMediaCapture4.WithDefault, IMediaCapture5.WithDefault, IMediaCapture6.WithDefault,
    IMediaCapture7.WithDefault, IWinRTObject {
  private val __1573545626_Interface: IMediaCapture.WithDefault by lazy {
    as_1573545626()
  }


  private val __1673389433_Interface: IMediaCaptureVideoPreview.WithDefault by lazy {
    as_1673389433()
  }


  private val __1535274200_Interface: IMediaCapture2.WithDefault by lazy {
    as_1535274200()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1535274201_Interface: IMediaCapture3.WithDefault by lazy {
    as_1535274201()
  }


  private val __1535274202_Interface: IMediaCapture4.WithDefault by lazy {
    as_1535274202()
  }


  private val __1535274203_Interface: IMediaCapture5.WithDefault by lazy {
    as_1535274203()
  }


  private val __1535274204_Interface: IMediaCapture6.WithDefault by lazy {
    as_1535274204()
  }


  private val __1535274205_Interface: IMediaCapture7.WithDefault by lazy {
    as_1535274205()
  }


  public override val __1573545626_Ptr: JNAPointer? by lazy {
    __1573545626_Interface.__1573545626_Ptr
  }


  public override val __1673389433_Ptr: JNAPointer? by lazy {
    __1673389433_Interface.__1673389433_Ptr
  }


  public override val __1535274200_Ptr: JNAPointer? by lazy {
    __1535274200_Interface.__1535274200_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1535274201_Ptr: JNAPointer? by lazy {
    __1535274201_Interface.__1535274201_Ptr
  }


  public override val __1535274202_Ptr: JNAPointer? by lazy {
    __1535274202_Interface.__1535274202_Ptr
  }


  public override val __1535274203_Ptr: JNAPointer? by lazy {
    __1535274203_Interface.__1535274203_Ptr
  }


  public override val __1535274204_Ptr: JNAPointer? by lazy {
    __1535274204_Interface.__1535274204_Ptr
  }


  public override val __1535274205_Ptr: JNAPointer? by lazy {
    __1535274205_Interface.__1535274205_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1573545626_Interface, __1673389433_Interface, __1535274200_Interface,
        __1260617006_Interface, __1535274201_Interface, __1535274202_Interface,
        __1535274203_Interface, __1535274204_Interface, __1535274205_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1573545626(): IMediaCapture.WithDefault {
    if(pointer == NULL) {
      return(IMediaCapture.ABI.makeIMediaCapture(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCapture>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCapture.ABI.makeIMediaCapture(ref.value))
  }

  private fun as_1673389433(): IMediaCaptureVideoPreview.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureVideoPreview.ABI.makeIMediaCaptureVideoPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureVideoPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureVideoPreview.ABI.makeIMediaCaptureVideoPreview(ref.value))
  }

  private fun as_1535274200(): IMediaCapture2.WithDefault {
    if(pointer == NULL) {
      return(IMediaCapture2.ABI.makeIMediaCapture2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCapture2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCapture2.ABI.makeIMediaCapture2(ref.value))
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

  private fun as_1535274201(): IMediaCapture3.WithDefault {
    if(pointer == NULL) {
      return(IMediaCapture3.ABI.makeIMediaCapture3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCapture3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCapture3.ABI.makeIMediaCapture3(ref.value))
  }

  private fun as_1535274202(): IMediaCapture4.WithDefault {
    if(pointer == NULL) {
      return(IMediaCapture4.ABI.makeIMediaCapture4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCapture4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCapture4.ABI.makeIMediaCapture4(ref.value))
  }

  private fun as_1535274203(): IMediaCapture5.WithDefault {
    if(pointer == NULL) {
      return(IMediaCapture5.ABI.makeIMediaCapture5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCapture5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCapture5.ABI.makeIMediaCapture5(ref.value))
  }

  private fun as_1535274204(): IMediaCapture6.WithDefault {
    if(pointer == NULL) {
      return(IMediaCapture6.ABI.makeIMediaCapture6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCapture6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCapture6.ABI.makeIMediaCapture6(ref.value))
  }

  private fun as_1535274205(): IMediaCapture7.WithDefault {
    if(pointer == NULL) {
      return(IMediaCapture7.ABI.makeIMediaCapture7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCapture7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCapture7.ABI.makeIMediaCapture7(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaCapture> {
    public override fun getValue() = MediaCapture(pointer.getPointer(0))

    public fun setValue(value: MediaCapture): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaCapture, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMediaCaptureStatics_Instance: IMediaCaptureStatics by lazy {
      createIMediaCaptureStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Capture.MediaCapture".toHandle(),
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

    public fun createIMediaCaptureStatics(): IMediaCaptureStatics {
      val refiid = Guid.REFIID(IMediaCaptureStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Capture.MediaCapture".toHandle(),refiid,interfacePtr)
      val result = IMediaCaptureStatics.ABI.makeIMediaCaptureStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaCapture {
      val address = segment.toRawLongValue()
      return MediaCapture(Pointer(address))
    }

    public override fun toNative(obj: MediaCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsVideoProfileSupported(videoDeviceId: String) =
        ABI.IMediaCaptureStatics_Instance.IsVideoProfileSupported(videoDeviceId)

    public fun FindAllVideoProfiles(videoDeviceId: String) =
        ABI.IMediaCaptureStatics_Instance.FindAllVideoProfiles(videoDeviceId)

    public fun FindConcurrentProfiles(videoDeviceId: String) =
        ABI.IMediaCaptureStatics_Instance.FindConcurrentProfiles(videoDeviceId)

    public fun FindKnownVideoProfiles(videoDeviceId: String, name: KnownVideoProfile) =
        ABI.IMediaCaptureStatics_Instance.FindKnownVideoProfiles(videoDeviceId, name)
  }
}
