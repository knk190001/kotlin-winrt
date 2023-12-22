package Windows.Devices.Gpio.Provider

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IGpioProvider.ABI::class)
@Signature("{44e82707-08ca-434a-afe0-d61580446f7e}")
@Guid("44e8270708ca434aafe0d61580446f7e")
@WinRTInterface("44e8270708ca434aafe0d61580446f7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioProvider.ByReference::class)
public interface IGpioProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetControllers(): IVectorView<IGpioControllerProvider?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGpioProvider>
      {
    public override fun getValue() = ABI.makeIGpioProvider(pointer.getPointer(0))

    public fun setValue(value: IGpioProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioProvider {
    public val __663806421_Ptr: Pointer?

    public val _663806421_VtblPtr: Pointer?
      get() = __663806421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetControllers(): IVectorView<IGpioControllerProvider?>? {
      val fnPtr = _663806421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IGpioControllerProvider?>>()
      val hr = fn.invokeHR(arrayOf(__663806421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IGpioControllerProvider?>>(result.getValue())
      return resultValue
    }
  }

  public class IGpioProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __663806421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("44e8270708ca434aafe0d61580446f7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioProvider(ptr: Pointer?): WithDefault = IGpioProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioProvider {
      val address = segment.toRawLongValue()
      return makeIGpioProvider(Pointer(address))
    }

    public override fun toNative(obj: IGpioProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__663806421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioProvider): Array<IGpioProvider?> = (elements as
        Array<IGpioProvider?>).castToImpl<IGpioProvider,IGpioProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioProvider?> =
        arrayOfNulls<IGpioProvider_Impl>(size) as Array<IGpioProvider?>
  }
}
