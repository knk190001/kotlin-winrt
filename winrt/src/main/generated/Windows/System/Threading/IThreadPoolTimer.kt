package Windows.System.Threading

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

@ABIMarker(IThreadPoolTimer.ABI::class)
@Signature("{594ebe78-55ea-4a88-a50d-3402ae1f9cf2}")
@Guid("594ebe7855ea4a88a50d3402ae1f9cf2")
@WinRTInterface("594ebe7855ea4a88a50d3402ae1f9cf2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThreadPoolTimer.ByReference::class)
public interface IThreadPoolTimer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Period(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_Delay(): TimeSpan?

  @InterfaceMethod(2)
  public fun Cancel(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThreadPoolTimer> {
    public override fun getValue() = ABI.makeIThreadPoolTimer(pointer.getPointer(0))

    public fun setValue(value: IThreadPoolTimer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThreadPoolTimer {
    public val __1155232038_Ptr: Pointer?

    public val _1155232038_VtblPtr: Pointer?
      get() = __1155232038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Period(): TimeSpan? {
      val fnPtr = _1155232038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1155232038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Delay(): TimeSpan? {
      val fnPtr = _1155232038_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1155232038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Cancel(): Unit {
      val fnPtr = _1155232038_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1155232038_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IThreadPoolTimer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1155232038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThreadPoolTimer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("594ebe7855ea4a88a50d3402ae1f9cf2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThreadPoolTimer(ptr: Pointer?): WithDefault = IThreadPoolTimer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThreadPoolTimer {
      val address = segment.toRawLongValue()
      return makeIThreadPoolTimer(Pointer(address))
    }

    public override fun toNative(obj: IThreadPoolTimer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1155232038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThreadPoolTimer): Array<IThreadPoolTimer?> = (elements as
        Array<IThreadPoolTimer?>).castToImpl<IThreadPoolTimer,IThreadPoolTimer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThreadPoolTimer?> =
        arrayOfNulls<IThreadPoolTimer_Impl>(size) as Array<IThreadPoolTimer?>
  }
}
