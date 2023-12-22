package Windows.Security.Authentication.Identity.Provider

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISecondaryAuthenticationFactorAuthenticationStatics.ABI::class)
@Signature("{3f582656-28f8-4e0f-ae8c-5898b9ae2469}")
@Guid("3f58265628f84e0fae8c5898b9ae2469")
@WinRTInterface("3f58265628f84e0fae8c5898b9ae2469")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryAuthenticationFactorAuthenticationStatics.ByReference::class)
public interface ISecondaryAuthenticationFactorAuthenticationStatics : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun ShowNotificationMessageAsync(deviceName: String?,
      message: SecondaryAuthenticationFactorAuthenticationMessage?): IAsyncAction?

  @InterfaceMethod(1)
  public fun StartAuthenticationAsync(deviceId: String?, serviceAuthenticationNonce: IBuffer?):
      IAsyncOperation<SecondaryAuthenticationFactorAuthenticationResult?>?

  @InterfaceMethod(2)
  public
      fun add_AuthenticationStageChanged(handler: EventHandler<SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_AuthenticationStageChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun GetAuthenticationStageInfoAsync():
      IAsyncOperation<SecondaryAuthenticationFactorAuthenticationStageInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorAuthenticationStatics> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorAuthenticationStatics(pointer.getPointer(0))

    public fun setValue(value: ISecondaryAuthenticationFactorAuthenticationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryAuthenticationFactorAuthenticationStatics {
    public val __936854899_Ptr: Pointer?

    public val _936854899_VtblPtr: Pointer?
      get() = __936854899_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowNotificationMessageAsync(deviceName: String?,
        message: SecondaryAuthenticationFactorAuthenticationMessage?): IAsyncAction? {
      val fnPtr = _936854899_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__936854899_Ptr, marshalToNative(deviceName),
          marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StartAuthenticationAsync(deviceId: String?,
        serviceAuthenticationNonce: IBuffer?):
        IAsyncOperation<SecondaryAuthenticationFactorAuthenticationResult?>? {
      val fnPtr = _936854899_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SecondaryAuthenticationFactorAuthenticationResult?>>()
      val hr = fn.invokeHR(arrayOf(__936854899_Ptr, marshalToNative(deviceId),
          marshalToNative(serviceAuthenticationNonce), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SecondaryAuthenticationFactorAuthenticationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun add_AuthenticationStageChanged(handler: EventHandler<SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _936854899_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__936854899_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_AuthenticationStageChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _936854899_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__936854899_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetAuthenticationStageInfoAsync():
        IAsyncOperation<SecondaryAuthenticationFactorAuthenticationStageInfo?>? {
      val fnPtr = _936854899_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SecondaryAuthenticationFactorAuthenticationStageInfo?>>()
      val hr = fn.invokeHR(arrayOf(__936854899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SecondaryAuthenticationFactorAuthenticationStageInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryAuthenticationFactorAuthenticationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __936854899_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryAuthenticationFactorAuthenticationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f58265628f84e0fae8c5898b9ae2469")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryAuthenticationFactorAuthenticationStatics(ptr: Pointer?): WithDefault =
        ISecondaryAuthenticationFactorAuthenticationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorAuthenticationStatics {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorAuthenticationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryAuthenticationFactorAuthenticationStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__936854899_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryAuthenticationFactorAuthenticationStatics):
        Array<ISecondaryAuthenticationFactorAuthenticationStatics?> = (elements as
        Array<ISecondaryAuthenticationFactorAuthenticationStatics?>).castToImpl<ISecondaryAuthenticationFactorAuthenticationStatics,ISecondaryAuthenticationFactorAuthenticationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISecondaryAuthenticationFactorAuthenticationStatics?> =
        arrayOfNulls<ISecondaryAuthenticationFactorAuthenticationStatics_Impl>(size) as
        Array<ISecondaryAuthenticationFactorAuthenticationStatics?>
  }
}
