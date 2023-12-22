package Windows.Services.Store

import Windows.Foundation.HResult
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

@ABIMarker(IStoreUninstallStorePackageResult.ABI::class)
@Signature("{9fca39fd-126f-4cda-b801-1346b8d0a260}")
@Guid("9fca39fd126f4cdab8011346b8d0a260")
@WinRTInterface("9fca39fd126f4cdab8011346b8d0a260")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreUninstallStorePackageResult.ByReference::class)
public interface IStoreUninstallStorePackageResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(1)
  public fun get_Status(): StoreUninstallStorePackageStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreUninstallStorePackageResult> {
    public override fun getValue() =
        ABI.makeIStoreUninstallStorePackageResult(pointer.getPointer(0))

    public fun setValue(value: IStoreUninstallStorePackageResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreUninstallStorePackageResult {
    public val __1545043248_Ptr: Pointer?

    public val _1545043248_VtblPtr: Pointer?
      get() = __1545043248_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1545043248_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1545043248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): StoreUninstallStorePackageStatus? {
      val fnPtr = _1545043248_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreUninstallStorePackageStatus>()
      val hr = fn.invokeHR(arrayOf(__1545043248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreUninstallStorePackageStatus>(result.getValue())
      return resultValue
    }
  }

  public class IStoreUninstallStorePackageResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1545043248_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreUninstallStorePackageResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fca39fd126f4cdab8011346b8d0a260")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreUninstallStorePackageResult(ptr: Pointer?): WithDefault =
        IStoreUninstallStorePackageResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreUninstallStorePackageResult {
      val address = segment.toRawLongValue()
      return makeIStoreUninstallStorePackageResult(Pointer(address))
    }

    public override fun toNative(obj: IStoreUninstallStorePackageResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1545043248_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreUninstallStorePackageResult):
        Array<IStoreUninstallStorePackageResult?> = (elements as
        Array<IStoreUninstallStorePackageResult?>).castToImpl<IStoreUninstallStorePackageResult,IStoreUninstallStorePackageResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreUninstallStorePackageResult?> =
        arrayOfNulls<IStoreUninstallStorePackageResult_Impl>(size) as
        Array<IStoreUninstallStorePackageResult?>
  }
}
