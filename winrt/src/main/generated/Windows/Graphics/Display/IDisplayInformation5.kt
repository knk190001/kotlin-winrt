package Windows.Graphics.Display

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDisplayInformation5.ABI::class)
@Signature("{3a5442dc-2cde-4a8d-80d1-21dc5adcc1aa}")
@Guid("3a5442dc2cde4a8d80d121dc5adcc1aa")
@WinRTInterface("3a5442dc2cde4a8d80d121dc5adcc1aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayInformation5.ByReference::class)
public interface IDisplayInformation5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAdvancedColorInfo(): AdvancedColorInfo?

  @InterfaceMethod(1)
  public fun add_AdvancedColorInfoChanged(handler: TypedEventHandler<DisplayInformation?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_AdvancedColorInfoChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayInformation5> {
    public override fun getValue() = ABI.makeIDisplayInformation5(pointer.getPointer(0))

    public fun setValue(value: IDisplayInformation5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayInformation5 {
    public val __1563419924_Ptr: Pointer?

    public val _1563419924_VtblPtr: Pointer?
      get() = __1563419924_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAdvancedColorInfo(): AdvancedColorInfo? {
      val fnPtr = _1563419924_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdvancedColorInfo>()
      val hr = fn.invokeHR(arrayOf(__1563419924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdvancedColorInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_AdvancedColorInfoChanged(handler: TypedEventHandler<DisplayInformation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1563419924_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1563419924_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_AdvancedColorInfoChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1563419924_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1563419924_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayInformation5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1563419924_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayInformation5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a5442dc2cde4a8d80d121dc5adcc1aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayInformation5(ptr: Pointer?): WithDefault = IDisplayInformation5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayInformation5 {
      val address = segment.toRawLongValue()
      return makeIDisplayInformation5(Pointer(address))
    }

    public override fun toNative(obj: IDisplayInformation5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1563419924_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayInformation5): Array<IDisplayInformation5?> =
        (elements as
        Array<IDisplayInformation5?>).castToImpl<IDisplayInformation5,IDisplayInformation5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayInformation5?> =
        arrayOfNulls<IDisplayInformation5_Impl>(size) as Array<IDisplayInformation5?>
  }
}
