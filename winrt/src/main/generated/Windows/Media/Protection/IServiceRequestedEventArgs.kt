package Windows.Media.Protection

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

@ABIMarker(IServiceRequestedEventArgs.ABI::class)
@Signature("{34283baf-abb4-4fc1-bd89-93f106573a49}")
@Guid("34283bafabb44fc1bd8993f106573a49")
@WinRTInterface("34283bafabb44fc1bd8993f106573a49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IServiceRequestedEventArgs.ByReference::class)
public interface IServiceRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): IMediaProtectionServiceRequest?

  @InterfaceMethod(1)
  public fun get_Completion(): MediaProtectionServiceCompletion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IServiceRequestedEventArgs> {
    public override fun getValue() = ABI.makeIServiceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IServiceRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IServiceRequestedEventArgs {
    public val __1679242205_Ptr: Pointer?

    public val _1679242205_VtblPtr: Pointer?
      get() = __1679242205_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): IMediaProtectionServiceRequest? {
      val fnPtr = _1679242205_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaProtectionServiceRequest>()
      val hr = fn.invokeHR(arrayOf(__1679242205_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaProtectionServiceRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Completion(): MediaProtectionServiceCompletion? {
      val fnPtr = _1679242205_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaProtectionServiceCompletion>()
      val hr = fn.invokeHR(arrayOf(__1679242205_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaProtectionServiceCompletion>(result.getValue())
      return resultValue
    }
  }

  public class IServiceRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1679242205_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IServiceRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34283bafabb44fc1bd8993f106573a49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIServiceRequestedEventArgs(ptr: Pointer?): WithDefault =
        IServiceRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IServiceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIServiceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IServiceRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1679242205_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IServiceRequestedEventArgs):
        Array<IServiceRequestedEventArgs?> = (elements as
        Array<IServiceRequestedEventArgs?>).castToImpl<IServiceRequestedEventArgs,IServiceRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IServiceRequestedEventArgs?> =
        arrayOfNulls<IServiceRequestedEventArgs_Impl>(size) as Array<IServiceRequestedEventArgs?>
  }
}
