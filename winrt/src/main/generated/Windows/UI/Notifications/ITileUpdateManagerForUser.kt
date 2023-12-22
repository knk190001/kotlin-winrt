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

@ABIMarker(ITileUpdateManagerForUser.ABI::class)
@Signature("{55141348-2ee2-4e2d-9cc1-216a20decc9f}")
@Guid("551413482ee24e2d9cc1216a20decc9f")
@WinRTInterface("551413482ee24e2d9cc1216a20decc9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileUpdateManagerForUser.ByReference::class)
public interface ITileUpdateManagerForUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateTileUpdaterForApplicationForUser(): TileUpdater?

  @InterfaceMethod(1)
  public fun CreateTileUpdaterForApplication(applicationId: String?): TileUpdater?

  @InterfaceMethod(2)
  public fun CreateTileUpdaterForSecondaryTile(tileId: String?): TileUpdater?

  @InterfaceMethod(3)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileUpdateManagerForUser> {
    public override fun getValue() = ABI.makeITileUpdateManagerForUser(pointer.getPointer(0))

    public fun setValue(value: ITileUpdateManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileUpdateManagerForUser {
    public val __1923189458_Ptr: Pointer?

    public val _1923189458_VtblPtr: Pointer?
      get() = __1923189458_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateTileUpdaterForApplicationForUser(): TileUpdater? {
      val fnPtr = _1923189458_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileUpdater>()
      val hr = fn.invokeHR(arrayOf(__1923189458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateTileUpdaterForApplication(applicationId: String?): TileUpdater? {
      val fnPtr = _1923189458_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileUpdater>()
      val hr = fn.invokeHR(arrayOf(__1923189458_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateTileUpdaterForSecondaryTile(tileId: String?): TileUpdater? {
      val fnPtr = _1923189458_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileUpdater>()
      val hr = fn.invokeHR(arrayOf(__1923189458_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_User(): User? {
      val fnPtr = _1923189458_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1923189458_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class ITileUpdateManagerForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1923189458_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileUpdateManagerForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("551413482ee24e2d9cc1216a20decc9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileUpdateManagerForUser(ptr: Pointer?): WithDefault =
        ITileUpdateManagerForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileUpdateManagerForUser {
      val address = segment.toRawLongValue()
      return makeITileUpdateManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: ITileUpdateManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1923189458_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileUpdateManagerForUser):
        Array<ITileUpdateManagerForUser?> = (elements as
        Array<ITileUpdateManagerForUser?>).castToImpl<ITileUpdateManagerForUser,ITileUpdateManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileUpdateManagerForUser?> =
        arrayOfNulls<ITileUpdateManagerForUser_Impl>(size) as Array<ITileUpdateManagerForUser?>
  }
}
