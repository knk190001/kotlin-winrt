package Windows.Storage.Search

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IQueryOptionsWithProviderFilter.ABI::class)
@Signature("{5b9d1026-15c4-44dd-b89a-47a59b7d7c4f}")
@Guid("5b9d102615c444ddb89a47a59b7d7c4f")
@WinRTInterface("5b9d102615c444ddb89a47a59b7d7c4f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IQueryOptionsWithProviderFilter.ByReference::class)
public interface IQueryOptionsWithProviderFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StorageProviderIdFilter(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IQueryOptionsWithProviderFilter> {
    public override fun getValue() = ABI.makeIQueryOptionsWithProviderFilter(pointer.getPointer(0))

    public fun setValue(value: IQueryOptionsWithProviderFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IQueryOptionsWithProviderFilter {
    public val __541903672_Ptr: Pointer?

    public val _541903672_VtblPtr: Pointer?
      get() = __541903672_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StorageProviderIdFilter(): IVector<String?>? {
      val fnPtr = _541903672_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__541903672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IQueryOptionsWithProviderFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __541903672_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IQueryOptionsWithProviderFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b9d102615c444ddb89a47a59b7d7c4f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIQueryOptionsWithProviderFilter(ptr: Pointer?): WithDefault =
        IQueryOptionsWithProviderFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IQueryOptionsWithProviderFilter {
      val address = segment.toRawLongValue()
      return makeIQueryOptionsWithProviderFilter(Pointer(address))
    }

    public override fun toNative(obj: IQueryOptionsWithProviderFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__541903672_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IQueryOptionsWithProviderFilter):
        Array<IQueryOptionsWithProviderFilter?> = (elements as
        Array<IQueryOptionsWithProviderFilter?>).castToImpl<IQueryOptionsWithProviderFilter,IQueryOptionsWithProviderFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IQueryOptionsWithProviderFilter?> =
        arrayOfNulls<IQueryOptionsWithProviderFilter_Impl>(size) as
        Array<IQueryOptionsWithProviderFilter?>
  }
}
