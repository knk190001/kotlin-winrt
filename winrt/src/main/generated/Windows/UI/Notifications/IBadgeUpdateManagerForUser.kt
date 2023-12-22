package Windows.UI.Notifications

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

@ABIMarker(IBadgeUpdateManagerForUser.ABI::class)
@Signature("{996b21bc-0386-44e5-ba8d-0c1077a62e92}")
@Guid("996b21bc038644e5ba8d0c1077a62e92")
@WinRTInterface("996b21bc038644e5ba8d0c1077a62e92")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBadgeUpdateManagerForUser.ByReference::class)
public interface IBadgeUpdateManagerForUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateBadgeUpdaterForApplication(): BadgeUpdater?

  @InterfaceMethod(1)
  public fun CreateBadgeUpdaterForApplication(applicationId: String?): BadgeUpdater?

  @InterfaceMethod(2)
  public fun CreateBadgeUpdaterForSecondaryTile(tileId: String?): BadgeUpdater?

  @InterfaceMethod(3)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBadgeUpdateManagerForUser> {
    public override fun getValue() = ABI.makeIBadgeUpdateManagerForUser(pointer.getPointer(0))

    public fun setValue(value: IBadgeUpdateManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBadgeUpdateManagerForUser {
    public val __2026391869_Ptr: Pointer?

    public val _2026391869_VtblPtr: Pointer?
      get() = __2026391869_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateBadgeUpdaterForApplication(): BadgeUpdater? {
      val fnPtr = _2026391869_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeUpdater>()
      val hr = fn.invokeHR(arrayOf(__2026391869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateBadgeUpdaterForApplication(applicationId: String?): BadgeUpdater? {
      val fnPtr = _2026391869_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeUpdater>()
      val hr = fn.invokeHR(arrayOf(__2026391869_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateBadgeUpdaterForSecondaryTile(tileId: String?): BadgeUpdater? {
      val fnPtr = _2026391869_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeUpdater>()
      val hr = fn.invokeHR(arrayOf(__2026391869_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_User(): User? {
      val fnPtr = _2026391869_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__2026391869_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IBadgeUpdateManagerForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2026391869_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBadgeUpdateManagerForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("996b21bc038644e5ba8d0c1077a62e92")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBadgeUpdateManagerForUser(ptr: Pointer?): WithDefault =
        IBadgeUpdateManagerForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBadgeUpdateManagerForUser {
      val address = segment.toRawLongValue()
      return makeIBadgeUpdateManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: IBadgeUpdateManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2026391869_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBadgeUpdateManagerForUser):
        Array<IBadgeUpdateManagerForUser?> = (elements as
        Array<IBadgeUpdateManagerForUser?>).castToImpl<IBadgeUpdateManagerForUser,IBadgeUpdateManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBadgeUpdateManagerForUser?> =
        arrayOfNulls<IBadgeUpdateManagerForUser_Impl>(size) as Array<IBadgeUpdateManagerForUser?>
  }
}
