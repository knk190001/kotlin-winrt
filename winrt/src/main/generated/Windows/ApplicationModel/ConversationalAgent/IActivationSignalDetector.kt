package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IActivationSignalDetector.ABI::class)
@Signature("{b5bf345f-a4d0-5b2b-8e65-b3c55ee756ff}")
@Guid("b5bf345fa4d05b2b8e65b3c55ee756ff")
@WinRTInterface("b5bf345fa4d05b2b8e65b3c55ee756ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivationSignalDetector.ByReference::class)
public interface IActivationSignalDetector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProviderId(): String?

  @InterfaceMethod(1)
  public fun get_Kind(): ActivationSignalDetectorKind?

  @InterfaceMethod(2)
  public fun get_CanCreateConfigurations(): Boolean

  @InterfaceMethod(3)
  public fun get_SupportedModelDataTypes(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun get_SupportedTrainingDataFormats():
      IVectorView<ActivationSignalDetectionTrainingDataFormat?>?

  @InterfaceMethod(5)
  public fun get_SupportedPowerStates(): IVectorView<ActivationSignalDetectorPowerState?>?

  @InterfaceMethod(6)
  public fun GetSupportedModelIdsForSignalId(signalId: String?): IVectorView<String?>?

  @InterfaceMethod(7)
  public fun GetSupportedModelIdsForSignalIdAsync(signalId: String?):
      IAsyncOperation<IVectorView<String?>?>?

  @InterfaceMethod(8)
  public fun CreateConfiguration(
    signalId: String?,
    modelId: String?,
    displayName: String?
  ): Unit

  @InterfaceMethod(9)
  public fun CreateConfigurationAsync(
    signalId: String?,
    modelId: String?,
    displayName: String?
  ): IAsyncAction?

  @InterfaceMethod(10)
  public fun GetConfigurations(): IVectorView<ActivationSignalDetectionConfiguration?>?

  @InterfaceMethod(11)
  public fun GetConfigurationsAsync():
      IAsyncOperation<IVectorView<ActivationSignalDetectionConfiguration?>?>?

  @InterfaceMethod(12)
  public fun GetConfiguration(signalId: String?, modelId: String?):
      ActivationSignalDetectionConfiguration?

  @InterfaceMethod(13)
  public fun GetConfigurationAsync(signalId: String?, modelId: String?):
      IAsyncOperation<ActivationSignalDetectionConfiguration?>?

  @InterfaceMethod(14)
  public fun RemoveConfiguration(signalId: String?, modelId: String?): Unit

  @InterfaceMethod(15)
  public fun RemoveConfigurationAsync(signalId: String?, modelId: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivationSignalDetector> {
    public override fun getValue() = ABI.makeIActivationSignalDetector(pointer.getPointer(0))

    public fun setValue(value: IActivationSignalDetector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivationSignalDetector {
    public val __804841312_Ptr: Pointer?

    public val _804841312_VtblPtr: Pointer?
      get() = __804841312_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProviderId(): String? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): ActivationSignalDetectorKind? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectorKind>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivationSignalDetectorKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CanCreateConfigurations(): Boolean {
      val fnPtr = _804841312_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SupportedModelDataTypes(): IVectorView<String?>? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SupportedTrainingDataFormats():
        IVectorView<ActivationSignalDetectionTrainingDataFormat?>? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ActivationSignalDetectionTrainingDataFormat?>>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<ActivationSignalDetectionTrainingDataFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SupportedPowerStates():
        IVectorView<ActivationSignalDetectorPowerState?>? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ActivationSignalDetectorPowerState?>>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<ActivationSignalDetectorPowerState?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetSupportedModelIdsForSignalId(signalId: String?): IVectorView<String?>? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr, marshalToNative(signalId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetSupportedModelIdsForSignalIdAsync(signalId: String?):
        IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr, marshalToNative(signalId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateConfiguration(
      signalId: String?,
      modelId: String?,
      displayName: String?
    ): Unit {
      val fnPtr = _804841312_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr, marshalToNative(signalId),
          marshalToNative(modelId), marshalToNative(displayName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun CreateConfigurationAsync(
      signalId: String?,
      modelId: String?,
      displayName: String?
    ): IAsyncAction? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr, marshalToNative(signalId),
          marshalToNative(modelId), marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetConfigurations(): IVectorView<ActivationSignalDetectionConfiguration?>? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ActivationSignalDetectionConfiguration?>>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<ActivationSignalDetectionConfiguration?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetConfigurationsAsync():
        IAsyncOperation<IVectorView<ActivationSignalDetectionConfiguration?>?>? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IVectorView<ActivationSignalDetectionConfiguration?>?>>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ActivationSignalDetectionConfiguration?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetConfiguration(signalId: String?, modelId: String?):
        ActivationSignalDetectionConfiguration? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectionConfiguration>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr, marshalToNative(signalId),
          marshalToNative(modelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivationSignalDetectionConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetConfigurationAsync(signalId: String?, modelId: String?):
        IAsyncOperation<ActivationSignalDetectionConfiguration?>? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ActivationSignalDetectionConfiguration?>>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr, marshalToNative(signalId),
          marshalToNative(modelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ActivationSignalDetectionConfiguration?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun RemoveConfiguration(signalId: String?, modelId: String?): Unit {
      val fnPtr = _804841312_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr, marshalToNative(signalId),
          marshalToNative(modelId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun RemoveConfigurationAsync(signalId: String?, modelId: String?):
        IAsyncAction? {
      val fnPtr = _804841312_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__804841312_Ptr, marshalToNative(signalId),
          marshalToNative(modelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IActivationSignalDetector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __804841312_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivationSignalDetector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5bf345fa4d05b2b8e65b3c55ee756ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivationSignalDetector(ptr: Pointer?): WithDefault =
        IActivationSignalDetector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivationSignalDetector {
      val address = segment.toRawLongValue()
      return makeIActivationSignalDetector(Pointer(address))
    }

    public override fun toNative(obj: IActivationSignalDetector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__804841312_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivationSignalDetector):
        Array<IActivationSignalDetector?> = (elements as
        Array<IActivationSignalDetector?>).castToImpl<IActivationSignalDetector,IActivationSignalDetector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivationSignalDetector?> =
        arrayOfNulls<IActivationSignalDetector_Impl>(size) as Array<IActivationSignalDetector?>
  }
}
