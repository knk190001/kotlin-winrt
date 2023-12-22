package Windows.UI.Xaml.Media.Media3D

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

@ABIMarker(ICompositeTransform3DStatics.ABI::class)
@Signature("{ddbf4d67-2a25-48f3-9808-c51ec3d55bec}")
@Guid("ddbf4d672a2548f39808c51ec3d55bec")
@WinRTInterface("ddbf4d672a2548f39808c51ec3d55bec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositeTransform3DStatics.ByReference::class)
public interface ICompositeTransform3DStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterXProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CenterYProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CenterZProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_RotationXProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_RotationYProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_RotationZProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ScaleXProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ScaleYProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_ScaleZProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_TranslateXProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_TranslateYProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_TranslateZProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositeTransform3DStatics> {
    public override fun getValue() = ABI.makeICompositeTransform3DStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositeTransform3DStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositeTransform3DStatics {
    public val __2116669786_Ptr: Pointer?

    public val _2116669786_VtblPtr: Pointer?
      get() = __2116669786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterXProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CenterYProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CenterZProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RotationXProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_RotationYProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RotationZProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ScaleXProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ScaleYProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ScaleZProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_TranslateXProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_TranslateYProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_TranslateZProperty(): DependencyProperty? {
      val fnPtr = _2116669786_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2116669786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICompositeTransform3DStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2116669786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositeTransform3DStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddbf4d672a2548f39808c51ec3d55bec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositeTransform3DStatics(ptr: Pointer?): WithDefault =
        ICompositeTransform3DStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositeTransform3DStatics {
      val address = segment.toRawLongValue()
      return makeICompositeTransform3DStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositeTransform3DStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2116669786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositeTransform3DStatics):
        Array<ICompositeTransform3DStatics?> = (elements as
        Array<ICompositeTransform3DStatics?>).castToImpl<ICompositeTransform3DStatics,ICompositeTransform3DStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositeTransform3DStatics?> =
        arrayOfNulls<ICompositeTransform3DStatics_Impl>(size) as
        Array<ICompositeTransform3DStatics?>
  }
}
