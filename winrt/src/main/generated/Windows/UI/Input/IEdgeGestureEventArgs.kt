package Windows.UI.Input

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

@ABIMarker(IEdgeGestureEventArgs.ABI::class)
@Signature("{44fa4a24-2d09-42e1-8b5e-368208796a4c}")
@Guid("44fa4a242d0942e18b5e368208796a4c")
@WinRTInterface("44fa4a242d0942e18b5e368208796a4c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEdgeGestureEventArgs.ByReference::class)
public interface IEdgeGestureEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): EdgeGestureKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEdgeGestureEventArgs> {
    public override fun getValue() = ABI.makeIEdgeGestureEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEdgeGestureEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEdgeGestureEventArgs {
    public val __1900294393_Ptr: Pointer?

    public val _1900294393_VtblPtr: Pointer?
      get() = __1900294393_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): EdgeGestureKind? {
      val fnPtr = _1900294393_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EdgeGestureKind>()
      val hr = fn.invokeHR(arrayOf(__1900294393_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EdgeGestureKind>(result.getValue())
      return resultValue
    }
  }

  public class IEdgeGestureEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1900294393_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEdgeGestureEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("44fa4a242d0942e18b5e368208796a4c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEdgeGestureEventArgs(ptr: Pointer?): WithDefault =
        IEdgeGestureEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEdgeGestureEventArgs {
      val address = segment.toRawLongValue()
      return makeIEdgeGestureEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEdgeGestureEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1900294393_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEdgeGestureEventArgs): Array<IEdgeGestureEventArgs?> =
        (elements as
        Array<IEdgeGestureEventArgs?>).castToImpl<IEdgeGestureEventArgs,IEdgeGestureEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEdgeGestureEventArgs?> =
        arrayOfNulls<IEdgeGestureEventArgs_Impl>(size) as Array<IEdgeGestureEventArgs?>
  }
}
