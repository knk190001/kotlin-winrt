package Windows.UI.Xaml.Controls

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

@ABIMarker(IInkToolbarToolButtonStatics.ABI::class)
@Signature("{9e097d18-d136-4ef6-b0fd-1a78c2884a01}")
@Guid("9e097d18d1364ef6b0fd1a78c2884a01")
@WinRTInterface("9e097d18d1364ef6b0fd1a78c2884a01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarToolButtonStatics.ByReference::class)
public interface IInkToolbarToolButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsExtensionGlyphShownProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarToolButtonStatics> {
    public override fun getValue() = ABI.makeIInkToolbarToolButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarToolButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarToolButtonStatics {
    public val __985987158_Ptr: Pointer?

    public val _985987158_VtblPtr: Pointer?
      get() = __985987158_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsExtensionGlyphShownProperty(): DependencyProperty? {
      val fnPtr = _985987158_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__985987158_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarToolButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __985987158_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarToolButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e097d18d1364ef6b0fd1a78c2884a01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarToolButtonStatics(ptr: Pointer?): WithDefault =
        IInkToolbarToolButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarToolButtonStatics {
      val address = segment.toRawLongValue()
      return makeIInkToolbarToolButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarToolButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__985987158_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarToolButtonStatics):
        Array<IInkToolbarToolButtonStatics?> = (elements as
        Array<IInkToolbarToolButtonStatics?>).castToImpl<IInkToolbarToolButtonStatics,IInkToolbarToolButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarToolButtonStatics?> =
        arrayOfNulls<IInkToolbarToolButtonStatics_Impl>(size) as
        Array<IInkToolbarToolButtonStatics?>
  }
}
