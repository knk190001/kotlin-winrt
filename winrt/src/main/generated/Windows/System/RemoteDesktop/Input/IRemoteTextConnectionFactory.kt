package Windows.System.RemoteDesktop.Input

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

@ABIMarker(IRemoteTextConnectionFactory.ABI::class)
@Signature("{88e075c2-0cae-596c-850f-78d345cd728b}")
@Guid("88e075c20cae596c850f78d345cd728b")
@WinRTInterface("88e075c20cae596c850f78d345cd728b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteTextConnectionFactory.ByReference::class)
public interface IRemoteTextConnectionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(connectionId: com.sun.jna.platform.win32.Guid.GUID?,
      pduForwarder: RemoteTextConnectionDataHandler?): RemoteTextConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteTextConnectionFactory> {
    public override fun getValue() = ABI.makeIRemoteTextConnectionFactory(pointer.getPointer(0))

    public fun setValue(value: IRemoteTextConnectionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteTextConnectionFactory {
    public val __1532616654_Ptr: Pointer?

    public val _1532616654_VtblPtr: Pointer?
      get() = __1532616654_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(connectionId: com.sun.jna.platform.win32.Guid.GUID?,
        pduForwarder: RemoteTextConnectionDataHandler?): RemoteTextConnection? {
      val fnPtr = _1532616654_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteTextConnection>()
      val hr = fn.invokeHR(arrayOf(__1532616654_Ptr, marshalToNative(connectionId),
          marshalToNative(pduForwarder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteTextConnection>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteTextConnectionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1532616654_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteTextConnectionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88e075c20cae596c850f78d345cd728b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteTextConnectionFactory(ptr: Pointer?): WithDefault =
        IRemoteTextConnectionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteTextConnectionFactory {
      val address = segment.toRawLongValue()
      return makeIRemoteTextConnectionFactory(Pointer(address))
    }

    public override fun toNative(obj: IRemoteTextConnectionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1532616654_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteTextConnectionFactory):
        Array<IRemoteTextConnectionFactory?> = (elements as
        Array<IRemoteTextConnectionFactory?>).castToImpl<IRemoteTextConnectionFactory,IRemoteTextConnectionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteTextConnectionFactory?> =
        arrayOfNulls<IRemoteTextConnectionFactory_Impl>(size) as
        Array<IRemoteTextConnectionFactory?>
  }
}
