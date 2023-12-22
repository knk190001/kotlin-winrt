package Windows.ApplicationModel.Store

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

@ABIMarker(IProductListingWithConsumables.ABI::class)
@Signature("{eb9e9790-8f6b-481f-93a7-5c3a63068149}")
@Guid("eb9e97908f6b481f93a75c3a63068149")
@WinRTInterface("eb9e97908f6b481f93a75c3a63068149")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProductListingWithConsumables.ByReference::class)
public interface IProductListingWithConsumables : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductType(): ProductType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProductListingWithConsumables> {
    public override fun getValue() = ABI.makeIProductListingWithConsumables(pointer.getPointer(0))

    public fun setValue(value: IProductListingWithConsumables_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProductListingWithConsumables {
    public val __1159379261_Ptr: Pointer?

    public val _1159379261_VtblPtr: Pointer?
      get() = __1159379261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductType(): ProductType? {
      val fnPtr = _1159379261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProductType>()
      val hr = fn.invokeHR(arrayOf(__1159379261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProductType>(result.getValue())
      return resultValue
    }
  }

  public class IProductListingWithConsumables_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1159379261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProductListingWithConsumables, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb9e97908f6b481f93a75c3a63068149")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProductListingWithConsumables(ptr: Pointer?): WithDefault =
        IProductListingWithConsumables_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProductListingWithConsumables {
      val address = segment.toRawLongValue()
      return makeIProductListingWithConsumables(Pointer(address))
    }

    public override fun toNative(obj: IProductListingWithConsumables): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1159379261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProductListingWithConsumables):
        Array<IProductListingWithConsumables?> = (elements as
        Array<IProductListingWithConsumables?>).castToImpl<IProductListingWithConsumables,IProductListingWithConsumables_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProductListingWithConsumables?> =
        arrayOfNulls<IProductListingWithConsumables_Impl>(size) as
        Array<IProductListingWithConsumables?>
  }
}
