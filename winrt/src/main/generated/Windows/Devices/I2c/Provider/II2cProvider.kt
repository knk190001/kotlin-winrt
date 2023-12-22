package Windows.Devices.I2c.Provider

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

@ABIMarker(II2cProvider.ABI::class)
@Signature("{6f13083e-bf62-4fe2-a95a-f08999669818}")
@Guid("6f13083ebf624fe2a95af08999669818")
@WinRTInterface("6f13083ebf624fe2a95af08999669818")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = II2cProvider.ByReference::class)
public interface II2cProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetControllersAsync(): IAsyncOperation<IVectorView<II2cControllerProvider?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<II2cProvider> {
    public override fun getValue() = ABI.makeII2cProvider(pointer.getPointer(0))

    public fun setValue(value: II2cProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : II2cProvider {
    public val __1213953123_Ptr: Pointer?

    public val _1213953123_VtblPtr: Pointer?
      get() = __1213953123_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetControllersAsync():
        IAsyncOperation<IVectorView<II2cControllerProvider?>?>? {
      val fnPtr = _1213953123_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<II2cControllerProvider?>?>>()
      val hr = fn.invokeHR(arrayOf(__1213953123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<II2cControllerProvider?>?>>(result.getValue())
      return resultValue
    }
  }

  public class II2cProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1213953123_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<II2cProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f13083ebf624fe2a95af08999669818")

    public override val layout: ValueLayout = ADDRESS

    public fun makeII2cProvider(ptr: Pointer?): WithDefault = II2cProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): II2cProvider {
      val address = segment.toRawLongValue()
      return makeII2cProvider(Pointer(address))
    }

    public override fun toNative(obj: II2cProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1213953123_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: II2cProvider): Array<II2cProvider?> = (elements as
        Array<II2cProvider?>).castToImpl<II2cProvider,II2cProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<II2cProvider?> =
        arrayOfNulls<II2cProvider_Impl>(size) as Array<II2cProvider?>
  }
}
