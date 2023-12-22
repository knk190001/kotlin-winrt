package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IMapControlStatics2.ABI::class)
@Signature("{04852b93-b446-4d31-9752-1ec69a5996ae}")
@Guid("04852b93b4464d3197521ec69a5996ae")
@WinRTInterface("04852b93b4464d3197521ec69a5996ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlStatics2.ByReference::class)
public interface IMapControlStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BusinessLandmarksVisibleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TransitFeaturesVisibleProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PanInteractionModeProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_RotateInteractionModeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_TiltInteractionModeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ZoomInteractionModeProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_Is3DSupportedProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_IsStreetsideSupportedProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_SceneProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlStatics2> {
    public override fun getValue() = ABI.makeIMapControlStatics2(pointer.getPointer(0))

    public fun setValue(value: IMapControlStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlStatics2 {
    public val __142000225_Ptr: Pointer?

    public val _142000225_VtblPtr: Pointer?
      get() = __142000225_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BusinessLandmarksVisibleProperty(): DependencyProperty? {
      val fnPtr = _142000225_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TransitFeaturesVisibleProperty(): DependencyProperty? {
      val fnPtr = _142000225_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PanInteractionModeProperty(): DependencyProperty? {
      val fnPtr = _142000225_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RotateInteractionModeProperty(): DependencyProperty? {
      val fnPtr = _142000225_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TiltInteractionModeProperty(): DependencyProperty? {
      val fnPtr = _142000225_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ZoomInteractionModeProperty(): DependencyProperty? {
      val fnPtr = _142000225_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Is3DSupportedProperty(): DependencyProperty? {
      val fnPtr = _142000225_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsStreetsideSupportedProperty(): DependencyProperty? {
      val fnPtr = _142000225_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SceneProperty(): DependencyProperty? {
      val fnPtr = _142000225_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __142000225_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("04852b93b4464d3197521ec69a5996ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlStatics2(ptr: Pointer?): WithDefault = IMapControlStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlStatics2 {
      val address = segment.toRawLongValue()
      return makeIMapControlStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMapControlStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__142000225_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlStatics2): Array<IMapControlStatics2?> =
        (elements as
        Array<IMapControlStatics2?>).castToImpl<IMapControlStatics2,IMapControlStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlStatics2?> =
        arrayOfNulls<IMapControlStatics2_Impl>(size) as Array<IMapControlStatics2?>
  }
}
