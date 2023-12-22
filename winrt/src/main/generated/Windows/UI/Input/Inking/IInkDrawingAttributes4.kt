package Windows.UI.Input.Inking

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkDrawingAttributes4.ABI::class)
@Signature("{ef65dc25-9f19-456d-91a3-bc3a3d91c5fb}")
@Guid("ef65dc259f19456d91a3bc3a3d91c5fb")
@WinRTInterface("ef65dc259f19456d91a3bc3a3d91c5fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkDrawingAttributes4.ByReference::class)
public interface IInkDrawingAttributes4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IgnoreTilt(): Boolean

  @InterfaceMethod(1)
  public fun put_IgnoreTilt(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkDrawingAttributes4> {
    public override fun getValue() = ABI.makeIInkDrawingAttributes4(pointer.getPointer(0))

    public fun setValue(value: IInkDrawingAttributes4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkDrawingAttributes4 {
    public val __1946136555_Ptr: Pointer?

    public val _1946136555_VtblPtr: Pointer?
      get() = __1946136555_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IgnoreTilt(): Boolean {
      val fnPtr = _1946136555_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1946136555_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IgnoreTilt(value: Boolean): Unit {
      val fnPtr = _1946136555_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946136555_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkDrawingAttributes4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946136555_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkDrawingAttributes4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef65dc259f19456d91a3bc3a3d91c5fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkDrawingAttributes4(ptr: Pointer?): WithDefault =
        IInkDrawingAttributes4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkDrawingAttributes4 {
      val address = segment.toRawLongValue()
      return makeIInkDrawingAttributes4(Pointer(address))
    }

    public override fun toNative(obj: IInkDrawingAttributes4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946136555_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkDrawingAttributes4): Array<IInkDrawingAttributes4?> =
        (elements as
        Array<IInkDrawingAttributes4?>).castToImpl<IInkDrawingAttributes4,IInkDrawingAttributes4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkDrawingAttributes4?> =
        arrayOfNulls<IInkDrawingAttributes4_Impl>(size) as Array<IInkDrawingAttributes4?>
  }
}
