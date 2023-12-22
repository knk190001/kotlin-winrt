package Windows.Services.Store

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

@ABIMarker(IStoreQueueItemCompletedEventArgs.ABI::class)
@Signature("{1247df6c-b44a-439b-bb07-1d3003d005c2}")
@Guid("1247df6cb44a439bbb071d3003d005c2")
@WinRTInterface("1247df6cb44a439bbb071d3003d005c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreQueueItemCompletedEventArgs.ByReference::class)
public interface IStoreQueueItemCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): StoreQueueItemStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreQueueItemCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeIStoreQueueItemCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IStoreQueueItemCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreQueueItemCompletedEventArgs {
    public val __1624270980_Ptr: Pointer?

    public val _1624270980_VtblPtr: Pointer?
      get() = __1624270980_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): StoreQueueItemStatus? {
      val fnPtr = _1624270980_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreQueueItemStatus>()
      val hr = fn.invokeHR(arrayOf(__1624270980_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreQueueItemStatus>(result.getValue())
      return resultValue
    }
  }

  public class IStoreQueueItemCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1624270980_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreQueueItemCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1247df6cb44a439bbb071d3003d005c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreQueueItemCompletedEventArgs(ptr: Pointer?): WithDefault =
        IStoreQueueItemCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreQueueItemCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIStoreQueueItemCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IStoreQueueItemCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1624270980_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreQueueItemCompletedEventArgs):
        Array<IStoreQueueItemCompletedEventArgs?> = (elements as
        Array<IStoreQueueItemCompletedEventArgs?>).castToImpl<IStoreQueueItemCompletedEventArgs,IStoreQueueItemCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreQueueItemCompletedEventArgs?> =
        arrayOfNulls<IStoreQueueItemCompletedEventArgs_Impl>(size) as
        Array<IStoreQueueItemCompletedEventArgs?>
  }
}
