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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITileUpdateManagerStatics2.ABI::class)
@Signature("{731c1ddc-8e14-4b7c-a34b-9d22de76c84d}")
@Guid("731c1ddc8e144b7ca34b9d22de76c84d")
@WinRTInterface("731c1ddc8e144b7ca34b9d22de76c84d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileUpdateManagerStatics2.ByReference::class)
public interface ITileUpdateManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): TileUpdateManagerForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileUpdateManagerStatics2> {
    public override fun getValue() = ABI.makeITileUpdateManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: ITileUpdateManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileUpdateManagerStatics2 {
    public val __1376551763_Ptr: Pointer?

    public val _1376551763_VtblPtr: Pointer?
      get() = __1376551763_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): TileUpdateManagerForUser? {
      val fnPtr = _1376551763_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileUpdateManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__1376551763_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileUpdateManagerForUser>(result.getValue())
      return resultValue
    }
  }

  public class ITileUpdateManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1376551763_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileUpdateManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("731c1ddc8e144b7ca34b9d22de76c84d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileUpdateManagerStatics2(ptr: Pointer?): WithDefault =
        ITileUpdateManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileUpdateManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeITileUpdateManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITileUpdateManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1376551763_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileUpdateManagerStatics2):
        Array<ITileUpdateManagerStatics2?> = (elements as
        Array<ITileUpdateManagerStatics2?>).castToImpl<ITileUpdateManagerStatics2,ITileUpdateManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileUpdateManagerStatics2?> =
        arrayOfNulls<ITileUpdateManagerStatics2_Impl>(size) as Array<ITileUpdateManagerStatics2?>
  }
}
