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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPenAndInkSettings.ABI::class)
@Signature("{bc2ceb8f-0066-44a8-bb7a-b839b3deb8f5}")
@Guid("bc2ceb8f006644a8bb7ab839b3deb8f5")
@WinRTInterface("bc2ceb8f006644a8bb7ab839b3deb8f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenAndInkSettings.ByReference::class)
public interface IPenAndInkSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsHandwritingDirectlyIntoTextFieldEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_PenHandedness(): PenHandedness?

  @InterfaceMethod(2)
  public fun get_HandwritingLineHeight(): HandwritingLineHeight?

  @InterfaceMethod(3)
  public fun get_FontFamilyName(): String?

  @InterfaceMethod(4)
  public fun get_UserConsentsToHandwritingTelemetryCollection(): Boolean

  @InterfaceMethod(5)
  public fun get_IsTouchHandwritingEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenAndInkSettings> {
    public override fun getValue() = ABI.makeIPenAndInkSettings(pointer.getPointer(0))

    public fun setValue(value: IPenAndInkSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenAndInkSettings {
    public val __103958799_Ptr: Pointer?

    public val _103958799_VtblPtr: Pointer?
      get() = __103958799_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsHandwritingDirectlyIntoTextFieldEnabled(): Boolean {
      val fnPtr = _103958799_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__103958799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PenHandedness(): PenHandedness? {
      val fnPtr = _103958799_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenHandedness>()
      val hr = fn.invokeHR(arrayOf(__103958799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenHandedness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HandwritingLineHeight(): HandwritingLineHeight? {
      val fnPtr = _103958799_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HandwritingLineHeight>()
      val hr = fn.invokeHR(arrayOf(__103958799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HandwritingLineHeight>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FontFamilyName(): String? {
      val fnPtr = _103958799_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__103958799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_UserConsentsToHandwritingTelemetryCollection(): Boolean {
      val fnPtr = _103958799_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__103958799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsTouchHandwritingEnabled(): Boolean {
      val fnPtr = _103958799_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__103958799_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPenAndInkSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __103958799_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenAndInkSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc2ceb8f006644a8bb7ab839b3deb8f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenAndInkSettings(ptr: Pointer?): WithDefault = IPenAndInkSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenAndInkSettings {
      val address = segment.toRawLongValue()
      return makeIPenAndInkSettings(Pointer(address))
    }

    public override fun toNative(obj: IPenAndInkSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__103958799_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenAndInkSettings): Array<IPenAndInkSettings?> =
        (elements as
        Array<IPenAndInkSettings?>).castToImpl<IPenAndInkSettings,IPenAndInkSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenAndInkSettings?> =
        arrayOfNulls<IPenAndInkSettings_Impl>(size) as Array<IPenAndInkSettings?>
  }
}
