package Windows.Devices.Pwm

import Windows.Devices.Pwm.Provider.IPwmProvider
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

@ABIMarker(IPwmControllerStatics.ABI::class)
@Signature("{4263bda1-8946-4404-bd48-81dd124af4d9}")
@Guid("4263bda189464404bd4881dd124af4d9")
@WinRTInterface("4263bda189464404bd4881dd124af4d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPwmControllerStatics.ByReference::class)
public interface IPwmControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetControllersAsync(provider: IPwmProvider?):
      IAsyncOperation<IVectorView<PwmController?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPwmControllerStatics> {
    public override fun getValue() = ABI.makeIPwmControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IPwmControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPwmControllerStatics {
    public val __1632595294_Ptr: Pointer?

    public val _1632595294_VtblPtr: Pointer?
      get() = __1632595294_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetControllersAsync(provider: IPwmProvider?):
        IAsyncOperation<IVectorView<PwmController?>?>? {
      val fnPtr = _1632595294_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<PwmController?>?>>()
      val hr = fn.invokeHR(arrayOf(__1632595294_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<PwmController?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IPwmControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1632595294_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPwmControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4263bda189464404bd4881dd124af4d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPwmControllerStatics(ptr: Pointer?): WithDefault =
        IPwmControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPwmControllerStatics {
      val address = segment.toRawLongValue()
      return makeIPwmControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPwmControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1632595294_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPwmControllerStatics): Array<IPwmControllerStatics?> =
        (elements as
        Array<IPwmControllerStatics?>).castToImpl<IPwmControllerStatics,IPwmControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPwmControllerStatics?> =
        arrayOfNulls<IPwmControllerStatics_Impl>(size) as Array<IPwmControllerStatics?>
  }
}
