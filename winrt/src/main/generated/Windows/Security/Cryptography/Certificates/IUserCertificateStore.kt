package Windows.Security.Cryptography.Certificates

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

@ABIMarker(IUserCertificateStore.ABI::class)
@Signature("{c9fb1d83-789f-4b4e-9180-045a757aac6d}")
@Guid("c9fb1d83789f4b4e9180045a757aac6d")
@WinRTInterface("c9fb1d83789f4b4e9180045a757aac6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserCertificateStore.ByReference::class)
public interface IUserCertificateStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAddAsync(certificate: Certificate?): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun RequestDeleteAsync(certificate: Certificate?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun get_Name(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserCertificateStore> {
    public override fun getValue() = ABI.makeIUserCertificateStore(pointer.getPointer(0))

    public fun setValue(value: IUserCertificateStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserCertificateStore {
    public val __2088755613_Ptr: Pointer?

    public val _2088755613_VtblPtr: Pointer?
      get() = __2088755613_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAddAsync(certificate: Certificate?): IAsyncOperation<Boolean>? {
      val fnPtr = _2088755613_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2088755613_Ptr, marshalToNative(certificate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestDeleteAsync(certificate: Certificate?): IAsyncOperation<Boolean>? {
      val fnPtr = _2088755613_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2088755613_Ptr, marshalToNative(certificate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Name(): String? {
      val fnPtr = _2088755613_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2088755613_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IUserCertificateStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2088755613_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserCertificateStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9fb1d83789f4b4e9180045a757aac6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserCertificateStore(ptr: Pointer?): WithDefault =
        IUserCertificateStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserCertificateStore {
      val address = segment.toRawLongValue()
      return makeIUserCertificateStore(Pointer(address))
    }

    public override fun toNative(obj: IUserCertificateStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2088755613_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserCertificateStore): Array<IUserCertificateStore?> =
        (elements as
        Array<IUserCertificateStore?>).castToImpl<IUserCertificateStore,IUserCertificateStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserCertificateStore?> =
        arrayOfNulls<IUserCertificateStore_Impl>(size) as Array<IUserCertificateStore?>
  }
}
