package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Composition.CompositionAnimation
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

@ABIMarker(IScrollingScrollAnimationStartingEventArgs.ABI::class)
@Signature("{7acb0423-6fc7-516b-ab67-03a4a4285a90}")
@Guid("7acb04236fc7516bab6703a4a4285a90")
@WinRTInterface("7acb04236fc7516bab6703a4a4285a90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollingScrollAnimationStartingEventArgs.ByReference::class)
public interface IScrollingScrollAnimationStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Animation(): CompositionAnimation?

  @InterfaceMethod(1)
  public fun put_Animation(value: CompositionAnimation?): Unit

  @InterfaceMethod(2)
  public fun get_StartPosition(): Vector2?

  @InterfaceMethod(3)
  public fun get_EndPosition(): Vector2?

  @InterfaceMethod(4)
  public fun get_CorrelationId(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollingScrollAnimationStartingEventArgs> {
    public override fun getValue() =
        ABI.makeIScrollingScrollAnimationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollingScrollAnimationStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollingScrollAnimationStartingEventArgs {
    public val __134421486_Ptr: Pointer?

    public val _134421486_VtblPtr: Pointer?
      get() = __134421486_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Animation(): CompositionAnimation? {
      val fnPtr = _134421486_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionAnimation>()
      val hr = fn.invokeHR(arrayOf(__134421486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Animation(value: CompositionAnimation?): Unit {
      val fnPtr = _134421486_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__134421486_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_StartPosition(): Vector2? {
      val fnPtr = _134421486_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__134421486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_EndPosition(): Vector2? {
      val fnPtr = _134421486_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__134421486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CorrelationId(): Int {
      val fnPtr = _134421486_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__134421486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IScrollingScrollAnimationStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __134421486_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollingScrollAnimationStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7acb04236fc7516bab6703a4a4285a90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollingScrollAnimationStartingEventArgs(ptr: Pointer?): WithDefault =
        IScrollingScrollAnimationStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IScrollingScrollAnimationStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollingScrollAnimationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollingScrollAnimationStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__134421486_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollingScrollAnimationStartingEventArgs):
        Array<IScrollingScrollAnimationStartingEventArgs?> = (elements as
        Array<IScrollingScrollAnimationStartingEventArgs?>).castToImpl<IScrollingScrollAnimationStartingEventArgs,IScrollingScrollAnimationStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollingScrollAnimationStartingEventArgs?> =
        arrayOfNulls<IScrollingScrollAnimationStartingEventArgs_Impl>(size) as
        Array<IScrollingScrollAnimationStartingEventArgs?>
  }
}
