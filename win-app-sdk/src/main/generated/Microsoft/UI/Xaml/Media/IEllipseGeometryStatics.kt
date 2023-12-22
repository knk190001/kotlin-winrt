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

@ABIMarker(IEllipseGeometryStatics.ABI::class)
@Signature("{e8a33c80-d72f-5248-a71f-4b70a0757f89}")
@Guid("e8a33c80d72f5248a71f4b70a0757f89")
@WinRTInterface("e8a33c80d72f5248a71f4b70a0757f89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEllipseGeometryStatics.ByReference::class)
public interface IEllipseGeometryStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_RadiusXProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_RadiusYProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEllipseGeometryStatics> {
    public override fun getValue() = ABI.makeIEllipseGeometryStatics(pointer.getPointer(0))

    public fun setValue(value: IEllipseGeometryStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEllipseGeometryStatics {
    public val __1433174874_Ptr: Pointer?

    public val _1433174874_VtblPtr: Pointer?
      get() = __1433174874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterProperty(): DependencyProperty? {
      val fnPtr = _1433174874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1433174874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RadiusXProperty(): DependencyProperty? {
      val fnPtr = _1433174874_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1433174874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RadiusYProperty(): DependencyProperty? {
      val fnPtr = _1433174874_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1433174874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IEllipseGeometryStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1433174874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEllipseGeometryStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8a33c80d72f5248a71f4b70a0757f89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEllipseGeometryStatics(ptr: Pointer?): WithDefault =
        IEllipseGeometryStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEllipseGeometryStatics {
      val address = segment.toRawLongValue()
      return makeIEllipseGeometryStatics(Pointer(address))
    }

    public override fun toNative(obj: IEllipseGeometryStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1433174874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEllipseGeometryStatics): Array<IEllipseGeometryStatics?>
        = (elements as
        Array<IEllipseGeometryStatics?>).castToImpl<IEllipseGeometryStatics,IEllipseGeometryStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEllipseGeometryStatics?> =
        arrayOfNulls<IEllipseGeometryStatics_Impl>(size) as Array<IEllipseGeometryStatics?>
  }
}
