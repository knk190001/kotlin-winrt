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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VideoEncodingProperties.ABI::class)
@Signature("rc(Windows.Media.MediaProperties.VideoEncodingProperties;{76ee6c9a-37c2-4f2a-880a-1282bbb4373d})")
@WinRTByReference(brClass = VideoEncodingProperties.ByReference::class)
public class VideoEncodingProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoEncodingProperties.WithDefault, IMediaEncodingProperties.WithDefault,
    IVideoEncodingProperties2.WithDefault, IVideoEncodingProperties3.WithDefault,
    IVideoEncodingProperties4.WithDefault, IVideoEncodingProperties5.WithDefault, IWinRTObject {
  private val __1546763558_Interface: IVideoEncodingProperties.WithDefault by lazy {
    as_1546763558()
  }


  private val __1294923267_Interface: IMediaEncodingProperties.WithDefault by lazy {
    as_1294923267()
  }


  private val __705029992_Interface: IVideoEncodingProperties2.WithDefault by lazy {
    as_705029992()
  }


  private val __705029991_Interface: IVideoEncodingProperties3.WithDefault by lazy {
    as_705029991()
  }


  private val __705029990_Interface: IVideoEncodingProperties4.WithDefault by lazy {
    as_705029990()
  }


  private val __705029989_Interface: IVideoEncodingProperties5.WithDefault by lazy {
    as_705029989()
  }


  public override val __1546763558_Ptr: JNAPointer? by lazy {
    __1546763558_Interface.__1546763558_Ptr
  }


  public override val __1294923267_Ptr: JNAPointer? by lazy {
    __1294923267_Interface.__1294923267_Ptr
  }


  public override val __705029992_Ptr: JNAPointer? by lazy {
    __705029992_Interface.__705029992_Ptr
  }


  public override val __705029991_Ptr: JNAPointer? by lazy {
    __705029991_Interface.__705029991_Ptr
  }


  public override val __705029990_Ptr: JNAPointer? by lazy {
    __705029990_Interface.__705029990_Ptr
  }


  public override val __705029989_Ptr: JNAPointer? by lazy {
    __705029989_Interface.__705029989_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1546763558_Interface, __1294923267_Interface, __705029992_Interface,
        __705029991_Interface, __705029990_Interface, __705029989_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1546763558(): IVideoEncodingProperties.WithDefault {
    if(pointer == NULL) {
      return(IVideoEncodingProperties.ABI.makeIVideoEncodingProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoEncodingProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoEncodingProperties.ABI.makeIVideoEncodingProperties(ref.value))
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

  private fun as_705029992(): IVideoEncodingProperties2.WithDefault {
    if(pointer == NULL) {
      return(IVideoEncodingProperties2.ABI.makeIVideoEncodingProperties2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoEncodingProperties2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoEncodingProperties2.ABI.makeIVideoEncodingProperties2(ref.value))
  }

  private fun as_705029991(): IVideoEncodingProperties3.WithDefault {
    if(pointer == NULL) {
      return(IVideoEncodingProperties3.ABI.makeIVideoEncodingProperties3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoEncodingProperties3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoEncodingProperties3.ABI.makeIVideoEncodingProperties3(ref.value))
  }

  private fun as_705029990(): IVideoEncodingProperties4.WithDefault {
    if(pointer == NULL) {
      return(IVideoEncodingProperties4.ABI.makeIVideoEncodingProperties4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoEncodingProperties4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoEncodingProperties4.ABI.makeIVideoEncodingProperties4(ref.value))
  }

  private fun as_705029989(): IVideoEncodingProperties5.WithDefault {
    if(pointer == NULL) {
      return(IVideoEncodingProperties5.ABI.makeIVideoEncodingProperties5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoEncodingProperties5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoEncodingProperties5.ABI.makeIVideoEncodingProperties5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoEncodingProperties> {
    public override fun getValue() = VideoEncodingProperties(pointer.getPointer(0))

    public fun setValue(value: VideoEncodingProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoEncodingProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IVideoEncodingPropertiesStatics2_Instance: IVideoEncodingPropertiesStatics2 by lazy {
      createIVideoEncodingPropertiesStatics2()
    }


    public val IVideoEncodingPropertiesStatics_Instance: IVideoEncodingPropertiesStatics by lazy {
      createIVideoEncodingPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.VideoEncodingProperties".toHandle(),
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

    public fun createIVideoEncodingPropertiesStatics2(): IVideoEncodingPropertiesStatics2 {
      val refiid = Guid.REFIID(IVideoEncodingPropertiesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.VideoEncodingProperties".toHandle(),refiid,interfacePtr)
      val result =
          IVideoEncodingPropertiesStatics2.ABI.makeIVideoEncodingPropertiesStatics2(interfacePtr.value)
      return result
    }

    public fun createIVideoEncodingPropertiesStatics(): IVideoEncodingPropertiesStatics {
      val refiid = Guid.REFIID(IVideoEncodingPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaProperties.VideoEncodingProperties".toHandle(),refiid,interfacePtr)
      val result =
          IVideoEncodingPropertiesStatics.ABI.makeIVideoEncodingPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VideoEncodingProperties {
      val address = segment.toRawLongValue()
      return VideoEncodingProperties(Pointer(address))
    }

    public override fun toNative(obj: VideoEncodingProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateHevc() = ABI.IVideoEncodingPropertiesStatics2_Instance.CreateHevc()

    public fun CreateH264() = ABI.IVideoEncodingPropertiesStatics_Instance.CreateH264()

    public fun CreateMpeg2() = ABI.IVideoEncodingPropertiesStatics_Instance.CreateMpeg2()

    public fun CreateUncompressed(
      subtype: String,
      width: WinDef.UINT,
      height: WinDef.UINT
    ) = ABI.IVideoEncodingPropertiesStatics_Instance.CreateUncompressed(subtype, width, height)
  }
}
