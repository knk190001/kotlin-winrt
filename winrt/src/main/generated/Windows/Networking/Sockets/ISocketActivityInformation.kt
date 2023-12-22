package Windows.Networking.Sockets

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

@ABIMarker(ISocketActivityInformation.ABI::class)
@Signature("{8d8a42e4-a87e-4b74-9968-185b2511defe}")
@Guid("8d8a42e4a87e4b749968185b2511defe")
@WinRTInterface("8d8a42e4a87e4b749968185b2511defe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocketActivityInformation.ByReference::class)
public interface ISocketActivityInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TaskId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Id(): String?

  @InterfaceMethod(2)
  public fun get_SocketKind(): SocketActivityKind?

  @InterfaceMethod(3)
  public fun get_Context(): SocketActivityContext?

  @InterfaceMethod(4)
  public fun get_DatagramSocket(): DatagramSocket?

  @InterfaceMethod(5)
  public fun get_StreamSocket(): StreamSocket?

  @InterfaceMethod(6)
  public fun get_StreamSocketListener(): StreamSocketListener?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocketActivityInformation> {
    public override fun getValue() = ABI.makeISocketActivityInformation(pointer.getPointer(0))

    public fun setValue(value: ISocketActivityInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocketActivityInformation {
    public val __1778480242_Ptr: Pointer?

    public val _1778480242_VtblPtr: Pointer?
      get() = __1778480242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TaskId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1778480242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1778480242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Id(): String? {
      val fnPtr = _1778480242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1778480242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SocketKind(): SocketActivityKind? {
      val fnPtr = _1778480242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketActivityKind>()
      val hr = fn.invokeHR(arrayOf(__1778480242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketActivityKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Context(): SocketActivityContext? {
      val fnPtr = _1778480242_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketActivityContext>()
      val hr = fn.invokeHR(arrayOf(__1778480242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketActivityContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DatagramSocket(): DatagramSocket? {
      val fnPtr = _1778480242_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DatagramSocket>()
      val hr = fn.invokeHR(arrayOf(__1778480242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DatagramSocket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_StreamSocket(): StreamSocket? {
      val fnPtr = _1778480242_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamSocket>()
      val hr = fn.invokeHR(arrayOf(__1778480242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamSocket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_StreamSocketListener(): StreamSocketListener? {
      val fnPtr = _1778480242_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamSocketListener>()
      val hr = fn.invokeHR(arrayOf(__1778480242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamSocketListener>(result.getValue())
      return resultValue
    }
  }

  public class ISocketActivityInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1778480242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocketActivityInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d8a42e4a87e4b749968185b2511defe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocketActivityInformation(ptr: Pointer?): WithDefault =
        ISocketActivityInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocketActivityInformation {
      val address = segment.toRawLongValue()
      return makeISocketActivityInformation(Pointer(address))
    }

    public override fun toNative(obj: ISocketActivityInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1778480242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocketActivityInformation):
        Array<ISocketActivityInformation?> = (elements as
        Array<ISocketActivityInformation?>).castToImpl<ISocketActivityInformation,ISocketActivityInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocketActivityInformation?> =
        arrayOfNulls<ISocketActivityInformation_Impl>(size) as Array<ISocketActivityInformation?>
  }
}
