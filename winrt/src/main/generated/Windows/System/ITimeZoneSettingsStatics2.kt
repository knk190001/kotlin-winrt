package Windows.System

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ITimeZoneSettingsStatics2.ABI::class)
@Signature("{555c0db8-39a8-49fa-b4f6-a2c7fc2842ec}")
@Guid("555c0db839a849fab4f6a2c7fc2842ec")
@WinRTInterface("555c0db839a849fab4f6a2c7fc2842ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimeZoneSettingsStatics2.ByReference::class)
public interface ITimeZoneSettingsStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AutoUpdateTimeZoneAsync(timeout: TimeSpan?):
      IAsyncOperation<AutoUpdateTimeZoneStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimeZoneSettingsStatics2> {
    public override fun getValue() = ABI.makeITimeZoneSettingsStatics2(pointer.getPointer(0))

    public fun setValue(value: ITimeZoneSettingsStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimeZoneSettingsStatics2 {
    public val __1803125000_Ptr: Pointer?

    public val _1803125000_VtblPtr: Pointer?
      get() = __1803125000_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AutoUpdateTimeZoneAsync(timeout: TimeSpan?):
        IAsyncOperation<AutoUpdateTimeZoneStatus?>? {
      val fnPtr = _1803125000_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AutoUpdateTimeZoneStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1803125000_Ptr, marshalToNative(timeout), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AutoUpdateTimeZoneStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ITimeZoneSettingsStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1803125000_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimeZoneSettingsStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("555c0db839a849fab4f6a2c7fc2842ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimeZoneSettingsStatics2(ptr: Pointer?): WithDefault =
        ITimeZoneSettingsStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimeZoneSettingsStatics2 {
      val address = segment.toRawLongValue()
      return makeITimeZoneSettingsStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITimeZoneSettingsStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1803125000_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimeZoneSettingsStatics2):
        Array<ITimeZoneSettingsStatics2?> = (elements as
        Array<ITimeZoneSettingsStatics2?>).castToImpl<ITimeZoneSettingsStatics2,ITimeZoneSettingsStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimeZoneSettingsStatics2?> =
        arrayOfNulls<ITimeZoneSettingsStatics2_Impl>(size) as Array<ITimeZoneSettingsStatics2?>
  }
}
