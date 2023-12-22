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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISocketActivityTriggerDetails.ABI::class)
@Signature("{45f406a7-fc9f-4f81-acad-355fef51e67b}")
@Guid("45f406a7fc9f4f81acad355fef51e67b")
@WinRTInterface("45f406a7fc9f4f81acad355fef51e67b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocketActivityTriggerDetails.ByReference::class)
public interface ISocketActivityTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): SocketActivityTriggerReason?

  @InterfaceMethod(1)
  public fun get_SocketInformation(): SocketActivityInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocketActivityTriggerDetails> {
    public override fun getValue() = ABI.makeISocketActivityTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ISocketActivityTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocketActivityTriggerDetails {
    public val __1329772444_Ptr: Pointer?

    public val _1329772444_VtblPtr: Pointer?
      get() = __1329772444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): SocketActivityTriggerReason? {
      val fnPtr = _1329772444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketActivityTriggerReason>()
      val hr = fn.invokeHR(arrayOf(__1329772444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketActivityTriggerReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SocketInformation(): SocketActivityInformation? {
      val fnPtr = _1329772444_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketActivityInformation>()
      val hr = fn.invokeHR(arrayOf(__1329772444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketActivityInformation>(result.getValue())
      return resultValue
    }
  }

  public class ISocketActivityTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1329772444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocketActivityTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45f406a7fc9f4f81acad355fef51e67b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocketActivityTriggerDetails(ptr: Pointer?): WithDefault =
        ISocketActivityTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocketActivityTriggerDetails {
      val address = segment.toRawLongValue()
      return makeISocketActivityTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ISocketActivityTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1329772444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocketActivityTriggerDetails):
        Array<ISocketActivityTriggerDetails?> = (elements as
        Array<ISocketActivityTriggerDetails?>).castToImpl<ISocketActivityTriggerDetails,ISocketActivityTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocketActivityTriggerDetails?> =
        arrayOfNulls<ISocketActivityTriggerDetails_Impl>(size) as
        Array<ISocketActivityTriggerDetails?>
  }
}
