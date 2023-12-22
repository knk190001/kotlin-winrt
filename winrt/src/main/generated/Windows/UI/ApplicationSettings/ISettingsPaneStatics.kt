package Windows.UI.ApplicationSettings

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

@ABIMarker(ISettingsPaneStatics.ABI::class)
@Signature("{1c6a52c5-ff19-471b-ba6b-f8f35694ad9a}")
@Guid("1c6a52c5ff19471bba6bf8f35694ad9a")
@WinRTInterface("1c6a52c5ff19471bba6bf8f35694ad9a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISettingsPaneStatics.ByReference::class)
public interface ISettingsPaneStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): SettingsPane?

  @InterfaceMethod(1)
  public fun Show(): Unit

  @InterfaceMethod(2)
  public fun get_Edge(): SettingsEdgeLocation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISettingsPaneStatics> {
    public override fun getValue() = ABI.makeISettingsPaneStatics(pointer.getPointer(0))

    public fun setValue(value: ISettingsPaneStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISettingsPaneStatics {
    public val __1860648683_Ptr: Pointer?

    public val _1860648683_VtblPtr: Pointer?
      get() = __1860648683_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): SettingsPane? {
      val fnPtr = _1860648683_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SettingsPane>()
      val hr = fn.invokeHR(arrayOf(__1860648683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SettingsPane>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Show(): Unit {
      val fnPtr = _1860648683_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1860648683_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Edge(): SettingsEdgeLocation? {
      val fnPtr = _1860648683_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SettingsEdgeLocation>()
      val hr = fn.invokeHR(arrayOf(__1860648683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SettingsEdgeLocation>(result.getValue())
      return resultValue
    }
  }

  public class ISettingsPaneStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1860648683_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISettingsPaneStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c6a52c5ff19471bba6bf8f35694ad9a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISettingsPaneStatics(ptr: Pointer?): WithDefault = ISettingsPaneStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISettingsPaneStatics {
      val address = segment.toRawLongValue()
      return makeISettingsPaneStatics(Pointer(address))
    }

    public override fun toNative(obj: ISettingsPaneStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1860648683_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISettingsPaneStatics): Array<ISettingsPaneStatics?> =
        (elements as
        Array<ISettingsPaneStatics?>).castToImpl<ISettingsPaneStatics,ISettingsPaneStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISettingsPaneStatics?> =
        arrayOfNulls<ISettingsPaneStatics_Impl>(size) as Array<ISettingsPaneStatics?>
  }
}
