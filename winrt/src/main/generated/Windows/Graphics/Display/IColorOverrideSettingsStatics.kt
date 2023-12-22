package Windows.Graphics.Display

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

@ABIMarker(IColorOverrideSettingsStatics.ABI::class)
@Signature("{b068e05f-c41f-4ac9-afab-827ab6248f9a}")
@Guid("b068e05fc41f4ac9afab827ab6248f9a")
@WinRTInterface("b068e05fc41f4ac9afab827ab6248f9a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorOverrideSettingsStatics.ByReference::class)
public interface IColorOverrideSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun CreateFromDisplayColorOverrideScenario(overrideScenario: DisplayColorOverrideScenario?):
      ColorOverrideSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorOverrideSettingsStatics> {
    public override fun getValue() = ABI.makeIColorOverrideSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IColorOverrideSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorOverrideSettingsStatics {
    public val __1256390030_Ptr: Pointer?

    public val _1256390030_VtblPtr: Pointer?
      get() = __1256390030_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateFromDisplayColorOverrideScenario(overrideScenario: DisplayColorOverrideScenario?):
        ColorOverrideSettings? {
      val fnPtr = _1256390030_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorOverrideSettings>()
      val hr = fn.invokeHR(arrayOf(__1256390030_Ptr, marshalToNative(overrideScenario), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorOverrideSettings>(result.getValue())
      return resultValue
    }
  }

  public class IColorOverrideSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1256390030_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorOverrideSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b068e05fc41f4ac9afab827ab6248f9a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorOverrideSettingsStatics(ptr: Pointer?): WithDefault =
        IColorOverrideSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorOverrideSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIColorOverrideSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IColorOverrideSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1256390030_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorOverrideSettingsStatics):
        Array<IColorOverrideSettingsStatics?> = (elements as
        Array<IColorOverrideSettingsStatics?>).castToImpl<IColorOverrideSettingsStatics,IColorOverrideSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorOverrideSettingsStatics?> =
        arrayOfNulls<IColorOverrideSettingsStatics_Impl>(size) as
        Array<IColorOverrideSettingsStatics?>
  }
}
