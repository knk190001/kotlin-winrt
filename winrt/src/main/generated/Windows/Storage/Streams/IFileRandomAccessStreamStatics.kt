package Windows.Storage.Streams

import Windows.Foundation.IAsyncOperation
import Windows.Storage.FileAccessMode
import Windows.Storage.StorageOpenOptions
import Windows.Storage.StorageStreamTransaction
import Windows.System.User
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

@ABIMarker(IFileRandomAccessStreamStatics.ABI::class)
@Signature("{73550107-3b57-4b5d-8345-554d2fc621f0}")
@Guid("735501073b574b5d8345554d2fc621f0")
@WinRTInterface("735501073b574b5d8345554d2fc621f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileRandomAccessStreamStatics.ByReference::class)
public interface IFileRandomAccessStreamStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenAsync(filePath: String?, accessMode: FileAccessMode?):
      IAsyncOperation<IRandomAccessStream?>?

  @InterfaceMethod(1)
  public fun OpenAsync(
    filePath: String?,
    accessMode: FileAccessMode?,
    sharingOptions: StorageOpenOptions?,
    openDisposition: FileOpenDisposition?
  ): IAsyncOperation<IRandomAccessStream?>?

  @InterfaceMethod(2)
  public fun OpenTransactedWriteAsync(filePath: String?):
      IAsyncOperation<StorageStreamTransaction?>?

  @InterfaceMethod(3)
  public fun OpenTransactedWriteAsync(
    filePath: String?,
    openOptions: StorageOpenOptions?,
    openDisposition: FileOpenDisposition?
  ): IAsyncOperation<StorageStreamTransaction?>?

  @InterfaceMethod(4)
  public fun OpenForUserAsync(
    user: User?,
    filePath: String?,
    accessMode: FileAccessMode?
  ): IAsyncOperation<IRandomAccessStream?>?

  @InterfaceMethod(5)
  public fun OpenForUserAsync(
    user: User?,
    filePath: String?,
    accessMode: FileAccessMode?,
    sharingOptions: StorageOpenOptions?,
    openDisposition: FileOpenDisposition?
  ): IAsyncOperation<IRandomAccessStream?>?

  @InterfaceMethod(6)
  public fun OpenTransactedWriteForUserAsync(user: User?, filePath: String?):
      IAsyncOperation<StorageStreamTransaction?>?

  @InterfaceMethod(7)
  public fun OpenTransactedWriteForUserAsync(
    user: User?,
    filePath: String?,
    openOptions: StorageOpenOptions?,
    openDisposition: FileOpenDisposition?
  ): IAsyncOperation<StorageStreamTransaction?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileRandomAccessStreamStatics> {
    public override fun getValue() = ABI.makeIFileRandomAccessStreamStatics(pointer.getPointer(0))

    public fun setValue(value: IFileRandomAccessStreamStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileRandomAccessStreamStatics {
    public val __383962770_Ptr: Pointer?

    public val _383962770_VtblPtr: Pointer?
      get() = __383962770_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenAsync(filePath: String?, accessMode: FileAccessMode?):
        IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _383962770_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__383962770_Ptr, marshalToNative(filePath),
          marshalToNative(accessMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OpenAsync(
      filePath: String?,
      accessMode: FileAccessMode?,
      sharingOptions: StorageOpenOptions?,
      openDisposition: FileOpenDisposition?
    ): IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _383962770_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__383962770_Ptr, marshalToNative(filePath),
          marshalToNative(accessMode), marshalToNative(sharingOptions),
          marshalToNative(openDisposition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun OpenTransactedWriteAsync(filePath: String?):
        IAsyncOperation<StorageStreamTransaction?>? {
      val fnPtr = _383962770_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageStreamTransaction?>>()
      val hr = fn.invokeHR(arrayOf(__383962770_Ptr, marshalToNative(filePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StorageStreamTransaction?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun OpenTransactedWriteAsync(
      filePath: String?,
      openOptions: StorageOpenOptions?,
      openDisposition: FileOpenDisposition?
    ): IAsyncOperation<StorageStreamTransaction?>? {
      val fnPtr = _383962770_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageStreamTransaction?>>()
      val hr = fn.invokeHR(arrayOf(__383962770_Ptr, marshalToNative(filePath),
          marshalToNative(openOptions), marshalToNative(openDisposition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StorageStreamTransaction?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun OpenForUserAsync(
      user: User?,
      filePath: String?,
      accessMode: FileAccessMode?
    ): IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _383962770_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__383962770_Ptr, marshalToNative(user),
          marshalToNative(filePath), marshalToNative(accessMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun OpenForUserAsync(
      user: User?,
      filePath: String?,
      accessMode: FileAccessMode?,
      sharingOptions: StorageOpenOptions?,
      openDisposition: FileOpenDisposition?
    ): IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _383962770_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__383962770_Ptr, marshalToNative(user),
          marshalToNative(filePath), marshalToNative(accessMode), marshalToNative(sharingOptions),
          marshalToNative(openDisposition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun OpenTransactedWriteForUserAsync(user: User?, filePath: String?):
        IAsyncOperation<StorageStreamTransaction?>? {
      val fnPtr = _383962770_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageStreamTransaction?>>()
      val hr = fn.invokeHR(arrayOf(__383962770_Ptr, marshalToNative(user),
          marshalToNative(filePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StorageStreamTransaction?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun OpenTransactedWriteForUserAsync(
      user: User?,
      filePath: String?,
      openOptions: StorageOpenOptions?,
      openDisposition: FileOpenDisposition?
    ): IAsyncOperation<StorageStreamTransaction?>? {
      val fnPtr = _383962770_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageStreamTransaction?>>()
      val hr = fn.invokeHR(arrayOf(__383962770_Ptr, marshalToNative(user),
          marshalToNative(filePath), marshalToNative(openOptions), marshalToNative(openDisposition),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StorageStreamTransaction?>>(result.getValue())
      return resultValue
    }
  }

  public class IFileRandomAccessStreamStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __383962770_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileRandomAccessStreamStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("735501073b574b5d8345554d2fc621f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileRandomAccessStreamStatics(ptr: Pointer?): WithDefault =
        IFileRandomAccessStreamStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileRandomAccessStreamStatics {
      val address = segment.toRawLongValue()
      return makeIFileRandomAccessStreamStatics(Pointer(address))
    }

    public override fun toNative(obj: IFileRandomAccessStreamStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__383962770_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileRandomAccessStreamStatics):
        Array<IFileRandomAccessStreamStatics?> = (elements as
        Array<IFileRandomAccessStreamStatics?>).castToImpl<IFileRandomAccessStreamStatics,IFileRandomAccessStreamStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileRandomAccessStreamStatics?> =
        arrayOfNulls<IFileRandomAccessStreamStatics_Impl>(size) as
        Array<IFileRandomAccessStreamStatics?>
  }
}
