package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IStreetsideExperience.ABI::class)
@Signature("{a558aec9-e30c-46c8-8116-484691675558}")
@Guid("a558aec9e30c46c88116484691675558")
@WinRTInterface("a558aec9e30c46c88116484691675558")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreetsideExperience.ByReference::class)
public interface IStreetsideExperience : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AddressTextVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_AddressTextVisible(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CursorVisible(): Boolean

  @InterfaceMethod(3)
  public fun put_CursorVisible(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_OverviewMapVisible(): Boolean

  @InterfaceMethod(5)
  public fun put_OverviewMapVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_StreetLabelsVisible(): Boolean

  @InterfaceMethod(7)
  public fun put_StreetLabelsVisible(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_ExitButtonVisible(): Boolean

  @InterfaceMethod(9)
  public fun put_ExitButtonVisible(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_ZoomButtonsVisible(): Boolean

  @InterfaceMethod(11)
  public fun put_ZoomButtonsVisible(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreetsideExperience> {
    public override fun getValue() = ABI.makeIStreetsideExperience(pointer.getPointer(0))

    public fun setValue(value: IStreetsideExperience_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreetsideExperience {
    public val __857891915_Ptr: Pointer?

    public val _857891915_VtblPtr: Pointer?
      get() = __857891915_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AddressTextVisible(): Boolean {
      val fnPtr = _857891915_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AddressTextVisible(value: Boolean): Unit {
      val fnPtr = _857891915_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CursorVisible(): Boolean {
      val fnPtr = _857891915_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CursorVisible(value: Boolean): Unit {
      val fnPtr = _857891915_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OverviewMapVisible(): Boolean {
      val fnPtr = _857891915_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_OverviewMapVisible(value: Boolean): Unit {
      val fnPtr = _857891915_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_StreetLabelsVisible(): Boolean {
      val fnPtr = _857891915_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_StreetLabelsVisible(value: Boolean): Unit {
      val fnPtr = _857891915_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ExitButtonVisible(): Boolean {
      val fnPtr = _857891915_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_ExitButtonVisible(value: Boolean): Unit {
      val fnPtr = _857891915_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ZoomButtonsVisible(): Boolean {
      val fnPtr = _857891915_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_ZoomButtonsVisible(value: Boolean): Unit {
      val fnPtr = _857891915_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__857891915_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreetsideExperience_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __857891915_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreetsideExperience, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a558aec9e30c46c88116484691675558")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreetsideExperience(ptr: Pointer?): WithDefault =
        IStreetsideExperience_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreetsideExperience {
      val address = segment.toRawLongValue()
      return makeIStreetsideExperience(Pointer(address))
    }

    public override fun toNative(obj: IStreetsideExperience): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__857891915_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreetsideExperience): Array<IStreetsideExperience?> =
        (elements as
        Array<IStreetsideExperience?>).castToImpl<IStreetsideExperience,IStreetsideExperience_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreetsideExperience?> =
        arrayOfNulls<IStreetsideExperience_Impl>(size) as Array<IStreetsideExperience?>
  }
}
