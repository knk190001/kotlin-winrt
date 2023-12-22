package Windows.Media.Devices

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IFocusControl.ABI::class)
@Signature("{c0d889f6-5228-4453-b153-85606592b238}")
@Guid("c0d889f652284453b15385606592b238")
@WinRTInterface("c0d889f652284453b15385606592b238")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusControl.ByReference::class)
public interface IFocusControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedPresets(): IVectorView<FocusPreset?>?

  @InterfaceMethod(2)
  public fun get_Preset(): FocusPreset?

  @InterfaceMethod(3)
  public fun SetPresetAsync(preset: FocusPreset?): IAsyncAction?

  @InterfaceMethod(4)
  public fun SetPresetAsync(preset: FocusPreset?, completeBeforeFocus: Boolean): IAsyncAction?

  @InterfaceMethod(5)
  public fun get_Min(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_Max(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_Step(): WinDef.UINT

  @InterfaceMethod(8)
  public fun get_Value(): WinDef.UINT

  @InterfaceMethod(9)
  public fun SetValueAsync(focus: WinDef.UINT): IAsyncAction?

  @InterfaceMethod(10)
  public fun FocusAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFocusControl>
      {
    public override fun getValue() = ABI.makeIFocusControl(pointer.getPointer(0))

    public fun setValue(value: IFocusControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusControl {
    public val __1920234234_Ptr: Pointer?

    public val _1920234234_VtblPtr: Pointer?
      get() = __1920234234_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedPresets(): IVectorView<FocusPreset?>? {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<FocusPreset?>>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<FocusPreset?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Preset(): FocusPreset? {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusPreset>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusPreset>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetPresetAsync(preset: FocusPreset?): IAsyncAction? {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr, marshalToNative(preset), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetPresetAsync(preset: FocusPreset?, completeBeforeFocus: Boolean):
        IAsyncAction? {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr, marshalToNative(preset), completeBeforeFocus,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Min(): WinDef.UINT {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_Max(): WinDef.UINT {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_Step(): WinDef.UINT {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_Value(): WinDef.UINT {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun SetValueAsync(focus: WinDef.UINT): IAsyncAction? {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr, focus, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun FocusAsync(): IAsyncAction? {
      val fnPtr = _1920234234_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1920234234_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IFocusControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1920234234_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0d889f652284453b15385606592b238")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusControl(ptr: Pointer?): WithDefault = IFocusControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusControl {
      val address = segment.toRawLongValue()
      return makeIFocusControl(Pointer(address))
    }

    public override fun toNative(obj: IFocusControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1920234234_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusControl): Array<IFocusControl?> = (elements as
        Array<IFocusControl?>).castToImpl<IFocusControl,IFocusControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusControl?> =
        arrayOfNulls<IFocusControl_Impl>(size) as Array<IFocusControl?>
  }
}
