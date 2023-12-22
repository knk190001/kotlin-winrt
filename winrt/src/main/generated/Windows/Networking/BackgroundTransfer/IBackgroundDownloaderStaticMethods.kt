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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundDownloaderStaticMethods.ABI::class)
@Signature("{52a65a35-c64e-426c-9919-540d0d21a650}")
@Guid("52a65a35c64e426c9919540d0d21a650")
@WinRTInterface("52a65a35c64e426c9919540d0d21a650")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundDownloaderStaticMethods.ByReference::class)
public interface IBackgroundDownloaderStaticMethods : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentDownloadsAsync(): IAsyncOperation<IVectorView<DownloadOperation?>?>?

  @InterfaceMethod(1)
  public fun GetCurrentDownloadsAsync(group: String?):
      IAsyncOperation<IVectorView<DownloadOperation?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundDownloaderStaticMethods> {
    public override fun getValue() =
        ABI.makeIBackgroundDownloaderStaticMethods(pointer.getPointer(0))

    public fun setValue(value: IBackgroundDownloaderStaticMethods_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundDownloaderStaticMethods {
    public val __75776_Ptr: Pointer?

    public val _75776_VtblPtr: Pointer?
      get() = __75776_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentDownloadsAsync():
        IAsyncOperation<IVectorView<DownloadOperation?>?>? {
      val fnPtr = _75776_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<DownloadOperation?>?>>()
      val hr = fn.invokeHR(arrayOf(__75776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<DownloadOperation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentDownloadsAsync(group: String?):
        IAsyncOperation<IVectorView<DownloadOperation?>?>? {
      val fnPtr = _75776_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<DownloadOperation?>?>>()
      val hr = fn.invokeHR(arrayOf(__75776_Ptr, marshalToNative(group), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<DownloadOperation?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundDownloaderStaticMethods_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __75776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundDownloaderStaticMethods, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52a65a35c64e426c9919540d0d21a650")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundDownloaderStaticMethods(ptr: Pointer?): WithDefault =
        IBackgroundDownloaderStaticMethods_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundDownloaderStaticMethods {
      val address = segment.toRawLongValue()
      return makeIBackgroundDownloaderStaticMethods(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundDownloaderStaticMethods): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__75776_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundDownloaderStaticMethods):
        Array<IBackgroundDownloaderStaticMethods?> = (elements as
        Array<IBackgroundDownloaderStaticMethods?>).castToImpl<IBackgroundDownloaderStaticMethods,IBackgroundDownloaderStaticMethods_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundDownloaderStaticMethods?> =
        arrayOfNulls<IBackgroundDownloaderStaticMethods_Impl>(size) as
        Array<IBackgroundDownloaderStaticMethods?>
  }
}
