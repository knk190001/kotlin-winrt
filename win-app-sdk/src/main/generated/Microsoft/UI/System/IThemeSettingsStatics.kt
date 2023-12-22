package Microsoft.UI.System

import Microsoft.UI.WindowId
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

@ABIMarker(IThemeSettingsStatics.ABI::class)
@Signature("{1586907d-30db-5f97-8fa1-8940c75dccc0}")
@Guid("1586907d30db5f978fa18940c75dccc0")
@WinRTInterface("1586907d30db5f978fa18940c75dccc0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThemeSettingsStatics.ByReference::class)
public interface IThemeSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForWindowId(windowId: WindowId?): ThemeSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThemeSettingsStatics> {
    public override fun getValue() = ABI.makeIThemeSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IThemeSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThemeSettingsStatics {
    public val __1058009895_Ptr: Pointer?

    public val _1058009895_VtblPtr: Pointer?
      get() = __1058009895_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForWindowId(windowId: WindowId?): ThemeSettings? {
      val fnPtr = _1058009895_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ThemeSettings>()
      val hr = fn.invokeHR(arrayOf(__1058009895_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ThemeSettings>(result.getValue())
      return resultValue
    }
  }

  public class IThemeSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1058009895_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThemeSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1586907d30db5f978fa18940c75dccc0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThemeSettingsStatics(ptr: Pointer?): WithDefault =
        IThemeSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThemeSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIThemeSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IThemeSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1058009895_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThemeSettingsStatics): Array<IThemeSettingsStatics?> =
        (elements as
        Array<IThemeSettingsStatics?>).castToImpl<IThemeSettingsStatics,IThemeSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThemeSettingsStatics?> =
        arrayOfNulls<IThemeSettingsStatics_Impl>(size) as Array<IThemeSettingsStatics?>
  }
}
