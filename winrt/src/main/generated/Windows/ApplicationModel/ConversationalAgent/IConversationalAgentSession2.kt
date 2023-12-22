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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConversationalAgentSession2.ABI::class)
@Signature("{a7a9fbf9-ac78-57ff-9596-acc7a1c9a607}")
@Guid("a7a9fbf9ac7857ff9596acc7a1c9a607")
@WinRTInterface("a7a9fbf9ac7857ff9596acc7a1c9a607")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConversationalAgentSession2.ByReference::class)
public interface IConversationalAgentSession2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestActivationAsync(activationKind: ConversationalAgentActivationKind?):
      IAsyncOperation<ConversationalAgentActivationResult?>?

  @InterfaceMethod(1)
  public fun RequestActivation(activationKind: ConversationalAgentActivationKind?):
      ConversationalAgentActivationResult?

  @InterfaceMethod(2)
  public fun SetSupportLockScreenActivationAsync(lockScreenActivationSupported: Boolean):
      IAsyncAction?

  @InterfaceMethod(3)
  public fun SetSupportLockScreenActivation(lockScreenActivationSupported: Boolean): Unit

  @InterfaceMethod(4)
  public fun GetMissingPrerequisites():
      IVectorView<ConversationalAgentVoiceActivationPrerequisiteKind?>?

  @InterfaceMethod(5)
  public fun GetMissingPrerequisitesAsync():
      IAsyncOperation<IVectorView<ConversationalAgentVoiceActivationPrerequisiteKind?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConversationalAgentSession2> {
    public override fun getValue() = ABI.makeIConversationalAgentSession2(pointer.getPointer(0))

    public fun setValue(value: IConversationalAgentSession2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConversationalAgentSession2 {
    public val __768271273_Ptr: Pointer?

    public val _768271273_VtblPtr: Pointer?
      get() = __768271273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestActivationAsync(activationKind: ConversationalAgentActivationKind?):
        IAsyncOperation<ConversationalAgentActivationResult?>? {
      val fnPtr = _768271273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ConversationalAgentActivationResult?>>()
      val hr = fn.invokeHR(arrayOf(__768271273_Ptr, marshalToNative(activationKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ConversationalAgentActivationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestActivation(activationKind: ConversationalAgentActivationKind?):
        ConversationalAgentActivationResult? {
      val fnPtr = _768271273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConversationalAgentActivationResult>()
      val hr = fn.invokeHR(arrayOf(__768271273_Ptr, marshalToNative(activationKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConversationalAgentActivationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetSupportLockScreenActivationAsync(lockScreenActivationSupported: Boolean):
        IAsyncAction? {
      val fnPtr = _768271273_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__768271273_Ptr, lockScreenActivationSupported, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetSupportLockScreenActivation(lockScreenActivationSupported: Boolean):
        Unit {
      val fnPtr = _768271273_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__768271273_Ptr, lockScreenActivationSupported,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetMissingPrerequisites():
        IVectorView<ConversationalAgentVoiceActivationPrerequisiteKind?>? {
      val fnPtr = _768271273_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IVectorView<ConversationalAgentVoiceActivationPrerequisiteKind?>>()
      val hr = fn.invokeHR(arrayOf(__768271273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<ConversationalAgentVoiceActivationPrerequisiteKind?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetMissingPrerequisitesAsync():
        IAsyncOperation<IVectorView<ConversationalAgentVoiceActivationPrerequisiteKind?>?>? {
      val fnPtr = _768271273_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IVectorView<ConversationalAgentVoiceActivationPrerequisiteKind?>?>>()
      val hr = fn.invokeHR(arrayOf(__768271273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ConversationalAgentVoiceActivationPrerequisiteKind?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IConversationalAgentSession2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __768271273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConversationalAgentSession2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7a9fbf9ac7857ff9596acc7a1c9a607")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConversationalAgentSession2(ptr: Pointer?): WithDefault =
        IConversationalAgentSession2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConversationalAgentSession2 {
      val address = segment.toRawLongValue()
      return makeIConversationalAgentSession2(Pointer(address))
    }

    public override fun toNative(obj: IConversationalAgentSession2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__768271273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConversationalAgentSession2):
        Array<IConversationalAgentSession2?> = (elements as
        Array<IConversationalAgentSession2?>).castToImpl<IConversationalAgentSession2,IConversationalAgentSession2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConversationalAgentSession2?> =
        arrayOfNulls<IConversationalAgentSession2_Impl>(size) as
        Array<IConversationalAgentSession2?>
  }
}
