package Windows.System.UserProfile

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

@ABIMarker(IFirstSignInSettingsStatics.ABI::class)
@Signature("{1ce18f0f-1c41-4ea0-b7a2-6f0c1c7e8438}")
@Guid("1ce18f0f1c414ea0b7a26f0c1c7e8438")
@WinRTInterface("1ce18f0f1c414ea0b7a26f0c1c7e8438")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFirstSignInSettingsStatics.ByReference::class)
public interface IFirstSignInSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): FirstSignInSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFirstSignInSettingsStatics> {
    public override fun getValue() = ABI.makeIFirstSignInSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IFirstSignInSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFirstSignInSettingsStatics {
    public val __992505487_Ptr: Pointer?

    public val _992505487_VtblPtr: Pointer?
      get() = __992505487_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): FirstSignInSettings? {
      val fnPtr = _992505487_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FirstSignInSettings>()
      val hr = fn.invokeHR(arrayOf(__992505487_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FirstSignInSettings>(result.getValue())
      return resultValue
    }
  }

  public class IFirstSignInSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __992505487_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFirstSignInSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ce18f0f1c414ea0b7a26f0c1c7e8438")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFirstSignInSettingsStatics(ptr: Pointer?): WithDefault =
        IFirstSignInSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFirstSignInSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIFirstSignInSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IFirstSignInSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__992505487_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFirstSignInSettingsStatics):
        Array<IFirstSignInSettingsStatics?> = (elements as
        Array<IFirstSignInSettingsStatics?>).castToImpl<IFirstSignInSettingsStatics,IFirstSignInSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFirstSignInSettingsStatics?> =
        arrayOfNulls<IFirstSignInSettingsStatics_Impl>(size) as Array<IFirstSignInSettingsStatics?>
  }
}
