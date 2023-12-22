package Windows.ApplicationModel

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

@ABIMarker(IPackageCatalogAddOptionalPackageResult.ABI::class)
@Signature("{3bf10cd4-b4df-47b3-a963-e2fa832f7dd3}")
@Guid("3bf10cd4b4df47b3a963e2fa832f7dd3")
@WinRTInterface("3bf10cd4b4df47b3a963e2fa832f7dd3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageCatalogAddOptionalPackageResult.ByReference::class)
public interface IPackageCatalogAddOptionalPackageResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Package(): Package?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageCatalogAddOptionalPackageResult> {
    public override fun getValue() =
        ABI.makeIPackageCatalogAddOptionalPackageResult(pointer.getPointer(0))

    public fun setValue(value: IPackageCatalogAddOptionalPackageResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageCatalogAddOptionalPackageResult {
    public val __678342554_Ptr: Pointer?

    public val _678342554_VtblPtr: Pointer?
      get() = __678342554_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Package(): Package? {
      val fnPtr = _678342554_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__678342554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _678342554_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__678342554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IPackageCatalogAddOptionalPackageResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __678342554_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageCatalogAddOptionalPackageResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3bf10cd4b4df47b3a963e2fa832f7dd3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageCatalogAddOptionalPackageResult(ptr: Pointer?): WithDefault =
        IPackageCatalogAddOptionalPackageResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPackageCatalogAddOptionalPackageResult {
      val address = segment.toRawLongValue()
      return makeIPackageCatalogAddOptionalPackageResult(Pointer(address))
    }

    public override fun toNative(obj: IPackageCatalogAddOptionalPackageResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__678342554_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageCatalogAddOptionalPackageResult):
        Array<IPackageCatalogAddOptionalPackageResult?> = (elements as
        Array<IPackageCatalogAddOptionalPackageResult?>).castToImpl<IPackageCatalogAddOptionalPackageResult,IPackageCatalogAddOptionalPackageResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageCatalogAddOptionalPackageResult?> =
        arrayOfNulls<IPackageCatalogAddOptionalPackageResult_Impl>(size) as
        Array<IPackageCatalogAddOptionalPackageResult?>
  }
}
