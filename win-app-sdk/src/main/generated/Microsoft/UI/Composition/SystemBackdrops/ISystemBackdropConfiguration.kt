package Microsoft.UI.Composition.SystemBackdrops

import Windows.Foundation.IReference
import Windows.UI.Color
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemBackdropConfiguration.ABI::class)
@Signature("{ebcce1b9-0e0c-5431-ab0e-00f3f0669962}")
@Guid("ebcce1b90e0c5431ab0e00f3f0669962")
@WinRTInterface("ebcce1b90e0c5431ab0e00f3f0669962")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemBackdropConfiguration.ByReference::class)
public interface ISystemBackdropConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HighContrastBackgroundColor(): IReference<Color?>?

  @InterfaceMethod(1)
  public fun put_HighContrastBackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(2)
  public fun get_IsHighContrast(): Boolean

  @InterfaceMethod(3)
  public fun put_IsHighContrast(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsInputActive(): Boolean

  @InterfaceMethod(5)
  public fun put_IsInputActive(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_Theme(): SystemBackdropTheme?

  @InterfaceMethod(7)
  public fun put_Theme(value: SystemBackdropTheme?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemBackdropConfiguration> {
    public override fun getValue() = ABI.makeISystemBackdropConfiguration(pointer.getPointer(0))

    public fun setValue(value: ISystemBackdropConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemBackdropConfiguration {
    public val __179160312_Ptr: Pointer?

    public val _179160312_VtblPtr: Pointer?
      get() = __179160312_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HighContrastBackgroundColor(): IReference<Color?>? {
      val fnPtr = _179160312_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__179160312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HighContrastBackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _179160312_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__179160312_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsHighContrast(): Boolean {
      val fnPtr = _179160312_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__179160312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsHighContrast(value: Boolean): Unit {
      val fnPtr = _179160312_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__179160312_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsInputActive(): Boolean {
      val fnPtr = _179160312_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__179160312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsInputActive(value: Boolean): Unit {
      val fnPtr = _179160312_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__179160312_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Theme(): SystemBackdropTheme? {
      val fnPtr = _179160312_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemBackdropTheme>()
      val hr = fn.invokeHR(arrayOf(__179160312_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemBackdropTheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Theme(value: SystemBackdropTheme?): Unit {
      val fnPtr = _179160312_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__179160312_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemBackdropConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __179160312_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemBackdropConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ebcce1b90e0c5431ab0e00f3f0669962")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemBackdropConfiguration(ptr: Pointer?): WithDefault =
        ISystemBackdropConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemBackdropConfiguration {
      val address = segment.toRawLongValue()
      return makeISystemBackdropConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ISystemBackdropConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__179160312_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemBackdropConfiguration):
        Array<ISystemBackdropConfiguration?> = (elements as
        Array<ISystemBackdropConfiguration?>).castToImpl<ISystemBackdropConfiguration,ISystemBackdropConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemBackdropConfiguration?> =
        arrayOfNulls<ISystemBackdropConfiguration_Impl>(size) as
        Array<ISystemBackdropConfiguration?>
  }
}
