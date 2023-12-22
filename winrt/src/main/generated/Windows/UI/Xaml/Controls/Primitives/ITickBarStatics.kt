package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(ITickBarStatics.ABI::class)
@Signature("{2c6d7e40-799d-4a54-be09-1fefc61d018e}")
@Guid("2c6d7e40799d4a54be091fefc61d018e")
@WinRTInterface("2c6d7e40799d4a54be091fefc61d018e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITickBarStatics.ByReference::class)
public interface ITickBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FillProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITickBarStatics> {
    public override fun getValue() = ABI.makeITickBarStatics(pointer.getPointer(0))

    public fun setValue(value: ITickBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITickBarStatics {
    public val __679864437_Ptr: Pointer?

    public val _679864437_VtblPtr: Pointer?
      get() = __679864437_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FillProperty(): DependencyProperty? {
      val fnPtr = _679864437_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679864437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITickBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __679864437_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITickBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c6d7e40799d4a54be091fefc61d018e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITickBarStatics(ptr: Pointer?): WithDefault = ITickBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITickBarStatics {
      val address = segment.toRawLongValue()
      return makeITickBarStatics(Pointer(address))
    }

    public override fun toNative(obj: ITickBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__679864437_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITickBarStatics): Array<ITickBarStatics?> = (elements as
        Array<ITickBarStatics?>).castToImpl<ITickBarStatics,ITickBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITickBarStatics?> =
        arrayOfNulls<ITickBarStatics_Impl>(size) as Array<ITickBarStatics?>
  }
}
