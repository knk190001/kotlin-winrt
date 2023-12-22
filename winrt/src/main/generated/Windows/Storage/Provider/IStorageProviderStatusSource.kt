package Windows.Storage.Provider

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageProviderStatusSource.ABI::class)
@Signature("{2e316bb2-fd43-5335-b3c4-a962ee31d17e}")
@Guid("2e316bb2fd435335b3c4a962ee31d17e")
@WinRTInterface("2e316bb2fd435335b3c4a962ee31d17e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderStatusSource.ByReference::class)
public interface IStorageProviderStatusSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStatus(): StorageProviderStatus?

  @InterfaceMethod(1)
  public fun add_Changed(handler: TypedEventHandler<IStorageProviderStatusSource?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderStatusSource> {
    public override fun getValue() = ABI.makeIStorageProviderStatusSource(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderStatusSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderStatusSource {
    public val __1881388095_Ptr: Pointer?

    public val _1881388095_VtblPtr: Pointer?
      get() = __1881388095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStatus(): StorageProviderStatus? {
      val fnPtr = _1881388095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderStatus>()
      val hr = fn.invokeHR(arrayOf(__1881388095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_Changed(handler: TypedEventHandler<IStorageProviderStatusSource?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1881388095_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1881388095_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1881388095_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1881388095_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageProviderStatusSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1881388095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderStatusSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e316bb2fd435335b3c4a962ee31d17e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderStatusSource(ptr: Pointer?): WithDefault =
        IStorageProviderStatusSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderStatusSource {
      val address = segment.toRawLongValue()
      return makeIStorageProviderStatusSource(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderStatusSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1881388095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderStatusSource):
        Array<IStorageProviderStatusSource?> = (elements as
        Array<IStorageProviderStatusSource?>).castToImpl<IStorageProviderStatusSource,IStorageProviderStatusSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderStatusSource?> =
        arrayOfNulls<IStorageProviderStatusSource_Impl>(size) as
        Array<IStorageProviderStatusSource?>
  }
}
