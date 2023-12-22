package Windows.UI.WindowManagement

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IReference
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppWindowTitleBar.ABI::class)
@Signature("{6e932c84-f644-541d-a2d7-0c262437842d}")
@Guid("6e932c84f644541da2d70c262437842d")
@WinRTInterface("6e932c84f644541da2d70c262437842d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowTitleBar.ByReference::class)
public interface IAppWindowTitleBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundColor(): IReference<Color?>?

  @InterfaceMethod(1)
  public fun put_BackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(2)
  public fun get_ButtonBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(3)
  public fun put_ButtonBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(4)
  public fun get_ButtonForegroundColor(): IReference<Color?>?

  @InterfaceMethod(5)
  public fun put_ButtonForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(6)
  public fun get_ButtonHoverBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(7)
  public fun put_ButtonHoverBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(8)
  public fun get_ButtonHoverForegroundColor(): IReference<Color?>?

  @InterfaceMethod(9)
  public fun put_ButtonHoverForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(10)
  public fun get_ButtonInactiveBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(11)
  public fun put_ButtonInactiveBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(12)
  public fun get_ButtonInactiveForegroundColor(): IReference<Color?>?

  @InterfaceMethod(13)
  public fun put_ButtonInactiveForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(14)
  public fun get_ButtonPressedBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(15)
  public fun put_ButtonPressedBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(16)
  public fun get_ButtonPressedForegroundColor(): IReference<Color?>?

  @InterfaceMethod(17)
  public fun put_ButtonPressedForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(18)
  public fun get_ExtendsContentIntoTitleBar(): Boolean

  @InterfaceMethod(19)
  public fun put_ExtendsContentIntoTitleBar(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_ForegroundColor(): IReference<Color?>?

  @InterfaceMethod(21)
  public fun put_ForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(22)
  public fun get_InactiveBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(23)
  public fun put_InactiveBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(24)
  public fun get_InactiveForegroundColor(): IReference<Color?>?

  @InterfaceMethod(25)
  public fun put_InactiveForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(26)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(27)
  public fun GetTitleBarOcclusions(): IVectorView<AppWindowTitleBarOcclusion?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowTitleBar> {
    public override fun getValue() = ABI.makeIAppWindowTitleBar(pointer.getPointer(0))

    public fun setValue(value: IAppWindowTitleBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowTitleBar {
    public val __1939368475_Ptr: Pointer?

    public val _1939368475_VtblPtr: Pointer?
      get() = __1939368475_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ButtonBackgroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ButtonBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ButtonForegroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ButtonForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ButtonHoverBackgroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ButtonHoverBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ButtonHoverForegroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ButtonHoverForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ButtonInactiveBackgroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ButtonInactiveBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ButtonInactiveForegroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ButtonInactiveForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ButtonPressedBackgroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ButtonPressedBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ButtonPressedForegroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ButtonPressedForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_ExtendsContentIntoTitleBar(): Boolean {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_ExtendsContentIntoTitleBar(value: Boolean): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_ForegroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_ForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_InactiveBackgroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_InactiveBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_InactiveForegroundColor(): IReference<Color?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_InactiveForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun GetTitleBarOcclusions(): IVectorView<AppWindowTitleBarOcclusion?>? {
      val fnPtr = _1939368475_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AppWindowTitleBarOcclusion?>>()
      val hr = fn.invokeHR(arrayOf(__1939368475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<AppWindowTitleBarOcclusion?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppWindowTitleBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1939368475_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowTitleBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e932c84f644541da2d70c262437842d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowTitleBar(ptr: Pointer?): WithDefault = IAppWindowTitleBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowTitleBar {
      val address = segment.toRawLongValue()
      return makeIAppWindowTitleBar(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowTitleBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1939368475_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowTitleBar): Array<IAppWindowTitleBar?> =
        (elements as
        Array<IAppWindowTitleBar?>).castToImpl<IAppWindowTitleBar,IAppWindowTitleBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowTitleBar?> =
        arrayOfNulls<IAppWindowTitleBar_Impl>(size) as Array<IAppWindowTitleBar?>
  }
}
