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

@ABIMarker(IColorOverrideSettings.ABI::class)
@Signature("{fbefa134-4a81-4c4d-a5b6-7d1b5c4bd00b}")
@Guid("fbefa1344a814c4da5b67d1b5c4bd00b")
@WinRTInterface("fbefa1344a814c4da5b67d1b5c4bd00b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorOverrideSettings.ByReference::class)
public interface IColorOverrideSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredDisplayColorOverrideScenario(): DisplayColorOverrideScenario?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorOverrideSettings> {
    public override fun getValue() = ABI.makeIColorOverrideSettings(pointer.getPointer(0))

    public fun setValue(value: IColorOverrideSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorOverrideSettings {
    public val __1062309421_Ptr: Pointer?

    public val _1062309421_VtblPtr: Pointer?
      get() = __1062309421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredDisplayColorOverrideScenario(): DisplayColorOverrideScenario? {
      val fnPtr = _1062309421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayColorOverrideScenario>()
      val hr = fn.invokeHR(arrayOf(__1062309421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayColorOverrideScenario>(result.getValue())
      return resultValue
    }
  }

  public class IColorOverrideSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1062309421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorOverrideSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbefa1344a814c4da5b67d1b5c4bd00b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorOverrideSettings(ptr: Pointer?): WithDefault =
        IColorOverrideSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorOverrideSettings {
      val address = segment.toRawLongValue()
      return makeIColorOverrideSettings(Pointer(address))
    }

    public override fun toNative(obj: IColorOverrideSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1062309421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorOverrideSettings): Array<IColorOverrideSettings?> =
        (elements as
        Array<IColorOverrideSettings?>).castToImpl<IColorOverrideSettings,IColorOverrideSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorOverrideSettings?> =
        arrayOfNulls<IColorOverrideSettings_Impl>(size) as Array<IColorOverrideSettings?>
  }
}
