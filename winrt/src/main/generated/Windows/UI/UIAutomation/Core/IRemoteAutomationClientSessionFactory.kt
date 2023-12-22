package Windows.UI.UIAutomation.Core

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

@ABIMarker(IRemoteAutomationClientSessionFactory.ABI::class)
@Signature("{f250263d-6057-5373-a5a5-ed7265fe0376}")
@Guid("f250263d60575373a5a5ed7265fe0376")
@WinRTInterface("f250263d60575373a5a5ed7265fe0376")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteAutomationClientSessionFactory.ByReference::class)
public interface IRemoteAutomationClientSessionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(name: String?): RemoteAutomationClientSession?

  @InterfaceMethod(1)
  public fun CreateInstance2(name: String?, sessionId: com.sun.jna.platform.win32.Guid.GUID?):
      RemoteAutomationClientSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteAutomationClientSessionFactory> {
    public override fun getValue() =
        ABI.makeIRemoteAutomationClientSessionFactory(pointer.getPointer(0))

    public fun setValue(value: IRemoteAutomationClientSessionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteAutomationClientSessionFactory {
    public val __1482276050_Ptr: Pointer?

    public val _1482276050_VtblPtr: Pointer?
      get() = __1482276050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(name: String?): RemoteAutomationClientSession? {
      val fnPtr = _1482276050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteAutomationClientSession>()
      val hr = fn.invokeHR(arrayOf(__1482276050_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteAutomationClientSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstance2(name: String?,
        sessionId: com.sun.jna.platform.win32.Guid.GUID?): RemoteAutomationClientSession? {
      val fnPtr = _1482276050_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteAutomationClientSession>()
      val hr = fn.invokeHR(arrayOf(__1482276050_Ptr, marshalToNative(name),
          marshalToNative(sessionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteAutomationClientSession>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteAutomationClientSessionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1482276050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteAutomationClientSessionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f250263d60575373a5a5ed7265fe0376")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteAutomationClientSessionFactory(ptr: Pointer?): WithDefault =
        IRemoteAutomationClientSessionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteAutomationClientSessionFactory {
      val address = segment.toRawLongValue()
      return makeIRemoteAutomationClientSessionFactory(Pointer(address))
    }

    public override fun toNative(obj: IRemoteAutomationClientSessionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1482276050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteAutomationClientSessionFactory):
        Array<IRemoteAutomationClientSessionFactory?> = (elements as
        Array<IRemoteAutomationClientSessionFactory?>).castToImpl<IRemoteAutomationClientSessionFactory,IRemoteAutomationClientSessionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteAutomationClientSessionFactory?> =
        arrayOfNulls<IRemoteAutomationClientSessionFactory_Impl>(size) as
        Array<IRemoteAutomationClientSessionFactory?>
  }
}
