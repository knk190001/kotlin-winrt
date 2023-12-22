package Windows.Networking.Sockets

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IStreamSocketListener3.ABI::class)
@Signature("{4798201c-bdf8-4919-8542-28d450e74507}")
@Guid("4798201cbdf84919854228d450e74507")
@WinRTInterface("4798201cbdf84919854228d450e74507")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketListener3.ByReference::class)
public interface IStreamSocketListener3 : NativeMapped, IWinRTInterface {
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketListener3> {
    public override fun getValue() = ABI.makeIStreamSocketListener3(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketListener3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketListener3 {
    public val __845265804_Ptr: Pointer?

    public val _845265804_VtblPtr: Pointer?
      get() = __845265804_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CancelIOAsync(): IAsyncAction? {
      val fnPtr = _845265804_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__845265804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun EnableTransferOwnership(taskId: com.sun.jna.platform.win32.Guid.GUID?):
        Unit {
      val fnPtr = _845265804_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__845265804_Ptr, marshalToNative(taskId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun EnableTransferOwnership(taskId: com.sun.jna.platform.win32.Guid.GUID?,
        connectedStandbyAction: SocketActivityConnectedStandbyAction?): Unit {
      val fnPtr = _845265804_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__845265804_Ptr, marshalToNative(taskId),
          marshalToNative(connectedStandbyAction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun TransferOwnership(socketId: String?): Unit {
      val fnPtr = _845265804_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__845265804_Ptr, marshalToNative(socketId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun TransferOwnership(socketId: String?, `data`: SocketActivityContext?): Unit {
      val fnPtr = _845265804_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__845265804_Ptr, marshalToNative(socketId),
          marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamSocketListener3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __845265804_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketListener3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4798201cbdf84919854228d450e74507")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketListener3(ptr: Pointer?): WithDefault =
        IStreamSocketListener3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketListener3 {
      val address = segment.toRawLongValue()
      return makeIStreamSocketListener3(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketListener3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__845265804_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketListener3): Array<IStreamSocketListener3?> =
        (elements as
        Array<IStreamSocketListener3?>).castToImpl<IStreamSocketListener3,IStreamSocketListener3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketListener3?> =
        arrayOfNulls<IStreamSocketListener3_Impl>(size) as Array<IStreamSocketListener3?>
  }
}
