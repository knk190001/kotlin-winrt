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

@ABIMarker(IFontIconSourceStatics.ABI::class)
@Signature("{c309c231-f7bf-5c06-a2d2-56502cfd33e5}")
@Guid("c309c231f7bf5c06a2d256502cfd33e5")
@WinRTInterface("c309c231f7bf5c06a2d256502cfd33e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFontIconSourceStatics.ByReference::class)
public interface IFontIconSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GlyphProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FontSizeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FontFamilyProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FontWeightProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_FontStyleProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_MirroredWhenRightToLeftProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFontIconSourceStatics> {
    public override fun getValue() = ABI.makeIFontIconSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IFontIconSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFontIconSourceStatics {
    public val __1671197893_Ptr: Pointer?

    public val _1671197893_VtblPtr: Pointer?
      get() = __1671197893_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GlyphProperty(): DependencyProperty? {
      val fnPtr = _1671197893_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1671197893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FontSizeProperty(): DependencyProperty? {
      val fnPtr = _1671197893_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1671197893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FontFamilyProperty(): DependencyProperty? {
      val fnPtr = _1671197893_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1671197893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FontWeightProperty(): DependencyProperty? {
      val fnPtr = _1671197893_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1671197893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FontStyleProperty(): DependencyProperty? {
      val fnPtr = _1671197893_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1671197893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsTextScaleFactorEnabledProperty(): DependencyProperty? {
      val fnPtr = _1671197893_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1671197893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MirroredWhenRightToLeftProperty(): DependencyProperty? {
      val fnPtr = _1671197893_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1671197893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFontIconSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1671197893_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFontIconSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c309c231f7bf5c06a2d256502cfd33e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFontIconSourceStatics(ptr: Pointer?): WithDefault =
        IFontIconSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFontIconSourceStatics {
      val address = segment.toRawLongValue()
      return makeIFontIconSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IFontIconSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1671197893_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFontIconSourceStatics): Array<IFontIconSourceStatics?> =
        (elements as
        Array<IFontIconSourceStatics?>).castToImpl<IFontIconSourceStatics,IFontIconSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFontIconSourceStatics?> =
        arrayOfNulls<IFontIconSourceStatics_Impl>(size) as Array<IFontIconSourceStatics?>
  }
}
