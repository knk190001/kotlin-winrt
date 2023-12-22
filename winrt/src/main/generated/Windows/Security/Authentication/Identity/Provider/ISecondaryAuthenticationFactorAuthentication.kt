package Windows.Security.Authentication.Identity.Provider

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

@ABIMarker(ISecondaryAuthenticationFactorAuthentication.ABI::class)
@Signature("{020a16e5-6a25-40a3-8c00-50a023f619d1}")
@Guid("020a16e56a2540a38c0050a023f619d1")
@WinRTInterface("020a16e56a2540a38c0050a023f619d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryAuthenticationFactorAuthentication.ByReference::class)
public interface ISecondaryAuthenticationFactorAuthentication : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ServiceAuthenticationHmac(): IBuffer?

  @InterfaceMethod(1)
  public fun get_SessionNonce(): IBuffer?

  @InterfaceMethod(2)
  public fun get_DeviceNonce(): IBuffer?

  @InterfaceMethod(3)
  public fun get_DeviceConfigurationData(): IBuffer?

  @InterfaceMethod(4)
  public fun FinishAuthenticationAsync(deviceHmac: IBuffer?, sessionHmac: IBuffer?):
      IAsyncOperation<SecondaryAuthenticationFactorFinishAuthenticationStatus?>?

  @InterfaceMethod(5)
  public fun AbortAuthenticationAsync(errorLogMessage: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorAuthentication> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorAuthentication(pointer.getPointer(0))

    public fun setValue(value: ISecondaryAuthenticationFactorAuthentication_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryAuthenticationFactorAuthentication {
    public val __670576104_Ptr: Pointer?

    public val _670576104_VtblPtr: Pointer?
      get() = __670576104_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServiceAuthenticationHmac(): IBuffer? {
      val fnPtr = _670576104_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__670576104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SessionNonce(): IBuffer? {
      val fnPtr = _670576104_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__670576104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DeviceNonce(): IBuffer? {
      val fnPtr = _670576104_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__670576104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DeviceConfigurationData(): IBuffer? {
      val fnPtr = _670576104_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__670576104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FinishAuthenticationAsync(deviceHmac: IBuffer?, sessionHmac: IBuffer?):
        IAsyncOperation<SecondaryAuthenticationFactorFinishAuthenticationStatus?>? {
      val fnPtr = _670576104_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SecondaryAuthenticationFactorFinishAuthenticationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__670576104_Ptr, marshalToNative(deviceHmac),
          marshalToNative(sessionHmac), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SecondaryAuthenticationFactorFinishAuthenticationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun AbortAuthenticationAsync(errorLogMessage: String?): IAsyncAction? {
      val fnPtr = _670576104_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__670576104_Ptr, marshalToNative(errorLogMessage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryAuthenticationFactorAuthentication_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __670576104_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryAuthenticationFactorAuthentication, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("020a16e56a2540a38c0050a023f619d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryAuthenticationFactorAuthentication(ptr: Pointer?): WithDefault =
        ISecondaryAuthenticationFactorAuthentication_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorAuthentication {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorAuthentication(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryAuthenticationFactorAuthentication): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__670576104_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryAuthenticationFactorAuthentication):
        Array<ISecondaryAuthenticationFactorAuthentication?> = (elements as
        Array<ISecondaryAuthenticationFactorAuthentication?>).castToImpl<ISecondaryAuthenticationFactorAuthentication,ISecondaryAuthenticationFactorAuthentication_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryAuthenticationFactorAuthentication?> =
        arrayOfNulls<ISecondaryAuthenticationFactorAuthentication_Impl>(size) as
        Array<ISecondaryAuthenticationFactorAuthentication?>
  }
}
