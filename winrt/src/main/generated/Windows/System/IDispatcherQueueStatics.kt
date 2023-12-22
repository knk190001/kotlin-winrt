package Windows.System

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

@ABIMarker(IDispatcherQueueStatics.ABI::class)
@Signature("{a96d83d7-9371-4517-9245-d0824ac12c74}")
@Guid("a96d83d7937145179245d0824ac12c74")
@WinRTInterface("a96d83d7937145179245d0824ac12c74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherQueueStatics.ByReference::class)
public interface IDispatcherQueueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentThread(): DispatcherQueue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherQueueStatics> {
    public override fun getValue() = ABI.makeIDispatcherQueueStatics(pointer.getPointer(0))

    public fun setValue(value: IDispatcherQueueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherQueueStatics {
    public val __844931094_Ptr: Pointer?

    public val _844931094_VtblPtr: Pointer?
      get() = __844931094_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentThread(): DispatcherQueue? {
      val fnPtr = _844931094_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__844931094_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }
  }

  public class IDispatcherQueueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __844931094_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherQueueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a96d83d7937145179245d0824ac12c74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherQueueStatics(ptr: Pointer?): WithDefault =
        IDispatcherQueueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherQueueStatics {
      val address = segment.toRawLongValue()
      return makeIDispatcherQueueStatics(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherQueueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__844931094_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherQueueStatics): Array<IDispatcherQueueStatics?>
        = (elements as
        Array<IDispatcherQueueStatics?>).castToImpl<IDispatcherQueueStatics,IDispatcherQueueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherQueueStatics?> =
        arrayOfNulls<IDispatcherQueueStatics_Impl>(size) as Array<IDispatcherQueueStatics?>
  }
}
