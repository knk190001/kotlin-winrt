package Windows.Security.Authentication.Identity.Provider

import Windows.Foundation.IAsyncAction
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

@ABIMarker(ISecondaryAuthenticationFactorRegistration.ABI::class)
@Signature("{9f4cbbb4-8cba-48b0-840d-dbb22a54c678}")
@Guid("9f4cbbb48cba48b0840ddbb22a54c678")
@WinRTInterface("9f4cbbb48cba48b0840ddbb22a54c678")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryAuthenticationFactorRegistration.ByReference::class)
public interface ISecondaryAuthenticationFactorRegistration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FinishRegisteringDeviceAsync(deviceConfigurationData: IBuffer?): IAsyncAction?

  @InterfaceMethod(1)
  public fun AbortRegisteringDeviceAsync(errorLogMessage: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorRegistration> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorRegistration(pointer.getPointer(0))

    public fun setValue(value: ISecondaryAuthenticationFactorRegistration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryAuthenticationFactorRegistration {
    public val __967098279_Ptr: Pointer?

    public val _967098279_VtblPtr: Pointer?
      get() = __967098279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FinishRegisteringDeviceAsync(deviceConfigurationData: IBuffer?):
        IAsyncAction? {
      val fnPtr = _967098279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__967098279_Ptr, marshalToNative(deviceConfigurationData),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AbortRegisteringDeviceAsync(errorLogMessage: String?): IAsyncAction? {
      val fnPtr = _967098279_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__967098279_Ptr, marshalToNative(errorLogMessage), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryAuthenticationFactorRegistration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __967098279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryAuthenticationFactorRegistration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f4cbbb48cba48b0840ddbb22a54c678")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryAuthenticationFactorRegistration(ptr: Pointer?): WithDefault =
        ISecondaryAuthenticationFactorRegistration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorRegistration {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorRegistration(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryAuthenticationFactorRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__967098279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryAuthenticationFactorRegistration):
        Array<ISecondaryAuthenticationFactorRegistration?> = (elements as
        Array<ISecondaryAuthenticationFactorRegistration?>).castToImpl<ISecondaryAuthenticationFactorRegistration,ISecondaryAuthenticationFactorRegistration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryAuthenticationFactorRegistration?> =
        arrayOfNulls<ISecondaryAuthenticationFactorRegistration_Impl>(size) as
        Array<ISecondaryAuthenticationFactorRegistration?>
  }
}
