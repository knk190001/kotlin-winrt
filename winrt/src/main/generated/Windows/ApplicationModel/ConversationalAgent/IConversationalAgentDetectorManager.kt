package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConversationalAgentDetectorManager.ABI::class)
@Signature("{de94fbb0-597a-5df8-8cfb-9dbb583ba3ff}")
@Guid("de94fbb0597a5df88cfb9dbb583ba3ff")
@WinRTInterface("de94fbb0597a5df88cfb9dbb583ba3ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentDetectorManager.ByReference::class)
public interface IConversationalAgentDetectorManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAllActivationSignalDetectors(): IVectorView<ActivationSignalDetector?>?

  @InterfaceMethod(1)
  public fun GetAllActivationSignalDetectorsAsync():
      IAsyncOperation<IVectorView<ActivationSignalDetector?>?>?

  @InterfaceMethod(2)
  public fun GetActivationSignalDetectors(kind: ActivationSignalDetectorKind?):
      IVectorView<ActivationSignalDetector?>?

  @InterfaceMethod(3)
  public fun GetActivationSignalDetectorsAsync(kind: ActivationSignalDetectorKind?):
      IAsyncOperation<IVectorView<ActivationSignalDetector?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentDetectorManager> {
    public override fun getValue() =
        ABI.makeIConversationalAgentDetectorManager(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentDetectorManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentDetectorManager {
    public val __819021652_Ptr: Pointer?

    public val _819021652_VtblPtr: Pointer?
      get() = __819021652_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAllActivationSignalDetectors(): IVectorView<ActivationSignalDetector?>? {
      val fnPtr = _819021652_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ActivationSignalDetector?>>()
      val hr = fn.invokeHR(arrayOf(__819021652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ActivationSignalDetector?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAllActivationSignalDetectorsAsync():
        IAsyncOperation<IVectorView<ActivationSignalDetector?>?>? {
      val fnPtr = _819021652_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ActivationSignalDetector?>?>>()
      val hr = fn.invokeHR(arrayOf(__819021652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ActivationSignalDetector?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetActivationSignalDetectors(kind: ActivationSignalDetectorKind?):
        IVectorView<ActivationSignalDetector?>? {
      val fnPtr = _819021652_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ActivationSignalDetector?>>()
      val hr = fn.invokeHR(arrayOf(__819021652_Ptr, marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ActivationSignalDetector?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetActivationSignalDetectorsAsync(kind: ActivationSignalDetectorKind?):
        IAsyncOperation<IVectorView<ActivationSignalDetector?>?>? {
      val fnPtr = _819021652_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ActivationSignalDetector?>?>>()
      val hr = fn.invokeHR(arrayOf(__819021652_Ptr, marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ActivationSignalDetector?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IConversationalAgentDetectorManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __819021652_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentDetectorManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de94fbb0597a5df88cfb9dbb583ba3ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentDetectorManager(ptr: Pointer?): WithDefault =
        IConversationalAgentDetectorManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConversationalAgentDetectorManager {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentDetectorManager(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentDetectorManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__819021652_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentDetectorManager):
        Array<IConversationalAgentDetectorManager?> = (elements as
        Array<IConversationalAgentDetectorManager?>).castToImpl<IConversationalAgentDetectorManager,IConversationalAgentDetectorManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentDetectorManager?> =
        arrayOfNulls<IConversationalAgentDetectorManager_Impl>(size) as
        Array<IConversationalAgentDetectorManager?>
  }
}
