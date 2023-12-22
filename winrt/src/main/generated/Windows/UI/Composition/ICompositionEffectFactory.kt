package Windows.UI.Composition

import Windows.Foundation.HResult
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

@ABIMarker(ICompositionEffectFactory.ABI::class)
@Signature("{be5624af-ba7e-4510-9850-41c0b4ff74df}")
@Guid("be5624afba7e4510985041c0b4ff74df")
@WinRTInterface("be5624afba7e4510985041c0b4ff74df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionEffectFactory.ByReference::class)
public interface ICompositionEffectFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateBrush(): CompositionEffectBrush?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun get_LoadStatus(): CompositionEffectFactoryLoadStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionEffectFactory> {
    public override fun getValue() = ABI.makeICompositionEffectFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionEffectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionEffectFactory {
    public val __165658019_Ptr: Pointer?

    public val _165658019_VtblPtr: Pointer?
      get() = __165658019_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateBrush(): CompositionEffectBrush? {
      val fnPtr = _165658019_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEffectBrush>()
      val hr = fn.invokeHR(arrayOf(__165658019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEffectBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _165658019_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__165658019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LoadStatus(): CompositionEffectFactoryLoadStatus? {
      val fnPtr = _165658019_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionEffectFactoryLoadStatus>()
      val hr = fn.invokeHR(arrayOf(__165658019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionEffectFactoryLoadStatus>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionEffectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __165658019_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionEffectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be5624afba7e4510985041c0b4ff74df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionEffectFactory(ptr: Pointer?): WithDefault =
        ICompositionEffectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionEffectFactory {
      val address = segment.toRawLongValue()
      return makeICompositionEffectFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionEffectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__165658019_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionEffectFactory):
        Array<ICompositionEffectFactory?> = (elements as
        Array<ICompositionEffectFactory?>).castToImpl<ICompositionEffectFactory,ICompositionEffectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionEffectFactory?> =
        arrayOfNulls<ICompositionEffectFactory_Impl>(size) as Array<ICompositionEffectFactory?>
  }
}
