package Windows.Networking.BackgroundTransfer

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Networking.BackgroundTransfer.IBackgroundTransferOperation.ABI.IID
import Windows.Storage.IStorageFile
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

@ABIMarker(IUploadOperation.ABI::class)
@Signature("{3e5624e0-7389-434c-8b35-427fd36bbdae}")
@Guid("3e5624e07389434c8b35427fd36bbdae")
@WinRTInterface("3e5624e07389434c8b35427fd36bbdae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUploadOperation.ByReference::class)
public interface IUploadOperation : NativeMapped, IWinRTInterface, IBackgroundTransferOperation {
  @InterfaceMethod(0)
  public fun get_SourceFile(): IStorageFile?

  @InterfaceMethod(1)
  public fun get_Progress(): BackgroundUploadProgress?

  @InterfaceMethod(2)
  public fun StartAsync(): IAsyncOperationWithProgress<UploadOperation?, UploadOperation?>?

  @InterfaceMethod(3)
  public fun AttachAsync(): IAsyncOperationWithProgress<UploadOperation?, UploadOperation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUploadOperation> {
    public override fun getValue() = ABI.makeIUploadOperation(pointer.getPointer(0))

    public fun setValue(value: IUploadOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUploadOperation, IBackgroundTransferOperation.WithDefault {
    public val __2095158021_Ptr: Pointer?

    public val _2095158021_VtblPtr: Pointer?
      get() = __2095158021_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceFile(): IStorageFile? {
      val fnPtr = _2095158021_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageFile>()
      val hr = fn.invokeHR(arrayOf(__2095158021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Progress(): BackgroundUploadProgress? {
      val fnPtr = _2095158021_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundUploadProgress>()
      val hr = fn.invokeHR(arrayOf(__2095158021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundUploadProgress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StartAsync(): IAsyncOperationWithProgress<UploadOperation?,
        UploadOperation?>? {
      val fnPtr = _2095158021_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<UploadOperation?,
          UploadOperation?>>()
      val hr = fn.invokeHR(arrayOf(__2095158021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<UploadOperation?,
          UploadOperation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun AttachAsync(): IAsyncOperationWithProgress<UploadOperation?,
        UploadOperation?>? {
      val fnPtr = _2095158021_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<UploadOperation?,
          UploadOperation?>>()
      val hr = fn.invokeHR(arrayOf(__2095158021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<UploadOperation?,
          UploadOperation?>>(result.getValue())
      return resultValue
    }
  }

  public class IUploadOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTransferOperation {
    public override val __1632478797_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2095158021_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2095158021_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUploadOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3e5624e07389434c8b35427fd36bbdae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUploadOperation(ptr: Pointer?): WithDefault = IUploadOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUploadOperation {
      val address = segment.toRawLongValue()
      return makeIUploadOperation(Pointer(address))
    }

    public override fun toNative(obj: IUploadOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2095158021_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUploadOperation): Array<IUploadOperation?> = (elements as
        Array<IUploadOperation?>).castToImpl<IUploadOperation,IUploadOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUploadOperation?> =
        arrayOfNulls<IUploadOperation_Impl>(size) as Array<IUploadOperation?>
  }
}
