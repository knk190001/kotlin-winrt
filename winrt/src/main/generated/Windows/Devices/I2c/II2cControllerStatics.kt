package Windows.Devices.I2c

import Windows.Devices.I2c.Provider.II2cProvider
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

@ABIMarker(II2cControllerStatics.ABI::class)
@Signature("{40fc0365-5f05-4e7e-84bd-100db8e0aec5}")
@Guid("40fc03655f054e7e84bd100db8e0aec5")
@WinRTInterface("40fc03655f054e7e84bd100db8e0aec5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = II2cControllerStatics.ByReference::class)
public interface II2cControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetControllersAsync(provider: II2cProvider?):
      IAsyncOperation<IVectorView<I2cController?>?>?

  @InterfaceMethod(1)
  public fun GetDefaultAsync(): IAsyncOperation<I2cController?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<II2cControllerStatics> {
    public override fun getValue() = ABI.makeII2cControllerStatics(pointer.getPointer(0))

    public fun setValue(value: II2cControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : II2cControllerStatics {
    public val __134350586_Ptr: Pointer?

    public val _134350586_VtblPtr: Pointer?
      get() = __134350586_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetControllersAsync(provider: II2cProvider?):
        IAsyncOperation<IVectorView<I2cController?>?>? {
      val fnPtr = _134350586_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<I2cController?>?>>()
      val hr = fn.invokeHR(arrayOf(__134350586_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<I2cController?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDefaultAsync(): IAsyncOperation<I2cController?>? {
      val fnPtr = _134350586_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<I2cController?>>()
      val hr = fn.invokeHR(arrayOf(__134350586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<I2cController?>>(result.getValue())
      return resultValue
    }
  }

  public class II2cControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __134350586_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<II2cControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40fc03655f054e7e84bd100db8e0aec5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeII2cControllerStatics(ptr: Pointer?): WithDefault =
        II2cControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): II2cControllerStatics {
      val address = segment.toRawLongValue()
      return makeII2cControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: II2cControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__134350586_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: II2cControllerStatics): Array<II2cControllerStatics?> =
        (elements as
        Array<II2cControllerStatics?>).castToImpl<II2cControllerStatics,II2cControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<II2cControllerStatics?> =
        arrayOfNulls<II2cControllerStatics_Impl>(size) as Array<II2cControllerStatics?>
  }
}
