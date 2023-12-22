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

@ABIMarker(IEdgeGestureStatics.ABI::class)
@Signature("{bc6a8519-18ee-4043-9839-4fc584d60a14}")
@Guid("bc6a851918ee404398394fc584d60a14")
@WinRTInterface("bc6a851918ee404398394fc584d60a14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEdgeGestureStatics.ByReference::class)
public interface IEdgeGestureStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): EdgeGesture?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEdgeGestureStatics> {
    public override fun getValue() = ABI.makeIEdgeGestureStatics(pointer.getPointer(0))

    public fun setValue(value: IEdgeGestureStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEdgeGestureStatics {
    public val __1122007385_Ptr: Pointer?

    public val _1122007385_VtblPtr: Pointer?
      get() = __1122007385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): EdgeGesture? {
      val fnPtr = _1122007385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EdgeGesture>()
      val hr = fn.invokeHR(arrayOf(__1122007385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EdgeGesture>(result.getValue())
      return resultValue
    }
  }

  public class IEdgeGestureStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1122007385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEdgeGestureStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc6a851918ee404398394fc584d60a14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEdgeGestureStatics(ptr: Pointer?): WithDefault = IEdgeGestureStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEdgeGestureStatics {
      val address = segment.toRawLongValue()
      return makeIEdgeGestureStatics(Pointer(address))
    }

    public override fun toNative(obj: IEdgeGestureStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1122007385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEdgeGestureStatics): Array<IEdgeGestureStatics?> =
        (elements as
        Array<IEdgeGestureStatics?>).castToImpl<IEdgeGestureStatics,IEdgeGestureStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEdgeGestureStatics?> =
        arrayOfNulls<IEdgeGestureStatics_Impl>(size) as Array<IEdgeGestureStatics?>
  }
}
