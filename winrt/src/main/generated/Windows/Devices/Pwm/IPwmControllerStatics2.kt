package Windows.Devices.Pwm

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

@ABIMarker(IPwmControllerStatics2.ABI::class)
@Signature("{44fc5b1f-f119-4bdd-97ad-f76ef986736d}")
@Guid("44fc5b1ff1194bdd97adf76ef986736d")
@WinRTInterface("44fc5b1ff1194bdd97adf76ef986736d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPwmControllerStatics2.ByReference::class)
public interface IPwmControllerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultAsync(): IAsyncOperation<PwmController?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPwmControllerStatics2> {
    public override fun getValue() = ABI.makeIPwmControllerStatics2(pointer.getPointer(0))

    public fun setValue(value: IPwmControllerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPwmControllerStatics2 {
    public val __929153488_Ptr: Pointer?

    public val _929153488_VtblPtr: Pointer?
      get() = __929153488_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultAsync(): IAsyncOperation<PwmController?>? {
      val fnPtr = _929153488_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PwmController?>>()
      val hr = fn.invokeHR(arrayOf(__929153488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PwmController?>>(result.getValue())
      return resultValue
    }
  }

  public class IPwmControllerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __929153488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPwmControllerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("44fc5b1ff1194bdd97adf76ef986736d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPwmControllerStatics2(ptr: Pointer?): WithDefault =
        IPwmControllerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPwmControllerStatics2 {
      val address = segment.toRawLongValue()
      return makeIPwmControllerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPwmControllerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__929153488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPwmControllerStatics2): Array<IPwmControllerStatics2?> =
        (elements as
        Array<IPwmControllerStatics2?>).castToImpl<IPwmControllerStatics2,IPwmControllerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPwmControllerStatics2?> =
        arrayOfNulls<IPwmControllerStatics2_Impl>(size) as Array<IPwmControllerStatics2?>
  }
}
