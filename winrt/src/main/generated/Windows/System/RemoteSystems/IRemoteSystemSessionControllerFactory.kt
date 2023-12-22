package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemSessionControllerFactory.ABI::class)
@Signature("{bfcc2f6b-ac3d-4199-82cd-6670a773ef2e}")
@Guid("bfcc2f6bac3d419982cd6670a773ef2e")
@WinRTInterface("bfcc2f6bac3d419982cd6670a773ef2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionControllerFactory.ByReference::class)
public interface IRemoteSystemSessionControllerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateController(displayName: String?): RemoteSystemSessionController?

  @InterfaceMethod(1)
  public fun CreateController(displayName: String?, options: RemoteSystemSessionOptions?):
      RemoteSystemSessionController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionControllerFactory> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionControllerFactory(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionControllerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionControllerFactory {
    public val __1386285812_Ptr: Pointer?

    public val _1386285812_VtblPtr: Pointer?
      get() = __1386285812_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateController(displayName: String?): RemoteSystemSessionController? {
      val fnPtr = _1386285812_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionController>()
      val hr = fn.invokeHR(arrayOf(__1386285812_Ptr, marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateController(displayName: String?,
        options: RemoteSystemSessionOptions?): RemoteSystemSessionController? {
      val fnPtr = _1386285812_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionController>()
      val hr = fn.invokeHR(arrayOf(__1386285812_Ptr, marshalToNative(displayName),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionController>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionControllerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1386285812_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionControllerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfcc2f6bac3d419982cd6670a773ef2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionControllerFactory(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionControllerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionControllerFactory {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionControllerFactory(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionControllerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1386285812_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionControllerFactory):
        Array<IRemoteSystemSessionControllerFactory?> = (elements as
        Array<IRemoteSystemSessionControllerFactory?>).castToImpl<IRemoteSystemSessionControllerFactory,IRemoteSystemSessionControllerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionControllerFactory?> =
        arrayOfNulls<IRemoteSystemSessionControllerFactory_Impl>(size) as
        Array<IRemoteSystemSessionControllerFactory?>
  }
}
