package Windows.UI.Xaml

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBringIntoViewOptions2.ABI::class)
@Signature("{e855e08e-64b6-1211-bddb-1fddbb6e8231}")
@Guid("e855e08e64b61211bddb1fddbb6e8231")
@WinRTInterface("e855e08e64b61211bddb1fddbb6e8231")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBringIntoViewOptions2.ByReference::class)
public interface IBringIntoViewOptions2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalAlignmentRatio(): Double

  @InterfaceMethod(1)
  public fun put_HorizontalAlignmentRatio(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_VerticalAlignmentRatio(): Double

  @InterfaceMethod(3)
  public fun put_VerticalAlignmentRatio(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(5)
  public fun put_HorizontalOffset(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(7)
  public fun put_VerticalOffset(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBringIntoViewOptions2> {
    public override fun getValue() = ABI.makeIBringIntoViewOptions2(pointer.getPointer(0))

    public fun setValue(value: IBringIntoViewOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBringIntoViewOptions2 {
    public val __2139270201_Ptr: Pointer?

    public val _2139270201_VtblPtr: Pointer?
      get() = __2139270201_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalAlignmentRatio(): Double {
      val fnPtr = _2139270201_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2139270201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_HorizontalAlignmentRatio(value: Double): Unit {
      val fnPtr = _2139270201_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2139270201_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_VerticalAlignmentRatio(): Double {
      val fnPtr = _2139270201_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2139270201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_VerticalAlignmentRatio(value: Double): Unit {
      val fnPtr = _2139270201_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2139270201_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _2139270201_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2139270201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_HorizontalOffset(value: Double): Unit {
      val fnPtr = _2139270201_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2139270201_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _2139270201_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2139270201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_VerticalOffset(value: Double): Unit {
      val fnPtr = _2139270201_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2139270201_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBringIntoViewOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2139270201_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBringIntoViewOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e855e08e64b61211bddb1fddbb6e8231")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBringIntoViewOptions2(ptr: Pointer?): WithDefault =
        IBringIntoViewOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBringIntoViewOptions2 {
      val address = segment.toRawLongValue()
      return makeIBringIntoViewOptions2(Pointer(address))
    }

    public override fun toNative(obj: IBringIntoViewOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2139270201_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBringIntoViewOptions2): Array<IBringIntoViewOptions2?> =
        (elements as
        Array<IBringIntoViewOptions2?>).castToImpl<IBringIntoViewOptions2,IBringIntoViewOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBringIntoViewOptions2?> =
        arrayOfNulls<IBringIntoViewOptions2_Impl>(size) as Array<IBringIntoViewOptions2?>
  }
}
