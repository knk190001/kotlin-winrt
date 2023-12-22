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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageCatalogAddResourcePackageResult.ABI::class)
@Signature("{9636ce0d-3e17-493f-aa08-ccec6fdef699}")
@Guid("9636ce0d3e17493faa08ccec6fdef699")
@WinRTInterface("9636ce0d3e17493faa08ccec6fdef699")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageCatalogAddResourcePackageResult.ByReference::class)
public interface IPackageCatalogAddResourcePackageResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Package(): Package?

  @InterfaceMethod(1)
  public fun get_IsComplete(): Boolean

  @InterfaceMethod(2)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageCatalogAddResourcePackageResult> {
    public override fun getValue() =
        ABI.makeIPackageCatalogAddResourcePackageResult(pointer.getPointer(0))

    public fun setValue(value: IPackageCatalogAddResourcePackageResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageCatalogAddResourcePackageResult {
    public val __418333100_Ptr: Pointer?

    public val _418333100_VtblPtr: Pointer?
      get() = __418333100_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Package(): Package? {
      val fnPtr = _418333100_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__418333100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsComplete(): Boolean {
      val fnPtr = _418333100_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__418333100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _418333100_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__418333100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IPackageCatalogAddResourcePackageResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __418333100_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageCatalogAddResourcePackageResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9636ce0d3e17493faa08ccec6fdef699")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageCatalogAddResourcePackageResult(ptr: Pointer?): WithDefault =
        IPackageCatalogAddResourcePackageResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPackageCatalogAddResourcePackageResult {
      val address = segment.toRawLongValue()
      return makeIPackageCatalogAddResourcePackageResult(Pointer(address))
    }

    public override fun toNative(obj: IPackageCatalogAddResourcePackageResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__418333100_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageCatalogAddResourcePackageResult):
        Array<IPackageCatalogAddResourcePackageResult?> = (elements as
        Array<IPackageCatalogAddResourcePackageResult?>).castToImpl<IPackageCatalogAddResourcePackageResult,IPackageCatalogAddResourcePackageResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageCatalogAddResourcePackageResult?> =
        arrayOfNulls<IPackageCatalogAddResourcePackageResult_Impl>(size) as
        Array<IPackageCatalogAddResourcePackageResult?>
  }
}
