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

@ABIMarker(ISwipeHintThemeAnimation.ABI::class)
@Signature("{cdd067c0-580e-4e40-be98-f202d3d84365}")
@Guid("cdd067c0580e4e40be98f202d3d84365")
@WinRTInterface("cdd067c0580e4e40be98f202d3d84365")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeHintThemeAnimation.ByReference::class)
public interface ISwipeHintThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetName(): String?

  @InterfaceMethod(1)
  public fun put_TargetName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_ToHorizontalOffset(): Double

  @InterfaceMethod(3)
  public fun put_ToHorizontalOffset(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_ToVerticalOffset(): Double

  @InterfaceMethod(5)
  public fun put_ToVerticalOffset(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeHintThemeAnimation> {
    public override fun getValue() = ABI.makeISwipeHintThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: ISwipeHintThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeHintThemeAnimation {
    public val __611541450_Ptr: Pointer?

    public val _611541450_VtblPtr: Pointer?
      get() = __611541450_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetName(): String? {
      val fnPtr = _611541450_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__611541450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _611541450_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__611541450_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ToHorizontalOffset(): Double {
      val fnPtr = _611541450_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__611541450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ToHorizontalOffset(value: Double): Unit {
      val fnPtr = _611541450_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__611541450_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ToVerticalOffset(): Double {
      val fnPtr = _611541450_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__611541450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ToVerticalOffset(value: Double): Unit {
      val fnPtr = _611541450_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__611541450_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISwipeHintThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __611541450_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeHintThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cdd067c0580e4e40be98f202d3d84365")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeHintThemeAnimation(ptr: Pointer?): WithDefault =
        ISwipeHintThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeHintThemeAnimation {
      val address = segment.toRawLongValue()
      return makeISwipeHintThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: ISwipeHintThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__611541450_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeHintThemeAnimation):
        Array<ISwipeHintThemeAnimation?> = (elements as
        Array<ISwipeHintThemeAnimation?>).castToImpl<ISwipeHintThemeAnimation,ISwipeHintThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeHintThemeAnimation?> =
        arrayOfNulls<ISwipeHintThemeAnimation_Impl>(size) as Array<ISwipeHintThemeAnimation?>
  }
}
