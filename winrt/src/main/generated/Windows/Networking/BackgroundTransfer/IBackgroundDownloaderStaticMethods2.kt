package Windows.Networking.BackgroundTransfer

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IBackgroundDownloaderStaticMethods2.ABI::class)
@Signature("{2faa1327-1ad4-4ca5-b2cd-08dbf0746afe}")
@Guid("2faa13271ad44ca5b2cd08dbf0746afe")
@WinRTInterface("2faa13271ad44ca5b2cd08dbf0746afe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundDownloaderStaticMethods2.ByReference::class)
public interface IBackgroundDownloaderStaticMethods2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentDownloadsForTransferGroupAsync(group: BackgroundTransferGroup?):
      IAsyncOperation<IVectorView<DownloadOperation?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundDownloaderStaticMethods2> {
    public override fun getValue() =
        ABI.makeIBackgroundDownloaderStaticMethods2(pointer.getPointer(0))

    public fun setValue(value: IBackgroundDownloaderStaticMethods2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundDownloaderStaticMethods2 {
    public val __2349006_Ptr: Pointer?

    public val _2349006_VtblPtr: Pointer?
      get() = __2349006_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentDownloadsForTransferGroupAsync(group: BackgroundTransferGroup?):
        IAsyncOperation<IVectorView<DownloadOperation?>?>? {
      val fnPtr = _2349006_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<DownloadOperation?>?>>()
      val hr = fn.invokeHR(arrayOf(__2349006_Ptr, marshalToNative(group), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<DownloadOperation?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundDownloaderStaticMethods2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2349006_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundDownloaderStaticMethods2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2faa13271ad44ca5b2cd08dbf0746afe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundDownloaderStaticMethods2(ptr: Pointer?): WithDefault =
        IBackgroundDownloaderStaticMethods2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundDownloaderStaticMethods2 {
      val address = segment.toRawLongValue()
      return makeIBackgroundDownloaderStaticMethods2(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundDownloaderStaticMethods2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2349006_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundDownloaderStaticMethods2):
        Array<IBackgroundDownloaderStaticMethods2?> = (elements as
        Array<IBackgroundDownloaderStaticMethods2?>).castToImpl<IBackgroundDownloaderStaticMethods2,IBackgroundDownloaderStaticMethods2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundDownloaderStaticMethods2?> =
        arrayOfNulls<IBackgroundDownloaderStaticMethods2_Impl>(size) as
        Array<IBackgroundDownloaderStaticMethods2?>
  }
}
