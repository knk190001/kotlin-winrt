package Windows.UI.ViewManagement

import Windows.Foundation.Size
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IUISettings.ABI::class)
@Signature("{85361600-1c63-4627-bcb1-3a89e0bc9c55}")
@Guid("853616001c634627bcb13a89e0bc9c55")
@WinRTInterface("853616001c634627bcb13a89e0bc9c55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettings.ByReference::class)
public interface IUISettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HandPreference(): HandPreference?

  @InterfaceMethod(1)
  public fun get_CursorSize(): Size?

  @InterfaceMethod(2)
  public fun get_ScrollBarSize(): Size?

  @InterfaceMethod(3)
  public fun get_ScrollBarArrowSize(): Size?

  @InterfaceMethod(4)
  public fun get_ScrollBarThumbBoxSize(): Size?

  @InterfaceMethod(5)
  public fun get_MessageDuration(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_AnimationsEnabled(): Boolean

  @InterfaceMethod(7)
  public fun get_CaretBrowsingEnabled(): Boolean

  @InterfaceMethod(8)
  public fun get_CaretBlinkRate(): WinDef.UINT

  @InterfaceMethod(9)
  public fun get_CaretWidth(): WinDef.UINT

  @InterfaceMethod(10)
  public fun get_DoubleClickTime(): WinDef.UINT

  @InterfaceMethod(11)
  public fun get_MouseHoverTime(): WinDef.UINT

  @InterfaceMethod(12)
  public fun UIElementColor(desiredElement: UIElementType?): Color?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUISettings> {
    public override fun getValue() = ABI.makeIUISettings(pointer.getPointer(0))

    public fun setValue(value: IUISettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettings {
    public val __913226441_Ptr: Pointer?

    public val _913226441_VtblPtr: Pointer?
      get() = __913226441_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HandPreference(): HandPreference? {
      val fnPtr = _913226441_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HandPreference>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HandPreference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CursorSize(): Size? {
      val fnPtr = _913226441_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ScrollBarSize(): Size? {
      val fnPtr = _913226441_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ScrollBarArrowSize(): Size? {
      val fnPtr = _913226441_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ScrollBarThumbBoxSize(): Size? {
      val fnPtr = _913226441_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MessageDuration(): WinDef.UINT {
      val fnPtr = _913226441_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_AnimationsEnabled(): Boolean {
      val fnPtr = _913226441_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_CaretBrowsingEnabled(): Boolean {
      val fnPtr = _913226441_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_CaretBlinkRate(): WinDef.UINT {
      val fnPtr = _913226441_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_CaretWidth(): WinDef.UINT {
      val fnPtr = _913226441_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_DoubleClickTime(): WinDef.UINT {
      val fnPtr = _913226441_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_MouseHoverTime(): WinDef.UINT {
      val fnPtr = _913226441_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun UIElementColor(desiredElement: UIElementType?): Color? {
      val fnPtr = _913226441_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__913226441_Ptr, marshalToNative(desiredElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }
  }

  public class IUISettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __913226441_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("853616001c634627bcb13a89e0bc9c55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettings(ptr: Pointer?): WithDefault = IUISettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUISettings {
      val address = segment.toRawLongValue()
      return makeIUISettings(Pointer(address))
    }

    public override fun toNative(obj: IUISettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__913226441_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettings): Array<IUISettings?> = (elements as
        Array<IUISettings?>).castToImpl<IUISettings,IUISettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettings?> =
        arrayOfNulls<IUISettings_Impl>(size) as Array<IUISettings?>
  }
}
