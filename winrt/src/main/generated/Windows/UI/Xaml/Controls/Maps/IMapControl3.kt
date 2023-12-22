package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapControl3.ABI::class)
@Signature("{586328f8-8cdd-40ae-9338-af2a7be845e5}")
@Guid("586328f88cdd40ae9338af2a7be845e5")
@WinRTInterface("586328f88cdd40ae9338af2a7be845e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControl3.ByReference::class)
public interface IMapControl3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_MapRightTapped(handler: TypedEventHandler<MapControl?, MapRightTappedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_MapRightTapped(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapControl3> {
    public override fun getValue() = ABI.makeIMapControl3(pointer.getPointer(0))

    public fun setValue(value: IMapControl3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControl3 {
    public val __1767447041_Ptr: Pointer?

    public val _1767447041_VtblPtr: Pointer?
      get() = __1767447041_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_MapRightTapped(handler: TypedEventHandler<MapControl?,
        MapRightTappedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1767447041_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1767447041_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_MapRightTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1767447041_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447041_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapControl3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1767447041_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControl3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("586328f88cdd40ae9338af2a7be845e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControl3(ptr: Pointer?): WithDefault = IMapControl3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControl3 {
      val address = segment.toRawLongValue()
      return makeIMapControl3(Pointer(address))
    }

    public override fun toNative(obj: IMapControl3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1767447041_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControl3): Array<IMapControl3?> = (elements as
        Array<IMapControl3?>).castToImpl<IMapControl3,IMapControl3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControl3?> =
        arrayOfNulls<IMapControl3_Impl>(size) as Array<IMapControl3?>
  }
}
