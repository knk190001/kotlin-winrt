package Microsoft.UI.Composition.SystemBackdrops

import Windows.UI.Color
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDesktopAcrylicController.ABI::class)
@Signature("{7c20a6af-8eb3-5f08-bdfc-6d35e35dfe45}")
@Guid("7c20a6af8eb35f08bdfc6d35e35dfe45")
@WinRTInterface("7c20a6af8eb35f08bdfc6d35e35dfe45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopAcrylicController.ByReference::class)
public interface IDesktopAcrylicController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FallbackColor(): Color?

  @InterfaceMethod(1)
  public fun put_FallbackColor(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_LuminosityOpacity(): Float

  @InterfaceMethod(3)
  public fun put_LuminosityOpacity(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_TintColor(): Color?

  @InterfaceMethod(5)
  public fun put_TintColor(value: Color?): Unit

  @InterfaceMethod(6)
  public fun get_TintOpacity(): Float

  @InterfaceMethod(7)
  public fun put_TintOpacity(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopAcrylicController> {
    public override fun getValue() = ABI.makeIDesktopAcrylicController(pointer.getPointer(0))

    public fun setValue(value: IDesktopAcrylicController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopAcrylicController {
    public val __1946645622_Ptr: Pointer?

    public val _1946645622_VtblPtr: Pointer?
      get() = __1946645622_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FallbackColor(): Color? {
      val fnPtr = _1946645622_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1946645622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FallbackColor(value: Color?): Unit {
      val fnPtr = _1946645622_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946645622_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LuminosityOpacity(): Float {
      val fnPtr = _1946645622_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1946645622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_LuminosityOpacity(value: Float): Unit {
      val fnPtr = _1946645622_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946645622_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TintColor(): Color? {
      val fnPtr = _1946645622_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1946645622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TintColor(value: Color?): Unit {
      val fnPtr = _1946645622_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946645622_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TintOpacity(): Float {
      val fnPtr = _1946645622_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1946645622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_TintOpacity(value: Float): Unit {
      val fnPtr = _1946645622_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946645622_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDesktopAcrylicController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946645622_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopAcrylicController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c20a6af8eb35f08bdfc6d35e35dfe45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopAcrylicController(ptr: Pointer?): WithDefault =
        IDesktopAcrylicController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopAcrylicController {
      val address = segment.toRawLongValue()
      return makeIDesktopAcrylicController(Pointer(address))
    }

    public override fun toNative(obj: IDesktopAcrylicController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946645622_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopAcrylicController):
        Array<IDesktopAcrylicController?> = (elements as
        Array<IDesktopAcrylicController?>).castToImpl<IDesktopAcrylicController,IDesktopAcrylicController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopAcrylicController?> =
        arrayOfNulls<IDesktopAcrylicController_Impl>(size) as Array<IDesktopAcrylicController?>
  }
}
