package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(IWidgetContextChangedArgs.ABI::class)
@Signature("{2c226d54-2252-576b-a197-370b28d25c2f}")
@Guid("2c226d542252576ba197370b28d25c2f")
@WinRTInterface("2c226d542252576ba197370b28d25c2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetContextChangedArgs.ByReference::class)
public interface IWidgetContextChangedArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WidgetContext(): WidgetContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetContextChangedArgs> {
    public override fun getValue() = ABI.makeIWidgetContextChangedArgs(pointer.getPointer(0))

    public fun setValue(value: IWidgetContextChangedArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetContextChangedArgs {
    public val __1443146327_Ptr: Pointer?

    public val _1443146327_VtblPtr: Pointer?
      get() = __1443146327_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WidgetContext(): WidgetContext? {
      val fnPtr = _1443146327_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WidgetContext>()
      val hr = fn.invokeHR(arrayOf(__1443146327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WidgetContext>(result.getValue())
      return resultValue
    }
  }

  public class IWidgetContextChangedArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1443146327_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetContextChangedArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c226d542252576ba197370b28d25c2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetContextChangedArgs(ptr: Pointer?): WithDefault =
        IWidgetContextChangedArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetContextChangedArgs {
      val address = segment.toRawLongValue()
      return makeIWidgetContextChangedArgs(Pointer(address))
    }

    public override fun toNative(obj: IWidgetContextChangedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1443146327_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetContextChangedArgs):
        Array<IWidgetContextChangedArgs?> = (elements as
        Array<IWidgetContextChangedArgs?>).castToImpl<IWidgetContextChangedArgs,IWidgetContextChangedArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetContextChangedArgs?> =
        arrayOfNulls<IWidgetContextChangedArgs_Impl>(size) as Array<IWidgetContextChangedArgs?>
  }
}
