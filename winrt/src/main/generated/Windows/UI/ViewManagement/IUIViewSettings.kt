package Windows.UI.ViewManagement

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

@ABIMarker(IUIViewSettings.ABI::class)
@Signature("{c63657f6-8850-470d-88f8-455e16ea2c26}")
@Guid("c63657f68850470d88f8455e16ea2c26")
@WinRTInterface("c63657f68850470d88f8455e16ea2c26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIViewSettings.ByReference::class)
public interface IUIViewSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UserInteractionMode(): UserInteractionMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIViewSettings> {
    public override fun getValue() = ABI.makeIUIViewSettings(pointer.getPointer(0))

    public fun setValue(value: IUIViewSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIViewSettings {
    public val __1145691762_Ptr: Pointer?

    public val _1145691762_VtblPtr: Pointer?
      get() = __1145691762_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserInteractionMode(): UserInteractionMode? {
      val fnPtr = _1145691762_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserInteractionMode>()
      val hr = fn.invokeHR(arrayOf(__1145691762_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserInteractionMode>(result.getValue())
      return resultValue
    }
  }

  public class IUIViewSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1145691762_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIViewSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c63657f68850470d88f8455e16ea2c26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIViewSettings(ptr: Pointer?): WithDefault = IUIViewSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIViewSettings {
      val address = segment.toRawLongValue()
      return makeIUIViewSettings(Pointer(address))
    }

    public override fun toNative(obj: IUIViewSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1145691762_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIViewSettings): Array<IUIViewSettings?> = (elements as
        Array<IUIViewSettings?>).castToImpl<IUIViewSettings,IUIViewSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIViewSettings?> =
        arrayOfNulls<IUIViewSettings_Impl>(size) as Array<IUIViewSettings?>
  }
}
