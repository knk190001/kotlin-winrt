package Windows.UI.Xaml.Controls

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

@ABIMarker(IBorderStatics.ABI::class)
@Signature("{b81d1639-e911-4fd7-a4c4-b9c7f008b7fc}")
@Guid("b81d1639e9114fd7a4c4b9c7f008b7fc")
@WinRTInterface("b81d1639e9114fd7a4c4b9c7f008b7fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBorderStatics.ByReference::class)
public interface IBorderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_BorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_BackgroundProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_PaddingProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ChildTransitionsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBorderStatics>
      {
    public override fun getValue() = ABI.makeIBorderStatics(pointer.getPointer(0))

    public fun setValue(value: IBorderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBorderStatics {
    public val __434468003_Ptr: Pointer?

    public val _434468003_VtblPtr: Pointer?
      get() = __434468003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BorderBrushProperty(): DependencyProperty? {
      val fnPtr = _434468003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__434468003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _434468003_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__434468003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundProperty(): DependencyProperty? {
      val fnPtr = _434468003_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__434468003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _434468003_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__434468003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PaddingProperty(): DependencyProperty? {
      val fnPtr = _434468003_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__434468003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ChildTransitionsProperty(): DependencyProperty? {
      val fnPtr = _434468003_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__434468003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBorderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __434468003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBorderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b81d1639e9114fd7a4c4b9c7f008b7fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBorderStatics(ptr: Pointer?): WithDefault = IBorderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBorderStatics {
      val address = segment.toRawLongValue()
      return makeIBorderStatics(Pointer(address))
    }

    public override fun toNative(obj: IBorderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__434468003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBorderStatics): Array<IBorderStatics?> = (elements as
        Array<IBorderStatics?>).castToImpl<IBorderStatics,IBorderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBorderStatics?> =
        arrayOfNulls<IBorderStatics_Impl>(size) as Array<IBorderStatics?>
  }
}
