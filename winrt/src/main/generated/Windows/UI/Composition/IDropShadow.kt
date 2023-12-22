package Windows.UI.Composition

import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(IDropShadow.ABI::class)
@Signature("{cb977c07-a154-4851-85e7-a8924c84fad8}")
@Guid("cb977c07a154485185e7a8924c84fad8")
@WinRTInterface("cb977c07a154485185e7a8924c84fad8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropShadow.ByReference::class)
public interface IDropShadow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BlurRadius(): Float

  @InterfaceMethod(1)
  public fun put_BlurRadius(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_Color(): Color?

  @InterfaceMethod(3)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(4)
  public fun get_Mask(): CompositionBrush?

  @InterfaceMethod(5)
  public fun put_Mask(value: CompositionBrush?): Unit

  @InterfaceMethod(6)
  public fun get_Offset(): Vector3?

  @InterfaceMethod(7)
  public fun put_Offset(value: Vector3?): Unit

  @InterfaceMethod(8)
  public fun get_Opacity(): Float

  @InterfaceMethod(9)
  public fun put_Opacity(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDropShadow> {
    public override fun getValue() = ABI.makeIDropShadow(pointer.getPointer(0))

    public fun setValue(value: IDropShadow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropShadow {
    public val __1560873757_Ptr: Pointer?

    public val _1560873757_VtblPtr: Pointer?
      get() = __1560873757_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BlurRadius(): Float {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BlurRadius(value: Float): Unit {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Color(): Color? {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Mask(): CompositionBrush? {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Mask(value: CompositionBrush?): Unit {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Offset(): Vector3? {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Offset(value: Vector3?): Unit {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Opacity(): Float {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Opacity(value: Float): Unit {
      val fnPtr = _1560873757_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1560873757_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDropShadow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1560873757_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropShadow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb977c07a154485185e7a8924c84fad8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropShadow(ptr: Pointer?): WithDefault = IDropShadow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropShadow {
      val address = segment.toRawLongValue()
      return makeIDropShadow(Pointer(address))
    }

    public override fun toNative(obj: IDropShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1560873757_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropShadow): Array<IDropShadow?> = (elements as
        Array<IDropShadow?>).castToImpl<IDropShadow,IDropShadow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropShadow?> =
        arrayOfNulls<IDropShadow_Impl>(size) as Array<IDropShadow?>
  }
}
