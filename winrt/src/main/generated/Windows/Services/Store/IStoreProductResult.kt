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

@ABIMarker(IStoreProductResult.ABI::class)
@Signature("{b7674f73-3c87-4ee1-8201-f428359bd3af}")
@Guid("b7674f733c874ee18201f428359bd3af")
@WinRTInterface("b7674f733c874ee18201f428359bd3af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreProductResult.ByReference::class)
public interface IStoreProductResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Product(): StoreProduct?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreProductResult> {
    public override fun getValue() = ABI.makeIStoreProductResult(pointer.getPointer(0))

    public fun setValue(value: IStoreProductResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreProductResult {
    public val __4610808_Ptr: Pointer?

    public val _4610808_VtblPtr: Pointer?
      get() = __4610808_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Product(): StoreProduct? {
      val fnPtr = _4610808_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreProduct>()
      val hr = fn.invokeHR(arrayOf(__4610808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreProduct>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _4610808_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__4610808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IStoreProductResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __4610808_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreProductResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7674f733c874ee18201f428359bd3af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreProductResult(ptr: Pointer?): WithDefault = IStoreProductResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreProductResult {
      val address = segment.toRawLongValue()
      return makeIStoreProductResult(Pointer(address))
    }

    public override fun toNative(obj: IStoreProductResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__4610808_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreProductResult): Array<IStoreProductResult?> =
        (elements as
        Array<IStoreProductResult?>).castToImpl<IStoreProductResult,IStoreProductResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreProductResult?> =
        arrayOfNulls<IStoreProductResult_Impl>(size) as Array<IStoreProductResult?>
  }
}
