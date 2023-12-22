package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IScrollSnapPoint.ABI::class)
@Signature("{73d918ff-d16c-52cd-9657-e392ee08868a}")
@Guid("73d918ffd16c52cd9657e392ee08868a")
@WinRTInterface("73d918ffd16c52cd9657e392ee08868a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollSnapPoint.ByReference::class)
public interface IScrollSnapPoint : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollSnapPoint> {
    public override fun getValue() = ABI.makeIScrollSnapPoint(pointer.getPointer(0))

    public fun setValue(value: IScrollSnapPoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollSnapPoint {
    public val __1089492776_Ptr: Pointer?

    public val _1089492776_VtblPtr: Pointer?
      get() = __1089492776_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): Double {
      val fnPtr = _1089492776_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1089492776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IScrollSnapPoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1089492776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollSnapPoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73d918ffd16c52cd9657e392ee08868a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollSnapPoint(ptr: Pointer?): WithDefault = IScrollSnapPoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollSnapPoint {
      val address = segment.toRawLongValue()
      return makeIScrollSnapPoint(Pointer(address))
    }

    public override fun toNative(obj: IScrollSnapPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1089492776_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollSnapPoint): Array<IScrollSnapPoint?> = (elements as
        Array<IScrollSnapPoint?>).castToImpl<IScrollSnapPoint,IScrollSnapPoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollSnapPoint?> =
        arrayOfNulls<IScrollSnapPoint_Impl>(size) as Array<IScrollSnapPoint?>
  }
}
