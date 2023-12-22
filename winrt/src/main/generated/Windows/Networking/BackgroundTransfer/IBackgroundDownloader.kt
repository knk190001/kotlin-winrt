package Windows.Networking.BackgroundTransfer

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Networking.BackgroundTransfer.IBackgroundTransferBase.ABI.IID
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IInputStream
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundDownloader.ABI::class)
@Signature("{c1c79333-6649-4b1d-a826-a4b3dd234d0b}")
@Guid("c1c7933366494b1da826a4b3dd234d0b")
@WinRTInterface("c1c7933366494b1da826a4b3dd234d0b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundDownloader.ByReference::class)
public interface IBackgroundDownloader : NativeMapped, IWinRTInterface, IBackgroundTransferBase {
  @InterfaceMethod(0)
  public fun CreateDownload(uri: Uri?, resultFile: IStorageFile?): DownloadOperation?

  @InterfaceMethod(1)
  public fun CreateDownload(
    uri: Uri?,
    resultFile: IStorageFile?,
    requestBodyFile: IStorageFile?
  ): DownloadOperation?

  @InterfaceMethod(2)
  public fun CreateDownloadAsync(
    uri: Uri?,
    resultFile: IStorageFile?,
    requestBodyStream: IInputStream?
  ): IAsyncOperation<DownloadOperation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundDownloader> {
    public override fun getValue() = ABI.makeIBackgroundDownloader(pointer.getPointer(0))

    public fun setValue(value: IBackgroundDownloader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundDownloader, IBackgroundTransferBase.WithDefault {
    public val __32912324_Ptr: Pointer?

    public val _32912324_VtblPtr: Pointer?
      get() = __32912324_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDownload(uri: Uri?, resultFile: IStorageFile?): DownloadOperation? {
      val fnPtr = _32912324_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DownloadOperation>()
      val hr = fn.invokeHR(arrayOf(__32912324_Ptr, marshalToNative(uri),
          marshalToNative(resultFile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DownloadOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateDownload(
      uri: Uri?,
      resultFile: IStorageFile?,
      requestBodyFile: IStorageFile?
    ): DownloadOperation? {
      val fnPtr = _32912324_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DownloadOperation>()
      val hr = fn.invokeHR(arrayOf(__32912324_Ptr, marshalToNative(uri),
          marshalToNative(resultFile), marshalToNative(requestBodyFile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DownloadOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateDownloadAsync(
      uri: Uri?,
      resultFile: IStorageFile?,
      requestBodyStream: IInputStream?
    ): IAsyncOperation<DownloadOperation?>? {
      val fnPtr = _32912324_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DownloadOperation?>>()
      val hr = fn.invokeHR(arrayOf(__32912324_Ptr, marshalToNative(uri),
          marshalToNative(resultFile), marshalToNative(requestBodyStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DownloadOperation?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundDownloader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTransferBase {
    public override val __1689666005_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_32912324_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __32912324_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundDownloader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1c7933366494b1da826a4b3dd234d0b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundDownloader(ptr: Pointer?): WithDefault =
        IBackgroundDownloader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundDownloader {
      val address = segment.toRawLongValue()
      return makeIBackgroundDownloader(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundDownloader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__32912324_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundDownloader): Array<IBackgroundDownloader?> =
        (elements as
        Array<IBackgroundDownloader?>).castToImpl<IBackgroundDownloader,IBackgroundDownloader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundDownloader?> =
        arrayOfNulls<IBackgroundDownloader_Impl>(size) as Array<IBackgroundDownloader?>
  }
}
