package Windows.Security.Isolation

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

@ABIMarker(IIsolatedWindowsEnvironmentOptions2.ABI::class)
@Signature("{10d7cc31-8b8f-4b9d-b22c-617103b55b08}")
@Guid("10d7cc318b8f4b9db22c617103b55b08")
@WinRTInterface("10d7cc318b8f4b9db22c617103b55b08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentOptions2.ByReference::class)
public interface IIsolatedWindowsEnvironmentOptions2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WindowAnnotationOverride(): String?

  @InterfaceMethod(1)
  public fun put_WindowAnnotationOverride(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentOptions2> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentOptions2(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentOptions2 {
    public val __1979420731_Ptr: Pointer?

    public val _1979420731_VtblPtr: Pointer?
      get() = __1979420731_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WindowAnnotationOverride(): String? {
      val fnPtr = _1979420731_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1979420731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_WindowAnnotationOverride(value: String?): Unit {
      val fnPtr = _1979420731_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1979420731_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIsolatedWindowsEnvironmentOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1979420731_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10d7cc318b8f4b9db22c617103b55b08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentOptions2(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsEnvironmentOptions2 {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentOptions2(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1979420731_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentOptions2):
        Array<IIsolatedWindowsEnvironmentOptions2?> = (elements as
        Array<IIsolatedWindowsEnvironmentOptions2?>).castToImpl<IIsolatedWindowsEnvironmentOptions2,IIsolatedWindowsEnvironmentOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentOptions2?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentOptions2_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentOptions2?>
  }
}
