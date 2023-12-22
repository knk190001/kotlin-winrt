package Windows.Networking.Vpn

import Windows.Security.Credentials.PasswordCredential
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

@ABIMarker(IVpnPickedCredential.ABI::class)
@Signature("{9a793ac7-8854-4e52-ad97-24dd9a842bce}")
@Guid("9a793ac788544e52ad9724dd9a842bce")
@WinRTInterface("9a793ac788544e52ad9724dd9a842bce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnPickedCredential.ByReference::class)
public interface IVpnPickedCredential : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PasskeyCredential(): PasswordCredential?

  @InterfaceMethod(1)
  public fun get_AdditionalPin(): String?

  @InterfaceMethod(2)
  public fun get_OldPasswordCredential(): PasswordCredential?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnPickedCredential> {
    public override fun getValue() = ABI.makeIVpnPickedCredential(pointer.getPointer(0))

    public fun setValue(value: IVpnPickedCredential_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnPickedCredential {
    public val __549546905_Ptr: Pointer?

    public val _549546905_VtblPtr: Pointer?
      get() = __549546905_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PasskeyCredential(): PasswordCredential? {
      val fnPtr = _549546905_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__549546905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AdditionalPin(): String? {
      val fnPtr = _549546905_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__549546905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OldPasswordCredential(): PasswordCredential? {
      val fnPtr = _549546905_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__549546905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }
  }

  public class IVpnPickedCredential_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __549546905_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnPickedCredential, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a793ac788544e52ad9724dd9a842bce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPickedCredential(ptr: Pointer?): WithDefault = IVpnPickedCredential_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPickedCredential {
      val address = segment.toRawLongValue()
      return makeIVpnPickedCredential(Pointer(address))
    }

    public override fun toNative(obj: IVpnPickedCredential): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__549546905_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnPickedCredential): Array<IVpnPickedCredential?> =
        (elements as
        Array<IVpnPickedCredential?>).castToImpl<IVpnPickedCredential,IVpnPickedCredential_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnPickedCredential?> =
        arrayOfNulls<IVpnPickedCredential_Impl>(size) as Array<IVpnPickedCredential?>
  }
}
