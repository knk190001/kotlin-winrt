package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IDetectionConfigurationAvailabilityInfo2.ABI::class)
@Signature("{30e06433-38b3-5c4b-84c3-62b6e685b2ff}")
@Guid("30e0643338b35c4b84c362b6e685b2ff")
@WinRTInterface("30e0643338b35c4b84c362b6e685b2ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDetectionConfigurationAvailabilityInfo2.ByReference::class)
public interface IDetectionConfigurationAvailabilityInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UnavailableSystemResources(): IVectorView<SignalDetectorResourceKind?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDetectionConfigurationAvailabilityInfo2> {
    public override fun getValue() =
        ABI.makeIDetectionConfigurationAvailabilityInfo2(pointer.getPointer(0))

    public fun setValue(value: IDetectionConfigurationAvailabilityInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDetectionConfigurationAvailabilityInfo2 {
    public val __407898276_Ptr: Pointer?

    public val _407898276_VtblPtr: Pointer?
      get() = __407898276_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UnavailableSystemResources():
        IVectorView<SignalDetectorResourceKind?>? {
      val fnPtr = _407898276_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SignalDetectorResourceKind?>>()
      val hr = fn.invokeHR(arrayOf(__407898276_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SignalDetectorResourceKind?>>(result.getValue())
      return resultValue
    }
  }

  public class IDetectionConfigurationAvailabilityInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __407898276_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDetectionConfigurationAvailabilityInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30e0643338b35c4b84c362b6e685b2ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDetectionConfigurationAvailabilityInfo2(ptr: Pointer?): WithDefault =
        IDetectionConfigurationAvailabilityInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDetectionConfigurationAvailabilityInfo2 {
      val address = segment.toRawLongValue()
      return makeIDetectionConfigurationAvailabilityInfo2(Pointer(address))
    }

    public override fun toNative(obj: IDetectionConfigurationAvailabilityInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__407898276_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDetectionConfigurationAvailabilityInfo2):
        Array<IDetectionConfigurationAvailabilityInfo2?> = (elements as
        Array<IDetectionConfigurationAvailabilityInfo2?>).castToImpl<IDetectionConfigurationAvailabilityInfo2,IDetectionConfigurationAvailabilityInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDetectionConfigurationAvailabilityInfo2?> =
        arrayOfNulls<IDetectionConfigurationAvailabilityInfo2_Impl>(size) as
        Array<IDetectionConfigurationAvailabilityInfo2?>
  }
}
