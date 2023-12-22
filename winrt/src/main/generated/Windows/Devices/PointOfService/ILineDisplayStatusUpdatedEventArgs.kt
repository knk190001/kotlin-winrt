package Windows.Devices.PointOfService

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

@ABIMarker(ILineDisplayStatusUpdatedEventArgs.ABI::class)
@Signature("{ddd57c1a-86fb-4eba-93d1-6f5eda52b752}")
@Guid("ddd57c1a86fb4eba93d16f5eda52b752")
@WinRTInterface("ddd57c1a86fb4eba93d16f5eda52b752")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayStatusUpdatedEventArgs.ByReference::class)
public interface ILineDisplayStatusUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): LineDisplayPowerStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayStatusUpdatedEventArgs> {
    public override fun getValue() =
        ABI.makeILineDisplayStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayStatusUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayStatusUpdatedEventArgs {
    public val __2022097731_Ptr: Pointer?

    public val _2022097731_VtblPtr: Pointer?
      get() = __2022097731_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): LineDisplayPowerStatus? {
      val fnPtr = _2022097731_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayPowerStatus>()
      val hr = fn.invokeHR(arrayOf(__2022097731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayPowerStatus>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayStatusUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2022097731_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayStatusUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddd57c1a86fb4eba93d16f5eda52b752")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayStatusUpdatedEventArgs(ptr: Pointer?): WithDefault =
        ILineDisplayStatusUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeILineDisplayStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2022097731_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayStatusUpdatedEventArgs):
        Array<ILineDisplayStatusUpdatedEventArgs?> = (elements as
        Array<ILineDisplayStatusUpdatedEventArgs?>).castToImpl<ILineDisplayStatusUpdatedEventArgs,ILineDisplayStatusUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayStatusUpdatedEventArgs?> =
        arrayOfNulls<ILineDisplayStatusUpdatedEventArgs_Impl>(size) as
        Array<ILineDisplayStatusUpdatedEventArgs?>
  }
}
