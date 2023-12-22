package Windows.Media.Protection.PlayReady

import Windows.Foundation.Uri
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyDomain.ABI::class)
@Signature("{adcc93ac-97e6-43ef-95e4-d7868f3b16a9}")
@Guid("adcc93ac97e643ef95e4d7868f3b16a9")
@WinRTInterface("adcc93ac97e643ef95e4d7868f3b16a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyDomain.ByReference::class)
public interface IPlayReadyDomain : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AccountId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_ServiceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_Revision(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(4)
  public fun get_DomainJoinUrl(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyDomain> {
    public override fun getValue() = ABI.makeIPlayReadyDomain(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyDomain_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyDomain {
    public val __66638023_Ptr: Pointer?

    public val _66638023_VtblPtr: Pointer?
      get() = __66638023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccountId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _66638023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__66638023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ServiceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _66638023_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__66638023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Revision(): WinDef.UINT {
      val fnPtr = _66638023_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__66638023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _66638023_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__66638023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DomainJoinUrl(): Uri? {
      val fnPtr = _66638023_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__66638023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyDomain_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __66638023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyDomain, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("adcc93ac97e643ef95e4d7868f3b16a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyDomain(ptr: Pointer?): WithDefault = IPlayReadyDomain_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyDomain {
      val address = segment.toRawLongValue()
      return makeIPlayReadyDomain(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyDomain): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__66638023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyDomain): Array<IPlayReadyDomain?> = (elements as
        Array<IPlayReadyDomain?>).castToImpl<IPlayReadyDomain,IPlayReadyDomain_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyDomain?> =
        arrayOfNulls<IPlayReadyDomain_Impl>(size) as Array<IPlayReadyDomain?>
  }
}
