package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IMapElementsLayer.ABI::class)
@Signature("{de79689a-01ef-46f4-ac60-7c200b552610}")
@Guid("de79689a01ef46f4ac607c200b552610")
@WinRTInterface("de79689a01ef46f4ac607c200b552610")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElementsLayer.ByReference::class)
public interface IMapElementsLayer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MapElements(): IVector<MapElement?>?

  @InterfaceMethod(1)
  public fun put_MapElements(value: IVector<MapElement?>?): Unit

  @InterfaceMethod(2)
  public fun add_MapElementClick(handler: TypedEventHandler<MapElementsLayer?,
      MapElementsLayerClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_MapElementClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_MapElementPointerEntered(handler: TypedEventHandler<MapElementsLayer?,
      MapElementsLayerPointerEnteredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_MapElementPointerEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_MapElementPointerExited(handler: TypedEventHandler<MapElementsLayer?,
      MapElementsLayerPointerExitedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_MapElementPointerExited(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_MapContextRequested(handler: TypedEventHandler<MapElementsLayer?,
      MapElementsLayerContextRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_MapContextRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapElementsLayer> {
    public override fun getValue() = ABI.makeIMapElementsLayer(pointer.getPointer(0))

    public fun setValue(value: IMapElementsLayer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElementsLayer {
    public val __347418129_Ptr: Pointer?

    public val _347418129_VtblPtr: Pointer?
      get() = __347418129_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MapElements(): IVector<MapElement?>? {
      val fnPtr = _347418129_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MapElement?>>()
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MapElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MapElements(value: IVector<MapElement?>?): Unit {
      val fnPtr = _347418129_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_MapElementClick(handler: TypedEventHandler<MapElementsLayer?,
        MapElementsLayerClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347418129_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_MapElementClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _347418129_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_MapElementPointerEntered(handler: TypedEventHandler<MapElementsLayer?,
        MapElementsLayerPointerEnteredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347418129_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_MapElementPointerEntered(token: EventRegistrationToken?): Unit {
      val fnPtr = _347418129_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_MapElementPointerExited(handler: TypedEventHandler<MapElementsLayer?,
        MapElementsLayerPointerExitedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347418129_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_MapElementPointerExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _347418129_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_MapContextRequested(handler: TypedEventHandler<MapElementsLayer?,
        MapElementsLayerContextRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _347418129_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_MapContextRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _347418129_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__347418129_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapElementsLayer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __347418129_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElementsLayer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de79689a01ef46f4ac607c200b552610")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElementsLayer(ptr: Pointer?): WithDefault = IMapElementsLayer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElementsLayer {
      val address = segment.toRawLongValue()
      return makeIMapElementsLayer(Pointer(address))
    }

    public override fun toNative(obj: IMapElementsLayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__347418129_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElementsLayer): Array<IMapElementsLayer?> = (elements
        as Array<IMapElementsLayer?>).castToImpl<IMapElementsLayer,IMapElementsLayer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElementsLayer?> =
        arrayOfNulls<IMapElementsLayer_Impl>(size) as Array<IMapElementsLayer?>
  }
}
