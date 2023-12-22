package Windows.Perception

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

@ABIMarker(IPerceptionTimestampHelperStatics2.ABI::class)
@Signature("{73d1a7fe-3fb9-4571-87d4-3c920a5e86eb}")
@Guid("73d1a7fe3fb9457187d43c920a5e86eb")
@WinRTInterface("73d1a7fe3fb9457187d43c920a5e86eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionTimestampHelperStatics2.ByReference::class)
public interface IPerceptionTimestampHelperStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromSystemRelativeTargetTime(targetTime: TimeSpan?): PerceptionTimestamp?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionTimestampHelperStatics2> {
    public override fun getValue() =
        ABI.makeIPerceptionTimestampHelperStatics2(pointer.getPointer(0))

    public fun setValue(value: IPerceptionTimestampHelperStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionTimestampHelperStatics2 {
    public val __1054652691_Ptr: Pointer?

    public val _1054652691_VtblPtr: Pointer?
      get() = __1054652691_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromSystemRelativeTargetTime(targetTime: TimeSpan?): PerceptionTimestamp? {
      val fnPtr = _1054652691_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionTimestamp>()
      val hr = fn.invokeHR(arrayOf(__1054652691_Ptr, marshalToNative(targetTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionTimestamp>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionTimestampHelperStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1054652691_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionTimestampHelperStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73d1a7fe3fb9457187d43c920a5e86eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionTimestampHelperStatics2(ptr: Pointer?): WithDefault =
        IPerceptionTimestampHelperStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionTimestampHelperStatics2 {
      val address = segment.toRawLongValue()
      return makeIPerceptionTimestampHelperStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionTimestampHelperStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1054652691_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionTimestampHelperStatics2):
        Array<IPerceptionTimestampHelperStatics2?> = (elements as
        Array<IPerceptionTimestampHelperStatics2?>).castToImpl<IPerceptionTimestampHelperStatics2,IPerceptionTimestampHelperStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionTimestampHelperStatics2?> =
        arrayOfNulls<IPerceptionTimestampHelperStatics2_Impl>(size) as
        Array<IPerceptionTimestampHelperStatics2?>
  }
}
