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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteTextConnection.ABI::class)
@Signature("{4e7bb02a-183e-5e66-b5e4-3e6e5c570cf1}")
@Guid("4e7bb02a183e5e66b5e43e6e5c570cf1")
@WinRTInterface("4e7bb02a183e5e66b5e43e6e5c570cf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteTextConnection.ByReference::class)
public interface IRemoteTextConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun RegisterThread(threadId: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun UnregisterThread(threadId: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun ReportDataReceived(pduData: Array<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteTextConnection> {
    public override fun getValue() = ABI.makeIRemoteTextConnection(pointer.getPointer(0))

    public fun setValue(value: IRemoteTextConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteTextConnection {
    public val __343268964_Ptr: Pointer?

    public val _343268964_VtblPtr: Pointer?
      get() = __343268964_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _343268964_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__343268964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _343268964_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343268964_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun RegisterThread(threadId: WinDef.UINT): Unit {
      val fnPtr = _343268964_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343268964_Ptr, threadId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun UnregisterThread(threadId: WinDef.UINT): Unit {
      val fnPtr = _343268964_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343268964_Ptr, threadId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ReportDataReceived(pduData: Array<Byte>): Unit {
      val fnPtr = _343268964_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343268964_Ptr, pduData.size,marshalToNative(pduData),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoteTextConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __343268964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteTextConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e7bb02a183e5e66b5e43e6e5c570cf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteTextConnection(ptr: Pointer?): WithDefault =
        IRemoteTextConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteTextConnection {
      val address = segment.toRawLongValue()
      return makeIRemoteTextConnection(Pointer(address))
    }

    public override fun toNative(obj: IRemoteTextConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__343268964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteTextConnection): Array<IRemoteTextConnection?> =
        (elements as
        Array<IRemoteTextConnection?>).castToImpl<IRemoteTextConnection,IRemoteTextConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteTextConnection?> =
        arrayOfNulls<IRemoteTextConnection_Impl>(size) as Array<IRemoteTextConnection?>
  }
}
