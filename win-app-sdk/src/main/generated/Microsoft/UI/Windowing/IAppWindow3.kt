package Microsoft.UI.Windowing

import Microsoft.UI.Dispatching.DispatcherQueue
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

@ABIMarker(IAppWindow3.ABI::class)
@Signature("{2f260cea-193d-5dd6-a904-d7649a608d2f}")
@Guid("2f260cea193d5dd6a904d7649a608d2f")
@WinRTInterface("2f260cea193d5dd6a904d7649a608d2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindow3.ByReference::class)
public interface IAppWindow3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AssociateWithDispatcherQueue(dispatcherQueue: DispatcherQueue?): Unit

  @InterfaceMethod(1)
  public fun get_DispatcherQueue(): DispatcherQueue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppWindow3> {
    public override fun getValue() = ABI.makeIAppWindow3(pointer.getPointer(0))

    public fun setValue(value: IAppWindow3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindow3 {
    public val __1895777549_Ptr: Pointer?

    public val _1895777549_VtblPtr: Pointer?
      get() = __1895777549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AssociateWithDispatcherQueue(dispatcherQueue: DispatcherQueue?): Unit {
      val fnPtr = _1895777549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1895777549_Ptr, marshalToNative(dispatcherQueue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1895777549_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1895777549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }
  }

  public class IAppWindow3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1895777549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindow3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f260cea193d5dd6a904d7649a608d2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindow3(ptr: Pointer?): WithDefault = IAppWindow3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindow3 {
      val address = segment.toRawLongValue()
      return makeIAppWindow3(Pointer(address))
    }

    public override fun toNative(obj: IAppWindow3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1895777549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindow3): Array<IAppWindow3?> = (elements as
        Array<IAppWindow3?>).castToImpl<IAppWindow3,IAppWindow3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindow3?> =
        arrayOfNulls<IAppWindow3_Impl>(size) as Array<IAppWindow3?>
  }
}
