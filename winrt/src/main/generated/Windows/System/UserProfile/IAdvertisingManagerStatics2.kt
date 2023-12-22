package Windows.System.UserProfile

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

@ABIMarker(IAdvertisingManagerStatics2.ABI::class)
@Signature("{dd0947af-1a6d-46b0-95bc-f3f9d6beb9fb}")
@Guid("dd0947af1a6d46b095bcf3f9d6beb9fb")
@WinRTInterface("dd0947af1a6d46b095bcf3f9d6beb9fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvertisingManagerStatics2.ByReference::class)
public interface IAdvertisingManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): AdvertisingManagerForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvertisingManagerStatics2> {
    public override fun getValue() = ABI.makeIAdvertisingManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IAdvertisingManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvertisingManagerStatics2 {
    public val __461407883_Ptr: Pointer?

    public val _461407883_VtblPtr: Pointer?
      get() = __461407883_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): AdvertisingManagerForUser? {
      val fnPtr = _461407883_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdvertisingManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__461407883_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdvertisingManagerForUser>(result.getValue())
      return resultValue
    }
  }

  public class IAdvertisingManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __461407883_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvertisingManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd0947af1a6d46b095bcf3f9d6beb9fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvertisingManagerStatics2(ptr: Pointer?): WithDefault =
        IAdvertisingManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvertisingManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIAdvertisingManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAdvertisingManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__461407883_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvertisingManagerStatics2):
        Array<IAdvertisingManagerStatics2?> = (elements as
        Array<IAdvertisingManagerStatics2?>).castToImpl<IAdvertisingManagerStatics2,IAdvertisingManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvertisingManagerStatics2?> =
        arrayOfNulls<IAdvertisingManagerStatics2_Impl>(size) as Array<IAdvertisingManagerStatics2?>
  }
}
