package Windows.UI.Xaml.Controls

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

@ABIMarker(IGridFactory.ABI::class)
@Signature("{ae814041-c531-43b4-bf99-12f506f7b01c}")
@Guid("ae814041c53143b4bf9912f506f7b01c")
@WinRTInterface("ae814041c53143b4bf9912f506f7b01c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridFactory.ByReference::class)
public interface IGridFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Grid?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGridFactory> {
    public override fun getValue() = ABI.makeIGridFactory(pointer.getPointer(0))

    public fun setValue(value: IGridFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridFactory {
    public val __964779336_Ptr: Pointer?

    public val _964779336_VtblPtr: Pointer?
      get() = __964779336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Grid? {
      val fnPtr = _964779336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Grid>()
      val hr = fn.invokeHR(arrayOf(__964779336_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Grid>(result.getValue())
      return resultValue
    }
  }

  public class IGridFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __964779336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae814041c53143b4bf9912f506f7b01c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridFactory(ptr: Pointer?): WithDefault = IGridFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridFactory {
      val address = segment.toRawLongValue()
      return makeIGridFactory(Pointer(address))
    }

    public override fun toNative(obj: IGridFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__964779336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridFactory): Array<IGridFactory?> = (elements as
        Array<IGridFactory?>).castToImpl<IGridFactory,IGridFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridFactory?> =
        arrayOfNulls<IGridFactory_Impl>(size) as Array<IGridFactory?>
  }
}
