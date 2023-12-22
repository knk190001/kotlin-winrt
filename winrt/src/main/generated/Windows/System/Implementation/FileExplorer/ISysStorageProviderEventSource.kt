package Windows.System.Implementation.FileExplorer

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

@ABIMarker(ISysStorageProviderEventSource.ABI::class)
@Signature("{1f36c476-9546-536a-8381-2f9a2c08cedd}")
@Guid("1f36c4769546536a83812f9a2c08cedd")
@WinRTInterface("1f36c4769546536a83812f9a2c08cedd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISysStorageProviderEventSource.ByReference::class)
public interface ISysStorageProviderEventSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_EventReceived(handler: TypedEventHandler<ISysStorageProviderEventSource?,
      SysStorageProviderEventReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_EventReceived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISysStorageProviderEventSource> {
    public override fun getValue() = ABI.makeISysStorageProviderEventSource(pointer.getPointer(0))

    public fun setValue(value: ISysStorageProviderEventSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISysStorageProviderEventSource {
    public val __154556080_Ptr: Pointer?

    public val _154556080_VtblPtr: Pointer?
      get() = __154556080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_EventReceived(handler: TypedEventHandler<ISysStorageProviderEventSource?,
        SysStorageProviderEventReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _154556080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__154556080_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_EventReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _154556080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__154556080_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISysStorageProviderEventSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __154556080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISysStorageProviderEventSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f36c4769546536a83812f9a2c08cedd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISysStorageProviderEventSource(ptr: Pointer?): WithDefault =
        ISysStorageProviderEventSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISysStorageProviderEventSource {
      val address = segment.toRawLongValue()
      return makeISysStorageProviderEventSource(Pointer(address))
    }

    public override fun toNative(obj: ISysStorageProviderEventSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__154556080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISysStorageProviderEventSource):
        Array<ISysStorageProviderEventSource?> = (elements as
        Array<ISysStorageProviderEventSource?>).castToImpl<ISysStorageProviderEventSource,ISysStorageProviderEventSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISysStorageProviderEventSource?> =
        arrayOfNulls<ISysStorageProviderEventSource_Impl>(size) as
        Array<ISysStorageProviderEventSource?>
  }
}
