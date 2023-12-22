package Windows.System

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimeZoneSettingsStatics.ABI::class)
@Signature("{9b3b2bea-a101-41ae-9fbd-028728bab73d}")
@Guid("9b3b2beaa10141ae9fbd028728bab73d")
@WinRTInterface("9b3b2beaa10141ae9fbd028728bab73d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimeZoneSettingsStatics.ByReference::class)
public interface ITimeZoneSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentTimeZoneDisplayName(): String?

  @InterfaceMethod(1)
  public fun get_SupportedTimeZoneDisplayNames(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun get_CanChangeTimeZone(): Boolean

  @InterfaceMethod(3)
  public fun ChangeTimeZoneByDisplayName(timeZoneDisplayName: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimeZoneSettingsStatics> {
    public override fun getValue() = ABI.makeITimeZoneSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: ITimeZoneSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimeZoneSettingsStatics {
    public val __1997827974_Ptr: Pointer?

    public val _1997827974_VtblPtr: Pointer?
      get() = __1997827974_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentTimeZoneDisplayName(): String? {
      val fnPtr = _1997827974_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1997827974_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedTimeZoneDisplayNames(): IVectorView<String?>? {
      val fnPtr = _1997827974_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1997827974_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CanChangeTimeZone(): Boolean {
      val fnPtr = _1997827974_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1997827974_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun ChangeTimeZoneByDisplayName(timeZoneDisplayName: String?): Unit {
      val fnPtr = _1997827974_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1997827974_Ptr, marshalToNative(timeZoneDisplayName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimeZoneSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1997827974_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimeZoneSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b3b2beaa10141ae9fbd028728bab73d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimeZoneSettingsStatics(ptr: Pointer?): WithDefault =
        ITimeZoneSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimeZoneSettingsStatics {
      val address = segment.toRawLongValue()
      return makeITimeZoneSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: ITimeZoneSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1997827974_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimeZoneSettingsStatics):
        Array<ITimeZoneSettingsStatics?> = (elements as
        Array<ITimeZoneSettingsStatics?>).castToImpl<ITimeZoneSettingsStatics,ITimeZoneSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimeZoneSettingsStatics?> =
        arrayOfNulls<ITimeZoneSettingsStatics_Impl>(size) as Array<ITimeZoneSettingsStatics?>
  }
}
