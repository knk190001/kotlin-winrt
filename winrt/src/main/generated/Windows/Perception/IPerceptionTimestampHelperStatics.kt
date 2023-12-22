package Windows.Perception

import Windows.Foundation.DateTime
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

@ABIMarker(IPerceptionTimestampHelperStatics.ABI::class)
@Signature("{47a611d4-a9df-4edc-855d-f4d339d967ac}")
@Guid("47a611d4a9df4edc855df4d339d967ac")
@WinRTInterface("47a611d4a9df4edc855df4d339d967ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionTimestampHelperStatics.ByReference::class)
public interface IPerceptionTimestampHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromHistoricalTargetTime(targetTime: DateTime?): PerceptionTimestamp?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionTimestampHelperStatics> {
    public override fun getValue() =
        ABI.makeIPerceptionTimestampHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IPerceptionTimestampHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionTimestampHelperStatics {
    public val __2044188929_Ptr: Pointer?

    public val _2044188929_VtblPtr: Pointer?
      get() = __2044188929_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromHistoricalTargetTime(targetTime: DateTime?): PerceptionTimestamp? {
      val fnPtr = _2044188929_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionTimestamp>()
      val hr = fn.invokeHR(arrayOf(__2044188929_Ptr, marshalToNative(targetTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionTimestamp>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionTimestampHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2044188929_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionTimestampHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47a611d4a9df4edc855df4d339d967ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionTimestampHelperStatics(ptr: Pointer?): WithDefault =
        IPerceptionTimestampHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionTimestampHelperStatics {
      val address = segment.toRawLongValue()
      return makeIPerceptionTimestampHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionTimestampHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2044188929_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionTimestampHelperStatics):
        Array<IPerceptionTimestampHelperStatics?> = (elements as
        Array<IPerceptionTimestampHelperStatics?>).castToImpl<IPerceptionTimestampHelperStatics,IPerceptionTimestampHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionTimestampHelperStatics?> =
        arrayOfNulls<IPerceptionTimestampHelperStatics_Impl>(size) as
        Array<IPerceptionTimestampHelperStatics?>
  }
}
