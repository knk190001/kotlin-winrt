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

@ABIMarker(IMapRoute3.ABI::class)
@Signature("{858d1eae-f2ad-429f-bb37-cd21094ffc92}")
@Guid("858d1eaef2ad429fbb37cd21094ffc92")
@WinRTInterface("858d1eaef2ad429fbb37cd21094ffc92")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRoute3.ByReference::class)
public interface IMapRoute3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DurationWithoutTraffic(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_TrafficCongestion(): TrafficCongestion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapRoute3> {
    public override fun getValue() = ABI.makeIMapRoute3(pointer.getPointer(0))

    public fun setValue(value: IMapRoute3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRoute3 {
    public val __1501242343_Ptr: Pointer?

    public val _1501242343_VtblPtr: Pointer?
      get() = __1501242343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DurationWithoutTraffic(): TimeSpan? {
      val fnPtr = _1501242343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1501242343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TrafficCongestion(): TrafficCongestion? {
      val fnPtr = _1501242343_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TrafficCongestion>()
      val hr = fn.invokeHR(arrayOf(__1501242343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TrafficCongestion>(result.getValue())
      return resultValue
    }
  }

  public class IMapRoute3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1501242343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRoute3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("858d1eaef2ad429fbb37cd21094ffc92")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRoute3(ptr: Pointer?): WithDefault = IMapRoute3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRoute3 {
      val address = segment.toRawLongValue()
      return makeIMapRoute3(Pointer(address))
    }

    public override fun toNative(obj: IMapRoute3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1501242343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRoute3): Array<IMapRoute3?> = (elements as
        Array<IMapRoute3?>).castToImpl<IMapRoute3,IMapRoute3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRoute3?> = arrayOfNulls<IMapRoute3_Impl>(size)
        as Array<IMapRoute3?>
  }
}
