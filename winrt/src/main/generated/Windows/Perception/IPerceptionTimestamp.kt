package Windows.Perception

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

@ABIMarker(IPerceptionTimestamp.ABI::class)
@Signature("{87c24804-a22e-4adb-ba26-d78ef639bcf4}")
@Guid("87c24804a22e4adbba26d78ef639bcf4")
@WinRTInterface("87c24804a22e4adbba26d78ef639bcf4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionTimestamp.ByReference::class)
public interface IPerceptionTimestamp : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetTime(): DateTime?

  @InterfaceMethod(1)
  public fun get_PredictionAmount(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionTimestamp> {
    public override fun getValue() = ABI.makeIPerceptionTimestamp(pointer.getPointer(0))

    public fun setValue(value: IPerceptionTimestamp_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionTimestamp {
    public val __1860102120_Ptr: Pointer?

    public val _1860102120_VtblPtr: Pointer?
      get() = __1860102120_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetTime(): DateTime? {
      val fnPtr = _1860102120_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1860102120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PredictionAmount(): TimeSpan? {
      val fnPtr = _1860102120_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1860102120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionTimestamp_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1860102120_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionTimestamp, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87c24804a22e4adbba26d78ef639bcf4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionTimestamp(ptr: Pointer?): WithDefault = IPerceptionTimestamp_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionTimestamp {
      val address = segment.toRawLongValue()
      return makeIPerceptionTimestamp(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionTimestamp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1860102120_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionTimestamp): Array<IPerceptionTimestamp?> =
        (elements as
        Array<IPerceptionTimestamp?>).castToImpl<IPerceptionTimestamp,IPerceptionTimestamp_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionTimestamp?> =
        arrayOfNulls<IPerceptionTimestamp_Impl>(size) as Array<IPerceptionTimestamp?>
  }
}
