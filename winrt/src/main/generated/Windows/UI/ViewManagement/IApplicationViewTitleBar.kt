package Windows.UI.ViewManagement

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationViewTitleBar.ABI::class)
@Signature("{00924ac0-932b-4a6b-9c4b-dc38c82478ce}")
@Guid("00924ac0932b4a6b9c4bdc38c82478ce")
@WinRTInterface("00924ac0932b4a6b9c4bdc38c82478ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewTitleBar.ByReference::class)
public interface IApplicationViewTitleBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(1)
  public fun get_ForegroundColor(): IReference<Color?>?

  @InterfaceMethod(2)
  public fun put_BackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(3)
  public fun get_BackgroundColor(): IReference<Color?>?

  @InterfaceMethod(4)
  public fun put_ButtonForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(5)
  public fun get_ButtonForegroundColor(): IReference<Color?>?

  @InterfaceMethod(6)
  public fun put_ButtonBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(7)
  public fun get_ButtonBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(8)
  public fun put_ButtonHoverForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(9)
  public fun get_ButtonHoverForegroundColor(): IReference<Color?>?

  @InterfaceMethod(10)
  public fun put_ButtonHoverBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(11)
  public fun get_ButtonHoverBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(12)
  public fun put_ButtonPressedForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(13)
  public fun get_ButtonPressedForegroundColor(): IReference<Color?>?

  @InterfaceMethod(14)
  public fun put_ButtonPressedBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(15)
  public fun get_ButtonPressedBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(16)
  public fun put_InactiveForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(17)
  public fun get_InactiveForegroundColor(): IReference<Color?>?

  @InterfaceMethod(18)
  public fun put_InactiveBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(19)
  public fun get_InactiveBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(20)
  public fun put_ButtonInactiveForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(21)
  public fun get_ButtonInactiveForegroundColor(): IReference<Color?>?

  @InterfaceMethod(22)
  public fun put_ButtonInactiveBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(23)
  public fun get_ButtonInactiveBackgroundColor(): IReference<Color?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewTitleBar> {
    public override fun getValue() = ABI.makeIApplicationViewTitleBar(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewTitleBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewTitleBar {
    public val __780245758_Ptr: Pointer?

    public val _780245758_VtblPtr: Pointer?
      get() = __780245758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ForegroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_BackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_BackgroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ButtonForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ButtonForegroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ButtonBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_ButtonBackgroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_ButtonHoverForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ButtonHoverForegroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_ButtonHoverBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ButtonHoverBackgroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_ButtonPressedForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_ButtonPressedForegroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_ButtonPressedBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_ButtonPressedBackgroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_InactiveForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_InactiveForegroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_InactiveBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_InactiveBackgroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_ButtonInactiveForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_ButtonInactiveForegroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_ButtonInactiveBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _780245758_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_ButtonInactiveBackgroundColor(): IReference<Color?>? {
      val fnPtr = _780245758_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__780245758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationViewTitleBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __780245758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewTitleBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00924ac0932b4a6b9c4bdc38c82478ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewTitleBar(ptr: Pointer?): WithDefault =
        IApplicationViewTitleBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewTitleBar {
      val address = segment.toRawLongValue()
      return makeIApplicationViewTitleBar(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewTitleBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__780245758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewTitleBar):
        Array<IApplicationViewTitleBar?> = (elements as
        Array<IApplicationViewTitleBar?>).castToImpl<IApplicationViewTitleBar,IApplicationViewTitleBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewTitleBar?> =
        arrayOfNulls<IApplicationViewTitleBar_Impl>(size) as Array<IApplicationViewTitleBar?>
  }
}
