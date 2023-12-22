package Windows.Devices.AllJoyn

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

@ABIMarker(IAllJoynAcceptSessionJoiner.ABI::class)
@Signature("{4da817d2-cd1d-4023-a7c4-16def89c28df}")
@Guid("4da817d2cd1d4023a7c416def89c28df")
@WinRTInterface("4da817d2cd1d4023a7c416def89c28df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynAcceptSessionJoiner.ByReference::class)
public interface IAllJoynAcceptSessionJoiner : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Accept(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynAcceptSessionJoiner> {
    public override fun getValue() = ABI.makeIAllJoynAcceptSessionJoiner(pointer.getPointer(0))

    public fun setValue(value: IAllJoynAcceptSessionJoiner_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynAcceptSessionJoiner {
    public val __1799380396_Ptr: Pointer?

    public val _1799380396_VtblPtr: Pointer?
      get() = __1799380396_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Accept(): Unit {
      val fnPtr = _1799380396_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1799380396_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAllJoynAcceptSessionJoiner_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1799380396_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynAcceptSessionJoiner, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4da817d2cd1d4023a7c416def89c28df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynAcceptSessionJoiner(ptr: Pointer?): WithDefault =
        IAllJoynAcceptSessionJoiner_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynAcceptSessionJoiner {
      val address = segment.toRawLongValue()
      return makeIAllJoynAcceptSessionJoiner(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynAcceptSessionJoiner): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1799380396_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynAcceptSessionJoiner):
        Array<IAllJoynAcceptSessionJoiner?> = (elements as
        Array<IAllJoynAcceptSessionJoiner?>).castToImpl<IAllJoynAcceptSessionJoiner,IAllJoynAcceptSessionJoiner_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynAcceptSessionJoiner?> =
        arrayOfNulls<IAllJoynAcceptSessionJoiner_Impl>(size) as Array<IAllJoynAcceptSessionJoiner?>
  }
}
