package Windows.Security.Credentials

import Windows.Foundation.IAsyncOperation
import Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType
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

@ABIMarker(IKeyCredential.ABI::class)
@Signature("{9585ef8d-457b-4847-b11a-fa960bbdb138}")
@Guid("9585ef8d457b4847b11afa960bbdb138")
@WinRTInterface("9585ef8d457b4847b11afa960bbdb138")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyCredential.ByReference::class)
public interface IKeyCredential : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun RetrievePublicKey(): IBuffer?

  @InterfaceMethod(2)
  public fun RetrievePublicKey(blobType: CryptographicPublicKeyBlobType?): IBuffer?

  @InterfaceMethod(3)
  public fun RequestSignAsync(`data`: IBuffer?): IAsyncOperation<KeyCredentialOperationResult?>?

  @InterfaceMethod(4)
  public fun GetAttestationAsync(): IAsyncOperation<KeyCredentialAttestationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IKeyCredential>
      {
    public override fun getValue() = ABI.makeIKeyCredential(pointer.getPointer(0))

    public fun setValue(value: IKeyCredential_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyCredential {
    public val __1289381242_Ptr: Pointer?

    public val _1289381242_VtblPtr: Pointer?
      get() = __1289381242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1289381242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1289381242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RetrievePublicKey(): IBuffer? {
      val fnPtr = _1289381242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1289381242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RetrievePublicKey(blobType: CryptographicPublicKeyBlobType?): IBuffer? {
      val fnPtr = _1289381242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1289381242_Ptr, marshalToNative(blobType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestSignAsync(`data`: IBuffer?):
        IAsyncOperation<KeyCredentialOperationResult?>? {
      val fnPtr = _1289381242_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<KeyCredentialOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1289381242_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<KeyCredentialOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAttestationAsync(): IAsyncOperation<KeyCredentialAttestationResult?>? {
      val fnPtr = _1289381242_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<KeyCredentialAttestationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1289381242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<KeyCredentialAttestationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IKeyCredential_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1289381242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyCredential, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9585ef8d457b4847b11afa960bbdb138")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyCredential(ptr: Pointer?): WithDefault = IKeyCredential_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyCredential {
      val address = segment.toRawLongValue()
      return makeIKeyCredential(Pointer(address))
    }

    public override fun toNative(obj: IKeyCredential): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1289381242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyCredential): Array<IKeyCredential?> = (elements as
        Array<IKeyCredential?>).castToImpl<IKeyCredential,IKeyCredential_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyCredential?> =
        arrayOfNulls<IKeyCredential_Impl>(size) as Array<IKeyCredential?>
  }
}
