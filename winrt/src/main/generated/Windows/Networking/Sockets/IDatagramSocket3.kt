package Windows.Networking.Sockets

import Windows.Foundation.IAsyncAction
import Windows.Foundation.TimeSpan
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

@ABIMarker(IDatagramSocket3.ABI::class)
@Signature("{37544f09-ab92-4306-9ac1-0c381283d9c6}")
@Guid("37544f09ab9243069ac10c381283d9c6")
@WinRTInterface("37544f09ab9243069ac10c381283d9c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatagramSocket3.ByReference::class)
public interface IDatagramSocket3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CancelIOAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun EnableTransferOwnership(taskId: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(2)
  public fun EnableTransferOwnership(taskId: com.sun.jna.platform.win32.Guid.GUID?,
      connectedStandbyAction: SocketActivityConnectedStandbyAction?): Unit

  @InterfaceMethod(3)
  public fun TransferOwnership(socketId: String?): Unit

  @InterfaceMethod(4)
  public fun TransferOwnership(socketId: String?, `data`: SocketActivityContext?): Unit

  @InterfaceMethod(5)
  public fun TransferOwnership(
    socketId: String?,
    `data`: SocketActivityContext?,
    keepAliveTime: TimeSpan?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatagramSocket3> {
    public override fun getValue() = ABI.makeIDatagramSocket3(pointer.getPointer(0))

    public fun setValue(value: IDatagramSocket3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatagramSocket3 {
    public val __1238990119_Ptr: Pointer?

    public val _1238990119_VtblPtr: Pointer?
      get() = __1238990119_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CancelIOAsync(): IAsyncAction? {
      val fnPtr = _1238990119_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1238990119_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun EnableTransferOwnership(taskId: com.sun.jna.platform.win32.Guid.GUID?):
        Unit {
      val fnPtr = _1238990119_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1238990119_Ptr, marshalToNative(taskId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun EnableTransferOwnership(taskId: com.sun.jna.platform.win32.Guid.GUID?,
        connectedStandbyAction: SocketActivityConnectedStandbyAction?): Unit {
      val fnPtr = _1238990119_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1238990119_Ptr, marshalToNative(taskId),
          marshalToNative(connectedStandbyAction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun TransferOwnership(socketId: String?): Unit {
      val fnPtr = _1238990119_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1238990119_Ptr, marshalToNative(socketId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun TransferOwnership(socketId: String?, `data`: SocketActivityContext?): Unit {
      val fnPtr = _1238990119_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1238990119_Ptr, marshalToNative(socketId),
          marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun TransferOwnership(
      socketId: String?,
      `data`: SocketActivityContext?,
      keepAliveTime: TimeSpan?
    ): Unit {
      val fnPtr = _1238990119_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1238990119_Ptr, marshalToNative(socketId),
          marshalToNative(data), marshalToNative(keepAliveTime),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatagramSocket3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1238990119_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatagramSocket3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37544f09ab9243069ac10c381283d9c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatagramSocket3(ptr: Pointer?): WithDefault = IDatagramSocket3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatagramSocket3 {
      val address = segment.toRawLongValue()
      return makeIDatagramSocket3(Pointer(address))
    }

    public override fun toNative(obj: IDatagramSocket3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1238990119_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatagramSocket3): Array<IDatagramSocket3?> = (elements as
        Array<IDatagramSocket3?>).castToImpl<IDatagramSocket3,IDatagramSocket3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatagramSocket3?> =
        arrayOfNulls<IDatagramSocket3_Impl>(size) as Array<IDatagramSocket3?>
  }
}
