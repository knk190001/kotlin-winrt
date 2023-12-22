package Windows.UI.Composition

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

@ABIMarker(ICompositionLinearGradientBrush.ABI::class)
@Signature("{983bc519-a9db-413c-a2d8-2a9056fc525e}")
@Guid("983bc519a9db413ca2d82a9056fc525e")
@WinRTInterface("983bc519a9db413ca2d82a9056fc525e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionLinearGradientBrush.ByReference::class)
public interface ICompositionLinearGradientBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EndPoint(): Vector2?

  @InterfaceMethod(1)
  public fun put_EndPoint(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_StartPoint(): Vector2?

  @InterfaceMethod(3)
  public fun put_StartPoint(value: Vector2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionLinearGradientBrush> {
    public override fun getValue() = ABI.makeICompositionLinearGradientBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositionLinearGradientBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionLinearGradientBrush {
    public val __856625129_Ptr: Pointer?

    public val _856625129_VtblPtr: Pointer?
      get() = __856625129_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EndPoint(): Vector2? {
      val fnPtr = _856625129_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__856625129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EndPoint(value: Vector2?): Unit {
      val fnPtr = _856625129_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__856625129_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_StartPoint(): Vector2? {
      val fnPtr = _856625129_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__856625129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_StartPoint(value: Vector2?): Unit {
      val fnPtr = _856625129_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__856625129_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionLinearGradientBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __856625129_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionLinearGradientBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("983bc519a9db413ca2d82a9056fc525e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionLinearGradientBrush(ptr: Pointer?): WithDefault =
        ICompositionLinearGradientBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionLinearGradientBrush {
      val address = segment.toRawLongValue()
      return makeICompositionLinearGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositionLinearGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__856625129_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionLinearGradientBrush):
        Array<ICompositionLinearGradientBrush?> = (elements as
        Array<ICompositionLinearGradientBrush?>).castToImpl<ICompositionLinearGradientBrush,ICompositionLinearGradientBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionLinearGradientBrush?> =
        arrayOfNulls<ICompositionLinearGradientBrush_Impl>(size) as
        Array<ICompositionLinearGradientBrush?>
  }
}
