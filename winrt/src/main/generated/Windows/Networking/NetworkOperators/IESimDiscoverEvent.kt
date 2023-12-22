package Windows.Networking.NetworkOperators

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IESimDiscoverEvent.ABI::class)
@Signature("{e59ac3e3-39bc-5f6f-9321-0d4a182d261b}")
@Guid("e59ac3e339bc5f6f93210d4a182d261b")
@WinRTInterface("e59ac3e339bc5f6f93210d4a182d261b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimDiscoverEvent.ByReference::class)
public interface IESimDiscoverEvent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MatchingId(): String?

  @InterfaceMethod(1)
  public fun get_RspServerAddress(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IESimDiscoverEvent> {
    public override fun getValue() = ABI.makeIESimDiscoverEvent(pointer.getPointer(0))

    public fun setValue(value: IESimDiscoverEvent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimDiscoverEvent {
    public val __1445320262_Ptr: Pointer?

    public val _1445320262_VtblPtr: Pointer?
      get() = __1445320262_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MatchingId(): String? {
      val fnPtr = _1445320262_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1445320262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RspServerAddress(): String? {
      val fnPtr = _1445320262_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1445320262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IESimDiscoverEvent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1445320262_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimDiscoverEvent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e59ac3e339bc5f6f93210d4a182d261b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimDiscoverEvent(ptr: Pointer?): WithDefault = IESimDiscoverEvent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimDiscoverEvent {
      val address = segment.toRawLongValue()
      return makeIESimDiscoverEvent(Pointer(address))
    }

    public override fun toNative(obj: IESimDiscoverEvent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1445320262_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimDiscoverEvent): Array<IESimDiscoverEvent?> =
        (elements as
        Array<IESimDiscoverEvent?>).castToImpl<IESimDiscoverEvent,IESimDiscoverEvent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimDiscoverEvent?> =
        arrayOfNulls<IESimDiscoverEvent_Impl>(size) as Array<IESimDiscoverEvent?>
  }
}
