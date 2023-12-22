package Windows.Services.Maps.OfflineMaps

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IOfflineMapPackageQueryResult.ABI::class)
@Signature("{55585411-39e1-4e41-a4e1-5f4872bee199}")
@Guid("5558541139e14e41a4e15f4872bee199")
@WinRTInterface("5558541139e14e41a4e15f4872bee199")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOfflineMapPackageQueryResult.ByReference::class)
public interface IOfflineMapPackageQueryResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): OfflineMapPackageQueryStatus?

  @InterfaceMethod(1)
  public fun get_Packages(): IVectorView<OfflineMapPackage?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOfflineMapPackageQueryResult> {
    public override fun getValue() = ABI.makeIOfflineMapPackageQueryResult(pointer.getPointer(0))

    public fun setValue(value: IOfflineMapPackageQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOfflineMapPackageQueryResult {
    public val __35425081_Ptr: Pointer?

    public val _35425081_VtblPtr: Pointer?
      get() = __35425081_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): OfflineMapPackageQueryStatus? {
      val fnPtr = _35425081_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OfflineMapPackageQueryStatus>()
      val hr = fn.invokeHR(arrayOf(__35425081_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OfflineMapPackageQueryStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Packages(): IVectorView<OfflineMapPackage?>? {
      val fnPtr = _35425081_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<OfflineMapPackage?>>()
      val hr = fn.invokeHR(arrayOf(__35425081_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<OfflineMapPackage?>>(result.getValue())
      return resultValue
    }
  }

  public class IOfflineMapPackageQueryResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __35425081_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOfflineMapPackageQueryResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5558541139e14e41a4e15f4872bee199")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOfflineMapPackageQueryResult(ptr: Pointer?): WithDefault =
        IOfflineMapPackageQueryResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOfflineMapPackageQueryResult {
      val address = segment.toRawLongValue()
      return makeIOfflineMapPackageQueryResult(Pointer(address))
    }

    public override fun toNative(obj: IOfflineMapPackageQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__35425081_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOfflineMapPackageQueryResult):
        Array<IOfflineMapPackageQueryResult?> = (elements as
        Array<IOfflineMapPackageQueryResult?>).castToImpl<IOfflineMapPackageQueryResult,IOfflineMapPackageQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOfflineMapPackageQueryResult?> =
        arrayOfNulls<IOfflineMapPackageQueryResult_Impl>(size) as
        Array<IOfflineMapPackageQueryResult?>
  }
}
