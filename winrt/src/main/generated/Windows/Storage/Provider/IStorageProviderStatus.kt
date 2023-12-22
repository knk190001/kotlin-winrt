package Windows.Storage.Provider

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IStorageProviderStatus.ABI::class)
@Signature("{ff6e761d-fb8b-56c3-9e7a-05309d191fb4}")
@Guid("ff6e761dfb8b56c39e7a05309d191fb4")
@WinRTInterface("ff6e761dfb8b56c39e7a05309d191fb4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderStatus.ByReference::class)
public interface IStorageProviderStatus : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Message(): String?

  @InterfaceMethod(1)
  public fun get_State(): StorageProviderState?

  @InterfaceMethod(2)
  public fun get_ErrorMessages(): IVectorView<StorageProviderError?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderStatus> {
    public override fun getValue() = ABI.makeIStorageProviderStatus(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderStatus_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderStatus {
    public val __1234717948_Ptr: Pointer?

    public val _1234717948_VtblPtr: Pointer?
      get() = __1234717948_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Message(): String? {
      val fnPtr = _1234717948_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1234717948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_State(): StorageProviderState? {
      val fnPtr = _1234717948_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderState>()
      val hr = fn.invokeHR(arrayOf(__1234717948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ErrorMessages(): IVectorView<StorageProviderError?>? {
      val fnPtr = _1234717948_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StorageProviderError?>>()
      val hr = fn.invokeHR(arrayOf(__1234717948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StorageProviderError?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderStatus_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1234717948_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderStatus, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff6e761dfb8b56c39e7a05309d191fb4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderStatus(ptr: Pointer?): WithDefault =
        IStorageProviderStatus_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderStatus {
      val address = segment.toRawLongValue()
      return makeIStorageProviderStatus(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1234717948_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderStatus): Array<IStorageProviderStatus?> =
        (elements as
        Array<IStorageProviderStatus?>).castToImpl<IStorageProviderStatus,IStorageProviderStatus_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderStatus?> =
        arrayOfNulls<IStorageProviderStatus_Impl>(size) as Array<IStorageProviderStatus?>
  }
}
