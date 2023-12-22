package Windows.UI.Xaml.Media

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

@ABIMarker(ICompositeTransformStatics.ABI::class)
@Signature("{2f190c08-8266-496f-9653-a18bd4f836aa}")
@Guid("2f190c088266496f9653a18bd4f836aa")
@WinRTInterface("2f190c088266496f9653a18bd4f836aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositeTransformStatics.ByReference::class)
public interface ICompositeTransformStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterXProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CenterYProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ScaleXProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ScaleYProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_SkewXProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_SkewYProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_RotationProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_TranslateXProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_TranslateYProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositeTransformStatics> {
    public override fun getValue() = ABI.makeICompositeTransformStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositeTransformStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositeTransformStatics {
    public val __1850055452_Ptr: Pointer?

    public val _1850055452_VtblPtr: Pointer?
      get() = __1850055452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterXProperty(): DependencyProperty? {
      val fnPtr = _1850055452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1850055452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CenterYProperty(): DependencyProperty? {
      val fnPtr = _1850055452_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1850055452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ScaleXProperty(): DependencyProperty? {
      val fnPtr = _1850055452_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1850055452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ScaleYProperty(): DependencyProperty? {
      val fnPtr = _1850055452_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1850055452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SkewXProperty(): DependencyProperty? {
      val fnPtr = _1850055452_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1850055452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SkewYProperty(): DependencyProperty? {
      val fnPtr = _1850055452_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1850055452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RotationProperty(): DependencyProperty? {
      val fnPtr = _1850055452_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1850055452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TranslateXProperty(): DependencyProperty? {
      val fnPtr = _1850055452_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1850055452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TranslateYProperty(): DependencyProperty? {
      val fnPtr = _1850055452_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1850055452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICompositeTransformStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1850055452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositeTransformStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f190c088266496f9653a18bd4f836aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositeTransformStatics(ptr: Pointer?): WithDefault =
        ICompositeTransformStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositeTransformStatics {
      val address = segment.toRawLongValue()
      return makeICompositeTransformStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositeTransformStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1850055452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositeTransformStatics):
        Array<ICompositeTransformStatics?> = (elements as
        Array<ICompositeTransformStatics?>).castToImpl<ICompositeTransformStatics,ICompositeTransformStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositeTransformStatics?> =
        arrayOfNulls<ICompositeTransformStatics_Impl>(size) as Array<ICompositeTransformStatics?>
  }
}
