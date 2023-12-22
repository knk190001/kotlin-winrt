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

@ABIMarker(IToolTipFactory.ABI::class)
@Signature("{bcbb3720-2db8-54e1-8806-fcbed38949a9}")
@Guid("bcbb37202db854e18806fcbed38949a9")
@WinRTInterface("bcbb37202db854e18806fcbed38949a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToolTipFactory.ByReference::class)
public interface IToolTipFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ToolTip?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToolTipFactory> {
    public override fun getValue() = ABI.makeIToolTipFactory(pointer.getPointer(0))

    public fun setValue(value: IToolTipFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToolTipFactory {
    public val __1397752110_Ptr: Pointer?

    public val _1397752110_VtblPtr: Pointer?
      get() = __1397752110_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ToolTip? {
      val fnPtr = _1397752110_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToolTip>()
      val hr = fn.invokeHR(arrayOf(__1397752110_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToolTip>(result.getValue())
      return resultValue
    }
  }

  public class IToolTipFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1397752110_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToolTipFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bcbb37202db854e18806fcbed38949a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToolTipFactory(ptr: Pointer?): WithDefault = IToolTipFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToolTipFactory {
      val address = segment.toRawLongValue()
      return makeIToolTipFactory(Pointer(address))
    }

    public override fun toNative(obj: IToolTipFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1397752110_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToolTipFactory): Array<IToolTipFactory?> = (elements as
        Array<IToolTipFactory?>).castToImpl<IToolTipFactory,IToolTipFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToolTipFactory?> =
        arrayOfNulls<IToolTipFactory_Impl>(size) as Array<IToolTipFactory?>
  }
}
