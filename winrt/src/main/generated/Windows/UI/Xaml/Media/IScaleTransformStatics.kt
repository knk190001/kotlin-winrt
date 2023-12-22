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

@ABIMarker(IScaleTransformStatics.ABI::class)
@Signature("{9d9436f4-40a7-46dd-975a-07d337cd852e}")
@Guid("9d9436f440a746dd975a07d337cd852e")
@WinRTInterface("9d9436f440a746dd975a07d337cd852e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScaleTransformStatics.ByReference::class)
public interface IScaleTransformStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterXProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CenterYProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ScaleXProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ScaleYProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScaleTransformStatics> {
    public override fun getValue() = ABI.makeIScaleTransformStatics(pointer.getPointer(0))

    public fun setValue(value: IScaleTransformStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScaleTransformStatics {
    public val __892958631_Ptr: Pointer?

    public val _892958631_VtblPtr: Pointer?
      get() = __892958631_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterXProperty(): DependencyProperty? {
      val fnPtr = _892958631_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__892958631_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CenterYProperty(): DependencyProperty? {
      val fnPtr = _892958631_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__892958631_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ScaleXProperty(): DependencyProperty? {
      val fnPtr = _892958631_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__892958631_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ScaleYProperty(): DependencyProperty? {
      val fnPtr = _892958631_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__892958631_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IScaleTransformStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __892958631_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScaleTransformStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d9436f440a746dd975a07d337cd852e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScaleTransformStatics(ptr: Pointer?): WithDefault =
        IScaleTransformStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScaleTransformStatics {
      val address = segment.toRawLongValue()
      return makeIScaleTransformStatics(Pointer(address))
    }

    public override fun toNative(obj: IScaleTransformStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__892958631_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScaleTransformStatics): Array<IScaleTransformStatics?> =
        (elements as
        Array<IScaleTransformStatics?>).castToImpl<IScaleTransformStatics,IScaleTransformStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScaleTransformStatics?> =
        arrayOfNulls<IScaleTransformStatics_Impl>(size) as Array<IScaleTransformStatics?>
  }
}
