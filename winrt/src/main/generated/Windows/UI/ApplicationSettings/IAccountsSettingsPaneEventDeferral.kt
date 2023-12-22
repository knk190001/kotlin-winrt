package Windows.UI.ApplicationSettings

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

@ABIMarker(IAccountsSettingsPaneEventDeferral.ABI::class)
@Signature("{cbf25d3f-e5ba-40ef-93da-65e096e5fb04}")
@Guid("cbf25d3fe5ba40ef93da65e096e5fb04")
@WinRTInterface("cbf25d3fe5ba40ef93da65e096e5fb04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccountsSettingsPaneEventDeferral.ByReference::class)
public interface IAccountsSettingsPaneEventDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccountsSettingsPaneEventDeferral> {
    public override fun getValue() =
        ABI.makeIAccountsSettingsPaneEventDeferral(pointer.getPointer(0))

    public fun setValue(value: IAccountsSettingsPaneEventDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccountsSettingsPaneEventDeferral {
    public val __2046824145_Ptr: Pointer?

    public val _2046824145_VtblPtr: Pointer?
      get() = __2046824145_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _2046824145_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2046824145_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccountsSettingsPaneEventDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2046824145_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccountsSettingsPaneEventDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cbf25d3fe5ba40ef93da65e096e5fb04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccountsSettingsPaneEventDeferral(ptr: Pointer?): WithDefault =
        IAccountsSettingsPaneEventDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccountsSettingsPaneEventDeferral {
      val address = segment.toRawLongValue()
      return makeIAccountsSettingsPaneEventDeferral(Pointer(address))
    }

    public override fun toNative(obj: IAccountsSettingsPaneEventDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2046824145_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccountsSettingsPaneEventDeferral):
        Array<IAccountsSettingsPaneEventDeferral?> = (elements as
        Array<IAccountsSettingsPaneEventDeferral?>).castToImpl<IAccountsSettingsPaneEventDeferral,IAccountsSettingsPaneEventDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccountsSettingsPaneEventDeferral?> =
        arrayOfNulls<IAccountsSettingsPaneEventDeferral_Impl>(size) as
        Array<IAccountsSettingsPaneEventDeferral?>
  }
}
