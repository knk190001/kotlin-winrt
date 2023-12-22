package Windows.Graphics.Imaging

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BitmapEncoder.ABI::class)
@Signature("rc(Windows.Graphics.Imaging.BitmapEncoder;{2bc468e3-e1f8-4b54-95e8-32919551ce62})")
@WinRTByReference(brClass = BitmapEncoder.ByReference::class)
public class BitmapEncoder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBitmapEncoder.WithDefault, IBitmapEncoderWithSoftwareBitmap.WithDefault,
    IWinRTObject {
  private val __1719659964_Interface: IBitmapEncoder.WithDefault by lazy {
    as_1719659964()
  }


  private val __234285696_Interface: IBitmapEncoderWithSoftwareBitmap.WithDefault by lazy {
    as_234285696()
  }


  public override val __1719659964_Ptr: JNAPointer? by lazy {
    __1719659964_Interface.__1719659964_Ptr
  }


  public override val __234285696_Ptr: JNAPointer? by lazy {
    __234285696_Interface.__234285696_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1719659964_Interface, __234285696_Interface)

  private fun as_1719659964(): IBitmapEncoder.WithDefault {
    if(pointer == NULL) {
      return(IBitmapEncoder.ABI.makeIBitmapEncoder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapEncoder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapEncoder.ABI.makeIBitmapEncoder(ref.value))
  }

  private fun as_234285696(): IBitmapEncoderWithSoftwareBitmap.WithDefault {
    if(pointer == NULL) {
      return(IBitmapEncoderWithSoftwareBitmap.ABI.makeIBitmapEncoderWithSoftwareBitmap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapEncoderWithSoftwareBitmap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapEncoderWithSoftwareBitmap.ABI.makeIBitmapEncoderWithSoftwareBitmap(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BitmapEncoder>
      {
    public override fun getValue() = BitmapEncoder(pointer.getPointer(0))

    public fun setValue(value: BitmapEncoder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapEncoder, MemoryAddress> {
    public val IBitmapEncoderStatics2_Instance: IBitmapEncoderStatics2 by lazy {
      createIBitmapEncoderStatics2()
    }


    public val IBitmapEncoderStatics_Instance: IBitmapEncoderStatics by lazy {
      createIBitmapEncoderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBitmapEncoderStatics2(): IBitmapEncoderStatics2 {
      val refiid = Guid.REFIID(IBitmapEncoderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Imaging.BitmapEncoder".toHandle(),refiid,interfacePtr)
      val result = IBitmapEncoderStatics2.ABI.makeIBitmapEncoderStatics2(interfacePtr.value)
      return result
    }

    public fun createIBitmapEncoderStatics(): IBitmapEncoderStatics {
      val refiid = Guid.REFIID(IBitmapEncoderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Imaging.BitmapEncoder".toHandle(),refiid,interfacePtr)
      val result = IBitmapEncoderStatics.ABI.makeIBitmapEncoderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BitmapEncoder {
      val address = segment.toRawLongValue()
      return BitmapEncoder(Pointer(address))
    }

    public override fun toNative(obj: BitmapEncoder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeifEncoderId() = ABI.IBitmapEncoderStatics2_Instance.get_HeifEncoderId()

    public fun get_BmpEncoderId() = ABI.IBitmapEncoderStatics_Instance.get_BmpEncoderId()

    public fun get_JpegEncoderId() = ABI.IBitmapEncoderStatics_Instance.get_JpegEncoderId()

    public fun get_PngEncoderId() = ABI.IBitmapEncoderStatics_Instance.get_PngEncoderId()

    public fun get_TiffEncoderId() = ABI.IBitmapEncoderStatics_Instance.get_TiffEncoderId()

    public fun get_GifEncoderId() = ABI.IBitmapEncoderStatics_Instance.get_GifEncoderId()

    public fun get_JpegXREncoderId() = ABI.IBitmapEncoderStatics_Instance.get_JpegXREncoderId()

    public fun GetEncoderInformationEnumerator() =
        ABI.IBitmapEncoderStatics_Instance.GetEncoderInformationEnumerator()

    public fun CreateAsync(encoderId: Guid.GUID, stream: IRandomAccessStream) =
        ABI.IBitmapEncoderStatics_Instance.CreateAsync(encoderId, stream)

    public fun CreateAsync(
      encoderId: Guid.GUID,
      stream: IRandomAccessStream,
      encodingOptions: IIterable<IKeyValuePair<String?, BitmapTypedValue?>?>
    ) = ABI.IBitmapEncoderStatics_Instance.CreateAsync(encoderId, stream, encodingOptions)

    public fun CreateForTranscodingAsync(stream: IRandomAccessStream, bitmapDecoder: BitmapDecoder)
        = ABI.IBitmapEncoderStatics_Instance.CreateForTranscodingAsync(stream, bitmapDecoder)

    public fun CreateForInPlacePropertyEncodingAsync(bitmapDecoder: BitmapDecoder) =
        ABI.IBitmapEncoderStatics_Instance.CreateForInPlacePropertyEncodingAsync(bitmapDecoder)
  }
}
