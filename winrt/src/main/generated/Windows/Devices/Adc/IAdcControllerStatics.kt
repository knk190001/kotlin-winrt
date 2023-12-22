package Windows.Devices.Adc

import Windows.Devices.Adc.Provider.IAdcProvider
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IAdcControllerStatics.ABI::class)
@Signature("{cce98e0c-01f8-4891-bc3b-be53ef279ca4}")
@Guid("cce98e0c01f84891bc3bbe53ef279ca4")
@WinRTInterface("cce98e0c01f84891bc3bbe53ef279ca4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdcControllerStatics.ByReference::class)
public interface IAdcControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetControllersAsync(provider: IAdcProvider?):
      IAsyncOperation<IVectorView<AdcController?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdcControllerStatics> {
    public override fun getValue() = ABI.makeIAdcControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IAdcControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdcControllerStatics {
    public val __1814174866_Ptr: Pointer?

    public val _1814174866_VtblPtr: Pointer?
      get() = __1814174866_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetControllersAsync(provider: IAdcProvider?):
        IAsyncOperation<IVectorView<AdcController?>?>? {
      val fnPtr = _1814174866_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AdcController?>?>>()
      val hr = fn.invokeHR(arrayOf(__1814174866_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AdcController?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IAdcControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1814174866_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdcControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cce98e0c01f84891bc3bbe53ef279ca4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdcControllerStatics(ptr: Pointer?): WithDefault =
        IAdcControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdcControllerStatics {
      val address = segment.toRawLongValue()
      return makeIAdcControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAdcControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1814174866_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdcControllerStatics): Array<IAdcControllerStatics?> =
        (elements as
        Array<IAdcControllerStatics?>).castToImpl<IAdcControllerStatics,IAdcControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdcControllerStatics?> =
        arrayOfNulls<IAdcControllerStatics_Impl>(size) as Array<IAdcControllerStatics?>
  }
}
