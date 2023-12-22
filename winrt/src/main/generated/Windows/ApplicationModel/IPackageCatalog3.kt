package Windows.ApplicationModel

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageCatalog3.ABI::class)
@Signature("{96dd5c88-8837-43f9-9015-033434ba14f3}")
@Guid("96dd5c88883743f99015033434ba14f3")
@WinRTInterface("96dd5c88883743f99015033434ba14f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageCatalog3.ByReference::class)
public interface IPackageCatalog3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RemoveOptionalPackagesAsync(optionalPackageFamilyNames: IIterable<String?>?):
      IAsyncOperation<PackageCatalogRemoveOptionalPackagesResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageCatalog3> {
    public override fun getValue() = ABI.makeIPackageCatalog3(pointer.getPointer(0))

    public fun setValue(value: IPackageCatalog3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageCatalog3 {
    public val __184253925_Ptr: Pointer?

    public val _184253925_VtblPtr: Pointer?
      get() = __184253925_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun RemoveOptionalPackagesAsync(optionalPackageFamilyNames: IIterable<String?>?):
        IAsyncOperation<PackageCatalogRemoveOptionalPackagesResult?>? {
      val fnPtr = _184253925_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<PackageCatalogRemoveOptionalPackagesResult?>>()
      val hr = fn.invokeHR(arrayOf(__184253925_Ptr, marshalToNative(optionalPackageFamilyNames),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PackageCatalogRemoveOptionalPackagesResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageCatalog3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __184253925_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageCatalog3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96dd5c88883743f99015033434ba14f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageCatalog3(ptr: Pointer?): WithDefault = IPackageCatalog3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageCatalog3 {
      val address = segment.toRawLongValue()
      return makeIPackageCatalog3(Pointer(address))
    }

    public override fun toNative(obj: IPackageCatalog3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__184253925_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageCatalog3): Array<IPackageCatalog3?> = (elements as
        Array<IPackageCatalog3?>).castToImpl<IPackageCatalog3,IPackageCatalog3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageCatalog3?> =
        arrayOfNulls<IPackageCatalog3_Impl>(size) as Array<IPackageCatalog3?>
  }
}
