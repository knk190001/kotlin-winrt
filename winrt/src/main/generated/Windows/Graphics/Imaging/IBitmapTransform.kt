package Windows.Graphics.Imaging

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBitmapTransform.ABI::class)
@Signature("{ae755344-e268-4d35-adcf-e995d31a8d34}")
@Guid("ae755344e2684d35adcfe995d31a8d34")
@WinRTInterface("ae755344e2684d35adcfe995d31a8d34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapTransform.ByReference::class)
public interface IBitmapTransform : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScaledWidth(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_ScaledWidth(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_ScaledHeight(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_ScaledHeight(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_InterpolationMode(): BitmapInterpolationMode?

  @InterfaceMethod(5)
  public fun put_InterpolationMode(value: BitmapInterpolationMode?): Unit

  @InterfaceMethod(6)
  public fun get_Flip(): BitmapFlip?

  @InterfaceMethod(7)
  public fun put_Flip(value: BitmapFlip?): Unit

  @InterfaceMethod(8)
  public fun get_Rotation(): BitmapRotation?

  @InterfaceMethod(9)
  public fun put_Rotation(value: BitmapRotation?): Unit

  @InterfaceMethod(10)
  public fun get_Bounds(): BitmapBounds?

  @InterfaceMethod(11)
  public fun put_Bounds(value: BitmapBounds?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapTransform> {
    public override fun getValue() = ABI.makeIBitmapTransform(pointer.getPointer(0))

    public fun setValue(value: IBitmapTransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapTransform {
    public val __513691284_Ptr: Pointer?

    public val _513691284_VtblPtr: Pointer?
      get() = __513691284_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScaledWidth(): WinDef.UINT {
      val fnPtr = _513691284_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ScaledWidth(value: WinDef.UINT): Unit {
      val fnPtr = _513691284_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ScaledHeight(): WinDef.UINT {
      val fnPtr = _513691284_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ScaledHeight(value: WinDef.UINT): Unit {
      val fnPtr = _513691284_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_InterpolationMode(): BitmapInterpolationMode? {
      val fnPtr = _513691284_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapInterpolationMode>()
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapInterpolationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_InterpolationMode(value: BitmapInterpolationMode?): Unit {
      val fnPtr = _513691284_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Flip(): BitmapFlip? {
      val fnPtr = _513691284_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapFlip>()
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapFlip>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Flip(value: BitmapFlip?): Unit {
      val fnPtr = _513691284_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Rotation(): BitmapRotation? {
      val fnPtr = _513691284_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapRotation>()
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapRotation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Rotation(value: BitmapRotation?): Unit {
      val fnPtr = _513691284_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Bounds(): BitmapBounds? {
      val fnPtr = _513691284_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapBounds>()
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapBounds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Bounds(value: BitmapBounds?): Unit {
      val fnPtr = _513691284_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__513691284_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBitmapTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __513691284_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae755344e2684d35adcfe995d31a8d34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapTransform(ptr: Pointer?): WithDefault = IBitmapTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapTransform {
      val address = segment.toRawLongValue()
      return makeIBitmapTransform(Pointer(address))
    }

    public override fun toNative(obj: IBitmapTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__513691284_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapTransform): Array<IBitmapTransform?> = (elements as
        Array<IBitmapTransform?>).castToImpl<IBitmapTransform,IBitmapTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapTransform?> =
        arrayOfNulls<IBitmapTransform_Impl>(size) as Array<IBitmapTransform?>
  }
}
