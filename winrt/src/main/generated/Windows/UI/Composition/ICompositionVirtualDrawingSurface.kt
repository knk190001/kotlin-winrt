package Windows.UI.Composition

import Windows.Graphics.RectInt32
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

@ABIMarker(ICompositionVirtualDrawingSurface.ABI::class)
@Signature("{a9c384db-8740-4f94-8b9d-b68521e7863d}")
@Guid("a9c384db87404f948b9db68521e7863d")
@WinRTInterface("a9c384db87404f948b9db68521e7863d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionVirtualDrawingSurface.ByReference::class)
public interface ICompositionVirtualDrawingSurface : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Trim(rects: Array<RectInt32?>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionVirtualDrawingSurface> {
    public override fun getValue() =
        ABI.makeICompositionVirtualDrawingSurface(pointer.getPointer(0))

    public fun setValue(value: ICompositionVirtualDrawingSurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionVirtualDrawingSurface {
    public val __1791307074_Ptr: Pointer?

    public val _1791307074_VtblPtr: Pointer?
      get() = __1791307074_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Trim(rects: Array<RectInt32?>): Unit {
      val fnPtr = _1791307074_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1791307074_Ptr, rects.size,marshalToNative(rects),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionVirtualDrawingSurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1791307074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionVirtualDrawingSurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9c384db87404f948b9db68521e7863d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionVirtualDrawingSurface(ptr: Pointer?): WithDefault =
        ICompositionVirtualDrawingSurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionVirtualDrawingSurface {
      val address = segment.toRawLongValue()
      return makeICompositionVirtualDrawingSurface(Pointer(address))
    }

    public override fun toNative(obj: ICompositionVirtualDrawingSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1791307074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionVirtualDrawingSurface):
        Array<ICompositionVirtualDrawingSurface?> = (elements as
        Array<ICompositionVirtualDrawingSurface?>).castToImpl<ICompositionVirtualDrawingSurface,ICompositionVirtualDrawingSurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionVirtualDrawingSurface?> =
        arrayOfNulls<ICompositionVirtualDrawingSurface_Impl>(size) as
        Array<ICompositionVirtualDrawingSurface?>
  }
}
