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

@ABIMarker(ICredentialPickerResults.ABI::class)
@Signature("{1948f99a-cc30-410c-9c38-cc0884c5b3d7}")
@Guid("1948f99acc30410c9c38cc0884c5b3d7")
@WinRTInterface("1948f99acc30410c9c38cc0884c5b3d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICredentialPickerResults.ByReference::class)
public interface ICredentialPickerResults : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorCode(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_CredentialSaveOption(): CredentialSaveOption?

  @InterfaceMethod(2)
  public fun get_CredentialSaved(): Boolean

  @InterfaceMethod(3)
  public fun get_Credential(): IBuffer?

  @InterfaceMethod(4)
  public fun get_CredentialDomainName(): String?

  @InterfaceMethod(5)
  public fun get_CredentialUserName(): String?

  @InterfaceMethod(6)
  public fun get_CredentialPassword(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICredentialPickerResults> {
    public override fun getValue() = ABI.makeICredentialPickerResults(pointer.getPointer(0))

    public fun setValue(value: ICredentialPickerResults_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICredentialPickerResults {
    public val __227890065_Ptr: Pointer?

    public val _227890065_VtblPtr: Pointer?
      get() = __227890065_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorCode(): WinDef.UINT {
      val fnPtr = _227890065_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__227890065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CredentialSaveOption(): CredentialSaveOption? {
      val fnPtr = _227890065_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CredentialSaveOption>()
      val hr = fn.invokeHR(arrayOf(__227890065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CredentialSaveOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CredentialSaved(): Boolean {
      val fnPtr = _227890065_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__227890065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Credential(): IBuffer? {
      val fnPtr = _227890065_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__227890065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CredentialDomainName(): String? {
      val fnPtr = _227890065_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__227890065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CredentialUserName(): String? {
      val fnPtr = _227890065_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__227890065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CredentialPassword(): String? {
      val fnPtr = _227890065_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__227890065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICredentialPickerResults_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __227890065_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICredentialPickerResults, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1948f99acc30410c9c38cc0884c5b3d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICredentialPickerResults(ptr: Pointer?): WithDefault =
        ICredentialPickerResults_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICredentialPickerResults {
      val address = segment.toRawLongValue()
      return makeICredentialPickerResults(Pointer(address))
    }

    public override fun toNative(obj: ICredentialPickerResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__227890065_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICredentialPickerResults):
        Array<ICredentialPickerResults?> = (elements as
        Array<ICredentialPickerResults?>).castToImpl<ICredentialPickerResults,ICredentialPickerResults_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICredentialPickerResults?> =
        arrayOfNulls<ICredentialPickerResults_Impl>(size) as Array<ICredentialPickerResults?>
  }
}
