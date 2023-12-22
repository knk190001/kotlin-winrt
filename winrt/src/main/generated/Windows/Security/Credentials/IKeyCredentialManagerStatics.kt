package Windows.Security.Credentials

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKeyCredentialManagerStatics.ABI::class)
@Signature("{6aac468b-0ef1-4ce0-8290-4106da6a63b5}")
@Guid("6aac468b0ef14ce082904106da6a63b5")
@WinRTInterface("6aac468b0ef14ce082904106da6a63b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyCredentialManagerStatics.ByReference::class)
public interface IKeyCredentialManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupportedAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun RenewAttestationAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun RequestCreateAsync(name: String?, option: KeyCredentialCreationOption?):
      IAsyncOperation<KeyCredentialRetrievalResult?>?

  @InterfaceMethod(3)
  public fun OpenAsync(name: String?): IAsyncOperation<KeyCredentialRetrievalResult?>?

  @InterfaceMethod(4)
  public fun DeleteAsync(name: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyCredentialManagerStatics> {
    public override fun getValue() = ABI.makeIKeyCredentialManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyCredentialManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyCredentialManagerStatics {
    public val __629637250_Ptr: Pointer?

    public val _629637250_VtblPtr: Pointer?
      get() = __629637250_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupportedAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _629637250_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__629637250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RenewAttestationAsync(): IAsyncAction? {
      val fnPtr = _629637250_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__629637250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestCreateAsync(name: String?, option: KeyCredentialCreationOption?):
        IAsyncOperation<KeyCredentialRetrievalResult?>? {
      val fnPtr = _629637250_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<KeyCredentialRetrievalResult?>>()
      val hr = fn.invokeHR(arrayOf(__629637250_Ptr, marshalToNative(name), marshalToNative(option),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<KeyCredentialRetrievalResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun OpenAsync(name: String?): IAsyncOperation<KeyCredentialRetrievalResult?>? {
      val fnPtr = _629637250_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<KeyCredentialRetrievalResult?>>()
      val hr = fn.invokeHR(arrayOf(__629637250_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<KeyCredentialRetrievalResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun DeleteAsync(name: String?): IAsyncAction? {
      val fnPtr = _629637250_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__629637250_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IKeyCredentialManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __629637250_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyCredentialManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6aac468b0ef14ce082904106da6a63b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyCredentialManagerStatics(ptr: Pointer?): WithDefault =
        IKeyCredentialManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyCredentialManagerStatics {
      val address = segment.toRawLongValue()
      return makeIKeyCredentialManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyCredentialManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__629637250_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyCredentialManagerStatics):
        Array<IKeyCredentialManagerStatics?> = (elements as
        Array<IKeyCredentialManagerStatics?>).castToImpl<IKeyCredentialManagerStatics,IKeyCredentialManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyCredentialManagerStatics?> =
        arrayOfNulls<IKeyCredentialManagerStatics_Impl>(size) as
        Array<IKeyCredentialManagerStatics?>
  }
}
