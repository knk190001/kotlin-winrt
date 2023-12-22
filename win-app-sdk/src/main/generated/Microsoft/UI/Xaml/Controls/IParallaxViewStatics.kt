package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IParallaxViewStatics.ABI::class)
@Signature("{69211861-40ba-5083-8835-416f40d4c5eb}")
@Guid("6921186140ba50838835416f40d4c5eb")
@WinRTInterface("6921186140ba50838835416f40d4c5eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IParallaxViewStatics.ByReference::class)
public interface IParallaxViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChildProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HorizontalSourceEndOffsetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_HorizontalSourceOffsetKindProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_HorizontalSourceStartOffsetProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_MaxHorizontalShiftRatioProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_HorizontalShiftProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_IsHorizontalShiftClampedProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_IsVerticalShiftClampedProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_SourceProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_VerticalSourceEndOffsetProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_VerticalSourceOffsetKindProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_VerticalSourceStartOffsetProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_MaxVerticalShiftRatioProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_VerticalShiftProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IParallaxViewStatics> {
    public override fun getValue() = ABI.makeIParallaxViewStatics(pointer.getPointer(0))

    public fun setValue(value: IParallaxViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IParallaxViewStatics {
    public val __1654872542_Ptr: Pointer?

    public val _1654872542_VtblPtr: Pointer?
      get() = __1654872542_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChildProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HorizontalSourceEndOffsetProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalSourceOffsetKindProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_HorizontalSourceStartOffsetProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MaxHorizontalShiftRatioProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_HorizontalShiftProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsHorizontalShiftClampedProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsVerticalShiftClampedProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SourceProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_VerticalSourceEndOffsetProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_VerticalSourceOffsetKindProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_VerticalSourceStartOffsetProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_MaxVerticalShiftRatioProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_VerticalShiftProperty(): DependencyProperty? {
      val fnPtr = _1654872542_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1654872542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IParallaxViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1654872542_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IParallaxViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6921186140ba50838835416f40d4c5eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIParallaxViewStatics(ptr: Pointer?): WithDefault = IParallaxViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IParallaxViewStatics {
      val address = segment.toRawLongValue()
      return makeIParallaxViewStatics(Pointer(address))
    }

    public override fun toNative(obj: IParallaxViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1654872542_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IParallaxViewStatics): Array<IParallaxViewStatics?> =
        (elements as
        Array<IParallaxViewStatics?>).castToImpl<IParallaxViewStatics,IParallaxViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IParallaxViewStatics?> =
        arrayOfNulls<IParallaxViewStatics_Impl>(size) as Array<IParallaxViewStatics?>
  }
}
