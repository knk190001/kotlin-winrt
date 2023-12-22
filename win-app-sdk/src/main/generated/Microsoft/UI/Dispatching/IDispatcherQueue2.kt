package Microsoft.UI.Dispatching

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

@ABIMarker(IDispatcherQueue2.ABI::class)
@Signature("{0cf48751-f1ac-59b8-ba52-6ce7a1444d6f}")
@Guid("0cf48751f1ac59b8ba526ce7a1444d6f")
@WinRTInterface("0cf48751f1ac59b8ba526ce7a1444d6f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherQueue2.ByReference::class)
public interface IDispatcherQueue2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasThreadAccess(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherQueue2> {
    public override fun getValue() = ABI.makeIDispatcherQueue2(pointer.getPointer(0))

    public fun setValue(value: IDispatcherQueue2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherQueue2 {
    public val __2029295907_Ptr: Pointer?

    public val _2029295907_VtblPtr: Pointer?
      get() = __2029295907_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasThreadAccess(): Boolean {
      val fnPtr = _2029295907_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2029295907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDispatcherQueue2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2029295907_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherQueue2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cf48751f1ac59b8ba526ce7a1444d6f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherQueue2(ptr: Pointer?): WithDefault = IDispatcherQueue2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherQueue2 {
      val address = segment.toRawLongValue()
      return makeIDispatcherQueue2(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherQueue2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2029295907_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherQueue2): Array<IDispatcherQueue2?> = (elements
        as Array<IDispatcherQueue2?>).castToImpl<IDispatcherQueue2,IDispatcherQueue2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherQueue2?> =
        arrayOfNulls<IDispatcherQueue2_Impl>(size) as Array<IDispatcherQueue2?>
  }
}
