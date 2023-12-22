package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IBeginStoryboardStatics.ABI::class)
@Signature("{4d5fdbeb-6b0e-5a8f-a8f0-01f438df8fb2}")
@Guid("4d5fdbeb6b0e5a8fa8f001f438df8fb2")
@WinRTInterface("4d5fdbeb6b0e5a8fa8f001f438df8fb2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBeginStoryboardStatics.ByReference::class)
public interface IBeginStoryboardStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StoryboardProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBeginStoryboardStatics> {
    public override fun getValue() = ABI.makeIBeginStoryboardStatics(pointer.getPointer(0))

    public fun setValue(value: IBeginStoryboardStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBeginStoryboardStatics {
    public val __208066170_Ptr: Pointer?

    public val _208066170_VtblPtr: Pointer?
      get() = __208066170_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StoryboardProperty(): DependencyProperty? {
      val fnPtr = _208066170_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__208066170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBeginStoryboardStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __208066170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBeginStoryboardStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d5fdbeb6b0e5a8fa8f001f438df8fb2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBeginStoryboardStatics(ptr: Pointer?): WithDefault =
        IBeginStoryboardStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBeginStoryboardStatics {
      val address = segment.toRawLongValue()
      return makeIBeginStoryboardStatics(Pointer(address))
    }

    public override fun toNative(obj: IBeginStoryboardStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__208066170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBeginStoryboardStatics): Array<IBeginStoryboardStatics?>
        = (elements as
        Array<IBeginStoryboardStatics?>).castToImpl<IBeginStoryboardStatics,IBeginStoryboardStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBeginStoryboardStatics?> =
        arrayOfNulls<IBeginStoryboardStatics_Impl>(size) as Array<IBeginStoryboardStatics?>
  }
}
