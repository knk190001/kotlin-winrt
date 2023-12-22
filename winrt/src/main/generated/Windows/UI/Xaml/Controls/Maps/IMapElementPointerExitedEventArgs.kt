package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Point
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

@ABIMarker(IMapElementPointerExitedEventArgs.ABI::class)
@Signature("{c1a45af9-60c9-4679-9119-20abc75d931f}")
@Guid("c1a45af960c94679911920abc75d931f")
@WinRTInterface("c1a45af960c94679911920abc75d931f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElementPointerExitedEventArgs.ByReference::class)
public interface IMapElementPointerExitedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Point?

  @InterfaceMethod(1)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(2)
  public fun get_MapElement(): MapElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapElementPointerExitedEventArgs> {
    public override fun getValue() =
        ABI.makeIMapElementPointerExitedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapElementPointerExitedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElementPointerExitedEventArgs {
    public val __1159210930_Ptr: Pointer?

    public val _1159210930_VtblPtr: Pointer?
      get() = __1159210930_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Point? {
      val fnPtr = _1159210930_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1159210930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _1159210930_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1159210930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MapElement(): MapElement? {
      val fnPtr = _1159210930_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapElement>()
      val hr = fn.invokeHR(arrayOf(__1159210930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapElement>(result.getValue())
      return resultValue
    }
  }

  public class IMapElementPointerExitedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1159210930_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElementPointerExitedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1a45af960c94679911920abc75d931f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElementPointerExitedEventArgs(ptr: Pointer?): WithDefault =
        IMapElementPointerExitedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElementPointerExitedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapElementPointerExitedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapElementPointerExitedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1159210930_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElementPointerExitedEventArgs):
        Array<IMapElementPointerExitedEventArgs?> = (elements as
        Array<IMapElementPointerExitedEventArgs?>).castToImpl<IMapElementPointerExitedEventArgs,IMapElementPointerExitedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElementPointerExitedEventArgs?> =
        arrayOfNulls<IMapElementPointerExitedEventArgs_Impl>(size) as
        Array<IMapElementPointerExitedEventArgs?>
  }
}
