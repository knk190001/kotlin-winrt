package Windows.Storage

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageFileStatics.ABI::class)
@Signature("{5984c710-daf2-43c8-8bb4-a4d3eacfd03f}")
@Guid("5984c710daf243c88bb4a4d3eacfd03f")
@WinRTInterface("5984c710daf243c88bb4a4d3eacfd03f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFileStatics.ByReference::class)
public interface IStorageFileStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFileFromPathAsync(path: String?): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(1)
  public fun GetFileFromApplicationUriAsync(uri: Uri?): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(2)
  public fun CreateStreamedFileAsync(
    displayNameWithExtension: String?,
    dataRequested: StreamedFileDataRequestedHandler?,
    thumbnail: IRandomAccessStreamReference?
  ): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(3)
  public fun ReplaceWithStreamedFileAsync(
    fileToReplace: IStorageFile?,
    dataRequested: StreamedFileDataRequestedHandler?,
    thumbnail: IRandomAccessStreamReference?
  ): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(4)
  public fun CreateStreamedFileFromUriAsync(
    displayNameWithExtension: String?,
    uri: Uri?,
    thumbnail: IRandomAccessStreamReference?
  ): IAsyncOperation<StorageFile?>?

  @InterfaceMethod(5)
  public fun ReplaceWithStreamedFileFromUriAsync(
    fileToReplace: IStorageFile?,
    uri: Uri?,
    thumbnail: IRandomAccessStreamReference?
  ): IAsyncOperation<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFileStatics> {
    public override fun getValue() = ABI.makeIStorageFileStatics(pointer.getPointer(0))

    public fun setValue(value: IStorageFileStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFileStatics {
    public val __4230777_Ptr: Pointer?

    public val _4230777_VtblPtr: Pointer?
      get() = __4230777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFileFromPathAsync(path: String?): IAsyncOperation<StorageFile?>? {
      val fnPtr = _4230777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__4230777_Ptr, marshalToNative(path), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetFileFromApplicationUriAsync(uri: Uri?): IAsyncOperation<StorageFile?>? {
      val fnPtr = _4230777_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__4230777_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateStreamedFileAsync(
      displayNameWithExtension: String?,
      dataRequested: StreamedFileDataRequestedHandler?,
      thumbnail: IRandomAccessStreamReference?
    ): IAsyncOperation<StorageFile?>? {
      val fnPtr = _4230777_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__4230777_Ptr, marshalToNative(displayNameWithExtension),
          marshalToNative(dataRequested), marshalToNative(thumbnail), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReplaceWithStreamedFileAsync(
      fileToReplace: IStorageFile?,
      dataRequested: StreamedFileDataRequestedHandler?,
      thumbnail: IRandomAccessStreamReference?
    ): IAsyncOperation<StorageFile?>? {
      val fnPtr = _4230777_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__4230777_Ptr, marshalToNative(fileToReplace),
          marshalToNative(dataRequested), marshalToNative(thumbnail), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateStreamedFileFromUriAsync(
      displayNameWithExtension: String?,
      uri: Uri?,
      thumbnail: IRandomAccessStreamReference?
    ): IAsyncOperation<StorageFile?>? {
      val fnPtr = _4230777_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__4230777_Ptr, marshalToNative(displayNameWithExtension),
          marshalToNative(uri), marshalToNative(thumbnail), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ReplaceWithStreamedFileFromUriAsync(
      fileToReplace: IStorageFile?,
      uri: Uri?,
      thumbnail: IRandomAccessStreamReference?
    ): IAsyncOperation<StorageFile?>? {
      val fnPtr = _4230777_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__4230777_Ptr, marshalToNative(fileToReplace),
          marshalToNative(uri), marshalToNative(thumbnail), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFileStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __4230777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFileStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5984c710daf243c88bb4a4d3eacfd03f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFileStatics(ptr: Pointer?): WithDefault = IStorageFileStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFileStatics {
      val address = segment.toRawLongValue()
      return makeIStorageFileStatics(Pointer(address))
    }

    public override fun toNative(obj: IStorageFileStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__4230777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFileStatics): Array<IStorageFileStatics?> =
        (elements as
        Array<IStorageFileStatics?>).castToImpl<IStorageFileStatics,IStorageFileStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFileStatics?> =
        arrayOfNulls<IStorageFileStatics_Impl>(size) as Array<IStorageFileStatics?>
  }
}
