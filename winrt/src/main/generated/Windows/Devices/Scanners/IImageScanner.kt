package Windows.Devices.Scanners

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Storage.StorageFolder
import Windows.Storage.Streams.IRandomAccessStream
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IImageScanner.ABI::class)
@Signature("{53a88f78-5298-48a0-8da3-8087519665e0}")
@Guid("53a88f78529848a08da38087519665e0")
@WinRTInterface("53a88f78529848a08da38087519665e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageScanner.ByReference::class)
public interface IImageScanner : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_DefaultScanSource(): ImageScannerScanSource?

  @InterfaceMethod(2)
  public fun IsScanSourceSupported(value: ImageScannerScanSource?): Boolean

  @InterfaceMethod(3)
  public fun get_FlatbedConfiguration(): ImageScannerFlatbedConfiguration?

  @InterfaceMethod(4)
  public fun get_FeederConfiguration(): ImageScannerFeederConfiguration?

  @InterfaceMethod(5)
  public fun get_AutoConfiguration(): ImageScannerAutoConfiguration?

  @InterfaceMethod(6)
  public fun IsPreviewSupported(scanSource: ImageScannerScanSource?): Boolean

  @InterfaceMethod(7)
  public fun ScanPreviewToStreamAsync(scanSource: ImageScannerScanSource?,
      targetStream: IRandomAccessStream?): IAsyncOperation<ImageScannerPreviewResult?>?

  @InterfaceMethod(8)
  public fun ScanFilesToFolderAsync(scanSource: ImageScannerScanSource?,
      storageFolder: StorageFolder?): IAsyncOperationWithProgress<ImageScannerScanResult?,
      WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IImageScanner>
      {
    public override fun getValue() = ABI.makeIImageScanner(pointer.getPointer(0))

    public fun setValue(value: IImageScanner_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageScanner {
    public val __689742309_Ptr: Pointer?

    public val _689742309_VtblPtr: Pointer?
      get() = __689742309_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _689742309_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__689742309_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DefaultScanSource(): ImageScannerScanSource? {
      val fnPtr = _689742309_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerScanSource>()
      val hr = fn.invokeHR(arrayOf(__689742309_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerScanSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun IsScanSourceSupported(value: ImageScannerScanSource?): Boolean {
      val fnPtr = _689742309_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__689742309_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_FlatbedConfiguration(): ImageScannerFlatbedConfiguration? {
      val fnPtr = _689742309_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerFlatbedConfiguration>()
      val hr = fn.invokeHR(arrayOf(__689742309_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerFlatbedConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FeederConfiguration(): ImageScannerFeederConfiguration? {
      val fnPtr = _689742309_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerFeederConfiguration>()
      val hr = fn.invokeHR(arrayOf(__689742309_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerFeederConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AutoConfiguration(): ImageScannerAutoConfiguration? {
      val fnPtr = _689742309_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerAutoConfiguration>()
      val hr = fn.invokeHR(arrayOf(__689742309_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerAutoConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun IsPreviewSupported(scanSource: ImageScannerScanSource?): Boolean {
      val fnPtr = _689742309_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__689742309_Ptr, marshalToNative(scanSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun ScanPreviewToStreamAsync(scanSource: ImageScannerScanSource?,
        targetStream: IRandomAccessStream?): IAsyncOperation<ImageScannerPreviewResult?>? {
      val fnPtr = _689742309_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ImageScannerPreviewResult?>>()
      val hr = fn.invokeHR(arrayOf(__689742309_Ptr, marshalToNative(scanSource),
          marshalToNative(targetStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ImageScannerPreviewResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ScanFilesToFolderAsync(scanSource: ImageScannerScanSource?,
        storageFolder: StorageFolder?): IAsyncOperationWithProgress<ImageScannerScanResult?,
        WinDef.UINT>? {
      val fnPtr = _689742309_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<ImageScannerScanResult?,
          WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__689742309_Ptr, marshalToNative(scanSource),
          marshalToNative(storageFolder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<ImageScannerScanResult?,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IImageScanner_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __689742309_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageScanner, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53a88f78529848a08da38087519665e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageScanner(ptr: Pointer?): WithDefault = IImageScanner_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageScanner {
      val address = segment.toRawLongValue()
      return makeIImageScanner(Pointer(address))
    }

    public override fun toNative(obj: IImageScanner): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__689742309_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageScanner): Array<IImageScanner?> = (elements as
        Array<IImageScanner?>).castToImpl<IImageScanner,IImageScanner_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageScanner?> =
        arrayOfNulls<IImageScanner_Impl>(size) as Array<IImageScanner?>
  }
}
