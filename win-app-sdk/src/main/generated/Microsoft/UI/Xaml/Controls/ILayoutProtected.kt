package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ILayoutProtected.ABI::class)
@Signature("{e46ff416-741e-5176-a1d4-5718d2342243}")
@Guid("e46ff416741e5176a1d45718d2342243")
@WinRTInterface("e46ff416741e5176a1d45718d2342243")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayoutProtected.ByReference::class)
public interface ILayoutProtected : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InvalidateMeasure(): Unit

  @InterfaceMethod(1)
  public fun InvalidateArrange(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILayoutProtected> {
    public override fun getValue() = ABI.makeILayoutProtected(pointer.getPointer(0))

    public fun setValue(value: ILayoutProtected_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayoutProtected {
    public val __1500547837_Ptr: Pointer?

    public val _1500547837_VtblPtr: Pointer?
      get() = __1500547837_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InvalidateMeasure(): Unit {
      val fnPtr = _1500547837_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1500547837_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InvalidateArrange(): Unit {
      val fnPtr = _1500547837_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1500547837_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILayoutProtected_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1500547837_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayoutProtected, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e46ff416741e5176a1d45718d2342243")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayoutProtected(ptr: Pointer?): WithDefault = ILayoutProtected_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayoutProtected {
      val address = segment.toRawLongValue()
      return makeILayoutProtected(Pointer(address))
    }

    public override fun toNative(obj: ILayoutProtected): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1500547837_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayoutProtected): Array<ILayoutProtected?> = (elements as
        Array<ILayoutProtected?>).castToImpl<ILayoutProtected,ILayoutProtected_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayoutProtected?> =
        arrayOfNulls<ILayoutProtected_Impl>(size) as Array<ILayoutProtected?>
  }
}
