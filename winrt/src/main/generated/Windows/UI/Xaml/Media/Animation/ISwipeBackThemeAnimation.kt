package Windows.UI.Xaml.Media.Animation

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISwipeBackThemeAnimation.ABI::class)
@Signature("{a38a4214-0bca-4d2d-95f7-ceba57fbaf60}")
@Guid("a38a42140bca4d2d95f7ceba57fbaf60")
@WinRTInterface("a38a42140bca4d2d95f7ceba57fbaf60")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeBackThemeAnimation.ByReference::class)
public interface ISwipeBackThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetName(): String?

  @InterfaceMethod(1)
  public fun put_TargetName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_FromHorizontalOffset(): Double

  @InterfaceMethod(3)
  public fun put_FromHorizontalOffset(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_FromVerticalOffset(): Double

  @InterfaceMethod(5)
  public fun put_FromVerticalOffset(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeBackThemeAnimation> {
    public override fun getValue() = ABI.makeISwipeBackThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: ISwipeBackThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeBackThemeAnimation {
    public val __522773354_Ptr: Pointer?

    public val _522773354_VtblPtr: Pointer?
      get() = __522773354_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetName(): String? {
      val fnPtr = _522773354_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__522773354_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _522773354_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__522773354_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FromHorizontalOffset(): Double {
      val fnPtr = _522773354_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__522773354_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_FromHorizontalOffset(value: Double): Unit {
      val fnPtr = _522773354_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__522773354_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FromVerticalOffset(): Double {
      val fnPtr = _522773354_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__522773354_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_FromVerticalOffset(value: Double): Unit {
      val fnPtr = _522773354_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__522773354_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISwipeBackThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __522773354_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeBackThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a38a42140bca4d2d95f7ceba57fbaf60")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeBackThemeAnimation(ptr: Pointer?): WithDefault =
        ISwipeBackThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeBackThemeAnimation {
      val address = segment.toRawLongValue()
      return makeISwipeBackThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: ISwipeBackThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__522773354_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeBackThemeAnimation):
        Array<ISwipeBackThemeAnimation?> = (elements as
        Array<ISwipeBackThemeAnimation?>).castToImpl<ISwipeBackThemeAnimation,ISwipeBackThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeBackThemeAnimation?> =
        arrayOfNulls<ISwipeBackThemeAnimation_Impl>(size) as Array<ISwipeBackThemeAnimation?>
  }
}
