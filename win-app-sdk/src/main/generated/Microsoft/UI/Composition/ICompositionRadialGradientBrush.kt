package Microsoft.UI.Composition

import Windows.Foundation.Numerics.Vector2
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

@ABIMarker(ICompositionRadialGradientBrush.ABI::class)
@Signature("{17662f3f-d351-5435-b3b4-ec26cefeccc5}")
@Guid("17662f3fd3515435b3b4ec26cefeccc5")
@WinRTInterface("17662f3fd3515435b3b4ec26cefeccc5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionRadialGradientBrush.ByReference::class)
public interface ICompositionRadialGradientBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EllipseCenter(): Vector2?

  @InterfaceMethod(1)
  public fun put_EllipseCenter(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_EllipseRadius(): Vector2?

  @InterfaceMethod(3)
  public fun put_EllipseRadius(value: Vector2?): Unit

  @InterfaceMethod(4)
  public fun get_GradientOriginOffset(): Vector2?

  @InterfaceMethod(5)
  public fun put_GradientOriginOffset(value: Vector2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionRadialGradientBrush> {
    public override fun getValue() = ABI.makeICompositionRadialGradientBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositionRadialGradientBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionRadialGradientBrush {
    public val __1601433178_Ptr: Pointer?

    public val _1601433178_VtblPtr: Pointer?
      get() = __1601433178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EllipseCenter(): Vector2? {
      val fnPtr = _1601433178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1601433178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EllipseCenter(value: Vector2?): Unit {
      val fnPtr = _1601433178_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601433178_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_EllipseRadius(): Vector2? {
      val fnPtr = _1601433178_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1601433178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_EllipseRadius(value: Vector2?): Unit {
      val fnPtr = _1601433178_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601433178_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_GradientOriginOffset(): Vector2? {
      val fnPtr = _1601433178_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__1601433178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_GradientOriginOffset(value: Vector2?): Unit {
      val fnPtr = _1601433178_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601433178_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionRadialGradientBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1601433178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionRadialGradientBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17662f3fd3515435b3b4ec26cefeccc5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionRadialGradientBrush(ptr: Pointer?): WithDefault =
        ICompositionRadialGradientBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionRadialGradientBrush {
      val address = segment.toRawLongValue()
      return makeICompositionRadialGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositionRadialGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1601433178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionRadialGradientBrush):
        Array<ICompositionRadialGradientBrush?> = (elements as
        Array<ICompositionRadialGradientBrush?>).castToImpl<ICompositionRadialGradientBrush,ICompositionRadialGradientBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionRadialGradientBrush?> =
        arrayOfNulls<ICompositionRadialGradientBrush_Impl>(size) as
        Array<ICompositionRadialGradientBrush?>
  }
}
