package Windows.UI.Input.Inking

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

@ABIMarker(IPenAndInkSettingsStatics.ABI::class)
@Signature("{ed6dd036-5708-5c3c-96db-f2f552eab641}")
@Guid("ed6dd03657085c3c96dbf2f552eab641")
@WinRTInterface("ed6dd03657085c3c96dbf2f552eab641")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenAndInkSettingsStatics.ByReference::class)
public interface IPenAndInkSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): PenAndInkSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenAndInkSettingsStatics> {
    public override fun getValue() = ABI.makeIPenAndInkSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IPenAndInkSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenAndInkSettingsStatics {
    public val __1466343532_Ptr: Pointer?

    public val _1466343532_VtblPtr: Pointer?
      get() = __1466343532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): PenAndInkSettings? {
      val fnPtr = _1466343532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenAndInkSettings>()
      val hr = fn.invokeHR(arrayOf(__1466343532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenAndInkSettings>(result.getValue())
      return resultValue
    }
  }

  public class IPenAndInkSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1466343532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenAndInkSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed6dd03657085c3c96dbf2f552eab641")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenAndInkSettingsStatics(ptr: Pointer?): WithDefault =
        IPenAndInkSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenAndInkSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIPenAndInkSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IPenAndInkSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1466343532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenAndInkSettingsStatics):
        Array<IPenAndInkSettingsStatics?> = (elements as
        Array<IPenAndInkSettingsStatics?>).castToImpl<IPenAndInkSettingsStatics,IPenAndInkSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenAndInkSettingsStatics?> =
        arrayOfNulls<IPenAndInkSettingsStatics_Impl>(size) as Array<IPenAndInkSettingsStatics?>
  }
}
