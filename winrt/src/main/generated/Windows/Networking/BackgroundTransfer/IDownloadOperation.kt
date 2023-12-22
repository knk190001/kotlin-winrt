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

@ABIMarker(IDownloadOperation.ABI::class)
@Signature("{bd87ebb0-5714-4e09-ba68-bef73903b0d7}")
@Guid("bd87ebb057144e09ba68bef73903b0d7")
@WinRTInterface("bd87ebb057144e09ba68bef73903b0d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDownloadOperation.ByReference::class)
public interface IDownloadOperation : NativeMapped, IWinRTInterface, IBackgroundTransferOperation {
  @InterfaceMethod(0)
  public fun get_ResultFile(): IStorageFile?

  @InterfaceMethod(1)
  public fun get_Progress(): BackgroundDownloadProgress?

  @InterfaceMethod(2)
  public fun StartAsync(): IAsyncOperationWithProgress<DownloadOperation?, DownloadOperation?>?

  @InterfaceMethod(3)
  public fun AttachAsync(): IAsyncOperationWithProgress<DownloadOperation?, DownloadOperation?>?

  @InterfaceMethod(4)
  public fun Pause(): Unit

  @InterfaceMethod(5)
  public fun Resume(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDownloadOperation> {
    public override fun getValue() = ABI.makeIDownloadOperation(pointer.getPointer(0))

    public fun setValue(value: IDownloadOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDownloadOperation, IBackgroundTransferOperation.WithDefault {
    public val __1669502110_Ptr: Pointer?

    public val _1669502110_VtblPtr: Pointer?
      get() = __1669502110_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResultFile(): IStorageFile? {
      val fnPtr = _1669502110_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageFile>()
      val hr = fn.invokeHR(arrayOf(__1669502110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Progress(): BackgroundDownloadProgress? {
      val fnPtr = _1669502110_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundDownloadProgress>()
      val hr = fn.invokeHR(arrayOf(__1669502110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundDownloadProgress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StartAsync(): IAsyncOperationWithProgress<DownloadOperation?,
        DownloadOperation?>? {
      val fnPtr = _1669502110_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DownloadOperation?,
          DownloadOperation?>>()
      val hr = fn.invokeHR(arrayOf(__1669502110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DownloadOperation?,
          DownloadOperation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun AttachAsync(): IAsyncOperationWithProgress<DownloadOperation?,
        DownloadOperation?>? {
      val fnPtr = _1669502110_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DownloadOperation?,
          DownloadOperation?>>()
      val hr = fn.invokeHR(arrayOf(__1669502110_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DownloadOperation?,
          DownloadOperation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Pause(): Unit {
      val fnPtr = _1669502110_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669502110_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Resume(): Unit {
      val fnPtr = _1669502110_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1669502110_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDownloadOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTransferOperation {
    public override val __1632478797_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1669502110_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1669502110_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDownloadOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd87ebb057144e09ba68bef73903b0d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDownloadOperation(ptr: Pointer?): WithDefault = IDownloadOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDownloadOperation {
      val address = segment.toRawLongValue()
      return makeIDownloadOperation(Pointer(address))
    }

    public override fun toNative(obj: IDownloadOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1669502110_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDownloadOperation): Array<IDownloadOperation?> =
        (elements as
        Array<IDownloadOperation?>).castToImpl<IDownloadOperation,IDownloadOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDownloadOperation?> =
        arrayOfNulls<IDownloadOperation_Impl>(size) as Array<IDownloadOperation?>
  }
}
