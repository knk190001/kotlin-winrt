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

@ABIMarker(IBrightnessOverrideSettingsStatics.ABI::class)
@Signature("{d487dc90-6f74-440b-b383-5fe96cf00b0f}")
@Guid("d487dc906f74440bb3835fe96cf00b0f")
@WinRTInterface("d487dc906f74440bb3835fe96cf00b0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrightnessOverrideSettingsStatics.ByReference::class)
public interface IBrightnessOverrideSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromLevel(level: Double): BrightnessOverrideSettings?

  @InterfaceMethod(1)
  public fun CreateFromNits(nits: Float): BrightnessOverrideSettings?

  @InterfaceMethod(2)
  public
      fun CreateFromDisplayBrightnessOverrideScenario(overrideScenario: DisplayBrightnessOverrideScenario?):
      BrightnessOverrideSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBrightnessOverrideSettingsStatics> {
    public override fun getValue() =
        ABI.makeIBrightnessOverrideSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IBrightnessOverrideSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrightnessOverrideSettingsStatics {
    public val __917177318_Ptr: Pointer?

    public val _917177318_VtblPtr: Pointer?
      get() = __917177318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromLevel(level: Double): BrightnessOverrideSettings? {
      val fnPtr = _917177318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrightnessOverrideSettings>()
      val hr = fn.invokeHR(arrayOf(__917177318_Ptr, level, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrightnessOverrideSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromNits(nits: Float): BrightnessOverrideSettings? {
      val fnPtr = _917177318_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrightnessOverrideSettings>()
      val hr = fn.invokeHR(arrayOf(__917177318_Ptr, nits, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrightnessOverrideSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun CreateFromDisplayBrightnessOverrideScenario(overrideScenario: DisplayBrightnessOverrideScenario?):
        BrightnessOverrideSettings? {
      val fnPtr = _917177318_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrightnessOverrideSettings>()
      val hr = fn.invokeHR(arrayOf(__917177318_Ptr, marshalToNative(overrideScenario), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrightnessOverrideSettings>(result.getValue())
      return resultValue
    }
  }

  public class IBrightnessOverrideSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __917177318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrightnessOverrideSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d487dc906f74440bb3835fe96cf00b0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrightnessOverrideSettingsStatics(ptr: Pointer?): WithDefault =
        IBrightnessOverrideSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrightnessOverrideSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIBrightnessOverrideSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IBrightnessOverrideSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__917177318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrightnessOverrideSettingsStatics):
        Array<IBrightnessOverrideSettingsStatics?> = (elements as
        Array<IBrightnessOverrideSettingsStatics?>).castToImpl<IBrightnessOverrideSettingsStatics,IBrightnessOverrideSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrightnessOverrideSettingsStatics?> =
        arrayOfNulls<IBrightnessOverrideSettingsStatics_Impl>(size) as
        Array<IBrightnessOverrideSettingsStatics?>
  }
}
