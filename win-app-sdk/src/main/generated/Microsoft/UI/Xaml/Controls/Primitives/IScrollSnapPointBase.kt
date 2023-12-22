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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollSnapPointBase.ABI::class)
@Signature("{45d7319d-c9eb-5109-9668-ff3fc6ccdf11}")
@Guid("45d7319dc9eb51099668ff3fc6ccdf11")
@WinRTInterface("45d7319dc9eb51099668ff3fc6ccdf11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollSnapPointBase.ByReference::class)
public interface IScrollSnapPointBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Alignment(): ScrollSnapPointsAlignment?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollSnapPointBase> {
    public override fun getValue() = ABI.makeIScrollSnapPointBase(pointer.getPointer(0))

    public fun setValue(value: IScrollSnapPointBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollSnapPointBase {
    public val __356515353_Ptr: Pointer?

    public val _356515353_VtblPtr: Pointer?
      get() = __356515353_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Alignment(): ScrollSnapPointsAlignment? {
      val fnPtr = _356515353_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollSnapPointsAlignment>()
      val hr = fn.invokeHR(arrayOf(__356515353_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollSnapPointsAlignment>(result.getValue())
      return resultValue
    }
  }

  public class IScrollSnapPointBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __356515353_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollSnapPointBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45d7319dc9eb51099668ff3fc6ccdf11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollSnapPointBase(ptr: Pointer?): WithDefault = IScrollSnapPointBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollSnapPointBase {
      val address = segment.toRawLongValue()
      return makeIScrollSnapPointBase(Pointer(address))
    }

    public override fun toNative(obj: IScrollSnapPointBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__356515353_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollSnapPointBase): Array<IScrollSnapPointBase?> =
        (elements as
        Array<IScrollSnapPointBase?>).castToImpl<IScrollSnapPointBase,IScrollSnapPointBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollSnapPointBase?> =
        arrayOfNulls<IScrollSnapPointBase_Impl>(size) as Array<IScrollSnapPointBase?>
  }
}
