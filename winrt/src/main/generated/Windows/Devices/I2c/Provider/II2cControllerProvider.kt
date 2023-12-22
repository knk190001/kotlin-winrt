package Windows.Devices.I2c.Provider

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

@ABIMarker(II2cControllerProvider.ABI::class)
@Signature("{61c2bb82-4510-4163-a87c-4e15a9558980}")
@Guid("61c2bb8245104163a87c4e15a9558980")
@WinRTInterface("61c2bb8245104163a87c4e15a9558980")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = II2cControllerProvider.ByReference::class)
public interface II2cControllerProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceProvider(settings: ProviderI2cConnectionSettings?): II2cDeviceProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<II2cControllerProvider> {
    public override fun getValue() = ABI.makeII2cControllerProvider(pointer.getPointer(0))

    public fun setValue(value: II2cControllerProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : II2cControllerProvider {
    public val __1631913569_Ptr: Pointer?

    public val _1631913569_VtblPtr: Pointer?
      get() = __1631913569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceProvider(settings: ProviderI2cConnectionSettings?):
        II2cDeviceProvider? {
      val fnPtr = _1631913569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<II2cDeviceProvider>()
      val hr = fn.invokeHR(arrayOf(__1631913569_Ptr, marshalToNative(settings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<II2cDeviceProvider>(result.getValue())
      return resultValue
    }
  }

  public class II2cControllerProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1631913569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<II2cControllerProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61c2bb8245104163a87c4e15a9558980")

    public override val layout: ValueLayout = ADDRESS

    public fun makeII2cControllerProvider(ptr: Pointer?): WithDefault =
        II2cControllerProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): II2cControllerProvider {
      val address = segment.toRawLongValue()
      return makeII2cControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: II2cControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1631913569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: II2cControllerProvider): Array<II2cControllerProvider?> =
        (elements as
        Array<II2cControllerProvider?>).castToImpl<II2cControllerProvider,II2cControllerProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<II2cControllerProvider?> =
        arrayOfNulls<II2cControllerProvider_Impl>(size) as Array<II2cControllerProvider?>
  }
}
