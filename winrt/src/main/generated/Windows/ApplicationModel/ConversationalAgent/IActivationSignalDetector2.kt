package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.Collections.IVector
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IActivationSignalDetector2.ABI::class)
@Signature("{c7e2490a-baa5-59d2-85d1-ba42f7cf78c9}")
@Guid("c7e2490abaa559d285d1ba42f7cf78c9")
@WinRTInterface("c7e2490abaa559d285d1ba42f7cf78c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivationSignalDetector2.ByReference::class)
public interface IActivationSignalDetector2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAvailableModelIdsForSignalIdAsync(signalId: String?):
      IAsyncOperation<IVector<String?>?>?

  @InterfaceMethod(1)
  public fun GetAvailableModelIdsForSignalId(signalId: String?): IVector<String?>?

  @InterfaceMethod(2)
  public fun CreateConfigurationWithResultAsync(
    signalId: String?,
    modelId: String?,
    displayName: String?
  ): IAsyncOperation<ActivationSignalDetectionConfigurationCreationResult?>?

  @InterfaceMethod(3)
  public fun CreateConfigurationWithResult(
    signalId: String?,
    modelId: String?,
    displayName: String?
  ): ActivationSignalDetectionConfigurationCreationResult?

  @InterfaceMethod(4)
  public fun RemoveConfigurationWithResultAsync(signalId: String?, modelId: String?):
      IAsyncOperation<ActivationSignalDetectionConfigurationRemovalResult?>?

  @InterfaceMethod(5)
  public fun RemoveConfigurationWithResult(signalId: String?, modelId: String?):
      ActivationSignalDetectionConfigurationRemovalResult?

  @InterfaceMethod(6)
  public fun get_DetectorId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivationSignalDetector2> {
    public override fun getValue() = ABI.makeIActivationSignalDetector2(pointer.getPointer(0))

    public fun setValue(value: IActivationSignalDetector2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivationSignalDetector2 {
    public val __819723154_Ptr: Pointer?

    public val _819723154_VtblPtr: Pointer?
      get() = __819723154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAvailableModelIdsForSignalIdAsync(signalId: String?):
        IAsyncOperation<IVector<String?>?>? {
      val fnPtr = _819723154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__819723154_Ptr, marshalToNative(signalId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVector<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAvailableModelIdsForSignalId(signalId: String?): IVector<String?>? {
      val fnPtr = _819723154_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__819723154_Ptr, marshalToNative(signalId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateConfigurationWithResultAsync(
      signalId: String?,
      modelId: String?,
      displayName: String?
    ): IAsyncOperation<ActivationSignalDetectionConfigurationCreationResult?>? {
      val fnPtr = _819723154_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<ActivationSignalDetectionConfigurationCreationResult?>>()
      val hr = fn.invokeHR(arrayOf(__819723154_Ptr, marshalToNative(signalId),
          marshalToNative(modelId), marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ActivationSignalDetectionConfigurationCreationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateConfigurationWithResult(
      signalId: String?,
      modelId: String?,
      displayName: String?
    ): ActivationSignalDetectionConfigurationCreationResult? {
      val fnPtr = _819723154_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectionConfigurationCreationResult>()
      val hr = fn.invokeHR(arrayOf(__819723154_Ptr, marshalToNative(signalId),
          marshalToNative(modelId), marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ActivationSignalDetectionConfigurationCreationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RemoveConfigurationWithResultAsync(signalId: String?, modelId: String?):
        IAsyncOperation<ActivationSignalDetectionConfigurationRemovalResult?>? {
      val fnPtr = _819723154_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<ActivationSignalDetectionConfigurationRemovalResult?>>()
      val hr = fn.invokeHR(arrayOf(__819723154_Ptr, marshalToNative(signalId),
          marshalToNative(modelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ActivationSignalDetectionConfigurationRemovalResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RemoveConfigurationWithResult(signalId: String?, modelId: String?):
        ActivationSignalDetectionConfigurationRemovalResult? {
      val fnPtr = _819723154_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationSignalDetectionConfigurationRemovalResult>()
      val hr = fn.invokeHR(arrayOf(__819723154_Ptr, marshalToNative(signalId),
          marshalToNative(modelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ActivationSignalDetectionConfigurationRemovalResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DetectorId(): String? {
      val fnPtr = _819723154_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__819723154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IActivationSignalDetector2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __819723154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivationSignalDetector2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7e2490abaa559d285d1ba42f7cf78c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivationSignalDetector2(ptr: Pointer?): WithDefault =
        IActivationSignalDetector2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivationSignalDetector2 {
      val address = segment.toRawLongValue()
      return makeIActivationSignalDetector2(Pointer(address))
    }

    public override fun toNative(obj: IActivationSignalDetector2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__819723154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivationSignalDetector2):
        Array<IActivationSignalDetector2?> = (elements as
        Array<IActivationSignalDetector2?>).castToImpl<IActivationSignalDetector2,IActivationSignalDetector2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivationSignalDetector2?> =
        arrayOfNulls<IActivationSignalDetector2_Impl>(size) as Array<IActivationSignalDetector2?>
  }
}
