package Windows.ApplicationModel.UserActivities

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IUserActivityStatics.ABI::class)
@Signature("{8c8fd333-0e09-47f6-9ac7-95cf5c39367b}")
@Guid("8c8fd3330e0947f69ac795cf5c39367b")
@WinRTInterface("8c8fd3330e0947f69ac795cf5c39367b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityStatics.ByReference::class)
public interface IUserActivityStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryParseFromJson(json: String?): UserActivity?

  @InterfaceMethod(1)
  public fun TryParseFromJsonArray(json: String?): IVector<UserActivity?>?

  @InterfaceMethod(2)
  public fun ToJsonArray(activities: IIterable<UserActivity?>?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityStatics> {
    public override fun getValue() = ABI.makeIUserActivityStatics(pointer.getPointer(0))

    public fun setValue(value: IUserActivityStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityStatics {
    public val __1972800452_Ptr: Pointer?

    public val _1972800452_VtblPtr: Pointer?
      get() = __1972800452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryParseFromJson(json: String?): UserActivity? {
      val fnPtr = _1972800452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivity>()
      val hr = fn.invokeHR(arrayOf(__1972800452_Ptr, marshalToNative(json), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParseFromJsonArray(json: String?): IVector<UserActivity?>? {
      val fnPtr = _1972800452_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<UserActivity?>>()
      val hr = fn.invokeHR(arrayOf(__1972800452_Ptr, marshalToNative(json), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<UserActivity?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ToJsonArray(activities: IIterable<UserActivity?>?): String? {
      val fnPtr = _1972800452_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1972800452_Ptr, marshalToNative(activities), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1972800452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c8fd3330e0947f69ac795cf5c39367b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityStatics(ptr: Pointer?): WithDefault = IUserActivityStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityStatics {
      val address = segment.toRawLongValue()
      return makeIUserActivityStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1972800452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityStatics): Array<IUserActivityStatics?> =
        (elements as
        Array<IUserActivityStatics?>).castToImpl<IUserActivityStatics,IUserActivityStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityStatics?> =
        arrayOfNulls<IUserActivityStatics_Impl>(size) as Array<IUserActivityStatics?>
  }
}
