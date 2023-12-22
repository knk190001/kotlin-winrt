package Microsoft.UI.Xaml.Controls.Primitives

import Windows.Foundation.IReference
import Windows.Foundation.Point
import Windows.Foundation.Rect
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

@ABIMarker(IFlyoutShowOptions.ABI::class)
@Signature("{30774a93-2803-50d3-b406-904aec3e175d}")
@Guid("30774a93280350d3b406904aec3e175d")
@WinRTInterface("30774a93280350d3b406904aec3e175d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutShowOptions.ByReference::class)
public interface IFlyoutShowOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): IReference<Point?>?

  @InterfaceMethod(1)
  public fun put_Position(value: IReference<Point?>?): Unit

  @InterfaceMethod(2)
  public fun get_ExclusionRect(): IReference<Rect?>?

  @InterfaceMethod(3)
  public fun put_ExclusionRect(value: IReference<Rect?>?): Unit

  @InterfaceMethod(4)
  public fun get_ShowMode(): FlyoutShowMode?

  @InterfaceMethod(5)
  public fun put_ShowMode(value: FlyoutShowMode?): Unit

  @InterfaceMethod(6)
  public fun get_Placement(): FlyoutPlacementMode?

  @InterfaceMethod(7)
  public fun put_Placement(value: FlyoutPlacementMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutShowOptions> {
    public override fun getValue() = ABI.makeIFlyoutShowOptions(pointer.getPointer(0))

    public fun setValue(value: IFlyoutShowOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutShowOptions {
    public val __1217070155_Ptr: Pointer?

    public val _1217070155_VtblPtr: Pointer?
      get() = __1217070155_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): IReference<Point?>? {
      val fnPtr = _1217070155_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Point?>>()
      val hr = fn.invokeHR(arrayOf(__1217070155_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Point?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Position(value: IReference<Point?>?): Unit {
      val fnPtr = _1217070155_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1217070155_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ExclusionRect(): IReference<Rect?>? {
      val fnPtr = _1217070155_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Rect?>>()
      val hr = fn.invokeHR(arrayOf(__1217070155_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Rect?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ExclusionRect(value: IReference<Rect?>?): Unit {
      val fnPtr = _1217070155_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1217070155_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ShowMode(): FlyoutShowMode? {
      val fnPtr = _1217070155_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutShowMode>()
      val hr = fn.invokeHR(arrayOf(__1217070155_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutShowMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ShowMode(value: FlyoutShowMode?): Unit {
      val fnPtr = _1217070155_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1217070155_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Placement(): FlyoutPlacementMode? {
      val fnPtr = _1217070155_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__1217070155_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Placement(value: FlyoutPlacementMode?): Unit {
      val fnPtr = _1217070155_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1217070155_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutShowOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1217070155_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutShowOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30774a93280350d3b406904aec3e175d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutShowOptions(ptr: Pointer?): WithDefault = IFlyoutShowOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutShowOptions {
      val address = segment.toRawLongValue()
      return makeIFlyoutShowOptions(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutShowOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1217070155_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutShowOptions): Array<IFlyoutShowOptions?> =
        (elements as
        Array<IFlyoutShowOptions?>).castToImpl<IFlyoutShowOptions,IFlyoutShowOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutShowOptions?> =
        arrayOfNulls<IFlyoutShowOptions_Impl>(size) as Array<IFlyoutShowOptions?>
  }
}
