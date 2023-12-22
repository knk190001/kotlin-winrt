package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ITeachingTipFactory.ABI::class)
@Signature("{a3ecd47d-2972-5d19-a62e-ddfbc5e1ad57}")
@Guid("a3ecd47d29725d19a62eddfbc5e1ad57")
@WinRTInterface("a3ecd47d29725d19a62eddfbc5e1ad57")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITeachingTipFactory.ByReference::class)
public interface ITeachingTipFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TeachingTip?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITeachingTipFactory> {
    public override fun getValue() = ABI.makeITeachingTipFactory(pointer.getPointer(0))

    public fun setValue(value: ITeachingTipFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITeachingTipFactory {
    public val __964779299_Ptr: Pointer?

    public val _964779299_VtblPtr: Pointer?
      get() = __964779299_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TeachingTip? {
      val fnPtr = _964779299_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TeachingTip>()
      val hr = fn.invokeHR(arrayOf(__964779299_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TeachingTip>(result.getValue())
      return resultValue
    }
  }

  public class ITeachingTipFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __964779299_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITeachingTipFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3ecd47d29725d19a62eddfbc5e1ad57")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITeachingTipFactory(ptr: Pointer?): WithDefault = ITeachingTipFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITeachingTipFactory {
      val address = segment.toRawLongValue()
      return makeITeachingTipFactory(Pointer(address))
    }

    public override fun toNative(obj: ITeachingTipFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__964779299_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITeachingTipFactory): Array<ITeachingTipFactory?> =
        (elements as
        Array<ITeachingTipFactory?>).castToImpl<ITeachingTipFactory,ITeachingTipFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITeachingTipFactory?> =
        arrayOfNulls<ITeachingTipFactory_Impl>(size) as Array<ITeachingTipFactory?>
  }
}
