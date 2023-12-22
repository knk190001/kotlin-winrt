package Windows.Graphics.Imaging

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

@ABIMarker(BitmapDecoder.ABI::class)
@Signature("rc(Windows.Graphics.Imaging.BitmapDecoder;{acef22ba-1d74-4c91-9dfc-9620745233e6})")
@WinRTByReference(brClass = BitmapDecoder.ByReference::class)
public class BitmapDecoder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBitmapDecoder.WithDefault, IBitmapFrame.WithDefault,
    IBitmapFrameWithSoftwareBitmap.WithDefault, IWinRTObject {
  private val __1430141292_Interface: IBitmapDecoder.WithDefault by lazy {
    as_1430141292()
  }


  private val __405954709_Interface: IBitmapFrame.WithDefault by lazy {
    as_405954709()
  }


  private val __454241903_Interface: IBitmapFrameWithSoftwareBitmap.WithDefault by lazy {
    as_454241903()
  }


  public override val __1430141292_Ptr: JNAPointer? by lazy {
    __1430141292_Interface.__1430141292_Ptr
  }


  public override val __405954709_Ptr: JNAPointer? by lazy {
    __405954709_Interface.__405954709_Ptr
  }


  public override val __454241903_Ptr: JNAPointer? by lazy {
    __454241903_Interface.__454241903_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1430141292_Interface, __405954709_Interface, __454241903_Interface)

  private fun as_1430141292(): IBitmapDecoder.WithDefault {
    if(pointer == NULL) {
      return(IBitmapDecoder.ABI.makeIBitmapDecoder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapDecoder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapDecoder.ABI.makeIBitmapDecoder(ref.value))
  }

  private fun as_405954709(): IBitmapFrame.WithDefault {
    if(pointer == NULL) {
      return(IBitmapFrame.ABI.makeIBitmapFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapFrame.ABI.makeIBitmapFrame(ref.value))
  }

  private fun as_454241903(): IBitmapFrameWithSoftwareBitmap.WithDefault {
    if(pointer == NULL) {
      return(IBitmapFrameWithSoftwareBitmap.ABI.makeIBitmapFrameWithSoftwareBitmap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapFrameWithSoftwareBitmap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapFrameWithSoftwareBitmap.ABI.makeIBitmapFrameWithSoftwareBitmap(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BitmapDecoder>
      {
    public override fun getValue() = BitmapDecoder(pointer.getPointer(0))

    public fun setValue(value: BitmapDecoder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapDecoder, MemoryAddress> {
    public val IBitmapDecoderStatics2_Instance: IBitmapDecoderStatics2 by lazy {
      createIBitmapDecoderStatics2()
    }


    public val IBitmapDecoderStatics_Instance: IBitmapDecoderStatics by lazy {
      createIBitmapDecoderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBitmapDecoderStatics2(): IBitmapDecoderStatics2 {
      val refiid = Guid.REFIID(IBitmapDecoderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Imaging.BitmapDecoder".toHandle(),refiid,interfacePtr)
      val result = IBitmapDecoderStatics2.ABI.makeIBitmapDecoderStatics2(interfacePtr.value)
      return result
    }

    public fun createIBitmapDecoderStatics(): IBitmapDecoderStatics {
      val refiid = Guid.REFIID(IBitmapDecoderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Imaging.BitmapDecoder".toHandle(),refiid,interfacePtr)
      val result = IBitmapDecoderStatics.ABI.makeIBitmapDecoderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BitmapDecoder {
      val address = segment.toRawLongValue()
      return BitmapDecoder(Pointer(address))
    }

    public override fun toNative(obj: BitmapDecoder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeifDecoderId() = ABI.IBitmapDecoderStatics2_Instance.get_HeifDecoderId()

    public fun get_WebpDecoderId() = ABI.IBitmapDecoderStatics2_Instance.get_WebpDecoderId()

    public fun get_BmpDecoderId() = ABI.IBitmapDecoderStatics_Instance.get_BmpDecoderId()

    public fun get_JpegDecoderId() = ABI.IBitmapDecoderStatics_Instance.get_JpegDecoderId()

    public fun get_PngDecoderId() = ABI.IBitmapDecoderStatics_Instance.get_PngDecoderId()

    public fun get_TiffDecoderId() = ABI.IBitmapDecoderStatics_Instance.get_TiffDecoderId()

    public fun get_GifDecoderId() = ABI.IBitmapDecoderStatics_Instance.get_GifDecoderId()

    public fun get_JpegXRDecoderId() = ABI.IBitmapDecoderStatics_Instance.get_JpegXRDecoderId()

    public fun get_IcoDecoderId() = ABI.IBitmapDecoderStatics_Instance.get_IcoDecoderId()

    public fun GetDecoderInformationEnumerator() =
        ABI.IBitmapDecoderStatics_Instance.GetDecoderInformationEnumerator()

    public fun CreateAsync(stream: IRandomAccessStream) =
        ABI.IBitmapDecoderStatics_Instance.CreateAsync(stream)

    public fun CreateAsync(decoderId: Guid.GUID, stream: IRandomAccessStream) =
        ABI.IBitmapDecoderStatics_Instance.CreateAsync(decoderId, stream)
  }
}
