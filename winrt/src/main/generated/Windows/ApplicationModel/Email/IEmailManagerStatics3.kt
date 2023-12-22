package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailManagerStatics3.ABI::class)
@Signature("{4a722395-843e-4945-b3aa-349e07a362c5}")
@Guid("4a722395843e4945b3aa349e07a362c5")
@WinRTInterface("4a722395843e4945b3aa349e07a362c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailManagerStatics3.ByReference::class)
public interface IEmailManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): EmailManagerForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailManagerStatics3> {
    public override fun getValue() = ABI.makeIEmailManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IEmailManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailManagerStatics3 {
    public val __1419544394_Ptr: Pointer?

    public val _1419544394_VtblPtr: Pointer?
      get() = __1419544394_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): EmailManagerForUser? {
      val fnPtr = _1419544394_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__1419544394_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailManagerForUser>(result.getValue())
      return resultValue
    }
  }

  public class IEmailManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1419544394_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a722395843e4945b3aa349e07a362c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailManagerStatics3(ptr: Pointer?): WithDefault =
        IEmailManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIEmailManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IEmailManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1419544394_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailManagerStatics3): Array<IEmailManagerStatics3?> =
        (elements as
        Array<IEmailManagerStatics3?>).castToImpl<IEmailManagerStatics3,IEmailManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailManagerStatics3?> =
        arrayOfNulls<IEmailManagerStatics3_Impl>(size) as Array<IEmailManagerStatics3?>
  }
}
