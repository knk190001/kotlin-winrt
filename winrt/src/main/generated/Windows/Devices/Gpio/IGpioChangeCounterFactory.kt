package Windows.Devices.Gpio

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

@ABIMarker(IGpioChangeCounterFactory.ABI::class)
@Signature("{147d94b6-0a9e-410c-b4fa-f89f4052084d}")
@Guid("147d94b60a9e410cb4faf89f4052084d")
@WinRTInterface("147d94b60a9e410cb4faf89f4052084d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioChangeCounterFactory.ByReference::class)
public interface IGpioChangeCounterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(pin: GpioPin?): GpioChangeCounter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioChangeCounterFactory> {
    public override fun getValue() = ABI.makeIGpioChangeCounterFactory(pointer.getPointer(0))

    public fun setValue(value: IGpioChangeCounterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioChangeCounterFactory {
    public val __1901235893_Ptr: Pointer?

    public val _1901235893_VtblPtr: Pointer?
      get() = __1901235893_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(pin: GpioPin?): GpioChangeCounter? {
      val fnPtr = _1901235893_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GpioChangeCounter>()
      val hr = fn.invokeHR(arrayOf(__1901235893_Ptr, marshalToNative(pin), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GpioChangeCounter>(result.getValue())
      return resultValue
    }
  }

  public class IGpioChangeCounterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1901235893_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioChangeCounterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("147d94b60a9e410cb4faf89f4052084d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioChangeCounterFactory(ptr: Pointer?): WithDefault =
        IGpioChangeCounterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioChangeCounterFactory {
      val address = segment.toRawLongValue()
      return makeIGpioChangeCounterFactory(Pointer(address))
    }

    public override fun toNative(obj: IGpioChangeCounterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1901235893_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioChangeCounterFactory):
        Array<IGpioChangeCounterFactory?> = (elements as
        Array<IGpioChangeCounterFactory?>).castToImpl<IGpioChangeCounterFactory,IGpioChangeCounterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioChangeCounterFactory?> =
        arrayOfNulls<IGpioChangeCounterFactory_Impl>(size) as Array<IGpioChangeCounterFactory?>
  }
}
