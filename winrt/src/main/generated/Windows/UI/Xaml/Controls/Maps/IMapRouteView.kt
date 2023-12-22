package Windows.UI.Xaml.Controls.Maps

import Windows.Services.Maps.MapRoute
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapRouteView.ABI::class)
@Signature("{740eaec5-bacc-41e1-a67e-dd6513832049}")
@Guid("740eaec5bacc41e1a67edd6513832049")
@WinRTInterface("740eaec5bacc41e1a67edd6513832049")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteView.ByReference::class)
public interface IMapRouteView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RouteColor(): Color?

  @InterfaceMethod(1)
  public fun put_RouteColor(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_OutlineColor(): Color?

  @InterfaceMethod(3)
  public fun put_OutlineColor(value: Color?): Unit

  @InterfaceMethod(4)
  public fun get_Route(): MapRoute?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapRouteView>
      {
    public override fun getValue() = ABI.makeIMapRouteView(pointer.getPointer(0))

    public fun setValue(value: IMapRouteView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteView {
    public val __480923037_Ptr: Pointer?

    public val _480923037_VtblPtr: Pointer?
      get() = __480923037_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RouteColor(): Color? {
      val fnPtr = _480923037_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__480923037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RouteColor(value: Color?): Unit {
      val fnPtr = _480923037_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__480923037_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OutlineColor(): Color? {
      val fnPtr = _480923037_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__480923037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_OutlineColor(value: Color?): Unit {
      val fnPtr = _480923037_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__480923037_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Route(): MapRoute? {
      val fnPtr = _480923037_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapRoute>()
      val hr = fn.invokeHR(arrayOf(__480923037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapRoute>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __480923037_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("740eaec5bacc41e1a67edd6513832049")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteView(ptr: Pointer?): WithDefault = IMapRouteView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteView {
      val address = segment.toRawLongValue()
      return makeIMapRouteView(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__480923037_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteView): Array<IMapRouteView?> = (elements as
        Array<IMapRouteView?>).castToImpl<IMapRouteView,IMapRouteView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteView?> =
        arrayOfNulls<IMapRouteView_Impl>(size) as Array<IMapRouteView?>
  }
}
