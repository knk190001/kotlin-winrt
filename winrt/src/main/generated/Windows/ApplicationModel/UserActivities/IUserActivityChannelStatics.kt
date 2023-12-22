package Windows.ApplicationModel.UserActivities

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

@ABIMarker(IUserActivityChannelStatics.ABI::class)
@Signature("{c8c005ab-198d-4d80-abb2-c9775ec4a729}")
@Guid("c8c005ab198d4d80abb2c9775ec4a729")
@WinRTInterface("c8c005ab198d4d80abb2c9775ec4a729")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityChannelStatics.ByReference::class)
public interface IUserActivityChannelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): UserActivityChannel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityChannelStatics> {
    public override fun getValue() = ABI.makeIUserActivityChannelStatics(pointer.getPointer(0))

    public fun setValue(value: IUserActivityChannelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityChannelStatics {
    public val __1090832483_Ptr: Pointer?

    public val _1090832483_VtblPtr: Pointer?
      get() = __1090832483_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): UserActivityChannel? {
      val fnPtr = _1090832483_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivityChannel>()
      val hr = fn.invokeHR(arrayOf(__1090832483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivityChannel>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityChannelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1090832483_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityChannelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8c005ab198d4d80abb2c9775ec4a729")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityChannelStatics(ptr: Pointer?): WithDefault =
        IUserActivityChannelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityChannelStatics {
      val address = segment.toRawLongValue()
      return makeIUserActivityChannelStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityChannelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1090832483_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityChannelStatics):
        Array<IUserActivityChannelStatics?> = (elements as
        Array<IUserActivityChannelStatics?>).castToImpl<IUserActivityChannelStatics,IUserActivityChannelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityChannelStatics?> =
        arrayOfNulls<IUserActivityChannelStatics_Impl>(size) as Array<IUserActivityChannelStatics?>
  }
}
