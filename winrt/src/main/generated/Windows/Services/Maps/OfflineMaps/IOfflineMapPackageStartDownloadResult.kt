package Windows.Services.Maps.OfflineMaps

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

@ABIMarker(IOfflineMapPackageStartDownloadResult.ABI::class)
@Signature("{d965b918-d4d6-4afe-9378-3ec71ef11c3d}")
@Guid("d965b918d4d64afe93783ec71ef11c3d")
@WinRTInterface("d965b918d4d64afe93783ec71ef11c3d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOfflineMapPackageStartDownloadResult.ByReference::class)
public interface IOfflineMapPackageStartDownloadResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): OfflineMapPackageStartDownloadStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOfflineMapPackageStartDownloadResult> {
    public override fun getValue() =
        ABI.makeIOfflineMapPackageStartDownloadResult(pointer.getPointer(0))

    public fun setValue(value: IOfflineMapPackageStartDownloadResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOfflineMapPackageStartDownloadResult {
    public val __628018181_Ptr: Pointer?

    public val _628018181_VtblPtr: Pointer?
      get() = __628018181_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): OfflineMapPackageStartDownloadStatus? {
      val fnPtr = _628018181_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OfflineMapPackageStartDownloadStatus>()
      val hr = fn.invokeHR(arrayOf(__628018181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OfflineMapPackageStartDownloadStatus>(result.getValue())
      return resultValue
    }
  }

  public class IOfflineMapPackageStartDownloadResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __628018181_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOfflineMapPackageStartDownloadResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d965b918d4d64afe93783ec71ef11c3d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOfflineMapPackageStartDownloadResult(ptr: Pointer?): WithDefault =
        IOfflineMapPackageStartDownloadResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOfflineMapPackageStartDownloadResult {
      val address = segment.toRawLongValue()
      return makeIOfflineMapPackageStartDownloadResult(Pointer(address))
    }

    public override fun toNative(obj: IOfflineMapPackageStartDownloadResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__628018181_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOfflineMapPackageStartDownloadResult):
        Array<IOfflineMapPackageStartDownloadResult?> = (elements as
        Array<IOfflineMapPackageStartDownloadResult?>).castToImpl<IOfflineMapPackageStartDownloadResult,IOfflineMapPackageStartDownloadResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOfflineMapPackageStartDownloadResult?> =
        arrayOfNulls<IOfflineMapPackageStartDownloadResult_Impl>(size) as
        Array<IOfflineMapPackageStartDownloadResult?>
  }
}
