package Windows.Services.Store

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

@ABIMarker(IStorePurchasePropertiesFactory.ABI::class)
@Signature("{a768f59e-fefd-489f-9a17-22a593e68b9d}")
@Guid("a768f59efefd489f9a1722a593e68b9d")
@WinRTInterface("a768f59efefd489f9a1722a593e68b9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePurchasePropertiesFactory.ByReference::class)
public interface IStorePurchasePropertiesFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(name: String?): StorePurchaseProperties?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorePurchasePropertiesFactory> {
    public override fun getValue() = ABI.makeIStorePurchasePropertiesFactory(pointer.getPointer(0))

    public fun setValue(value: IStorePurchasePropertiesFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePurchasePropertiesFactory {
    public val __570580894_Ptr: Pointer?

    public val _570580894_VtblPtr: Pointer?
      get() = __570580894_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(name: String?): StorePurchaseProperties? {
      val fnPtr = _570580894_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorePurchaseProperties>()
      val hr = fn.invokeHR(arrayOf(__570580894_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorePurchaseProperties>(result.getValue())
      return resultValue
    }
  }

  public class IStorePurchasePropertiesFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __570580894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePurchasePropertiesFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a768f59efefd489f9a1722a593e68b9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePurchasePropertiesFactory(ptr: Pointer?): WithDefault =
        IStorePurchasePropertiesFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePurchasePropertiesFactory {
      val address = segment.toRawLongValue()
      return makeIStorePurchasePropertiesFactory(Pointer(address))
    }

    public override fun toNative(obj: IStorePurchasePropertiesFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__570580894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePurchasePropertiesFactory):
        Array<IStorePurchasePropertiesFactory?> = (elements as
        Array<IStorePurchasePropertiesFactory?>).castToImpl<IStorePurchasePropertiesFactory,IStorePurchasePropertiesFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePurchasePropertiesFactory?> =
        arrayOfNulls<IStorePurchasePropertiesFactory_Impl>(size) as
        Array<IStorePurchasePropertiesFactory?>
  }
}
