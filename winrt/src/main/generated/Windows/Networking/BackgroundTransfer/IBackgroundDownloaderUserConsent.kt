package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundDownloaderUserConsent.ABI::class)
@Signature("{5d14e906-9266-4808-bd71-5925f2a3130a}")
@Guid("5d14e90692664808bd715925f2a3130a")
@WinRTInterface("5d14e90692664808bd715925f2a3130a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundDownloaderUserConsent.ByReference::class)
public interface IBackgroundDownloaderUserConsent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestUnconstrainedDownloadsAsync(operations: IIterable<DownloadOperation?>?):
      IAsyncOperation<UnconstrainedTransferRequestResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundDownloaderUserConsent> {
    public override fun getValue() = ABI.makeIBackgroundDownloaderUserConsent(pointer.getPointer(0))

    public fun setValue(value: IBackgroundDownloaderUserConsent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundDownloaderUserConsent {
    public val __442553195_Ptr: Pointer?

    public val _442553195_VtblPtr: Pointer?
      get() = __442553195_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun RequestUnconstrainedDownloadsAsync(operations: IIterable<DownloadOperation?>?):
        IAsyncOperation<UnconstrainedTransferRequestResult?>? {
      val fnPtr = _442553195_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UnconstrainedTransferRequestResult?>>()
      val hr = fn.invokeHR(arrayOf(__442553195_Ptr, marshalToNative(operations), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<UnconstrainedTransferRequestResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundDownloaderUserConsent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __442553195_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundDownloaderUserConsent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d14e90692664808bd715925f2a3130a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundDownloaderUserConsent(ptr: Pointer?): WithDefault =
        IBackgroundDownloaderUserConsent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundDownloaderUserConsent {
      val address = segment.toRawLongValue()
      return makeIBackgroundDownloaderUserConsent(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundDownloaderUserConsent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__442553195_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundDownloaderUserConsent):
        Array<IBackgroundDownloaderUserConsent?> = (elements as
        Array<IBackgroundDownloaderUserConsent?>).castToImpl<IBackgroundDownloaderUserConsent,IBackgroundDownloaderUserConsent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundDownloaderUserConsent?> =
        arrayOfNulls<IBackgroundDownloaderUserConsent_Impl>(size) as
        Array<IBackgroundDownloaderUserConsent?>
  }
}
