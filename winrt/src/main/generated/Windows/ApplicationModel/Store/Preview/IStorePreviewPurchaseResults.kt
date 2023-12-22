package Windows.ApplicationModel.Store.Preview

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

@ABIMarker(IStorePreviewPurchaseResults.ABI::class)
@Signature("{b0daaed1-d6c5-4e53-a043-fba0d8e61231}")
@Guid("b0daaed1d6c54e53a043fba0d8e61231")
@WinRTInterface("b0daaed1d6c54e53a043fba0d8e61231")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePreviewPurchaseResults.ByReference::class)
public interface IStorePreviewPurchaseResults : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductPurchaseStatus(): StorePreviewProductPurchaseStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorePreviewPurchaseResults> {
    public override fun getValue() = ABI.makeIStorePreviewPurchaseResults(pointer.getPointer(0))

    public fun setValue(value: IStorePreviewPurchaseResults_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePreviewPurchaseResults {
    public val __1147521686_Ptr: Pointer?

    public val _1147521686_VtblPtr: Pointer?
      get() = __1147521686_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductPurchaseStatus(): StorePreviewProductPurchaseStatus? {
      val fnPtr = _1147521686_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorePreviewProductPurchaseStatus>()
      val hr = fn.invokeHR(arrayOf(__1147521686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorePreviewProductPurchaseStatus>(result.getValue())
      return resultValue
    }
  }

  public class IStorePreviewPurchaseResults_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1147521686_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePreviewPurchaseResults, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0daaed1d6c54e53a043fba0d8e61231")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePreviewPurchaseResults(ptr: Pointer?): WithDefault =
        IStorePreviewPurchaseResults_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePreviewPurchaseResults {
      val address = segment.toRawLongValue()
      return makeIStorePreviewPurchaseResults(Pointer(address))
    }

    public override fun toNative(obj: IStorePreviewPurchaseResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1147521686_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePreviewPurchaseResults):
        Array<IStorePreviewPurchaseResults?> = (elements as
        Array<IStorePreviewPurchaseResults?>).castToImpl<IStorePreviewPurchaseResults,IStorePreviewPurchaseResults_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePreviewPurchaseResults?> =
        arrayOfNulls<IStorePreviewPurchaseResults_Impl>(size) as
        Array<IStorePreviewPurchaseResults?>
  }
}
