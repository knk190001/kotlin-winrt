package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundUploader.ABI::class)
@Signature("{c595c9ae-cead-465b-8801-c55ac90a01ce}")
@Guid("c595c9aecead465b8801c55ac90a01ce")
@WinRTInterface("c595c9aecead465b8801c55ac90a01ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundUploader.ByReference::class)
public interface IBackgroundUploader : NativeMapped, IWinRTInterface, IBackgroundTransferBase {
  @InterfaceMethod(0)
  public fun CreateUpload(uri: Uri?, sourceFile: IStorageFile?): UploadOperation?

  @InterfaceMethod(1)
  public fun CreateUploadFromStreamAsync(uri: Uri?, sourceStream: IInputStream?):
      IAsyncOperation<UploadOperation?>?

  @InterfaceMethod(2)
  public fun CreateUploadAsync(uri: Uri?, parts: IIterable<BackgroundTransferContentPart?>?):
      IAsyncOperation<UploadOperation?>?

  @InterfaceMethod(3)
  public fun CreateUploadAsync(
    uri: Uri?,
    parts: IIterable<BackgroundTransferContentPart?>?,
    subType: String?
  ): IAsyncOperation<UploadOperation?>?

  @InterfaceMethod(4)
  public fun CreateUploadAsync(
    uri: Uri?,
    parts: IIterable<BackgroundTransferContentPart?>?,
    subType: String?,
    boundary: String?
  ): IAsyncOperation<UploadOperation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundUploader> {
    public override fun getValue() = ABI.makeIBackgroundUploader(pointer.getPointer(0))

    public fun setValue(value: IBackgroundUploader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundUploader, IBackgroundTransferBase.WithDefault {
    public val __355412291_Ptr: Pointer?

    public val _355412291_VtblPtr: Pointer?
      get() = __355412291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateUpload(uri: Uri?, sourceFile: IStorageFile?): UploadOperation? {
      val fnPtr = _355412291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UploadOperation>()
      val hr = fn.invokeHR(arrayOf(__355412291_Ptr, marshalToNative(uri),
          marshalToNative(sourceFile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UploadOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateUploadFromStreamAsync(uri: Uri?, sourceStream: IInputStream?):
        IAsyncOperation<UploadOperation?>? {
      val fnPtr = _355412291_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UploadOperation?>>()
      val hr = fn.invokeHR(arrayOf(__355412291_Ptr, marshalToNative(uri),
          marshalToNative(sourceStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UploadOperation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateUploadAsync(uri: Uri?,
        parts: IIterable<BackgroundTransferContentPart?>?): IAsyncOperation<UploadOperation?>? {
      val fnPtr = _355412291_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UploadOperation?>>()
      val hr = fn.invokeHR(arrayOf(__355412291_Ptr, marshalToNative(uri), marshalToNative(parts),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UploadOperation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateUploadAsync(
      uri: Uri?,
      parts: IIterable<BackgroundTransferContentPart?>?,
      subType: String?
    ): IAsyncOperation<UploadOperation?>? {
      val fnPtr = _355412291_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UploadOperation?>>()
      val hr = fn.invokeHR(arrayOf(__355412291_Ptr, marshalToNative(uri), marshalToNative(parts),
          marshalToNative(subType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UploadOperation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateUploadAsync(
      uri: Uri?,
      parts: IIterable<BackgroundTransferContentPart?>?,
      subType: String?,
      boundary: String?
    ): IAsyncOperation<UploadOperation?>? {
      val fnPtr = _355412291_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UploadOperation?>>()
      val hr = fn.invokeHR(arrayOf(__355412291_Ptr, marshalToNative(uri), marshalToNative(parts),
          marshalToNative(subType), marshalToNative(boundary), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UploadOperation?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundUploader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTransferBase {
    public override val __1689666005_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_355412291_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __355412291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundUploader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c595c9aecead465b8801c55ac90a01ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundUploader(ptr: Pointer?): WithDefault = IBackgroundUploader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundUploader {
      val address = segment.toRawLongValue()
      return makeIBackgroundUploader(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundUploader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__355412291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundUploader): Array<IBackgroundUploader?> =
        (elements as
        Array<IBackgroundUploader?>).castToImpl<IBackgroundUploader,IBackgroundUploader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundUploader?> =
        arrayOfNulls<IBackgroundUploader_Impl>(size) as Array<IBackgroundUploader?>
  }
}
