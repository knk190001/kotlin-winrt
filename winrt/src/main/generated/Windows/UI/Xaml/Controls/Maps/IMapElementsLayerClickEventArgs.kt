package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IMapElementsLayerClickEventArgs.ABI::class)
@Signature("{2ca7cf66-af1b-4c05-8c85-f74ae3d4677f}")
@Guid("2ca7cf66af1b4c058c85f74ae3d4677f")
@WinRTInterface("2ca7cf66af1b4c058c85f74ae3d4677f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElementsLayerClickEventArgs.ByReference::class)
public interface IMapElementsLayerClickEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Point?

  @InterfaceMethod(1)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(2)
  public fun get_MapElements(): IVector<MapElement?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapElementsLayerClickEventArgs> {
    public override fun getValue() = ABI.makeIMapElementsLayerClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapElementsLayerClickEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElementsLayerClickEventArgs {
    public val __1945959870_Ptr: Pointer?

    public val _1945959870_VtblPtr: Pointer?
      get() = __1945959870_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Point? {
      val fnPtr = _1945959870_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1945959870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _1945959870_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1945959870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MapElements(): IVector<MapElement?>? {
      val fnPtr = _1945959870_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MapElement?>>()
      val hr = fn.invokeHR(arrayOf(__1945959870_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MapElement?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapElementsLayerClickEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1945959870_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElementsLayerClickEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ca7cf66af1b4c058c85f74ae3d4677f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElementsLayerClickEventArgs(ptr: Pointer?): WithDefault =
        IMapElementsLayerClickEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElementsLayerClickEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapElementsLayerClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapElementsLayerClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1945959870_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElementsLayerClickEventArgs):
        Array<IMapElementsLayerClickEventArgs?> = (elements as
        Array<IMapElementsLayerClickEventArgs?>).castToImpl<IMapElementsLayerClickEventArgs,IMapElementsLayerClickEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElementsLayerClickEventArgs?> =
        arrayOfNulls<IMapElementsLayerClickEventArgs_Impl>(size) as
        Array<IMapElementsLayerClickEventArgs?>
  }
}
