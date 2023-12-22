package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IMapStyleSheetStatics.ABI::class)
@Signature("{abbd00ad-0a1c-4335-82f4-61d936aa197d}")
@Guid("abbd00ad0a1c433582f461d936aa197d")
@WinRTInterface("abbd00ad0a1c433582f461d936aa197d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapStyleSheetStatics.ByReference::class)
public interface IMapStyleSheetStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Aerial(): MapStyleSheet?

  @InterfaceMethod(1)
  public fun AerialWithOverlay(): MapStyleSheet?

  @InterfaceMethod(2)
  public fun RoadLight(): MapStyleSheet?

  @InterfaceMethod(3)
  public fun RoadDark(): MapStyleSheet?

  @InterfaceMethod(4)
  public fun RoadHighContrastLight(): MapStyleSheet?

  @InterfaceMethod(5)
  public fun RoadHighContrastDark(): MapStyleSheet?

  @InterfaceMethod(6)
  public fun Combine(styleSheets: IIterable<MapStyleSheet?>?): MapStyleSheet?

  @InterfaceMethod(7)
  public fun ParseFromJson(styleAsJson: String?): MapStyleSheet?

  @InterfaceMethod(8)
  public fun TryParseFromJson(styleAsJson: String?,
      styleSheet: Windows.UI.Xaml.Controls.Maps.MapStyleSheet.ByReference?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapStyleSheetStatics> {
    public override fun getValue() = ABI.makeIMapStyleSheetStatics(pointer.getPointer(0))

    public fun setValue(value: IMapStyleSheetStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapStyleSheetStatics {
    public val __1503614324_Ptr: Pointer?

    public val _1503614324_VtblPtr: Pointer?
      get() = __1503614324_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Aerial(): MapStyleSheet? {
      val fnPtr = _1503614324_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyleSheet>()
      val hr = fn.invokeHR(arrayOf(__1503614324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyleSheet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AerialWithOverlay(): MapStyleSheet? {
      val fnPtr = _1503614324_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyleSheet>()
      val hr = fn.invokeHR(arrayOf(__1503614324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyleSheet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RoadLight(): MapStyleSheet? {
      val fnPtr = _1503614324_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyleSheet>()
      val hr = fn.invokeHR(arrayOf(__1503614324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyleSheet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RoadDark(): MapStyleSheet? {
      val fnPtr = _1503614324_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyleSheet>()
      val hr = fn.invokeHR(arrayOf(__1503614324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyleSheet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RoadHighContrastLight(): MapStyleSheet? {
      val fnPtr = _1503614324_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyleSheet>()
      val hr = fn.invokeHR(arrayOf(__1503614324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyleSheet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RoadHighContrastDark(): MapStyleSheet? {
      val fnPtr = _1503614324_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyleSheet>()
      val hr = fn.invokeHR(arrayOf(__1503614324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyleSheet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun Combine(styleSheets: IIterable<MapStyleSheet?>?): MapStyleSheet? {
      val fnPtr = _1503614324_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyleSheet>()
      val hr = fn.invokeHR(arrayOf(__1503614324_Ptr, marshalToNative(styleSheets), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyleSheet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ParseFromJson(styleAsJson: String?): MapStyleSheet? {
      val fnPtr = _1503614324_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyleSheet>()
      val hr = fn.invokeHR(arrayOf(__1503614324_Ptr, marshalToNative(styleAsJson), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyleSheet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun TryParseFromJson(styleAsJson: String?,
        styleSheet: Windows.UI.Xaml.Controls.Maps.MapStyleSheet.ByReference?): Boolean {
      val fnPtr = _1503614324_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1503614324_Ptr, marshalToNative(styleAsJson),
          marshalToNative(styleSheet), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMapStyleSheetStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1503614324_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapStyleSheetStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("abbd00ad0a1c433582f461d936aa197d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapStyleSheetStatics(ptr: Pointer?): WithDefault =
        IMapStyleSheetStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapStyleSheetStatics {
      val address = segment.toRawLongValue()
      return makeIMapStyleSheetStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapStyleSheetStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1503614324_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapStyleSheetStatics): Array<IMapStyleSheetStatics?> =
        (elements as
        Array<IMapStyleSheetStatics?>).castToImpl<IMapStyleSheetStatics,IMapStyleSheetStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapStyleSheetStatics?> =
        arrayOfNulls<IMapStyleSheetStatics_Impl>(size) as Array<IMapStyleSheetStatics?>
  }
}
