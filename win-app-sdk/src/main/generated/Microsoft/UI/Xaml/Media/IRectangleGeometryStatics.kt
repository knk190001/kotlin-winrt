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

@ABIMarker(IRectangleGeometryStatics.ABI::class)
@Signature("{1ae7ac26-8a8b-55a5-b035-586e2b642919}")
@Guid("1ae7ac268a8b55a5b035586e2b642919")
@WinRTInterface("1ae7ac268a8b55a5b035586e2b642919")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRectangleGeometryStatics.ByReference::class)
public interface IRectangleGeometryStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RectProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRectangleGeometryStatics> {
    public override fun getValue() = ABI.makeIRectangleGeometryStatics(pointer.getPointer(0))

    public fun setValue(value: IRectangleGeometryStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRectangleGeometryStatics {
    public val __1187962549_Ptr: Pointer?

    public val _1187962549_VtblPtr: Pointer?
      get() = __1187962549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RectProperty(): DependencyProperty? {
      val fnPtr = _1187962549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1187962549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRectangleGeometryStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187962549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRectangleGeometryStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ae7ac268a8b55a5b035586e2b642919")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRectangleGeometryStatics(ptr: Pointer?): WithDefault =
        IRectangleGeometryStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRectangleGeometryStatics {
      val address = segment.toRawLongValue()
      return makeIRectangleGeometryStatics(Pointer(address))
    }

    public override fun toNative(obj: IRectangleGeometryStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187962549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRectangleGeometryStatics):
        Array<IRectangleGeometryStatics?> = (elements as
        Array<IRectangleGeometryStatics?>).castToImpl<IRectangleGeometryStatics,IRectangleGeometryStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRectangleGeometryStatics?> =
        arrayOfNulls<IRectangleGeometryStatics_Impl>(size) as Array<IRectangleGeometryStatics?>
  }
}
