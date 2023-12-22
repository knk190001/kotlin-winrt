package Windows.Networking.Connectivity

import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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

@ABIMarker(IConnectivityInterval.ABI::class)
@Signature("{4faa3fff-6746-4824-a964-eed8e87f8709}")
@Guid("4faa3fff67464824a964eed8e87f8709")
@WinRTInterface("4faa3fff67464824a964eed8e87f8709")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectivityInterval.ByReference::class)
public interface IConnectivityInterval : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(1)
  public fun get_ConnectionDuration(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectivityInterval> {
    public override fun getValue() = ABI.makeIConnectivityInterval(pointer.getPointer(0))

    public fun setValue(value: IConnectivityInterval_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectivityInterval {
    public val __2068666719_Ptr: Pointer?

    public val _2068666719_VtblPtr: Pointer?
      get() = __2068666719_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _2068666719_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2068666719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionDuration(): TimeSpan? {
      val fnPtr = _2068666719_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2068666719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IConnectivityInterval_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2068666719_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectivityInterval, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4faa3fff67464824a964eed8e87f8709")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectivityInterval(ptr: Pointer?): WithDefault =
        IConnectivityInterval_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectivityInterval {
      val address = segment.toRawLongValue()
      return makeIConnectivityInterval(Pointer(address))
    }

    public override fun toNative(obj: IConnectivityInterval): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2068666719_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectivityInterval): Array<IConnectivityInterval?> =
        (elements as
        Array<IConnectivityInterval?>).castToImpl<IConnectivityInterval,IConnectivityInterval_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectivityInterval?> =
        arrayOfNulls<IConnectivityInterval_Impl>(size) as Array<IConnectivityInterval?>
  }
}
