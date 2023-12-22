package Microsoft.UI.Xaml

import Windows.Foundation.IReference
import Windows.Foundation.Rect
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBringIntoViewOptions.ABI::class)
@Signature("{eeb4a447-eb9e-5003-a479-b9e3a886b708}")
@Guid("eeb4a447eb9e5003a479b9e3a886b708")
@WinRTInterface("eeb4a447eb9e5003a479b9e3a886b708")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBringIntoViewOptions.ByReference::class)
public interface IBringIntoViewOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnimationDesired(): Boolean

  @InterfaceMethod(1)
  public fun put_AnimationDesired(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_TargetRect(): IReference<Rect?>?

  @InterfaceMethod(3)
  public fun put_TargetRect(value: IReference<Rect?>?): Unit

  @InterfaceMethod(4)
  public fun get_HorizontalAlignmentRatio(): Double

  @InterfaceMethod(5)
  public fun put_HorizontalAlignmentRatio(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_VerticalAlignmentRatio(): Double

  @InterfaceMethod(7)
  public fun put_VerticalAlignmentRatio(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(9)
  public fun put_HorizontalOffset(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(11)
  public fun put_VerticalOffset(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBringIntoViewOptions> {
    public override fun getValue() = ABI.makeIBringIntoViewOptions(pointer.getPointer(0))

    public fun setValue(value: IBringIntoViewOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBringIntoViewOptions {
    public val __1094950030_Ptr: Pointer?

    public val _1094950030_VtblPtr: Pointer?
      get() = __1094950030_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnimationDesired(): Boolean {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AnimationDesired(value: Boolean): Unit {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TargetRect(): IReference<Rect?>? {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Rect?>>()
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Rect?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TargetRect(value: IReference<Rect?>?): Unit {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HorizontalAlignmentRatio(): Double {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_HorizontalAlignmentRatio(value: Double): Unit {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_VerticalAlignmentRatio(): Double {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_VerticalAlignmentRatio(value: Double): Unit {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_HorizontalOffset(value: Double): Unit {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_VerticalOffset(value: Double): Unit {
      val fnPtr = _1094950030_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1094950030_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBringIntoViewOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1094950030_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBringIntoViewOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eeb4a447eb9e5003a479b9e3a886b708")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBringIntoViewOptions(ptr: Pointer?): WithDefault =
        IBringIntoViewOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBringIntoViewOptions {
      val address = segment.toRawLongValue()
      return makeIBringIntoViewOptions(Pointer(address))
    }

    public override fun toNative(obj: IBringIntoViewOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1094950030_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBringIntoViewOptions): Array<IBringIntoViewOptions?> =
        (elements as
        Array<IBringIntoViewOptions?>).castToImpl<IBringIntoViewOptions,IBringIntoViewOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBringIntoViewOptions?> =
        arrayOfNulls<IBringIntoViewOptions_Impl>(size) as Array<IBringIntoViewOptions?>
  }
}
