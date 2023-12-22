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

@ABIMarker(IUniformGridLayoutStatics.ABI::class)
@Signature("{19be9a3e-37e1-5a6d-8b62-419325ea705a}")
@Guid("19be9a3e37e15a6d8b62419325ea705a")
@WinRTInterface("19be9a3e37e15a6d8b62419325ea705a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUniformGridLayoutStatics.ByReference::class)
public interface IUniformGridLayoutStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MinItemWidthProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MinItemHeightProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_MinRowSpacingProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_MinColumnSpacingProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ItemsJustificationProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ItemsStretchProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_MaximumRowsOrColumnsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUniformGridLayoutStatics> {
    public override fun getValue() = ABI.makeIUniformGridLayoutStatics(pointer.getPointer(0))

    public fun setValue(value: IUniformGridLayoutStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUniformGridLayoutStatics {
    public val __1933349624_Ptr: Pointer?

    public val _1933349624_VtblPtr: Pointer?
      get() = __1933349624_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _1933349624_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1933349624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MinItemWidthProperty(): DependencyProperty? {
      val fnPtr = _1933349624_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1933349624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinItemHeightProperty(): DependencyProperty? {
      val fnPtr = _1933349624_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1933349624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MinRowSpacingProperty(): DependencyProperty? {
      val fnPtr = _1933349624_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1933349624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MinColumnSpacingProperty(): DependencyProperty? {
      val fnPtr = _1933349624_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1933349624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ItemsJustificationProperty(): DependencyProperty? {
      val fnPtr = _1933349624_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1933349624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ItemsStretchProperty(): DependencyProperty? {
      val fnPtr = _1933349624_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1933349624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_MaximumRowsOrColumnsProperty(): DependencyProperty? {
      val fnPtr = _1933349624_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1933349624_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IUniformGridLayoutStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1933349624_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUniformGridLayoutStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19be9a3e37e15a6d8b62419325ea705a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUniformGridLayoutStatics(ptr: Pointer?): WithDefault =
        IUniformGridLayoutStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUniformGridLayoutStatics {
      val address = segment.toRawLongValue()
      return makeIUniformGridLayoutStatics(Pointer(address))
    }

    public override fun toNative(obj: IUniformGridLayoutStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1933349624_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUniformGridLayoutStatics):
        Array<IUniformGridLayoutStatics?> = (elements as
        Array<IUniformGridLayoutStatics?>).castToImpl<IUniformGridLayoutStatics,IUniformGridLayoutStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUniformGridLayoutStatics?> =
        arrayOfNulls<IUniformGridLayoutStatics_Impl>(size) as Array<IUniformGridLayoutStatics?>
  }
}
