package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IActivationSignalDetectionConfiguration.ABI::class)
@Signature("{40d8be16-5217-581c-9ab2-ce9b2f2e8e00}")
@Guid("40d8be165217581c9ab2ce9b2f2e8e00")
@WinRTInterface("40d8be165217581c9ab2ce9b2f2e8e00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivationSignalDetectionConfiguration.ByReference::class)
public interface IActivationSignalDetectionConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SignalId(): String?

  @InterfaceMethod(1)
  public fun get_ModelId(): String?

  @InterfaceMethod(2)
  public fun get_DisplayName(): String?

  @InterfaceMethod(3)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(4)
  public fun SetEnabled(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun SetEnabledAsync(value: Boolean): IAsyncAction?

  @InterfaceMethod(6)
  public fun get_AvailabilityInfo(): DetectionConfigurationAvailabilityInfo?

  @InterfaceMethod(7)
  public
      fun add_AvailabilityChanged(handler: TypedEventHandler<ActivationSignalDetectionConfiguration?,
      DetectionConfigurationAvailabilityChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_AvailabilityChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun SetModelData(dataType: String?, `data`: IInputStream?): Unit

  @InterfaceMethod(10)
  public fun SetModelDataAsync(dataType: String?, `data`: IInputStream?): IAsyncAction?

  @InterfaceMethod(11)
  public fun GetModelDataType(): String?

  @InterfaceMethod(12)
  public fun GetModelDataTypeAsync(): IAsyncOperation<String?>?

  @InterfaceMethod(13)
  public fun GetModelData(): IInputStream?

  @InterfaceMethod(14)
  public fun GetModelDataAsync(): IAsyncOperation<IInputStream?>?

  @InterfaceMethod(15)
  public fun ClearModelData(): Unit

  @InterfaceMethod(16)
  public fun ClearModelDataAsync(): IAsyncAction?

  @InterfaceMethod(17)
  public fun get_TrainingStepsCompleted(): WinDef.UINT

  @InterfaceMethod(18)
  public fun get_TrainingStepsRemaining(): WinDef.UINT

  @InterfaceMethod(19)
  public fun get_TrainingDataFormat(): ActivationSignalDetectionTrainingDataFormat?

  @InterfaceMethod(20)
  public fun ApplyTrainingData(trainingDataFormat: ActivationSignalDetectionTrainingDataFormat?,
      trainingData: IInputStream?): DetectionConfigurationTrainingStatus?

  @InterfaceMethod(21)
  public
      fun ApplyTrainingDataAsync(trainingDataFormat: ActivationSignalDetectionTrainingDataFormat?,
      trainingData: IInputStream?): IAsyncOperation<DetectionConfigurationTrainingStatus?>?

  @InterfaceMethod(22)
  public fun ClearTrainingData(): Unit

  @InterfaceMethod(23)
  public fun ClearTrainingDataAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivationSignalDetectionConfiguration> {
    public override fun getValue() =
        ABI.makeIActivationSignalDetectionConfiguration(pointer.getPointer(0))

    public fun setValue(value: IActivationSignalDetectionConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivationSignalDetectionConfiguration {
    public val __872327733_Ptr: Pointer?

    public val _872327733_VtblPtr: Pointer?
      get() = __872327733_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SignalId(): String? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ModelId(): String? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DisplayName(): String? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _872327733_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun SetEnabled(value: Boolean): Unit {
      val fnPtr = _872327733_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetEnabledAsync(value: Boolean): IAsyncAction? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AvailabilityInfo(): DetectionConfigurationAvailabilityInfo? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DetectionConfigurationAvailabilityInfo>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DetectionConfigurationAvailabilityInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun add_AvailabilityChanged(handler: TypedEventHandler<ActivationSignalDetectionConfiguration?,
        DetectionConfigurationAvailabilityChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_AvailabilityChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _872327733_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetModelData(dataType: String?, `data`: IInputStream?): Unit {
      val fnPtr = _872327733_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, marshalToNative(dataType),
          marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetModelDataAsync(dataType: String?, `data`: IInputStream?): IAsyncAction? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, marshalToNative(dataType),
          marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetModelDataType(): String? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetModelDataTypeAsync(): IAsyncOperation<String?>? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetModelData(): IInputStream? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetModelDataAsync(): IAsyncOperation<IInputStream?>? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IInputStream?>>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IInputStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun ClearModelData(): Unit {
      val fnPtr = _872327733_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun ClearModelDataAsync(): IAsyncAction? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_TrainingStepsCompleted(): WinDef.UINT {
      val fnPtr = _872327733_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_TrainingStepsRemaining(): WinDef.UINT {
      val fnPtr = _872327733_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_TrainingDataFormat(): ActivationSignalDetectionTrainingDataFormat? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectionTrainingDataFormat>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ActivationSignalDetectionTrainingDataFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override
        fun ApplyTrainingData(trainingDataFormat: ActivationSignalDetectionTrainingDataFormat?,
        trainingData: IInputStream?): DetectionConfigurationTrainingStatus? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DetectionConfigurationTrainingStatus>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, marshalToNative(trainingDataFormat),
          marshalToNative(trainingData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DetectionConfigurationTrainingStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override
        fun ApplyTrainingDataAsync(trainingDataFormat: ActivationSignalDetectionTrainingDataFormat?,
        trainingData: IInputStream?): IAsyncOperation<DetectionConfigurationTrainingStatus?>? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DetectionConfigurationTrainingStatus?>>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, marshalToNative(trainingDataFormat),
          marshalToNative(trainingData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DetectionConfigurationTrainingStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun ClearTrainingData(): Unit {
      val fnPtr = _872327733_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun ClearTrainingDataAsync(): IAsyncAction? {
      val fnPtr = _872327733_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__872327733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IActivationSignalDetectionConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __872327733_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivationSignalDetectionConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40d8be165217581c9ab2ce9b2f2e8e00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivationSignalDetectionConfiguration(ptr: Pointer?): WithDefault =
        IActivationSignalDetectionConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IActivationSignalDetectionConfiguration {
      val address = segment.toRawLongValue()
      return makeIActivationSignalDetectionConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IActivationSignalDetectionConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__872327733_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivationSignalDetectionConfiguration):
        Array<IActivationSignalDetectionConfiguration?> = (elements as
        Array<IActivationSignalDetectionConfiguration?>).castToImpl<IActivationSignalDetectionConfiguration,IActivationSignalDetectionConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivationSignalDetectionConfiguration?> =
        arrayOfNulls<IActivationSignalDetectionConfiguration_Impl>(size) as
        Array<IActivationSignalDetectionConfiguration?>
  }
}
