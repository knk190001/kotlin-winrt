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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ImageEncodingProperties.ABI::class)
@Signature("rc(Windows.Media.MediaProperties.ImageEncodingProperties;{78625635-f331-4189-b1c3-b48d5ae034f1})")
@WinRTByReference(brClass = ImageEncodingProperties.ByReference::class)
public class ImageEncodingProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageEncodingProperties.WithDefault, IMediaEncodingProperties.WithDefault,
    IImageEncodingProperties2.WithDefault, IWinRTObject {
  private val __1708040262_Interface: IImageEncodingProperties.WithDefault by lazy {
    as_1708040262()
  }


  private val __1294923267_Interface: IMediaEncodingProperties.WithDefault by lazy {
    as_1294923267()
  }


  private val __1409640520_Interface: IImageEncodingProperties2.WithDefault by lazy {
    as_1409640520()
  }


  public override val __1708040262_Ptr: JNAPointer? by lazy {
    __1708040262_Interface.__1708040262_Ptr
  }


  public override val __1294923267_Ptr: JNAPointer? by lazy {
    __1294923267_Interface.__1294923267_Ptr
  }


  public override val __1409640520_Ptr: JNAPointer? by lazy {
    __1409640520_Interface.__1409640520_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1708040262_Interface, __1294923267_Interface, __1409640520_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1708040262(): IImageEncodingProperties.WithDefault {
    if(pointer == NULL) {
      return(IImageEncodingProperties.ABI.makeIImageEncodingProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageEncodingProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageEncodingProperties.ABI.makeIImageEncodingProperties(ref.value))
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

  private fun as_1409640520(): IImageEncodingProperties2.WithDefault {
    if(pointer == NULL) {
      return(IImageEncodingProperties2.ABI.makeIImageEncodingProperties2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageEncodingProperties2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageEncodingProperties2.ABI.makeIImageEncodingProperties2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageEncodingProperties> {
    public override fun getValue() = ImageEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: ImageEncodingProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageEncodingProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IImageEncodingPropertiesStatics_Instance: IImageEncodingPropertiesStatics by lazy {
      createIImageEncodingPropertiesStatics()
    }


    public val IImageEncodingPropertiesStatics3_Instance: IImageEncodingPropertiesStatics3 by lazy {
      createIImageEncodingPropertiesStatics3()
    }


    public val IImageEncodingPropertiesStatics2_Instance: IImageEncodingPropertiesStatics2 by lazy {
      createIImageEncodingPropertiesStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.ImageEncodingProperties".toHandle(),
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

    public fun createIImageEncodingPropertiesStatics(): IImageEncodingPropertiesStatics {
      val refiid = Guid.REFIID(IImageEncodingPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.ImageEncodingProperties".toHandle(),refiid,interfacePtr)
      val result =
          IImageEncodingPropertiesStatics.ABI.makeIImageEncodingPropertiesStatics(interfacePtr.value)
      return result
    }

    public fun createIImageEncodingPropertiesStatics3(): IImageEncodingPropertiesStatics3 {
      val refiid = Guid.REFIID(IImageEncodingPropertiesStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.ImageEncodingProperties".toHandle(),refiid,interfacePtr)
      val result =
          IImageEncodingPropertiesStatics3.ABI.makeIImageEncodingPropertiesStatics3(interfacePtr.value)
      return result
    }

    public fun createIImageEncodingPropertiesStatics2(): IImageEncodingPropertiesStatics2 {
      val refiid = Guid.REFIID(IImageEncodingPropertiesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.ImageEncodingProperties".toHandle(),refiid,interfacePtr)
      val result =
          IImageEncodingPropertiesStatics2.ABI.makeIImageEncodingPropertiesStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ImageEncodingProperties {
      val address = segment.toRawLongValue()
      return ImageEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: ImageEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateJpeg() = ABI.IImageEncodingPropertiesStatics_Instance.CreateJpeg()

    public fun CreatePng() = ABI.IImageEncodingPropertiesStatics_Instance.CreatePng()

    public fun CreateJpegXR() = ABI.IImageEncodingPropertiesStatics_Instance.CreateJpegXR()

    public fun CreateHeif() = ABI.IImageEncodingPropertiesStatics3_Instance.CreateHeif()

    public fun CreateUncompressed(format: MediaPixelFormat) =
        ABI.IImageEncodingPropertiesStatics2_Instance.CreateUncompressed(format)

    public fun CreateBmp() = ABI.IImageEncodingPropertiesStatics2_Instance.CreateBmp()
  }
}
