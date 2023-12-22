package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IInputStream
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IActivationSignalDetectionConfiguration2.ABI::class)
@Signature("{71d9b022-562c-57ce-a78b-8b4ff0145bab}")
@Guid("71d9b022562c57cea78b8b4ff0145bab")
@WinRTInterface("71d9b022562c57cea78b8b4ff0145bab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivationSignalDetectionConfiguration2.ByReference::class)
public interface IActivationSignalDetectionConfiguration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetModelDataWithResult(dataType: String?, `data`: IInputStream?):
      ActivationSignalDetectionConfigurationSetModelDataResult?

  @InterfaceMethod(1)
  public fun SetModelDataWithResultAsync(dataType: String?, `data`: IInputStream?):
      IAsyncOperation<ActivationSignalDetectionConfigurationSetModelDataResult?>?

  @InterfaceMethod(2)
  public fun SetEnabledWithResultAsync(value: Boolean):
      IAsyncOperation<ActivationSignalDetectionConfigurationStateChangeResult?>?

  @InterfaceMethod(3)
  public fun SetEnabledWithResult(value: Boolean):
      ActivationSignalDetectionConfigurationStateChangeResult?

  @InterfaceMethod(4)
  public fun get_TrainingStepCompletionMaxAllowedTime(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivationSignalDetectionConfiguration2> {
    public override fun getValue() =
        ABI.makeIActivationSignalDetectionConfiguration2(pointer.getPointer(0))

    public fun setValue(value: IActivationSignalDetectionConfiguration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivationSignalDetectionConfiguration2 {
    public val __1272355897_Ptr: Pointer?

    public val _1272355897_VtblPtr: Pointer?
      get() = __1272355897_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetModelDataWithResult(dataType: String?, `data`: IInputStream?):
        ActivationSignalDetectionConfigurationSetModelDataResult? {
      val fnPtr = _1272355897_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectionConfigurationSetModelDataResult>()
      val hr = fn.invokeHR(arrayOf(__1272355897_Ptr, marshalToNative(dataType),
          marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ActivationSignalDetectionConfigurationSetModelDataResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetModelDataWithResultAsync(dataType: String?, `data`: IInputStream?):
        IAsyncOperation<ActivationSignalDetectionConfigurationSetModelDataResult?>? {
      val fnPtr = _1272355897_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<ActivationSignalDetectionConfigurationSetModelDataResult?>>()
      val hr = fn.invokeHR(arrayOf(__1272355897_Ptr, marshalToNative(dataType),
          marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ActivationSignalDetectionConfigurationSetModelDataResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetEnabledWithResultAsync(value: Boolean):
        IAsyncOperation<ActivationSignalDetectionConfigurationStateChangeResult?>? {
      val fnPtr = _1272355897_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<ActivationSignalDetectionConfigurationStateChangeResult?>>()
      val hr = fn.invokeHR(arrayOf(__1272355897_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ActivationSignalDetectionConfigurationStateChangeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetEnabledWithResult(value: Boolean):
        ActivationSignalDetectionConfigurationStateChangeResult? {
      val fnPtr = _1272355897_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectionConfigurationStateChangeResult>()
      val hr = fn.invokeHR(arrayOf(__1272355897_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ActivationSignalDetectionConfigurationStateChangeResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TrainingStepCompletionMaxAllowedTime(): WinDef.UINT {
      val fnPtr = _1272355897_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1272355897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IActivationSignalDetectionConfiguration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1272355897_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivationSignalDetectionConfiguration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71d9b022562c57cea78b8b4ff0145bab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivationSignalDetectionConfiguration2(ptr: Pointer?): WithDefault =
        IActivationSignalDetectionConfiguration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IActivationSignalDetectionConfiguration2 {
      val address = segment.toRawLongValue()
      return makeIActivationSignalDetectionConfiguration2(Pointer(address))
    }

    public override fun toNative(obj: IActivationSignalDetectionConfiguration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1272355897_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivationSignalDetectionConfiguration2):
        Array<IActivationSignalDetectionConfiguration2?> = (elements as
        Array<IActivationSignalDetectionConfiguration2?>).castToImpl<IActivationSignalDetectionConfiguration2,IActivationSignalDetectionConfiguration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivationSignalDetectionConfiguration2?> =
        arrayOfNulls<IActivationSignalDetectionConfiguration2_Impl>(size) as
        Array<IActivationSignalDetectionConfiguration2?>
  }
}
