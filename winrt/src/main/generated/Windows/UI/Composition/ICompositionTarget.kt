package Windows.UI.Composition

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

@ABIMarker(ICompositionTarget.ABI::class)
@Signature("{a1bea8ba-d726-4663-8129-6b5e7927ffa6}")
@Guid("a1bea8bad726466381296b5e7927ffa6")
@WinRTInterface("a1bea8bad726466381296b5e7927ffa6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionTarget.ByReference::class)
public interface ICompositionTarget : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Root(): Visual?

  @InterfaceMethod(1)
  public fun put_Root(value: Visual?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionTarget> {
    public override fun getValue() = ABI.makeICompositionTarget(pointer.getPointer(0))

    public fun setValue(value: ICompositionTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionTarget {
    public val __1292937709_Ptr: Pointer?

    public val _1292937709_VtblPtr: Pointer?
      get() = __1292937709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Root(): Visual? {
      val fnPtr = _1292937709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__1292937709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Root(value: Visual?): Unit {
      val fnPtr = _1292937709_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1292937709_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1292937709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1bea8bad726466381296b5e7927ffa6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionTarget(ptr: Pointer?): WithDefault = ICompositionTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionTarget {
      val address = segment.toRawLongValue()
      return makeICompositionTarget(Pointer(address))
    }

    public override fun toNative(obj: ICompositionTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1292937709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionTarget): Array<ICompositionTarget?> =
        (elements as
        Array<ICompositionTarget?>).castToImpl<ICompositionTarget,ICompositionTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionTarget?> =
        arrayOfNulls<ICompositionTarget_Impl>(size) as Array<ICompositionTarget?>
  }
}
