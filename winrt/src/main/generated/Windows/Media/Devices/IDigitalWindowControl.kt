package Windows.Media.Devices

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDigitalWindowControl.ABI::class)
@Signature("{23b69eff-65d2-53ea-8780-de582b48b544}")
@Guid("23b69eff65d253ea8780de582b48b544")
@WinRTInterface("23b69eff65d253ea8780de582b48b544")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDigitalWindowControl.ByReference::class)
public interface IDigitalWindowControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedModes(): Array<DigitalWindowMode?>?

  @InterfaceMethod(2)
  public fun get_CurrentMode(): DigitalWindowMode?

  @InterfaceMethod(3)
  public fun GetBounds(): DigitalWindowBounds?

  @InterfaceMethod(4)
  public fun Configure(digitalWindowMode: DigitalWindowMode?): Unit

  @InterfaceMethod(5)
  public fun Configure(digitalWindowMode: DigitalWindowMode?,
      digitalWindowBounds: DigitalWindowBounds?): Unit

  @InterfaceMethod(6)
  public fun get_SupportedCapabilities(): IVectorView<DigitalWindowCapability?>?

  @InterfaceMethod(7)
  public fun GetCapabilityForSize(width: Int, height: Int): DigitalWindowCapability?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDigitalWindowControl> {
    public override fun getValue() = ABI.makeIDigitalWindowControl(pointer.getPointer(0))

    public fun setValue(value: IDigitalWindowControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDigitalWindowControl {
    public val __2001605302_Ptr: Pointer?

    public val _2001605302_VtblPtr: Pointer?
      get() = __2001605302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _2001605302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2001605302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedModes(): Array<DigitalWindowMode?>? {
      val fnPtr = _2001605302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<DigitalWindowMode>()
      val hr = fn.invokeHR(arrayOf(__2001605302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CurrentMode(): DigitalWindowMode? {
      val fnPtr = _2001605302_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DigitalWindowMode>()
      val hr = fn.invokeHR(arrayOf(__2001605302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DigitalWindowMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetBounds(): DigitalWindowBounds? {
      val fnPtr = _2001605302_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DigitalWindowBounds>()
      val hr = fn.invokeHR(arrayOf(__2001605302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DigitalWindowBounds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Configure(digitalWindowMode: DigitalWindowMode?): Unit {
      val fnPtr = _2001605302_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2001605302_Ptr, marshalToNative(digitalWindowMode),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Configure(digitalWindowMode: DigitalWindowMode?,
        digitalWindowBounds: DigitalWindowBounds?): Unit {
      val fnPtr = _2001605302_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2001605302_Ptr, marshalToNative(digitalWindowMode),
          marshalToNative(digitalWindowBounds),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SupportedCapabilities(): IVectorView<DigitalWindowCapability?>? {
      val fnPtr = _2001605302_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DigitalWindowCapability?>>()
      val hr = fn.invokeHR(arrayOf(__2001605302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DigitalWindowCapability?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetCapabilityForSize(width: Int, height: Int): DigitalWindowCapability? {
      val fnPtr = _2001605302_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DigitalWindowCapability>()
      val hr = fn.invokeHR(arrayOf(__2001605302_Ptr, width, height, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DigitalWindowCapability>(result.getValue())
      return resultValue
    }
  }

  public class IDigitalWindowControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2001605302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDigitalWindowControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23b69eff65d253ea8780de582b48b544")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDigitalWindowControl(ptr: Pointer?): WithDefault =
        IDigitalWindowControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDigitalWindowControl {
      val address = segment.toRawLongValue()
      return makeIDigitalWindowControl(Pointer(address))
    }

    public override fun toNative(obj: IDigitalWindowControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2001605302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDigitalWindowControl): Array<IDigitalWindowControl?> =
        (elements as
        Array<IDigitalWindowControl?>).castToImpl<IDigitalWindowControl,IDigitalWindowControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDigitalWindowControl?> =
        arrayOfNulls<IDigitalWindowControl_Impl>(size) as Array<IDigitalWindowControl?>
  }
}
