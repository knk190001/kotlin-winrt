package Windows.System.Profile

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISharedModeSettingsStatics2.ABI::class)
@Signature("{608988a4-ccf1-4ee8-a5e2-fd6a1d0cfac8}")
@Guid("608988a4ccf14ee8a5e2fd6a1d0cfac8")
@WinRTInterface("608988a4ccf14ee8a5e2fd6a1d0cfac8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISharedModeSettingsStatics2.ByReference::class)
public interface ISharedModeSettingsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShouldAvoidLocalStorage(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISharedModeSettingsStatics2> {
    public override fun getValue() = ABI.makeISharedModeSettingsStatics2(pointer.getPointer(0))

    public fun setValue(value: ISharedModeSettingsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISharedModeSettingsStatics2 {
    public val __1938602932_Ptr: Pointer?

    public val _1938602932_VtblPtr: Pointer?
      get() = __1938602932_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShouldAvoidLocalStorage(): Boolean {
      val fnPtr = _1938602932_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1938602932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISharedModeSettingsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1938602932_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISharedModeSettingsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("608988a4ccf14ee8a5e2fd6a1d0cfac8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISharedModeSettingsStatics2(ptr: Pointer?): WithDefault =
        ISharedModeSettingsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISharedModeSettingsStatics2 {
      val address = segment.toRawLongValue()
      return makeISharedModeSettingsStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISharedModeSettingsStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1938602932_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISharedModeSettingsStatics2):
        Array<ISharedModeSettingsStatics2?> = (elements as
        Array<ISharedModeSettingsStatics2?>).castToImpl<ISharedModeSettingsStatics2,ISharedModeSettingsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISharedModeSettingsStatics2?> =
        arrayOfNulls<ISharedModeSettingsStatics2_Impl>(size) as Array<ISharedModeSettingsStatics2?>
  }
}
