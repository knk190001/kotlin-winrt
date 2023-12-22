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

@ABIMarker(IMapElementsLayerPointerEnteredEventArgs.ABI::class)
@Signature("{757fc032-4694-4404-8c89-348b6b76c5e6}")
@Guid("757fc032469444048c89348b6b76c5e6")
@WinRTInterface("757fc032469444048c89348b6b76c5e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElementsLayerPointerEnteredEventArgs.ByReference::class)
public interface IMapElementsLayerPointerEnteredEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Point?

  @InterfaceMethod(1)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(2)
  public fun get_MapElement(): MapElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapElementsLayerPointerEnteredEventArgs> {
    public override fun getValue() =
        ABI.makeIMapElementsLayerPointerEnteredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapElementsLayerPointerEnteredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElementsLayerPointerEnteredEventArgs {
    public val __1490101326_Ptr: Pointer?

    public val _1490101326_VtblPtr: Pointer?
      get() = __1490101326_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Point? {
      val fnPtr = _1490101326_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1490101326_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _1490101326_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1490101326_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MapElement(): MapElement? {
      val fnPtr = _1490101326_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapElement>()
      val hr = fn.invokeHR(arrayOf(__1490101326_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapElement>(result.getValue())
      return resultValue
    }
  }

  public class IMapElementsLayerPointerEnteredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1490101326_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElementsLayerPointerEnteredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("757fc032469444048c89348b6b76c5e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElementsLayerPointerEnteredEventArgs(ptr: Pointer?): WithDefault =
        IMapElementsLayerPointerEnteredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMapElementsLayerPointerEnteredEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapElementsLayerPointerEnteredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapElementsLayerPointerEnteredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1490101326_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElementsLayerPointerEnteredEventArgs):
        Array<IMapElementsLayerPointerEnteredEventArgs?> = (elements as
        Array<IMapElementsLayerPointerEnteredEventArgs?>).castToImpl<IMapElementsLayerPointerEnteredEventArgs,IMapElementsLayerPointerEnteredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElementsLayerPointerEnteredEventArgs?> =
        arrayOfNulls<IMapElementsLayerPointerEnteredEventArgs_Impl>(size) as
        Array<IMapElementsLayerPointerEnteredEventArgs?>
  }
}
