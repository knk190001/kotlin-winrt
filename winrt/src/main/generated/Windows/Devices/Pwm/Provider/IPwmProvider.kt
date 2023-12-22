package Windows.Devices.Pwm.Provider

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

@ABIMarker(IPwmProvider.ABI::class)
@Signature("{a3301228-52f1-47b0-9349-66ba43d25902}")
@Guid("a330122852f147b0934966ba43d25902")
@WinRTInterface("a330122852f147b0934966ba43d25902")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPwmProvider.ByReference::class)
public interface IPwmProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetControllers(): IVectorView<IPwmControllerProvider?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPwmProvider> {
    public override fun getValue() = ABI.makeIPwmProvider(pointer.getPointer(0))

    public fun setValue(value: IPwmProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPwmProvider {
    public val __565619683_Ptr: Pointer?

    public val _565619683_VtblPtr: Pointer?
      get() = __565619683_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetControllers(): IVectorView<IPwmControllerProvider?>? {
      val fnPtr = _565619683_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IPwmControllerProvider?>>()
      val hr = fn.invokeHR(arrayOf(__565619683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IPwmControllerProvider?>>(result.getValue())
      return resultValue
    }
  }

  public class IPwmProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __565619683_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPwmProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a330122852f147b0934966ba43d25902")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPwmProvider(ptr: Pointer?): WithDefault = IPwmProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPwmProvider {
      val address = segment.toRawLongValue()
      return makeIPwmProvider(Pointer(address))
    }

    public override fun toNative(obj: IPwmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__565619683_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPwmProvider): Array<IPwmProvider?> = (elements as
        Array<IPwmProvider?>).castToImpl<IPwmProvider,IPwmProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPwmProvider?> =
        arrayOfNulls<IPwmProvider_Impl>(size) as Array<IPwmProvider?>
  }
}
