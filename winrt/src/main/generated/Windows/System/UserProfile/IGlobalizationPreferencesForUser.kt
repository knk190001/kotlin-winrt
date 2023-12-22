package Windows.System.UserProfile

import Windows.Foundation.Collections.IVectorView
import Windows.Globalization.DayOfWeek
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

@ABIMarker(IGlobalizationPreferencesForUser.ABI::class)
@Signature("{150f0795-4f6e-40ba-a010-e27d81bda7f5}")
@Guid("150f07954f6e40baa010e27d81bda7f5")
@WinRTInterface("150f07954f6e40baa010e27d81bda7f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGlobalizationPreferencesForUser.ByReference::class)
public interface IGlobalizationPreferencesForUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  @InterfaceMethod(1)
  public fun get_Calendars(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun get_Clocks(): IVectorView<String?>?

  @InterfaceMethod(3)
  public fun get_Currencies(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun get_Languages(): IVectorView<String?>?

  @InterfaceMethod(5)
  public fun get_HomeGeographicRegion(): String?

  @InterfaceMethod(6)
  public fun get_WeekStartsOn(): DayOfWeek?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGlobalizationPreferencesForUser> {
    public override fun getValue() = ABI.makeIGlobalizationPreferencesForUser(pointer.getPointer(0))

    public fun setValue(value: IGlobalizationPreferencesForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlobalizationPreferencesForUser {
    public val __1814922914_Ptr: Pointer?

    public val _1814922914_VtblPtr: Pointer?
      get() = __1814922914_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _1814922914_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1814922914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Calendars(): IVectorView<String?>? {
      val fnPtr = _1814922914_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1814922914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Clocks(): IVectorView<String?>? {
      val fnPtr = _1814922914_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1814922914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Currencies(): IVectorView<String?>? {
      val fnPtr = _1814922914_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1814922914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Languages(): IVectorView<String?>? {
      val fnPtr = _1814922914_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1814922914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HomeGeographicRegion(): String? {
      val fnPtr = _1814922914_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1814922914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_WeekStartsOn(): DayOfWeek? {
      val fnPtr = _1814922914_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DayOfWeek>()
      val hr = fn.invokeHR(arrayOf(__1814922914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DayOfWeek>(result.getValue())
      return resultValue
    }
  }

  public class IGlobalizationPreferencesForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1814922914_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlobalizationPreferencesForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("150f07954f6e40baa010e27d81bda7f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlobalizationPreferencesForUser(ptr: Pointer?): WithDefault =
        IGlobalizationPreferencesForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGlobalizationPreferencesForUser {
      val address = segment.toRawLongValue()
      return makeIGlobalizationPreferencesForUser(Pointer(address))
    }

    public override fun toNative(obj: IGlobalizationPreferencesForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1814922914_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGlobalizationPreferencesForUser):
        Array<IGlobalizationPreferencesForUser?> = (elements as
        Array<IGlobalizationPreferencesForUser?>).castToImpl<IGlobalizationPreferencesForUser,IGlobalizationPreferencesForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGlobalizationPreferencesForUser?> =
        arrayOfNulls<IGlobalizationPreferencesForUser_Impl>(size) as
        Array<IGlobalizationPreferencesForUser?>
  }
}
