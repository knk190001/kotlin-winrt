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

@ABIMarker(IBrushTransitionFactory.ABI::class)
@Signature("{3dbe7368-13d4-510c-a215-7539f4787b52}")
@Guid("3dbe736813d4510ca2157539f4787b52")
@WinRTInterface("3dbe736813d4510ca2157539f4787b52")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrushTransitionFactory.ByReference::class)
public interface IBrushTransitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): BrushTransition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBrushTransitionFactory> {
    public override fun getValue() = ABI.makeIBrushTransitionFactory(pointer.getPointer(0))

    public fun setValue(value: IBrushTransitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrushTransitionFactory {
    public val __286638765_Ptr: Pointer?

    public val _286638765_VtblPtr: Pointer?
      get() = __286638765_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        BrushTransition? {
      val fnPtr = _286638765_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrushTransition>()
      val hr = fn.invokeHR(arrayOf(__286638765_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrushTransition>(result.getValue())
      return resultValue
    }
  }

  public class IBrushTransitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __286638765_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrushTransitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3dbe736813d4510ca2157539f4787b52")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrushTransitionFactory(ptr: Pointer?): WithDefault =
        IBrushTransitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrushTransitionFactory {
      val address = segment.toRawLongValue()
      return makeIBrushTransitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IBrushTransitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__286638765_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrushTransitionFactory): Array<IBrushTransitionFactory?>
        = (elements as
        Array<IBrushTransitionFactory?>).castToImpl<IBrushTransitionFactory,IBrushTransitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrushTransitionFactory?> =
        arrayOfNulls<IBrushTransitionFactory_Impl>(size) as Array<IBrushTransitionFactory?>
  }
}
