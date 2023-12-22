package Windows.UI.ViewManagement.Core

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUISettingsController.ABI::class)
@Signature("{78a51ac4-15c0-5a1b-a75b-acbf9cb8bb9e}")
@Guid("78a51ac415c05a1ba75bacbf9cb8bb9e")
@WinRTInterface("78a51ac415c05a1ba75bacbf9cb8bb9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettingsController.ByReference::class)
public interface IUISettingsController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetAdvancedEffectsEnabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun SetAnimationsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun SetAutoHideScrollBars(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun SetMessageDuration(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun SetTextScaleFactor(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUISettingsController> {
    public override fun getValue() = ABI.makeIUISettingsController(pointer.getPointer(0))

    public fun setValue(value: IUISettingsController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettingsController {
    public val __1920231110_Ptr: Pointer?

    public val _1920231110_VtblPtr: Pointer?
      get() = __1920231110_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetAdvancedEffectsEnabled(value: Boolean): Unit {
      val fnPtr = _1920231110_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1920231110_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetAnimationsEnabled(value: Boolean): Unit {
      val fnPtr = _1920231110_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1920231110_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetAutoHideScrollBars(value: Boolean): Unit {
      val fnPtr = _1920231110_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1920231110_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetMessageDuration(value: WinDef.UINT): Unit {
      val fnPtr = _1920231110_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1920231110_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetTextScaleFactor(value: Double): Unit {
      val fnPtr = _1920231110_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1920231110_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUISettingsController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1920231110_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettingsController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78a51ac415c05a1ba75bacbf9cb8bb9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettingsController(ptr: Pointer?): WithDefault =
        IUISettingsController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUISettingsController {
      val address = segment.toRawLongValue()
      return makeIUISettingsController(Pointer(address))
    }

    public override fun toNative(obj: IUISettingsController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1920231110_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettingsController): Array<IUISettingsController?> =
        (elements as
        Array<IUISettingsController?>).castToImpl<IUISettingsController,IUISettingsController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettingsController?> =
        arrayOfNulls<IUISettingsController_Impl>(size) as Array<IUISettingsController?>
  }
}
