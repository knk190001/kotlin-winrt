package Windows.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IVisualTransitionFactory.ABI::class)
@Signature("{ea75864f-d1e0-4dae-b429-89fc322724f4}")
@Guid("ea75864fd1e04daeb42989fc322724f4")
@WinRTInterface("ea75864fd1e04daeb42989fc322724f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualTransitionFactory.ByReference::class)
public interface IVisualTransitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): VisualTransition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualTransitionFactory> {
    public override fun getValue() = ABI.makeIVisualTransitionFactory(pointer.getPointer(0))

    public fun setValue(value: IVisualTransitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualTransitionFactory {
    public val __329187331_Ptr: Pointer?

    public val _329187331_VtblPtr: Pointer?
      get() = __329187331_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        VisualTransition? {
      val fnPtr = _329187331_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualTransition>()
      val hr = fn.invokeHR(arrayOf(__329187331_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualTransition>(result.getValue())
      return resultValue
    }
  }

  public class IVisualTransitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __329187331_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualTransitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea75864fd1e04daeb42989fc322724f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualTransitionFactory(ptr: Pointer?): WithDefault =
        IVisualTransitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualTransitionFactory {
      val address = segment.toRawLongValue()
      return makeIVisualTransitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IVisualTransitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__329187331_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualTransitionFactory):
        Array<IVisualTransitionFactory?> = (elements as
        Array<IVisualTransitionFactory?>).castToImpl<IVisualTransitionFactory,IVisualTransitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualTransitionFactory?> =
        arrayOfNulls<IVisualTransitionFactory_Impl>(size) as Array<IVisualTransitionFactory?>
  }
}
