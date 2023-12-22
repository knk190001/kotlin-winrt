package Windows.Services.Store

import Windows.ApplicationModel.Package
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

@ABIMarker(IStoreContext2.ABI::class)
@Signature("{18bc54da-7bd9-452c-9116-3bbd06ffc63a}")
@Guid("18bc54da7bd9452c91163bbd06ffc63a")
@WinRTInterface("18bc54da7bd9452c91163bbd06ffc63a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreContext2.ByReference::class)
public interface IStoreContext2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindStoreProductForPackageAsync(productKinds: IIterable<String?>?,
      `package`: Package?): IAsyncOperation<StoreProductResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStoreContext2>
      {
    public override fun getValue() = ABI.makeIStoreContext2(pointer.getPointer(0))

    public fun setValue(value: IStoreContext2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreContext2 {
    public val __137068503_Ptr: Pointer?

    public val _137068503_VtblPtr: Pointer?
      get() = __137068503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindStoreProductForPackageAsync(productKinds: IIterable<String?>?,
        `package`: Package?): IAsyncOperation<StoreProductResult?>? {
      val fnPtr = _137068503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoreProductResult?>>()
      val hr = fn.invokeHR(arrayOf(__137068503_Ptr, marshalToNative(productKinds),
          marshalToNative(`package`), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StoreProductResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IStoreContext2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __137068503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreContext2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18bc54da7bd9452c91163bbd06ffc63a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreContext2(ptr: Pointer?): WithDefault = IStoreContext2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreContext2 {
      val address = segment.toRawLongValue()
      return makeIStoreContext2(Pointer(address))
    }

    public override fun toNative(obj: IStoreContext2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__137068503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreContext2): Array<IStoreContext2?> = (elements as
        Array<IStoreContext2?>).castToImpl<IStoreContext2,IStoreContext2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreContext2?> =
        arrayOfNulls<IStoreContext2_Impl>(size) as Array<IStoreContext2?>
  }
}
