package Windows.Security.Cryptography.Certificates

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

@ABIMarker(ICertificateStoresStatics2.ABI::class)
@Signature("{fa900b79-a0d4-4b8c-bc55-c0a37eb141ed}")
@Guid("fa900b79a0d44b8cbc55c0a37eb141ed")
@WinRTInterface("fa900b79a0d44b8cbc55c0a37eb141ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateStoresStatics2.ByReference::class)
public interface ICertificateStoresStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetUserStoreByName(storeName: String?): UserCertificateStore?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateStoresStatics2> {
    public override fun getValue() = ABI.makeICertificateStoresStatics2(pointer.getPointer(0))

    public fun setValue(value: ICertificateStoresStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateStoresStatics2 {
    public val __794749400_Ptr: Pointer?

    public val _794749400_VtblPtr: Pointer?
      get() = __794749400_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetUserStoreByName(storeName: String?): UserCertificateStore? {
      val fnPtr = _794749400_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserCertificateStore>()
      val hr = fn.invokeHR(arrayOf(__794749400_Ptr, marshalToNative(storeName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserCertificateStore>(result.getValue())
      return resultValue
    }
  }

  public class ICertificateStoresStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __794749400_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateStoresStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa900b79a0d44b8cbc55c0a37eb141ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateStoresStatics2(ptr: Pointer?): WithDefault =
        ICertificateStoresStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateStoresStatics2 {
      val address = segment.toRawLongValue()
      return makeICertificateStoresStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICertificateStoresStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__794749400_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateStoresStatics2):
        Array<ICertificateStoresStatics2?> = (elements as
        Array<ICertificateStoresStatics2?>).castToImpl<ICertificateStoresStatics2,ICertificateStoresStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateStoresStatics2?> =
        arrayOfNulls<ICertificateStoresStatics2_Impl>(size) as Array<ICertificateStoresStatics2?>
  }
}
