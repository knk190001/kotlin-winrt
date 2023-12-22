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

@ABIMarker(IAccountsSettingsPaneStatics.ABI::class)
@Signature("{561f8b60-b0ec-4150-a8dc-208ee44b068a}")
@Guid("561f8b60b0ec4150a8dc208ee44b068a")
@WinRTInterface("561f8b60b0ec4150a8dc208ee44b068a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccountsSettingsPaneStatics.ByReference::class)
public interface IAccountsSettingsPaneStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): AccountsSettingsPane?

  @InterfaceMethod(1)
  public fun Show(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccountsSettingsPaneStatics> {
    public override fun getValue() = ABI.makeIAccountsSettingsPaneStatics(pointer.getPointer(0))

    public fun setValue(value: IAccountsSettingsPaneStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccountsSettingsPaneStatics {
    public val __1131240527_Ptr: Pointer?

    public val _1131240527_VtblPtr: Pointer?
      get() = __1131240527_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): AccountsSettingsPane? {
      val fnPtr = _1131240527_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccountsSettingsPane>()
      val hr = fn.invokeHR(arrayOf(__1131240527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccountsSettingsPane>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Show(): Unit {
      val fnPtr = _1131240527_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1131240527_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccountsSettingsPaneStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1131240527_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccountsSettingsPaneStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("561f8b60b0ec4150a8dc208ee44b068a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccountsSettingsPaneStatics(ptr: Pointer?): WithDefault =
        IAccountsSettingsPaneStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccountsSettingsPaneStatics {
      val address = segment.toRawLongValue()
      return makeIAccountsSettingsPaneStatics(Pointer(address))
    }

    public override fun toNative(obj: IAccountsSettingsPaneStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1131240527_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccountsSettingsPaneStatics):
        Array<IAccountsSettingsPaneStatics?> = (elements as
        Array<IAccountsSettingsPaneStatics?>).castToImpl<IAccountsSettingsPaneStatics,IAccountsSettingsPaneStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccountsSettingsPaneStatics?> =
        arrayOfNulls<IAccountsSettingsPaneStatics_Impl>(size) as
        Array<IAccountsSettingsPaneStatics?>
  }
}
