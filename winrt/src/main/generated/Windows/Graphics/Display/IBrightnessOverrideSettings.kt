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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBrightnessOverrideSettings.ABI::class)
@Signature("{d112ab2a-7604-4dba-bcf8-4b6f49502cb0}")
@Guid("d112ab2a76044dbabcf84b6f49502cb0")
@WinRTInterface("d112ab2a76044dbabcf84b6f49502cb0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrightnessOverrideSettings.ByReference::class)
public interface IBrightnessOverrideSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredLevel(): Double

  @InterfaceMethod(1)
  public fun get_DesiredNits(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBrightnessOverrideSettings> {
    public override fun getValue() = ABI.makeIBrightnessOverrideSettings(pointer.getPointer(0))

    public fun setValue(value: IBrightnessOverrideSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrightnessOverrideSettings {
    public val __1028363553_Ptr: Pointer?

    public val _1028363553_VtblPtr: Pointer?
      get() = __1028363553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredLevel(): Double {
      val fnPtr = _1028363553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1028363553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DesiredNits(): Float {
      val fnPtr = _1028363553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1028363553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IBrightnessOverrideSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1028363553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrightnessOverrideSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d112ab2a76044dbabcf84b6f49502cb0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrightnessOverrideSettings(ptr: Pointer?): WithDefault =
        IBrightnessOverrideSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrightnessOverrideSettings {
      val address = segment.toRawLongValue()
      return makeIBrightnessOverrideSettings(Pointer(address))
    }

    public override fun toNative(obj: IBrightnessOverrideSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1028363553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrightnessOverrideSettings):
        Array<IBrightnessOverrideSettings?> = (elements as
        Array<IBrightnessOverrideSettings?>).castToImpl<IBrightnessOverrideSettings,IBrightnessOverrideSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrightnessOverrideSettings?> =
        arrayOfNulls<IBrightnessOverrideSettings_Impl>(size) as Array<IBrightnessOverrideSettings?>
  }
}
