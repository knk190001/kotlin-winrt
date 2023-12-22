package Windows.System.RemoteSystems

import Windows.Foundation.Collections.IIterable
import Windows.System.User
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

@ABIMarker(IRemoteSystemStatics3.ABI::class)
@Signature("{9995f16f-0b3c-5ac5-b325-cc73f437dfcd}")
@Guid("9995f16f0b3c5ac5b325cc73f437dfcd")
@WinRTInterface("9995f16f0b3c5ac5b325cc73f437dfcd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemStatics3.ByReference::class)
public interface IRemoteSystemStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWatcherForUser(user: User?): RemoteSystemWatcher?

  @InterfaceMethod(1)
  public fun CreateWatcherForUser(user: User?, filters: IIterable<IRemoteSystemFilter?>?):
      RemoteSystemWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemStatics3> {
    public override fun getValue() = ABI.makeIRemoteSystemStatics3(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemStatics3 {
    public val __1960969150_Ptr: Pointer?

    public val _1960969150_VtblPtr: Pointer?
      get() = __1960969150_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWatcherForUser(user: User?): RemoteSystemWatcher? {
      val fnPtr = _1960969150_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemWatcher>()
      val hr = fn.invokeHR(arrayOf(__1960969150_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemWatcher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWatcherForUser(user: User?,
        filters: IIterable<IRemoteSystemFilter?>?): RemoteSystemWatcher? {
      val fnPtr = _1960969150_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemWatcher>()
      val hr = fn.invokeHR(arrayOf(__1960969150_Ptr, marshalToNative(user),
          marshalToNative(filters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemWatcher>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1960969150_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9995f16f0b3c5ac5b325cc73f437dfcd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemStatics3(ptr: Pointer?): WithDefault =
        IRemoteSystemStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemStatics3 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemStatics3(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1960969150_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemStatics3): Array<IRemoteSystemStatics3?> =
        (elements as
        Array<IRemoteSystemStatics3?>).castToImpl<IRemoteSystemStatics3,IRemoteSystemStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemStatics3?> =
        arrayOfNulls<IRemoteSystemStatics3_Impl>(size) as Array<IRemoteSystemStatics3?>
  }
}
