package Windows.ApplicationModel

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPackageCatalogRemoveOptionalPackagesResult.ABI::class)
@Signature("{29d2f97b-d974-4e64-9359-22cadfd79828}")
@Guid("29d2f97bd9744e64935922cadfd79828")
@WinRTInterface("29d2f97bd9744e64935922cadfd79828")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageCatalogRemoveOptionalPackagesResult.ByReference::class)
public interface IPackageCatalogRemoveOptionalPackagesResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PackagesRemoved(): IVectorView<Package?>?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageCatalogRemoveOptionalPackagesResult> {
    public override fun getValue() =
        ABI.makeIPackageCatalogRemoveOptionalPackagesResult(pointer.getPointer(0))

    public fun setValue(value: IPackageCatalogRemoveOptionalPackagesResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageCatalogRemoveOptionalPackagesResult {
    public val __828431814_Ptr: Pointer?

    public val _828431814_VtblPtr: Pointer?
      get() = __828431814_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PackagesRemoved(): IVectorView<Package?>? {
      val fnPtr = _828431814_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Package?>>()
      val hr = fn.invokeHR(arrayOf(__828431814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _828431814_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__828431814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IPackageCatalogRemoveOptionalPackagesResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __828431814_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageCatalogRemoveOptionalPackagesResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29d2f97bd9744e64935922cadfd79828")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageCatalogRemoveOptionalPackagesResult(ptr: Pointer?): WithDefault =
        IPackageCatalogRemoveOptionalPackagesResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPackageCatalogRemoveOptionalPackagesResult {
      val address = segment.toRawLongValue()
      return makeIPackageCatalogRemoveOptionalPackagesResult(Pointer(address))
    }

    public override fun toNative(obj: IPackageCatalogRemoveOptionalPackagesResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__828431814_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageCatalogRemoveOptionalPackagesResult):
        Array<IPackageCatalogRemoveOptionalPackagesResult?> = (elements as
        Array<IPackageCatalogRemoveOptionalPackagesResult?>).castToImpl<IPackageCatalogRemoveOptionalPackagesResult,IPackageCatalogRemoveOptionalPackagesResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageCatalogRemoveOptionalPackagesResult?> =
        arrayOfNulls<IPackageCatalogRemoveOptionalPackagesResult_Impl>(size) as
        Array<IPackageCatalogRemoveOptionalPackagesResult?>
  }
}
