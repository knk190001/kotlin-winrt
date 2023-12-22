package Windows.Gaming.Input.Preview

import Windows.Gaming.Input.Custom.IGameControllerProvider
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameControllerProviderInfoStatics.ABI::class)
@Signature("{0be1e6c5-d9bd-44ee-8362-488b2e464bfb}")
@Guid("0be1e6c5d9bd44ee8362488b2e464bfb")
@WinRTInterface("0be1e6c5d9bd44ee8362488b2e464bfb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameControllerProviderInfoStatics.ByReference::class)
public interface IGameControllerProviderInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetParentProviderId(provider: IGameControllerProvider?): String?

  @InterfaceMethod(1)
  public fun GetProviderId(provider: IGameControllerProvider?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameControllerProviderInfoStatics> {
    public override fun getValue() =
        ABI.makeIGameControllerProviderInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IGameControllerProviderInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameControllerProviderInfoStatics {
    public val __1097935327_Ptr: Pointer?

    public val _1097935327_VtblPtr: Pointer?
      get() = __1097935327_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetParentProviderId(provider: IGameControllerProvider?): String? {
      val fnPtr = _1097935327_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1097935327_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetProviderId(provider: IGameControllerProvider?): String? {
      val fnPtr = _1097935327_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1097935327_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IGameControllerProviderInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1097935327_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameControllerProviderInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0be1e6c5d9bd44ee8362488b2e464bfb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameControllerProviderInfoStatics(ptr: Pointer?): WithDefault =
        IGameControllerProviderInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameControllerProviderInfoStatics {
      val address = segment.toRawLongValue()
      return makeIGameControllerProviderInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IGameControllerProviderInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1097935327_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameControllerProviderInfoStatics):
        Array<IGameControllerProviderInfoStatics?> = (elements as
        Array<IGameControllerProviderInfoStatics?>).castToImpl<IGameControllerProviderInfoStatics,IGameControllerProviderInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameControllerProviderInfoStatics?> =
        arrayOfNulls<IGameControllerProviderInfoStatics_Impl>(size) as
        Array<IGameControllerProviderInfoStatics?>
  }
}
