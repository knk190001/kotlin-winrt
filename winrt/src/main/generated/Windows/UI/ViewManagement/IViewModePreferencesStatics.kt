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

@ABIMarker(IViewModePreferencesStatics.ABI::class)
@Signature("{69b60a65-5de5-40d8-8306-3833df7a2274}")
@Guid("69b60a655de540d883063833df7a2274")
@WinRTInterface("69b60a655de540d883063833df7a2274")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IViewModePreferencesStatics.ByReference::class)
public interface IViewModePreferencesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateDefault(mode: ApplicationViewMode?): ViewModePreferences?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IViewModePreferencesStatics> {
    public override fun getValue() = ABI.makeIViewModePreferencesStatics(pointer.getPointer(0))

    public fun setValue(value: IViewModePreferencesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IViewModePreferencesStatics {
    public val __271412679_Ptr: Pointer?

    public val _271412679_VtblPtr: Pointer?
      get() = __271412679_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDefault(mode: ApplicationViewMode?): ViewModePreferences? {
      val fnPtr = _271412679_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ViewModePreferences>()
      val hr = fn.invokeHR(arrayOf(__271412679_Ptr, marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ViewModePreferences>(result.getValue())
      return resultValue
    }
  }

  public class IViewModePreferencesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __271412679_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IViewModePreferencesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69b60a655de540d883063833df7a2274")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIViewModePreferencesStatics(ptr: Pointer?): WithDefault =
        IViewModePreferencesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IViewModePreferencesStatics {
      val address = segment.toRawLongValue()
      return makeIViewModePreferencesStatics(Pointer(address))
    }

    public override fun toNative(obj: IViewModePreferencesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__271412679_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IViewModePreferencesStatics):
        Array<IViewModePreferencesStatics?> = (elements as
        Array<IViewModePreferencesStatics?>).castToImpl<IViewModePreferencesStatics,IViewModePreferencesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IViewModePreferencesStatics?> =
        arrayOfNulls<IViewModePreferencesStatics_Impl>(size) as Array<IViewModePreferencesStatics?>
  }
}
