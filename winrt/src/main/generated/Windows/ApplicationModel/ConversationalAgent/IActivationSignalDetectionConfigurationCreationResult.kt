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

@ABIMarker(IActivationSignalDetectionConfigurationCreationResult.ABI::class)
@Signature("{4c89bc1b-8d12-5e48-a71c-7f6bc1cd66e0}")
@Guid("4c89bc1b8d125e48a71c7f6bc1cd66e0")
@WinRTInterface("4c89bc1b8d125e48a71c7f6bc1cd66e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IActivationSignalDetectionConfigurationCreationResult.ByReference::class)
public interface IActivationSignalDetectionConfigurationCreationResult : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): ActivationSignalDetectionConfigurationCreationStatus?

  @InterfaceMethod(1)
  public fun get_Configuration(): ActivationSignalDetectionConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivationSignalDetectionConfigurationCreationResult> {
    public override fun getValue() =
        ABI.makeIActivationSignalDetectionConfigurationCreationResult(pointer.getPointer(0))

    public fun setValue(value: IActivationSignalDetectionConfigurationCreationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivationSignalDetectionConfigurationCreationResult {
    public val __247209337_Ptr: Pointer?

    public val _247209337_VtblPtr: Pointer?
      get() = __247209337_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): ActivationSignalDetectionConfigurationCreationStatus? {
      val fnPtr = _247209337_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectionConfigurationCreationStatus>()
      val hr = fn.invokeHR(arrayOf(__247209337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ActivationSignalDetectionConfigurationCreationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Configuration(): ActivationSignalDetectionConfiguration? {
      val fnPtr = _247209337_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectionConfiguration>()
      val hr = fn.invokeHR(arrayOf(__247209337_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivationSignalDetectionConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IActivationSignalDetectionConfigurationCreationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __247209337_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivationSignalDetectionConfigurationCreationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c89bc1b8d125e48a71c7f6bc1cd66e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivationSignalDetectionConfigurationCreationResult(ptr: Pointer?): WithDefault
        = IActivationSignalDetectionConfigurationCreationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IActivationSignalDetectionConfigurationCreationResult {
      val address = segment.toRawLongValue()
      return makeIActivationSignalDetectionConfigurationCreationResult(Pointer(address))
    }

    public override fun toNative(obj: IActivationSignalDetectionConfigurationCreationResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__247209337_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivationSignalDetectionConfigurationCreationResult):
        Array<IActivationSignalDetectionConfigurationCreationResult?> = (elements as
        Array<IActivationSignalDetectionConfigurationCreationResult?>).castToImpl<IActivationSignalDetectionConfigurationCreationResult,IActivationSignalDetectionConfigurationCreationResult_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IActivationSignalDetectionConfigurationCreationResult?> =
        arrayOfNulls<IActivationSignalDetectionConfigurationCreationResult_Impl>(size) as
        Array<IActivationSignalDetectionConfigurationCreationResult?>
  }
}
