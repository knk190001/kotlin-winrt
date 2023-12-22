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

@ABIMarker(IMapElementPointerEnteredEventArgs.ABI::class)
@Signature("{ab85dd4e-91d7-4b31-8f0a-d390c7d3a2ef}")
@Guid("ab85dd4e91d74b318f0ad390c7d3a2ef")
@WinRTInterface("ab85dd4e91d74b318f0ad390c7d3a2ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElementPointerEnteredEventArgs.ByReference::class)
public interface IMapElementPointerEnteredEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Point?

  @InterfaceMethod(1)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(2)
  public fun get_MapElement(): MapElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapElementPointerEnteredEventArgs> {
    public override fun getValue() =
        ABI.makeIMapElementPointerEnteredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapElementPointerEnteredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElementPointerEnteredEventArgs {
    public val __157827564_Ptr: Pointer?

    public val _157827564_VtblPtr: Pointer?
      get() = __157827564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Point? {
      val fnPtr = _157827564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__157827564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _157827564_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__157827564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MapElement(): MapElement? {
      val fnPtr = _157827564_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapElement>()
      val hr = fn.invokeHR(arrayOf(__157827564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapElement>(result.getValue())
      return resultValue
    }
  }

  public class IMapElementPointerEnteredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __157827564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElementPointerEnteredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab85dd4e91d74b318f0ad390c7d3a2ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElementPointerEnteredEventArgs(ptr: Pointer?): WithDefault =
        IMapElementPointerEnteredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElementPointerEnteredEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapElementPointerEnteredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapElementPointerEnteredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__157827564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElementPointerEnteredEventArgs):
        Array<IMapElementPointerEnteredEventArgs?> = (elements as
        Array<IMapElementPointerEnteredEventArgs?>).castToImpl<IMapElementPointerEnteredEventArgs,IMapElementPointerEnteredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElementPointerEnteredEventArgs?> =
        arrayOfNulls<IMapElementPointerEnteredEventArgs_Impl>(size) as
        Array<IMapElementPointerEnteredEventArgs?>
  }
}
