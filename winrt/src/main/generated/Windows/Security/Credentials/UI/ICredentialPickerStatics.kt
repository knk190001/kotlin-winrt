package Windows.Security.Credentials.UI

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICredentialPickerStatics.ABI::class)
@Signature("{aa3a5c73-c9ea-4782-99fb-e6d7e938e12d}")
@Guid("aa3a5c73c9ea478299fbe6d7e938e12d")
@WinRTInterface("aa3a5c73c9ea478299fbe6d7e938e12d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICredentialPickerStatics.ByReference::class)
public interface ICredentialPickerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PickAsync(options: CredentialPickerOptions?):
      IAsyncOperation<CredentialPickerResults?>?

  @InterfaceMethod(1)
  public fun PickAsync(targetName: String?, message: String?):
      IAsyncOperation<CredentialPickerResults?>?

  @InterfaceMethod(2)
  public fun PickAsync(
    targetName: String?,
    message: String?,
    caption: String?
  ): IAsyncOperation<CredentialPickerResults?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICredentialPickerStatics> {
    public override fun getValue() = ABI.makeICredentialPickerStatics(pointer.getPointer(0))

    public fun setValue(value: ICredentialPickerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICredentialPickerStatics {
    public val __1528174432_Ptr: Pointer?

    public val _1528174432_VtblPtr: Pointer?
      get() = __1528174432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PickAsync(options: CredentialPickerOptions?):
        IAsyncOperation<CredentialPickerResults?>? {
      val fnPtr = _1528174432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CredentialPickerResults?>>()
      val hr = fn.invokeHR(arrayOf(__1528174432_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CredentialPickerResults?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PickAsync(targetName: String?, message: String?):
        IAsyncOperation<CredentialPickerResults?>? {
      val fnPtr = _1528174432_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CredentialPickerResults?>>()
      val hr = fn.invokeHR(arrayOf(__1528174432_Ptr, marshalToNative(targetName),
          marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CredentialPickerResults?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun PickAsync(
      targetName: String?,
      message: String?,
      caption: String?
    ): IAsyncOperation<CredentialPickerResults?>? {
      val fnPtr = _1528174432_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CredentialPickerResults?>>()
      val hr = fn.invokeHR(arrayOf(__1528174432_Ptr, marshalToNative(targetName),
          marshalToNative(message), marshalToNative(caption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CredentialPickerResults?>>(result.getValue())
      return resultValue
    }
  }

  public class ICredentialPickerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1528174432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICredentialPickerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa3a5c73c9ea478299fbe6d7e938e12d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICredentialPickerStatics(ptr: Pointer?): WithDefault =
        ICredentialPickerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICredentialPickerStatics {
      val address = segment.toRawLongValue()
      return makeICredentialPickerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICredentialPickerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1528174432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICredentialPickerStatics):
        Array<ICredentialPickerStatics?> = (elements as
        Array<ICredentialPickerStatics?>).castToImpl<ICredentialPickerStatics,ICredentialPickerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICredentialPickerStatics?> =
        arrayOfNulls<ICredentialPickerStatics_Impl>(size) as Array<ICredentialPickerStatics?>
  }
}
