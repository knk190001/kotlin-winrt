package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(IDetectionConfigurationAvailabilityChangedEventArgs.ABI::class)
@Signature("{5129c9fb-4be8-5f14-af2b-88d62b1b4462}")
@Guid("5129c9fb4be85f14af2b88d62b1b4462")
@WinRTInterface("5129c9fb4be85f14af2b88d62b1b4462")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDetectionConfigurationAvailabilityChangedEventArgs.ByReference::class)
public interface IDetectionConfigurationAvailabilityChangedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Kind(): DetectionConfigurationAvailabilityChangeKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDetectionConfigurationAvailabilityChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIDetectionConfigurationAvailabilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDetectionConfigurationAvailabilityChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDetectionConfigurationAvailabilityChangedEventArgs {
    public val __1860853035_Ptr: Pointer?

    public val _1860853035_VtblPtr: Pointer?
      get() = __1860853035_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): DetectionConfigurationAvailabilityChangeKind? {
      val fnPtr = _1860853035_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DetectionConfigurationAvailabilityChangeKind>()
      val hr = fn.invokeHR(arrayOf(__1860853035_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<DetectionConfigurationAvailabilityChangeKind>(result.getValue())
      return resultValue
    }
  }

  public class IDetectionConfigurationAvailabilityChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1860853035_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDetectionConfigurationAvailabilityChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5129c9fb4be85f14af2b88d62b1b4462")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDetectionConfigurationAvailabilityChangedEventArgs(ptr: Pointer?): WithDefault =
        IDetectionConfigurationAvailabilityChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDetectionConfigurationAvailabilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDetectionConfigurationAvailabilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDetectionConfigurationAvailabilityChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1860853035_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDetectionConfigurationAvailabilityChangedEventArgs):
        Array<IDetectionConfigurationAvailabilityChangedEventArgs?> = (elements as
        Array<IDetectionConfigurationAvailabilityChangedEventArgs?>).castToImpl<IDetectionConfigurationAvailabilityChangedEventArgs,IDetectionConfigurationAvailabilityChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IDetectionConfigurationAvailabilityChangedEventArgs?> =
        arrayOfNulls<IDetectionConfigurationAvailabilityChangedEventArgs_Impl>(size) as
        Array<IDetectionConfigurationAvailabilityChangedEventArgs?>
  }
}
