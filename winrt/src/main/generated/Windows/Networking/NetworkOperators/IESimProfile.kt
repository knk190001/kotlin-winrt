package Windows.Networking.NetworkOperators

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IESimProfile.ABI::class)
@Signature("{ee1e7880-06a9-4027-b4f8-ddb23d7810e0}")
@Guid("ee1e788006a94027b4f8ddb23d7810e0")
@WinRTInterface("ee1e788006a94027b4f8ddb23d7810e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimProfile.ByReference::class)
public interface IESimProfile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Class(): ESimProfileClass?

  @InterfaceMethod(1)
  public fun get_Nickname(): String?

  @InterfaceMethod(2)
  public fun get_Policy(): ESimProfilePolicy?

  @InterfaceMethod(3)
  public fun get_Id(): String?

  @InterfaceMethod(4)
  public fun get_ProviderIcon(): IRandomAccessStreamReference?

  @InterfaceMethod(5)
  public fun get_ProviderId(): String?

  @InterfaceMethod(6)
  public fun get_ProviderName(): String?

  @InterfaceMethod(7)
  public fun get_State(): ESimProfileState?

  @InterfaceMethod(8)
  public fun DisableAsync(): IAsyncOperation<ESimOperationResult?>?

  @InterfaceMethod(9)
  public fun EnableAsync(): IAsyncOperation<ESimOperationResult?>?

  @InterfaceMethod(10)
  public fun SetNicknameAsync(newNickname: String?): IAsyncOperation<ESimOperationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IESimProfile> {
    public override fun getValue() = ABI.makeIESimProfile(pointer.getPointer(0))

    public fun setValue(value: IESimProfile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimProfile {
    public val __713408642_Ptr: Pointer?

    public val _713408642_VtblPtr: Pointer?
      get() = __713408642_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Class(): ESimProfileClass? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimProfileClass>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimProfileClass>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Nickname(): String? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Policy(): ESimProfilePolicy? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimProfilePolicy>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimProfilePolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Id(): String? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ProviderIcon(): IRandomAccessStreamReference? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ProviderId(): String? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ProviderName(): String? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_State(): ESimProfileState? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimProfileState>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimProfileState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun DisableAsync(): IAsyncOperation<ESimOperationResult?>? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ESimOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun EnableAsync(): IAsyncOperation<ESimOperationResult?>? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ESimOperationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun SetNicknameAsync(newNickname: String?):
        IAsyncOperation<ESimOperationResult?>? {
      val fnPtr = _713408642_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ESimOperationResult?>>()
      val hr = fn.invokeHR(arrayOf(__713408642_Ptr, marshalToNative(newNickname), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ESimOperationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IESimProfile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __713408642_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimProfile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee1e788006a94027b4f8ddb23d7810e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimProfile(ptr: Pointer?): WithDefault = IESimProfile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimProfile {
      val address = segment.toRawLongValue()
      return makeIESimProfile(Pointer(address))
    }

    public override fun toNative(obj: IESimProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__713408642_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimProfile): Array<IESimProfile?> = (elements as
        Array<IESimProfile?>).castToImpl<IESimProfile,IESimProfile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimProfile?> =
        arrayOfNulls<IESimProfile_Impl>(size) as Array<IESimProfile?>
  }
}
