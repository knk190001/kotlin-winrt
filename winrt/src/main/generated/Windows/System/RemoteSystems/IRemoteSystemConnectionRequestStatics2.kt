package Windows.System.RemoteSystems

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystemConnectionRequestStatics2.ABI::class)
@Signature("{460f1027-64ec-598e-a800-4f2ee58def19}")
@Guid("460f102764ec598ea8004f2ee58def19")
@WinRTInterface("460f102764ec598ea8004f2ee58def19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemConnectionRequestStatics2.ByReference::class)
public interface IRemoteSystemConnectionRequestStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromConnectionToken(connectionToken: String?): RemoteSystemConnectionRequest?

  @InterfaceMethod(1)
  public fun CreateFromConnectionTokenForUser(user: User?, connectionToken: String?):
      RemoteSystemConnectionRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemConnectionRequestStatics2> {
    public override fun getValue() =
        ABI.makeIRemoteSystemConnectionRequestStatics2(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemConnectionRequestStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemConnectionRequestStatics2 {
    public val __823886518_Ptr: Pointer?

    public val _823886518_VtblPtr: Pointer?
      get() = __823886518_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromConnectionToken(connectionToken: String?):
        RemoteSystemConnectionRequest? {
      val fnPtr = _823886518_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemConnectionRequest>()
      val hr = fn.invokeHR(arrayOf(__823886518_Ptr, marshalToNative(connectionToken), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemConnectionRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromConnectionTokenForUser(user: User?, connectionToken: String?):
        RemoteSystemConnectionRequest? {
      val fnPtr = _823886518_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemConnectionRequest>()
      val hr = fn.invokeHR(arrayOf(__823886518_Ptr, marshalToNative(user),
          marshalToNative(connectionToken), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemConnectionRequest>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemConnectionRequestStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __823886518_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemConnectionRequestStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("460f102764ec598ea8004f2ee58def19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemConnectionRequestStatics2(ptr: Pointer?): WithDefault =
        IRemoteSystemConnectionRequestStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemConnectionRequestStatics2 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemConnectionRequestStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemConnectionRequestStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__823886518_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemConnectionRequestStatics2):
        Array<IRemoteSystemConnectionRequestStatics2?> = (elements as
        Array<IRemoteSystemConnectionRequestStatics2?>).castToImpl<IRemoteSystemConnectionRequestStatics2,IRemoteSystemConnectionRequestStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemConnectionRequestStatics2?> =
        arrayOfNulls<IRemoteSystemConnectionRequestStatics2_Impl>(size) as
        Array<IRemoteSystemConnectionRequestStatics2?>
  }
}
