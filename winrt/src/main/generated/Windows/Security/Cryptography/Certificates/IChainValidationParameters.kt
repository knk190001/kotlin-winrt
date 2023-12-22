package Windows.Security.Cryptography.Certificates

import Windows.Networking.HostName
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

@ABIMarker(IChainValidationParameters.ABI::class)
@Signature("{c4743b4a-7eb0-4b56-a040-b9c8e655ddf3}")
@Guid("c4743b4a7eb04b56a040b9c8e655ddf3")
@WinRTInterface("c4743b4a7eb04b56a040b9c8e655ddf3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChainValidationParameters.ByReference::class)
public interface IChainValidationParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CertificateChainPolicy(): CertificateChainPolicy?

  @InterfaceMethod(1)
  public fun put_CertificateChainPolicy(value: CertificateChainPolicy?): Unit

  @InterfaceMethod(2)
  public fun get_ServerDnsName(): HostName?

  @InterfaceMethod(3)
  public fun put_ServerDnsName(value: HostName?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChainValidationParameters> {
    public override fun getValue() = ABI.makeIChainValidationParameters(pointer.getPointer(0))

    public fun setValue(value: IChainValidationParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChainValidationParameters {
    public val __594735478_Ptr: Pointer?

    public val _594735478_VtblPtr: Pointer?
      get() = __594735478_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CertificateChainPolicy(): CertificateChainPolicy? {
      val fnPtr = _594735478_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CertificateChainPolicy>()
      val hr = fn.invokeHR(arrayOf(__594735478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CertificateChainPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CertificateChainPolicy(value: CertificateChainPolicy?): Unit {
      val fnPtr = _594735478_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__594735478_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ServerDnsName(): HostName? {
      val fnPtr = _594735478_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__594735478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ServerDnsName(value: HostName?): Unit {
      val fnPtr = _594735478_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__594735478_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChainValidationParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __594735478_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChainValidationParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4743b4a7eb04b56a040b9c8e655ddf3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChainValidationParameters(ptr: Pointer?): WithDefault =
        IChainValidationParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChainValidationParameters {
      val address = segment.toRawLongValue()
      return makeIChainValidationParameters(Pointer(address))
    }

    public override fun toNative(obj: IChainValidationParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__594735478_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChainValidationParameters):
        Array<IChainValidationParameters?> = (elements as
        Array<IChainValidationParameters?>).castToImpl<IChainValidationParameters,IChainValidationParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChainValidationParameters?> =
        arrayOfNulls<IChainValidationParameters_Impl>(size) as Array<IChainValidationParameters?>
  }
}
