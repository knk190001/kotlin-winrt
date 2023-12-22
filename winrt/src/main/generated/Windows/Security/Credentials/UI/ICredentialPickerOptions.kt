package Windows.Security.Credentials.UI

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICredentialPickerOptions.ABI::class)
@Signature("{965a0b4c-95fa-467f-992b-0b22e5859bf6}")
@Guid("965a0b4c95fa467f992b0b22e5859bf6")
@WinRTInterface("965a0b4c95fa467f992b0b22e5859bf6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICredentialPickerOptions.ByReference::class)
public interface ICredentialPickerOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Caption(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_Caption(): String?

  @InterfaceMethod(2)
  public fun put_Message(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Message(): String?

  @InterfaceMethod(4)
  public fun put_ErrorCode(value: WinDef.UINT): Unit

  @InterfaceMethod(5)
  public fun get_ErrorCode(): WinDef.UINT

  @InterfaceMethod(6)
  public fun put_TargetName(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_TargetName(): String?

  @InterfaceMethod(8)
  public fun put_AuthenticationProtocol(value: AuthenticationProtocol?): Unit

  @InterfaceMethod(9)
  public fun get_AuthenticationProtocol(): AuthenticationProtocol?

  @InterfaceMethod(10)
  public fun put_CustomAuthenticationProtocol(value: String?): Unit

  @InterfaceMethod(11)
  public fun get_CustomAuthenticationProtocol(): String?

  @InterfaceMethod(12)
  public fun put_PreviousCredential(value: IBuffer?): Unit

  @InterfaceMethod(13)
  public fun get_PreviousCredential(): IBuffer?

  @InterfaceMethod(14)
  public fun put_AlwaysDisplayDialog(value: Boolean): Unit

  @InterfaceMethod(15)
  public fun get_AlwaysDisplayDialog(): Boolean

  @InterfaceMethod(16)
  public fun put_CallerSavesCredential(value: Boolean): Unit

  @InterfaceMethod(17)
  public fun get_CallerSavesCredential(): Boolean

  @InterfaceMethod(18)
  public fun put_CredentialSaveOption(value: CredentialSaveOption?): Unit

  @InterfaceMethod(19)
  public fun get_CredentialSaveOption(): CredentialSaveOption?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICredentialPickerOptions> {
    public override fun getValue() = ABI.makeICredentialPickerOptions(pointer.getPointer(0))

    public fun setValue(value: ICredentialPickerOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICredentialPickerOptions {
    public val __2119131591_Ptr: Pointer?

    public val _2119131591_VtblPtr: Pointer?
      get() = __2119131591_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Caption(value: String?): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Caption(): String? {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Message(value: String?): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Message(): String? {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ErrorCode(value: WinDef.UINT): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ErrorCode(): WinDef.UINT {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_TargetName(): String? {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_AuthenticationProtocol(value: AuthenticationProtocol?): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_AuthenticationProtocol(): AuthenticationProtocol? {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AuthenticationProtocol>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AuthenticationProtocol>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_CustomAuthenticationProtocol(value: String?): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_CustomAuthenticationProtocol(): String? {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_PreviousCredential(value: IBuffer?): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_PreviousCredential(): IBuffer? {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_AlwaysDisplayDialog(value: Boolean): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_AlwaysDisplayDialog(): Boolean {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_CallerSavesCredential(value: Boolean): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_CallerSavesCredential(): Boolean {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_CredentialSaveOption(value: CredentialSaveOption?): Unit {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_CredentialSaveOption(): CredentialSaveOption? {
      val fnPtr = _2119131591_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CredentialSaveOption>()
      val hr = fn.invokeHR(arrayOf(__2119131591_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CredentialSaveOption>(result.getValue())
      return resultValue
    }
  }

  public class ICredentialPickerOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2119131591_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICredentialPickerOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("965a0b4c95fa467f992b0b22e5859bf6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICredentialPickerOptions(ptr: Pointer?): WithDefault =
        ICredentialPickerOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICredentialPickerOptions {
      val address = segment.toRawLongValue()
      return makeICredentialPickerOptions(Pointer(address))
    }

    public override fun toNative(obj: ICredentialPickerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2119131591_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICredentialPickerOptions):
        Array<ICredentialPickerOptions?> = (elements as
        Array<ICredentialPickerOptions?>).castToImpl<ICredentialPickerOptions,ICredentialPickerOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICredentialPickerOptions?> =
        arrayOfNulls<ICredentialPickerOptions_Impl>(size) as Array<ICredentialPickerOptions?>
  }
}
