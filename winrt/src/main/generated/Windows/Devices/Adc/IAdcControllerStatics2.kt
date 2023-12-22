package Windows.Devices.Adc

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdcControllerStatics2.ABI::class)
@Signature("{a2b93b1d-977b-4f5a-a5fe-a6abaffe6484}")
@Guid("a2b93b1d977b4f5aa5fea6abaffe6484")
@WinRTInterface("a2b93b1d977b4f5aa5fea6abaffe6484")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdcControllerStatics2.ByReference::class)
public interface IAdcControllerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultAsync(): IAsyncOperation<AdcController?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdcControllerStatics2> {
    public override fun getValue() = ABI.makeIAdcControllerStatics2(pointer.getPointer(0))

    public fun setValue(value: IAdcControllerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdcControllerStatics2 {
    public val __404845948_Ptr: Pointer?

    public val _404845948_VtblPtr: Pointer?
      get() = __404845948_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultAsync(): IAsyncOperation<AdcController?>? {
      val fnPtr = _404845948_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AdcController?>>()
      val hr = fn.invokeHR(arrayOf(__404845948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AdcController?>>(result.getValue())
      return resultValue
    }
  }

  public class IAdcControllerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __404845948_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdcControllerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2b93b1d977b4f5aa5fea6abaffe6484")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdcControllerStatics2(ptr: Pointer?): WithDefault =
        IAdcControllerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdcControllerStatics2 {
      val address = segment.toRawLongValue()
      return makeIAdcControllerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAdcControllerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__404845948_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdcControllerStatics2): Array<IAdcControllerStatics2?> =
        (elements as
        Array<IAdcControllerStatics2?>).castToImpl<IAdcControllerStatics2,IAdcControllerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdcControllerStatics2?> =
        arrayOfNulls<IAdcControllerStatics2_Impl>(size) as Array<IAdcControllerStatics2?>
  }
}
