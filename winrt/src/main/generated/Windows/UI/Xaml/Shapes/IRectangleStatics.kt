package Windows.UI.Xaml.Shapes

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

@ABIMarker(IRectangleStatics.ABI::class)
@Signature("{9f25aa53-bb3a-4c3c-89db-6fbc0d1fa0cc}")
@Guid("9f25aa53bb3a4c3c89db6fbc0d1fa0cc")
@WinRTInterface("9f25aa53bb3a4c3c89db6fbc0d1fa0cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRectangleStatics.ByReference::class)
public interface IRectangleStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RadiusXProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_RadiusYProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRectangleStatics> {
    public override fun getValue() = ABI.makeIRectangleStatics(pointer.getPointer(0))

    public fun setValue(value: IRectangleStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRectangleStatics {
    public val __147069686_Ptr: Pointer?

    public val _147069686_VtblPtr: Pointer?
      get() = __147069686_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RadiusXProperty(): DependencyProperty? {
      val fnPtr = _147069686_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__147069686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RadiusYProperty(): DependencyProperty? {
      val fnPtr = _147069686_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__147069686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRectangleStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __147069686_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRectangleStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f25aa53bb3a4c3c89db6fbc0d1fa0cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRectangleStatics(ptr: Pointer?): WithDefault = IRectangleStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRectangleStatics {
      val address = segment.toRawLongValue()
      return makeIRectangleStatics(Pointer(address))
    }

    public override fun toNative(obj: IRectangleStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__147069686_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRectangleStatics): Array<IRectangleStatics?> = (elements
        as Array<IRectangleStatics?>).castToImpl<IRectangleStatics,IRectangleStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRectangleStatics?> =
        arrayOfNulls<IRectangleStatics_Impl>(size) as Array<IRectangleStatics?>
  }
}
