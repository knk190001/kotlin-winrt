package Microsoft.UI.Xaml.Media

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

@ABIMarker(IRotateTransformStatics.ABI::class)
@Signature("{8ec4c662-04f8-51d7-bcb2-17f10c2faa38}")
@Guid("8ec4c66204f851d7bcb217f10c2faa38")
@WinRTInterface("8ec4c66204f851d7bcb217f10c2faa38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRotateTransformStatics.ByReference::class)
public interface IRotateTransformStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterXProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CenterYProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_AngleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRotateTransformStatics> {
    public override fun getValue() = ABI.makeIRotateTransformStatics(pointer.getPointer(0))

    public fun setValue(value: IRotateTransformStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRotateTransformStatics {
    public val __467397723_Ptr: Pointer?

    public val _467397723_VtblPtr: Pointer?
      get() = __467397723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterXProperty(): DependencyProperty? {
      val fnPtr = _467397723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__467397723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CenterYProperty(): DependencyProperty? {
      val fnPtr = _467397723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__467397723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AngleProperty(): DependencyProperty? {
      val fnPtr = _467397723_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__467397723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRotateTransformStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __467397723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRotateTransformStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ec4c66204f851d7bcb217f10c2faa38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRotateTransformStatics(ptr: Pointer?): WithDefault =
        IRotateTransformStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRotateTransformStatics {
      val address = segment.toRawLongValue()
      return makeIRotateTransformStatics(Pointer(address))
    }

    public override fun toNative(obj: IRotateTransformStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__467397723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRotateTransformStatics): Array<IRotateTransformStatics?>
        = (elements as
        Array<IRotateTransformStatics?>).castToImpl<IRotateTransformStatics,IRotateTransformStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRotateTransformStatics?> =
        arrayOfNulls<IRotateTransformStatics_Impl>(size) as Array<IRotateTransformStatics?>
  }
}
