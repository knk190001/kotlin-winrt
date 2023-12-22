package Windows.Services.Maps

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

@ABIMarker(IMapRouteLeg2.ABI::class)
@Signature("{02e2062d-c9c6-45b8-8e54-1a10b57a17e8}")
@Guid("02e2062dc9c645b88e541a10b57a17e8")
@WinRTInterface("02e2062dc9c645b88e541a10b57a17e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteLeg2.ByReference::class)
public interface IMapRouteLeg2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DurationWithoutTraffic(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_TrafficCongestion(): TrafficCongestion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapRouteLeg2>
      {
    public override fun getValue() = ABI.makeIMapRouteLeg2(pointer.getPointer(0))

    public fun setValue(value: IMapRouteLeg2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteLeg2 {
    public val __15341986_Ptr: Pointer?

    public val _15341986_VtblPtr: Pointer?
      get() = __15341986_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DurationWithoutTraffic(): TimeSpan? {
      val fnPtr = _15341986_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__15341986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TrafficCongestion(): TrafficCongestion? {
      val fnPtr = _15341986_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TrafficCongestion>()
      val hr = fn.invokeHR(arrayOf(__15341986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TrafficCongestion>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteLeg2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __15341986_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteLeg2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02e2062dc9c645b88e541a10b57a17e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteLeg2(ptr: Pointer?): WithDefault = IMapRouteLeg2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteLeg2 {
      val address = segment.toRawLongValue()
      return makeIMapRouteLeg2(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteLeg2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__15341986_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteLeg2): Array<IMapRouteLeg2?> = (elements as
        Array<IMapRouteLeg2?>).castToImpl<IMapRouteLeg2,IMapRouteLeg2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteLeg2?> =
        arrayOfNulls<IMapRouteLeg2_Impl>(size) as Array<IMapRouteLeg2?>
  }
}
