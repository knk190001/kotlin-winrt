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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProductPurchaseDisplayPropertiesFactory.ABI::class)
@Signature("{6f491df4-32d6-4b40-b474-b83038a4d9cf}")
@Guid("6f491df432d64b40b474b83038a4d9cf")
@WinRTInterface("6f491df432d64b40b474b83038a4d9cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProductPurchaseDisplayPropertiesFactory.ByReference::class)
public interface IProductPurchaseDisplayPropertiesFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateProductPurchaseDisplayProperties(name: String?):
      ProductPurchaseDisplayProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProductPurchaseDisplayPropertiesFactory> {
    public override fun getValue() =
        ABI.makeIProductPurchaseDisplayPropertiesFactory(pointer.getPointer(0))

    public fun setValue(value: IProductPurchaseDisplayPropertiesFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProductPurchaseDisplayPropertiesFactory {
    public val __1331652173_Ptr: Pointer?

    public val _1331652173_VtblPtr: Pointer?
      get() = __1331652173_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateProductPurchaseDisplayProperties(name: String?):
        ProductPurchaseDisplayProperties? {
      val fnPtr = _1331652173_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProductPurchaseDisplayProperties>()
      val hr = fn.invokeHR(arrayOf(__1331652173_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProductPurchaseDisplayProperties>(result.getValue())
      return resultValue
    }
  }

  public class IProductPurchaseDisplayPropertiesFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1331652173_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProductPurchaseDisplayPropertiesFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f491df432d64b40b474b83038a4d9cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProductPurchaseDisplayPropertiesFactory(ptr: Pointer?): WithDefault =
        IProductPurchaseDisplayPropertiesFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IProductPurchaseDisplayPropertiesFactory {
      val address = segment.toRawLongValue()
      return makeIProductPurchaseDisplayPropertiesFactory(Pointer(address))
    }

    public override fun toNative(obj: IProductPurchaseDisplayPropertiesFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1331652173_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProductPurchaseDisplayPropertiesFactory):
        Array<IProductPurchaseDisplayPropertiesFactory?> = (elements as
        Array<IProductPurchaseDisplayPropertiesFactory?>).castToImpl<IProductPurchaseDisplayPropertiesFactory,IProductPurchaseDisplayPropertiesFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProductPurchaseDisplayPropertiesFactory?> =
        arrayOfNulls<IProductPurchaseDisplayPropertiesFactory_Impl>(size) as
        Array<IProductPurchaseDisplayPropertiesFactory?>
  }
}
